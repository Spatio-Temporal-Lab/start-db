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

package org.apache.calcite.sql.validate;

import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeFactoryImpl;
import org.apache.calcite.rel.type.RelDataTypeField;
import org.apache.calcite.sql.*;
import org.apache.calcite.sql.fun.SqlStdOperatorTable;
import org.apache.calcite.sql.parser.SqlParserPos;
import org.apache.calcite.util.Util;

import java.util.ArrayList;
import java.util.List;

import static org.apache.calcite.util.Static.RESOURCE;

/**
 * Namespace for an <code>AS t(c1, c2, ...)</code> clause.
 *
 * <p>A namespace is necessary only if there is a column list, in order to
 * re-map column names; a <code>relation AS t</code> clause just uses the same
 * namespace as <code>relation</code>.
 */
public class AliasNamespace extends AbstractNamespace {
    // ~ Instance fields --------------------------------------------------------

    protected final SqlCall call;

    // ~ Constructors -----------------------------------------------------------

    /**
     * Creates an AliasNamespace.
     *
     * @param validator     Validator
     * @param call          Call to AS operator
     * @param enclosingNode Enclosing node
     */
    protected AliasNamespace(SqlValidatorImpl validator, SqlCall call, SqlNode enclosingNode) {
        super(validator, enclosingNode);
        this.call = call;
        assert call.getOperator() == SqlStdOperatorTable.AS;
    }

    // ~ Methods ----------------------------------------------------------------

    protected RelDataType validateImpl(RelDataType targetRowType) {
        final List<String> nameList = new ArrayList<>();
        final List<SqlNode> operands = call.getOperandList();
        final SqlValidatorNamespace childNs = validator.getNamespace(operands.get(0));
        final RelDataType rowType = childNs.getRowTypeSansSystemColumns();

        // modify start
        List<SqlNode> columnNames;
        if (SqlUtil.isAsOperatorWithListOperand(call)) {
            columnNames = ((SqlNodeList) operands.get(1)).getList();
        } else {
            columnNames = Util.skip(operands, 2);
        }
        // modify end

        for (final SqlNode operand : columnNames) {
            String name = ((SqlIdentifier) operand).getSimple();
            if (nameList.contains(name)) {
                throw validator.newValidationError(operand, RESOURCE.aliasListDuplicate(name));
            }
            nameList.add(name);
        }
        if (nameList.size() != rowType.getFieldCount()) {
            // Position error over all column names
            final SqlNode node = operands.size() == 3
                ? operands.get(2)
                : new SqlNodeList(columnNames, SqlParserPos.sum(columnNames));
            throw validator.newValidationError(
                node,
                RESOURCE.aliasListDegree(
                    rowType.getFieldCount(),
                    getString(rowType),
                    nameList.size()
                )
            );
        }
        final List<RelDataType> typeList = new ArrayList<>();
        for (RelDataTypeField field : rowType.getFieldList()) {
            typeList.add(field.getType());
        }
        final RelDataType aliasedType = validator.getTypeFactory()
            .createStructType(rowType.getStructKind(), typeList, nameList);

        // As per suggestion in CALCITE-4085, JavaType has its special nullability handling.
        if (rowType instanceof RelDataTypeFactoryImpl.JavaType) {
            return aliasedType;
        } else {
            return validator.getTypeFactory()
                .createTypeWithNullability(aliasedType, rowType.isNullable());
        }
    }

    private String getString(RelDataType rowType) {
        StringBuilder buf = new StringBuilder();
        buf.append("(");
        for (RelDataTypeField field : rowType.getFieldList()) {
            if (field.getIndex() > 0) {
                buf.append(", ");
            }
            buf.append("'");
            buf.append(field.getName());
            buf.append("'");
        }
        buf.append(")");
        return buf.toString();
    }

    public SqlNode getNode() {
        return call;
    }

    public String translate(String name) {
        final RelDataType underlyingRowType = validator.getValidatedNodeType(call.operand(0));
        int i = 0;
        for (RelDataTypeField field : rowType.getFieldList()) {
            if (field.getName().equals(name)) {
                return underlyingRowType.getFieldList().get(i).getName();
            }
            ++i;
        }
        throw new AssertionError("unknown field '" + name + "' in rowtype " + underlyingRowType);
    }
}
