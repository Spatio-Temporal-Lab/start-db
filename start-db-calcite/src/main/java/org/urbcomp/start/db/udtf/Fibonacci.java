package org.urbcomp.start.db.udtf;

import org.apache.calcite.DataContext;
import org.apache.calcite.config.CalciteConnectionConfig;
import org.apache.calcite.linq4j.AbstractEnumerable;
import org.apache.calcite.linq4j.Enumerable;
import org.apache.calcite.linq4j.Enumerator;
import org.apache.calcite.linq4j.tree.Types;
import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeFactory;
import org.apache.calcite.schema.ScannableTable;
import org.apache.calcite.schema.Schema;
import org.apache.calcite.schema.Statistic;
import org.apache.calcite.schema.Statistics;
import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.type.SqlTypeName;

import java.lang.reflect.Method;

/**
 * Fibonacci User Defined Table Function
 *
 * @author zaiyuan
 * @date 2022-06-12 23:36:40
 */
public class Fibonacci {
    public static final Method FIBONACCI2_TABLE_METHOD =
            Types.lookupMethod(Fibonacci.class, "fibonacci", long.class);

    /**
     * A function that generates the Fibonacci sequence.
     * Interesting because it has one column and no arguments.
     */
    public ScannableTable fibonacci(final long limit) {
        return new ScannableTable() {
            @Override
            public RelDataType getRowType(RelDataTypeFactory typeFactory) {
                return typeFactory.builder()
                        .add("N", SqlTypeName.BIGINT)
                        .build();
            }

            @Override
            public Enumerable<Object[]> scan(DataContext root) {
                return new AbstractEnumerable<Object[]>() {
                    @Override
                    public Enumerator<Object[]> enumerator() {
                        return new Enumerator<Object[]>() {
                            private long prev = 1;
                            private long current = 0;

                            @Override
                            public Object[] current() {
                                return new Object[]{current};
                            }

                            @Override
                            public boolean moveNext() {
                                final long next = current + prev;
                                if (limit >= 0 && next > limit) {
                                    return false;
                                }
                                prev = current;
                                current = next;
                                return true;
                            }

                            @Override
                            public void reset() {
                                prev = 0;
                                current = 1;
                            }

                            @Override
                            public void close() {
                            }
                        };
                    }
                };
            }

            @Override
            public Statistic getStatistic() {
                return Statistics.UNKNOWN;
            }

            @Override
            public Schema.TableType getJdbcTableType() {
                return Schema.TableType.TABLE;
            }

            @Override
            public boolean isRolledUp(String column) {
                return false;
            }

            @Override
            public boolean rolledUpColumnValidInsideAgg(String column, SqlCall call,
                                                        SqlNode parent, CalciteConnectionConfig config) {
                return true;
            }
        };
    }
}
