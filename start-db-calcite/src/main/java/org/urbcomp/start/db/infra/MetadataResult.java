/*
 * This file is inherited from Apache Calcite and modifed by ST-Lab under apache license.
 * You can find the original code from
 *
 * https://github.com/apache/calcite
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.urbcomp.start.db.infra;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.apache.calcite.DataContext;
import org.apache.calcite.avatica.AvaticaParameter;
import org.apache.calcite.avatica.ColumnMetaData;
import org.apache.calcite.avatica.Meta;
import org.apache.calcite.avatica.SqlType;
import org.apache.calcite.jdbc.CalcitePrepare;
import org.apache.calcite.jdbc.CalciteSchema;
import org.apache.calcite.linq4j.AbstractEnumerable;
import org.apache.calcite.linq4j.Enumerable;
import org.apache.calcite.linq4j.Enumerator;
import org.apache.calcite.rel.RelCollation;
import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.runtime.Bindable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * result for DDL & DML
 *
 * @author jimo
 **/
public class MetadataResult<T> extends CalcitePrepare.CalciteSignature<T> {

    private MetadataResult(
        String sql,
        List<AvaticaParameter> parameterList,
        Map<String, Object> internalParameters,
        RelDataType rowType,
        List<ColumnMetaData> columns,
        Meta.CursorFactory cursorFactory,
        CalciteSchema rootSchema,
        List<RelCollation> collationList,
        long maxRowCount,
        Bindable<T> bindable,
        Meta.StatementType statementType
    ) {
        super(
            sql,
            parameterList,
            internalParameters,
            rowType,
            columns,
            cursorFactory,
            rootSchema,
            collationList,
            maxRowCount,
            bindable,
            statementType
        );
    }

    /**
     * DDL
     */
    public MetadataResult(List<ColumnMetaData> metaData) {
        this(metaData, null);
    }

    public MetadataResult(List<ColumnMetaData> metaData, Bindable<T> bindable) {
        this(
            "",
            ImmutableList.of(),
            ImmutableMap.of(),
            null,
            metaData,
            Meta.CursorFactory.OBJECT,
            null,
            ImmutableList.of(),
            -1,
            bindable,
            Meta.StatementType.OTHER_DDL
        );
    }

    public static <T> MetadataResult<T> buildDDLResult(int affectRows) {
        List<ColumnMetaData> metaData = new ArrayList<>(1);
        metaData.add(
            ColumnMetaData.dummy(
                new ColumnMetaData.ScalarType(
                    SqlType.INTEGER.id,
                    "affectRows",
                    ColumnMetaData.Rep.INTEGER
                ),
                true
            )
        );
        return new MetadataResult<>(metaData);
    }

    /**
     * with result,eg: show tables
     */
    public static MetadataResult<Object[]> buildResult(String[] columns, List<Object[]> values) {
        List<ColumnMetaData> metaData = new ArrayList<>(1);
        for (String column : columns) {
            metaData.add(
                ColumnMetaData.dummy(
                    new ColumnMetaData.ScalarType(
                        SqlType.VARCHAR.id,
                        column,
                        ColumnMetaData.Rep.STRING
                    ),
                    true
                )
            );
        }
        return new MetadataResult<>(metaData, new MetaBindable(values));
    }

    private static class MetaBindable implements Bindable<Object[]> {

        private final List<Object[]> values;

        private MetaBindable(List<Object[]> values) {
            this.values = values;
        }

        @Override
        public Enumerable<Object[]> bind(DataContext dataContext) {
            return new AbstractEnumerable<Object[]>() {

                @Override
                public Enumerator<Object[]> enumerator() {
                    return new Enumerator<Object[]>() {
                        int i = 0;

                        @Override
                        public Object[] current() {
                            return values.get(i);
                        }

                        @Override
                        public boolean moveNext() {
                            if (i < values.size()) {
                                i++;
                                return true;
                            }
                            return false;
                        }

                        @Override
                        public void reset() {
                            i = 0;
                        }

                        @Override
                        public void close() {}
                    };
                }
            };
        }
    }
}
