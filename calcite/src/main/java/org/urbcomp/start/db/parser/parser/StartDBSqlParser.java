// Generated from F:/workspace/idea/start-db/calcite/src/main/java/org/urbcomp/start/db/parser/grammar\StartDBSql.g4 by ANTLR 4.9.2
package org.urbcomp.start.db.parser.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StartDBSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T_ACTION=2, T_ADD2=3, T_ALL=4, T_ALLOCATE=5, T_ALTER=6, T_AND=7, 
		T_ANSI_NULLS=8, T_ANSI_PADDING=9, T_AS=10, T_ASC=11, T_ASSOCIATE=12, T_AT=13, 
		T_AUTO=14, T_AVG=15, T_BATCHSIZE=16, T_BEGIN=17, T_BETWEEN=18, T_BIGINT=19, 
		T_BINARY_DOUBLE=20, T_BINARY_FLOAT=21, T_BINARY_INTEGER=22, T_BIT=23, 
		T_BODY=24, T_BREAK=25, T_BUILD=26, T_BY=27, T_BYTE=28, T_CALL=29, T_CALLER=30, 
		T_CASCADE=31, T_CASE=32, T_CASESPECIFIC=33, T_CAST=34, T_CHAR=35, T_CHARACTER=36, 
		T_CHARSET=37, T_CLIENT=38, T_CLOSE=39, T_CLUSTERED=40, T_CMP=41, T_COLLECT=42, 
		T_COLLECTION=43, T_COLUMN=44, T_COMMENT=45, T_CONFIG=46, T_CONSTANT=47, 
		T_COMMIT=48, T_COMPRESS=49, T_CONCAT=50, T_CONDITION=51, T_CONSTRAINT=52, 
		T_CONTINUE=53, T_COPY=54, T_COUNT=55, T_COUNT_BIG=56, T_CREATE=57, T_CREATION=58, 
		T_CREATOR=59, T_CS=60, T_CURRENT=61, T_CURRENT_SCHEMA=62, T_CURSOR=63, 
		T_DATABASE=64, T_DATABASES=65, T_DATA=66, T_DATE=67, T_DATETIME=68, T_DAY=69, 
		T_DAYS=70, T_DEC=71, T_DECIMAL=72, T_DECLARE=73, T_DEFAULT=74, T_DEFERRED=75, 
		T_DEFINED=76, T_DEFINER=77, T_DEFINITION=78, T_DELETE=79, T_DELIMITED=80, 
		T_DELIMITER=81, T_DESC=82, T_DESCRIBE=83, T_DIAGNOSTICS=84, T_DIR=85, 
		T_DIRECTORY=86, T_DISTINCT=87, T_DISTRIBUTE=88, T_DO=89, T_DOUBLE=90, 
		T_DOWNLOAD=91, T_DROP=92, T_DYNAMIC=93, T_ELSE=94, T_ELSEIF=95, T_ELSIF=96, 
		T_ENABLE=97, T_END=98, T_ENGINE=99, T_ESCAPED=100, T_EXCEPT=101, T_EXEC=102, 
		T_EXECUTE=103, T_EXCEPTION=104, T_EXCLUSIVE=105, T_EXISTS=106, T_EXIT=107, 
		T_FALLBACK=108, T_FALSE=109, T_FETCH=110, T_FIELDS=111, T_FILE=112, T_FILES=113, 
		T_FLOAT=114, T_FOR=115, T_FOREIGN=116, T_FORMAT=117, T_FOUND=118, T_FROM=119, 
		T_FULL=120, T_FUNCTION=121, T_GET=122, T_GLOBAL=123, T_GO=124, T_GRANT=125, 
		T_GRANTS=126, T_GROUP=127, T_HANDLER=128, T_HASH=129, T_HAVING=130, T_HOST=131, 
		T_IDENTITY=132, T_IDENTIFIED=133, T_IF=134, T_IGNORE=135, T_IMMEDIATE=136, 
		T_IN=137, T_INCLUDE=138, T_INCREMENT=139, T_INDEX=140, T_INITRANS=141, 
		T_INNER=142, T_INOUT=143, T_INSERT=144, T_INT=145, T_INT2=146, T_INT4=147, 
		T_INT8=148, T_INTEGER=149, T_INTERSECT=150, T_INTERVAL=151, T_INTO=152, 
		T_INVOKER=153, T_IS=154, T_ISOPEN=155, T_ITEMS=156, T_JOIN=157, T_KEEP=158, 
		T_KILL=159, T_KEY=160, T_KEYS=161, T_KV_SEARCH=162, T_LANGUAGE=163, T_LEAVE=164, 
		T_LEFT=165, T_LIKE=166, T_LIMIT=167, T_LINES=168, T_LOAD=169, T_LOCAL=170, 
		T_LOCATION=171, T_LOCATOR=172, T_LOCATORS=173, T_LOCKS=174, T_LOG=175, 
		T_LOGGED=176, T_LOGGING=177, T_LOOP=178, T_MAP=179, T_MATCHED=180, T_MAX=181, 
		T_MAXTRANS=182, T_MERGE=183, T_MESSAGE_TEXT=184, T_MICROSECOND=185, T_MICROSECONDS=186, 
		T_MIN=187, T_MULTISET=188, T_NCHAR=189, T_NEW=190, T_NVARCHAR=191, T_NO=192, 
		T_NOCOUNT=193, T_NOCOMPRESS=194, T_NOLOGGING=195, T_NONE=196, T_NOT=197, 
		T_NOTFOUND=198, T_NULL=199, T_NUMERIC=200, T_NUMBER=201, T_OBJECT=202, 
		T_OFF=203, T_ON=204, T_ONLY=205, T_OPEN=206, T_OR=207, T_ORDER=208, T_OUT=209, 
		T_OUTER=210, T_OVER=211, T_OVERWRITE=212, T_OWNER=213, T_PACKAGE=214, 
		T_PARTITION=215, T_PASSWORD=216, T_PCTFREE=217, T_PCTUSED=218, T_PERCENT=219, 
		T_PLS_INTEGER=220, T_PRECISION=221, T_PRESERVE=222, T_PRIVILEGES=223, 
		T_PRIMARY=224, T_PRINT=225, T_PROC=226, T_PROCEDURE=227, T_PYRAMID=228, 
		T_PYRAMIDS=229, T_QUERY=230, T_QUERIES=231, T_QUALIFY=232, T_QUERY_BAND=233, 
		T_QUIT=234, T_QUOTED_IDENTIFIER=235, T_RAISE=236, T_REAL=237, T_REFERENCES=238, 
		T_REGEXP=239, T_RENAME=240, T_REPLACE=241, T_RESIGNAL=242, T_RESTRICT=243, 
		T_RESULT=244, T_RESULT_SET_LOCATOR=245, T_RETURN=246, T_RETURNS=247, T_REVERSE=248, 
		T_REVOKE=249, T_RIGHT=250, T_RLIKE=251, T_ROLE=252, T_ROLLBACK=253, T_ROW=254, 
		T_ROWS=255, T_ROWTYPE=256, T_ROW_COUNT=257, T_RR=258, T_RS=259, T_PWD=260, 
		T_TRIM=261, T_TABLESAMPLE=262, T_SCHEMA=263, T_SECOND=264, T_SECONDS=265, 
		T_SECURITY=266, T_SEGMENT=267, T_SEL=268, T_SELECT=269, T_SET=270, T_SESSION=271, 
		T_SESSIONS=272, T_SETS=273, T_SHOW=274, T_SIGNAL=275, T_SIMPLE_DOUBLE=276, 
		T_SIMPLE_FLOAT=277, T_SIMPLE_INTEGER=278, T_SMALLDATETIME=279, T_SMALLINT=280, 
		T_SQL=281, T_SQLEXCEPTION=282, T_SQLINSERT=283, T_SQLSTATE=284, T_SQLWARNING=285, 
		T_SRID=286, T_STATS=287, T_STATISTICS=288, T_STEP=289, T_STORAGE=290, 
		T_STORE=291, T_STORED=292, T_STRING=293, T_SUBDIR=294, T_SUBSTRING=295, 
		T_SUM=296, T_SUMMARY=297, T_SYS_REFCURSOR=298, T_TABLE=299, T_TILE=300, 
		T_VIEW=301, T_TABLES=302, T_VIEWS=303, T_TABLESPACE=304, T_TEMPORARY=305, 
		T_TERMINATED=306, T_TEXTIMAGE_ON=307, T_THEN=308, T_TIMESTAMP=309, T_TINYINT=310, 
		T_TITLE=311, T_TO=312, T_TOP=313, T_TRANSACTION=314, T_TRUE=315, T_TRUNCATE=316, 
		T_TYPE=317, T_UNION=318, T_UNIQUE=319, T_UPDATE=320, T_UR=321, T_USE=322, 
		T_USING=323, T_VALUE=324, T_VALUES=325, T_VAR=326, T_VARCHAR=327, T_VARCHAR2=328, 
		T_VARYING=329, T_VOLATILE=330, T_WHEN=331, T_WHERE=332, T_WHILE=333, T_WITH=334, 
		T_WITHOUT=335, T_WORK=336, T_XACT_ABORT=337, T_XML=338, T_YES=339, T_ACTIVITY_COUNT=340, 
		T_CUME_DIST=341, T_CURRENT_DATE=342, T_CURRENT_TIME=343, T_PI=344, T_CURRENT_TIMESTAMP=345, 
		T_CURRENT_USER=346, T_DENSE_RANK=347, T_FIRST_VALUE=348, T_LAG=349, T_LAST_VALUE=350, 
		T_LEAD=351, T_MAX_PART_STRING=352, T_MIN_PART_STRING=353, T_MAX_PART_INT=354, 
		T_MIN_PART_INT=355, T_MAX_PART_DATE=356, T_MIN_PART_DATE=357, T_PART_COUNT=358, 
		T_PART_LOC=359, T_RANK=360, T_ROW_NUMBER=361, T_STDEV=362, T_SYSDATE=363, 
		T_VARIANCE=364, T_USER=365, T_METADATA=366, T_ADD=367, T_COLON=368, T_COMMA=369, 
		T_PIPE=370, T_DIV=371, T_DOT=372, T_DOT2=373, T_EQUAL=374, T_EQUAL2=375, 
		T_NOTEQUAL=376, T_NOTEQUAL2=377, T_GREATER=378, T_GREATEREQUAL=379, T_LESS=380, 
		T_LESSEQUAL=381, T_MUL=382, T_OPEN_B=383, T_OPEN_P=384, T_OPEN_SB=385, 
		T_CLOSE_B=386, T_CLOSE_P=387, T_CLOSE_SB=388, T_SEMICOLON=389, T_SUB=390, 
		L_ID=391, L_S_STRING=392, L_D_STRING=393, L_INT=394, L_DEC=395, L_WS=396, 
		L_M_COMMENT=397, L_S_COMMENT=398, L_FILE=399, T_HDFS=400, T_HIVE=401;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_dbDotTable = 2, RULE_userDotDbDotTable = 3, 
		RULE_assignmentStmtItem = 4, RULE_assignmentStmtSingleItem = 5, RULE_assignmentStmtMultipleItem = 6, 
		RULE_assignmentStmtSelectItem = 7, RULE_showCreateTableStmt = 8, RULE_createTableStmt = 9, 
		RULE_createTableWithSelect = 10, RULE_createTableWithLike = 11, RULE_withOption = 12, 
		RULE_withOptionItems = 13, RULE_withOptionItem = 14, RULE_showTablesStmt = 15, 
		RULE_dtype = 16, RULE_dtypeLen = 17, RULE_createDatabaseStmt = 18, RULE_showDatabasesStmt = 19, 
		RULE_dropDatabaseStmt = 20, RULE_createDatabaseOption = 21, RULE_dropTableStmt = 22, 
		RULE_insertStmt = 23, RULE_insertStmtCols = 24, RULE_insertStmtRows = 25, 
		RULE_insertStmtRow = 26, RULE_truncateStmt = 27, RULE_useStmt = 28, RULE_selectStmt = 29, 
		RULE_cteSelectStmt = 30, RULE_cteSelectStmtItem = 31, RULE_cteSelectCols = 32, 
		RULE_fullselectStmt = 33, RULE_fullselectStmtItem = 34, RULE_fullselectSetClause = 35, 
		RULE_subselectStmt = 36, RULE_selectList = 37, RULE_selectListSet = 38, 
		RULE_selectListLimit = 39, RULE_selectListItem = 40, RULE_selectListAlias = 41, 
		RULE_selectListAsterisk = 42, RULE_intoClause = 43, RULE_fromClause = 44, 
		RULE_fromTableClause = 45, RULE_fromTableNameClause = 46, RULE_fromSubselectClause = 47, 
		RULE_fromJoinClause = 48, RULE_fromJoinTypeClause = 49, RULE_fromTableValuesClause = 50, 
		RULE_fromTableValuesRow = 51, RULE_fromAliasClause = 52, RULE_tableName = 53, 
		RULE_whereClause = 54, RULE_groupByClause = 55, RULE_havingClause = 56, 
		RULE_qualifyClause = 57, RULE_orderByClause = 58, RULE_orderByClauseItem = 59, 
		RULE_sampleClause = 60, RULE_selectOptions = 61, RULE_selectOptionsItem = 62, 
		RULE_updateStmt = 63, RULE_updateAssignment = 64, RULE_updateTable = 65, 
		RULE_updateUpsert = 66, RULE_deleteStmt = 67, RULE_deleteAlias = 68, RULE_describeStmt = 69, 
		RULE_boolExpr = 70, RULE_boolExprAtom = 71, RULE_boolExprUnary = 72, RULE_boolExprSingleIn = 73, 
		RULE_boolExprMultiIn = 74, RULE_boolExprBinary = 75, RULE_boolExprLogicalOperator = 76, 
		RULE_boolExprBinaryOperator = 77, RULE_expr = 78, RULE_exprAtom = 79, 
		RULE_exprInterval = 80, RULE_intervalItem = 81, RULE_exprConcat = 82, 
		RULE_exprConcatItem = 83, RULE_exprCase = 84, RULE_exprCaseSimple = 85, 
		RULE_exprCaseSearched = 86, RULE_exprCaseItem = 87, RULE_exprCursorAttribute = 88, 
		RULE_exprAggWindowFunc = 89, RULE_exprFuncAllDistinct = 90, RULE_exprFuncOverClause = 91, 
		RULE_exprFuncPartitionByClause = 92, RULE_exprSpecFunc = 93, RULE_exprFunc = 94, 
		RULE_exprFuncParams = 95, RULE_funcParam = 96, RULE_dateLiteral = 97, 
		RULE_timestampLiteral = 98, RULE_ident = 99, RULE_identItem = 100, RULE_string = 101, 
		RULE_intNumber = 102, RULE_decNumber = 103, RULE_boolLiteral = 104, RULE_nullConst = 105, 
		RULE_nonReservedWords = 106;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "dbDotTable", "userDotDbDotTable", "assignmentStmtItem", 
			"assignmentStmtSingleItem", "assignmentStmtMultipleItem", "assignmentStmtSelectItem", 
			"showCreateTableStmt", "createTableStmt", "createTableWithSelect", "createTableWithLike", 
			"withOption", "withOptionItems", "withOptionItem", "showTablesStmt", 
			"dtype", "dtypeLen", "createDatabaseStmt", "showDatabasesStmt", "dropDatabaseStmt", 
			"createDatabaseOption", "dropTableStmt", "insertStmt", "insertStmtCols", 
			"insertStmtRows", "insertStmtRow", "truncateStmt", "useStmt", "selectStmt", 
			"cteSelectStmt", "cteSelectStmtItem", "cteSelectCols", "fullselectStmt", 
			"fullselectStmtItem", "fullselectSetClause", "subselectStmt", "selectList", 
			"selectListSet", "selectListLimit", "selectListItem", "selectListAlias", 
			"selectListAsterisk", "intoClause", "fromClause", "fromTableClause", 
			"fromTableNameClause", "fromSubselectClause", "fromJoinClause", "fromJoinTypeClause", 
			"fromTableValuesClause", "fromTableValuesRow", "fromAliasClause", "tableName", 
			"whereClause", "groupByClause", "havingClause", "qualifyClause", "orderByClause", 
			"orderByClauseItem", "sampleClause", "selectOptions", "selectOptionsItem", 
			"updateStmt", "updateAssignment", "updateTable", "updateUpsert", "deleteStmt", 
			"deleteAlias", "describeStmt", "boolExpr", "boolExprAtom", "boolExprUnary", 
			"boolExprSingleIn", "boolExprMultiIn", "boolExprBinary", "boolExprLogicalOperator", 
			"boolExprBinaryOperator", "expr", "exprAtom", "exprInterval", "intervalItem", 
			"exprConcat", "exprConcatItem", "exprCase", "exprCaseSimple", "exprCaseSearched", 
			"exprCaseItem", "exprCursorAttribute", "exprAggWindowFunc", "exprFuncAllDistinct", 
			"exprFuncOverClause", "exprFuncPartitionByClause", "exprSpecFunc", "exprFunc", 
			"exprFuncParams", "funcParam", "dateLiteral", "timestampLiteral", "ident", 
			"identItem", "string", "intNumber", "decNumber", "boolLiteral", "nullConst", 
			"nonReservedWords"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'%'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'+'", "':'", "','", "'||'", 
			"'/'", "'.'", "'..'", "'='", "'=='", "'<>'", "'!='", "'>'", "'>='", "'<'", 
			"'<='", "'*'", "'{'", "'('", "'['", "'}'", "')'", "']'", "';'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "T_ACTION", "T_ADD2", "T_ALL", "T_ALLOCATE", "T_ALTER", "T_AND", 
			"T_ANSI_NULLS", "T_ANSI_PADDING", "T_AS", "T_ASC", "T_ASSOCIATE", "T_AT", 
			"T_AUTO", "T_AVG", "T_BATCHSIZE", "T_BEGIN", "T_BETWEEN", "T_BIGINT", 
			"T_BINARY_DOUBLE", "T_BINARY_FLOAT", "T_BINARY_INTEGER", "T_BIT", "T_BODY", 
			"T_BREAK", "T_BUILD", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", "T_CASCADE", 
			"T_CASE", "T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER", "T_CHARSET", 
			"T_CLIENT", "T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECT", "T_COLLECTION", 
			"T_COLUMN", "T_COMMENT", "T_CONFIG", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", 
			"T_CONCAT", "T_CONDITION", "T_CONSTRAINT", "T_CONTINUE", "T_COPY", "T_COUNT", 
			"T_COUNT_BIG", "T_CREATE", "T_CREATION", "T_CREATOR", "T_CS", "T_CURRENT", 
			"T_CURRENT_SCHEMA", "T_CURSOR", "T_DATABASE", "T_DATABASES", "T_DATA", 
			"T_DATE", "T_DATETIME", "T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", "T_DECLARE", 
			"T_DEFAULT", "T_DEFERRED", "T_DEFINED", "T_DEFINER", "T_DEFINITION", 
			"T_DELETE", "T_DELIMITED", "T_DELIMITER", "T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", 
			"T_DIR", "T_DIRECTORY", "T_DISTINCT", "T_DISTRIBUTE", "T_DO", "T_DOUBLE", 
			"T_DOWNLOAD", "T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", "T_ELSIF", 
			"T_ENABLE", "T_END", "T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", "T_EXECUTE", 
			"T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", "T_EXIT", "T_FALLBACK", "T_FALSE", 
			"T_FETCH", "T_FIELDS", "T_FILE", "T_FILES", "T_FLOAT", "T_FOR", "T_FOREIGN", 
			"T_FORMAT", "T_FOUND", "T_FROM", "T_FULL", "T_FUNCTION", "T_GET", "T_GLOBAL", 
			"T_GO", "T_GRANT", "T_GRANTS", "T_GROUP", "T_HANDLER", "T_HASH", "T_HAVING", 
			"T_HOST", "T_IDENTITY", "T_IDENTIFIED", "T_IF", "T_IGNORE", "T_IMMEDIATE", 
			"T_IN", "T_INCLUDE", "T_INCREMENT", "T_INDEX", "T_INITRANS", "T_INNER", 
			"T_INOUT", "T_INSERT", "T_INT", "T_INT2", "T_INT4", "T_INT8", "T_INTEGER", 
			"T_INTERSECT", "T_INTERVAL", "T_INTO", "T_INVOKER", "T_IS", "T_ISOPEN", 
			"T_ITEMS", "T_JOIN", "T_KEEP", "T_KILL", "T_KEY", "T_KEYS", "T_KV_SEARCH", 
			"T_LANGUAGE", "T_LEAVE", "T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", "T_LOAD", 
			"T_LOCAL", "T_LOCATION", "T_LOCATOR", "T_LOCATORS", "T_LOCKS", "T_LOG", 
			"T_LOGGED", "T_LOGGING", "T_LOOP", "T_MAP", "T_MATCHED", "T_MAX", "T_MAXTRANS", 
			"T_MERGE", "T_MESSAGE_TEXT", "T_MICROSECOND", "T_MICROSECONDS", "T_MIN", 
			"T_MULTISET", "T_NCHAR", "T_NEW", "T_NVARCHAR", "T_NO", "T_NOCOUNT", 
			"T_NOCOMPRESS", "T_NOLOGGING", "T_NONE", "T_NOT", "T_NOTFOUND", "T_NULL", 
			"T_NUMERIC", "T_NUMBER", "T_OBJECT", "T_OFF", "T_ON", "T_ONLY", "T_OPEN", 
			"T_OR", "T_ORDER", "T_OUT", "T_OUTER", "T_OVER", "T_OVERWRITE", "T_OWNER", 
			"T_PACKAGE", "T_PARTITION", "T_PASSWORD", "T_PCTFREE", "T_PCTUSED", "T_PERCENT", 
			"T_PLS_INTEGER", "T_PRECISION", "T_PRESERVE", "T_PRIVILEGES", "T_PRIMARY", 
			"T_PRINT", "T_PROC", "T_PROCEDURE", "T_PYRAMID", "T_PYRAMIDS", "T_QUERY", 
			"T_QUERIES", "T_QUALIFY", "T_QUERY_BAND", "T_QUIT", "T_QUOTED_IDENTIFIER", 
			"T_RAISE", "T_REAL", "T_REFERENCES", "T_REGEXP", "T_RENAME", "T_REPLACE", 
			"T_RESIGNAL", "T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", "T_RETURN", 
			"T_RETURNS", "T_REVERSE", "T_REVOKE", "T_RIGHT", "T_RLIKE", "T_ROLE", 
			"T_ROLLBACK", "T_ROW", "T_ROWS", "T_ROWTYPE", "T_ROW_COUNT", "T_RR", 
			"T_RS", "T_PWD", "T_TRIM", "T_TABLESAMPLE", "T_SCHEMA", "T_SECOND", "T_SECONDS", 
			"T_SECURITY", "T_SEGMENT", "T_SEL", "T_SELECT", "T_SET", "T_SESSION", 
			"T_SESSIONS", "T_SETS", "T_SHOW", "T_SIGNAL", "T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT", 
			"T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", "T_SQL", "T_SQLEXCEPTION", 
			"T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", "T_SRID", "T_STATS", "T_STATISTICS", 
			"T_STEP", "T_STORAGE", "T_STORE", "T_STORED", "T_STRING", "T_SUBDIR", 
			"T_SUBSTRING", "T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", "T_TABLE", "T_TILE", 
			"T_VIEW", "T_TABLES", "T_VIEWS", "T_TABLESPACE", "T_TEMPORARY", "T_TERMINATED", 
			"T_TEXTIMAGE_ON", "T_THEN", "T_TIMESTAMP", "T_TINYINT", "T_TITLE", "T_TO", 
			"T_TOP", "T_TRANSACTION", "T_TRUE", "T_TRUNCATE", "T_TYPE", "T_UNION", 
			"T_UNIQUE", "T_UPDATE", "T_UR", "T_USE", "T_USING", "T_VALUE", "T_VALUES", 
			"T_VAR", "T_VARCHAR", "T_VARCHAR2", "T_VARYING", "T_VOLATILE", "T_WHEN", 
			"T_WHERE", "T_WHILE", "T_WITH", "T_WITHOUT", "T_WORK", "T_XACT_ABORT", 
			"T_XML", "T_YES", "T_ACTIVITY_COUNT", "T_CUME_DIST", "T_CURRENT_DATE", 
			"T_CURRENT_TIME", "T_PI", "T_CURRENT_TIMESTAMP", "T_CURRENT_USER", "T_DENSE_RANK", 
			"T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", 
			"T_MIN_PART_STRING", "T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", 
			"T_MIN_PART_DATE", "T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", 
			"T_STDEV", "T_SYSDATE", "T_VARIANCE", "T_USER", "T_METADATA", "T_ADD", 
			"T_COLON", "T_COMMA", "T_PIPE", "T_DIV", "T_DOT", "T_DOT2", "T_EQUAL", 
			"T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", "T_GREATER", "T_GREATEREQUAL", 
			"T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", "T_OPEN_P", "T_OPEN_SB", 
			"T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", "T_SUB", "L_ID", 
			"L_S_STRING", "L_D_STRING", "L_INT", "L_DEC", "L_WS", "L_M_COMMENT", 
			"L_S_COMMENT", "L_FILE", "T_HDFS", "T_HIVE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "StartDBSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StartDBSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode EOF() { return getToken(StartDBSqlParser.EOF, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(StartDBSqlParser.T_SEMICOLON, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			stmt();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_SEMICOLON) {
				{
				setState(215);
				match(T_SEMICOLON);
				}
			}

			setState(218);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public CreateDatabaseStmtContext createDatabaseStmt() {
			return getRuleContext(CreateDatabaseStmtContext.class,0);
		}
		public CreateTableStmtContext createTableStmt() {
			return getRuleContext(CreateTableStmtContext.class,0);
		}
		public DescribeStmtContext describeStmt() {
			return getRuleContext(DescribeStmtContext.class,0);
		}
		public DropDatabaseStmtContext dropDatabaseStmt() {
			return getRuleContext(DropDatabaseStmtContext.class,0);
		}
		public DropTableStmtContext dropTableStmt() {
			return getRuleContext(DropTableStmtContext.class,0);
		}
		public TruncateStmtContext truncateStmt() {
			return getRuleContext(TruncateStmtContext.class,0);
		}
		public UseStmtContext useStmt() {
			return getRuleContext(UseStmtContext.class,0);
		}
		public ShowDatabasesStmtContext showDatabasesStmt() {
			return getRuleContext(ShowDatabasesStmtContext.class,0);
		}
		public ShowTablesStmtContext showTablesStmt() {
			return getRuleContext(ShowTablesStmtContext.class,0);
		}
		public ShowCreateTableStmtContext showCreateTableStmt() {
			return getRuleContext(ShowCreateTableStmtContext.class,0);
		}
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public UpdateStmtContext updateStmt() {
			return getRuleContext(UpdateStmtContext.class,0);
		}
		public DeleteStmtContext deleteStmt() {
			return getRuleContext(DeleteStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				createDatabaseStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				createTableStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				describeStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				dropDatabaseStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				dropTableStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				truncateStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(226);
				useStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(227);
				showDatabasesStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(228);
				showTablesStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(229);
				showCreateTableStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(230);
				insertStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(231);
				updateStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(232);
				deleteStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(233);
				selectStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DbDotTableContext extends ParserRuleContext {
		public Token db;
		public Token table;
		public List<TerminalNode> T_MUL() { return getTokens(StartDBSqlParser.T_MUL); }
		public TerminalNode T_MUL(int i) {
			return getToken(StartDBSqlParser.T_MUL, i);
		}
		public List<TerminalNode> T_DEFAULT() { return getTokens(StartDBSqlParser.T_DEFAULT); }
		public TerminalNode T_DEFAULT(int i) {
			return getToken(StartDBSqlParser.T_DEFAULT, i);
		}
		public List<TerminalNode> L_ID() { return getTokens(StartDBSqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(StartDBSqlParser.L_ID, i);
		}
		public TerminalNode T_DOT() { return getToken(StartDBSqlParser.T_DOT, 0); }
		public DbDotTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbDotTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitDbDotTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbDotTableContext dbDotTable() throws RecognitionException {
		DbDotTableContext _localctx = new DbDotTableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dbDotTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(236);
				((DbDotTableContext)_localctx).db = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_DEFAULT || _la==T_MUL || _la==L_ID) ) {
					((DbDotTableContext)_localctx).db = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(237);
				match(T_DOT);
				}
				break;
			}
			setState(240);
			((DbDotTableContext)_localctx).table = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T_DEFAULT || _la==T_MUL || _la==L_ID) ) {
				((DbDotTableContext)_localctx).table = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserDotDbDotTableContext extends ParserRuleContext {
		public Token user;
		public DbDotTableContext dbDotTable() {
			return getRuleContext(DbDotTableContext.class,0);
		}
		public TerminalNode T_DOT() { return getToken(StartDBSqlParser.T_DOT, 0); }
		public TerminalNode L_ID() { return getToken(StartDBSqlParser.L_ID, 0); }
		public UserDotDbDotTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDotDbDotTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitUserDotDbDotTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserDotDbDotTableContext userDotDbDotTable() throws RecognitionException {
		UserDotDbDotTableContext _localctx = new UserDotDbDotTableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_userDotDbDotTable);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				dbDotTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(243);
					((UserDotDbDotTableContext)_localctx).user = match(L_ID);
					setState(244);
					match(T_DOT);
					}
					break;
				}
				setState(247);
				dbDotTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStmtItemContext extends ParserRuleContext {
		public AssignmentStmtSingleItemContext assignmentStmtSingleItem() {
			return getRuleContext(AssignmentStmtSingleItemContext.class,0);
		}
		public AssignmentStmtMultipleItemContext assignmentStmtMultipleItem() {
			return getRuleContext(AssignmentStmtMultipleItemContext.class,0);
		}
		public AssignmentStmtSelectItemContext assignmentStmtSelectItem() {
			return getRuleContext(AssignmentStmtSelectItemContext.class,0);
		}
		public AssignmentStmtItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmtItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitAssignmentStmtItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtItemContext assignmentStmtItem() throws RecognitionException {
		AssignmentStmtItemContext _localctx = new AssignmentStmtItemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentStmtItem);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				assignmentStmtSingleItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				assignmentStmtMultipleItem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				assignmentStmtSelectItem();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStmtSingleItemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(StartDBSqlParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(StartDBSqlParser.T_COLON, 0); }
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public AssignmentStmtSingleItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmtSingleItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitAssignmentStmtSingleItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtSingleItemContext assignmentStmtSingleItem() throws RecognitionException {
		AssignmentStmtSingleItemContext _localctx = new AssignmentStmtSingleItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentStmtSingleItem);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DOWNLOAD:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIME:
			case T_PI:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
			case T_HDFS:
			case T_HIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				ident();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(256);
					match(T_COLON);
					}
				}

				setState(259);
				match(T_EQUAL);
				setState(260);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(T_OPEN_P);
				setState(263);
				ident();
				setState(264);
				match(T_CLOSE_P);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(265);
					match(T_COLON);
					}
				}

				setState(268);
				match(T_EQUAL);
				setState(269);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStmtMultipleItemContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(StartDBSqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(StartDBSqlParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(StartDBSqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(StartDBSqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_EQUAL() { return getToken(StartDBSqlParser.T_EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public TerminalNode T_COLON() { return getToken(StartDBSqlParser.T_COLON, 0); }
		public AssignmentStmtMultipleItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmtMultipleItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitAssignmentStmtMultipleItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtMultipleItemContext assignmentStmtMultipleItem() throws RecognitionException {
		AssignmentStmtMultipleItemContext _localctx = new AssignmentStmtMultipleItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignmentStmtMultipleItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T_OPEN_P);
			setState(274);
			ident();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(275);
				match(T_COMMA);
				setState(276);
				ident();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			match(T_CLOSE_P);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(283);
				match(T_COLON);
				}
			}

			setState(286);
			match(T_EQUAL);
			setState(287);
			match(T_OPEN_P);
			setState(288);
			expr(0);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(289);
				match(T_COMMA);
				setState(290);
				expr(0);
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStmtSelectItemContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(StartDBSqlParser.T_EQUAL, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(StartDBSqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(StartDBSqlParser.T_OPEN_P, i);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(StartDBSqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(StartDBSqlParser.T_CLOSE_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_COLON() { return getToken(StartDBSqlParser.T_COLON, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public AssignmentStmtSelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmtSelectItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitAssignmentStmtSelectItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtSelectItemContext assignmentStmtSelectItem() throws RecognitionException {
		AssignmentStmtSelectItemContext _localctx = new AssignmentStmtSelectItemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmentStmtSelectItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DOWNLOAD:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIME:
			case T_PI:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
			case T_HDFS:
			case T_HIVE:
				{
				setState(298);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(299);
				match(T_OPEN_P);
				setState(300);
				ident();
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(301);
					match(T_COMMA);
					setState(302);
					ident();
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(308);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(312);
				match(T_COLON);
				}
			}

			setState(315);
			match(T_EQUAL);
			setState(316);
			match(T_OPEN_P);
			setState(317);
			selectStmt();
			setState(318);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowCreateTableStmtContext extends ParserRuleContext {
		public IdentContext relation;
		public TerminalNode T_SHOW() { return getToken(StartDBSqlParser.T_SHOW, 0); }
		public TerminalNode T_CREATE() { return getToken(StartDBSqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(StartDBSqlParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ShowCreateTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showCreateTableStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitShowCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowCreateTableStmtContext showCreateTableStmt() throws RecognitionException {
		ShowCreateTableStmtContext _localctx = new ShowCreateTableStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_showCreateTableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T_SHOW);
			setState(321);
			match(T_CREATE);
			setState(322);
			match(T_TABLE);
			setState(323);
			((ShowCreateTableStmtContext)_localctx).relation = ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableStmtContext extends ParserRuleContext {
		public CreateTableWithSelectContext createTableWithSelect() {
			return getRuleContext(CreateTableWithSelectContext.class,0);
		}
		public CreateTableWithLikeContext createTableWithLike() {
			return getRuleContext(CreateTableWithLikeContext.class,0);
		}
		public CreateTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableStmtContext createTableStmt() throws RecognitionException {
		CreateTableStmtContext _localctx = new CreateTableStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createTableStmt);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				createTableWithSelect();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				createTableWithLike();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableWithSelectContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(StartDBSqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(StartDBSqlParser.T_TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(StartDBSqlParser.T_AS, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode T_OR() { return getToken(StartDBSqlParser.T_OR, 0); }
		public TerminalNode T_REPLACE() { return getToken(StartDBSqlParser.T_REPLACE, 0); }
		public TerminalNode T_IF() { return getToken(StartDBSqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(StartDBSqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(StartDBSqlParser.T_EXISTS, 0); }
		public WithOptionContext withOption() {
			return getRuleContext(WithOptionContext.class,0);
		}
		public CreateTableWithSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableWithSelect; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitCreateTableWithSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableWithSelectContext createTableWithSelect() throws RecognitionException {
		CreateTableWithSelectContext _localctx = new CreateTableWithSelectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createTableWithSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T_CREATE);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OR) {
				{
				setState(330);
				match(T_OR);
				setState(331);
				match(T_REPLACE);
				}
			}

			setState(334);
			match(T_TABLE);
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(335);
				match(T_IF);
				setState(336);
				match(T_NOT);
				setState(337);
				match(T_EXISTS);
				}
				break;
			}
			setState(340);
			tableName();
			setState(341);
			match(T_AS);
			setState(342);
			selectStmt();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(343);
				withOption();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableWithLikeContext extends ParserRuleContext {
		public TableNameContext destination;
		public TableNameContext origination;
		public TerminalNode T_CREATE() { return getToken(StartDBSqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(StartDBSqlParser.T_TABLE, 0); }
		public TerminalNode T_LIKE() { return getToken(StartDBSqlParser.T_LIKE, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode T_OR() { return getToken(StartDBSqlParser.T_OR, 0); }
		public TerminalNode T_REPLACE() { return getToken(StartDBSqlParser.T_REPLACE, 0); }
		public TerminalNode T_IF() { return getToken(StartDBSqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(StartDBSqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(StartDBSqlParser.T_EXISTS, 0); }
		public CreateTableWithLikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableWithLike; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitCreateTableWithLike(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableWithLikeContext createTableWithLike() throws RecognitionException {
		CreateTableWithLikeContext _localctx = new CreateTableWithLikeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createTableWithLike);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T_CREATE);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OR) {
				{
				setState(347);
				match(T_OR);
				setState(348);
				match(T_REPLACE);
				}
			}

			setState(351);
			match(T_TABLE);
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(352);
				match(T_IF);
				setState(353);
				match(T_NOT);
				setState(354);
				match(T_EXISTS);
				}
				break;
			}
			setState(357);
			((CreateTableWithLikeContext)_localctx).destination = tableName();
			setState(358);
			match(T_LIKE);
			setState(359);
			((CreateTableWithLikeContext)_localctx).origination = tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithOptionContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(StartDBSqlParser.T_WITH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public WithOptionItemsContext withOptionItems() {
			return getRuleContext(WithOptionItemsContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public WithOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitWithOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithOptionContext withOption() throws RecognitionException {
		WithOptionContext _localctx = new WithOptionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_withOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T_WITH);
			setState(362);
			match(T_OPEN_P);
			setState(363);
			withOptionItems();
			setState(364);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithOptionItemsContext extends ParserRuleContext {
		public List<WithOptionItemContext> withOptionItem() {
			return getRuleContexts(WithOptionItemContext.class);
		}
		public WithOptionItemContext withOptionItem(int i) {
			return getRuleContext(WithOptionItemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public WithOptionItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withOptionItems; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitWithOptionItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithOptionItemsContext withOptionItems() throws RecognitionException {
		WithOptionItemsContext _localctx = new WithOptionItemsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_withOptionItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			withOptionItem();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(367);
				match(T_COMMA);
				setState(368);
				withOptionItem();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithOptionItemContext extends ParserRuleContext {
		public Token left;
		public Token right;
		public TerminalNode T_EQUAL() { return getToken(StartDBSqlParser.T_EQUAL, 0); }
		public List<TerminalNode> L_ID() { return getTokens(StartDBSqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(StartDBSqlParser.L_ID, i);
		}
		public List<TerminalNode> L_D_STRING() { return getTokens(StartDBSqlParser.L_D_STRING); }
		public TerminalNode L_D_STRING(int i) {
			return getToken(StartDBSqlParser.L_D_STRING, i);
		}
		public List<TerminalNode> L_S_STRING() { return getTokens(StartDBSqlParser.L_S_STRING); }
		public TerminalNode L_S_STRING(int i) {
			return getToken(StartDBSqlParser.L_S_STRING, i);
		}
		public WithOptionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withOptionItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitWithOptionItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithOptionItemContext withOptionItem() throws RecognitionException {
		WithOptionItemContext _localctx = new WithOptionItemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_withOptionItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			((WithOptionItemContext)_localctx).left = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 391)) & ~0x3f) == 0 && ((1L << (_la - 391)) & ((1L << (L_ID - 391)) | (1L << (L_S_STRING - 391)) | (1L << (L_D_STRING - 391)))) != 0)) ) {
				((WithOptionItemContext)_localctx).left = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(375);
			match(T_EQUAL);
			setState(376);
			((WithOptionItemContext)_localctx).right = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 391)) & ~0x3f) == 0 && ((1L << (_la - 391)) & ((1L << (L_ID - 391)) | (1L << (L_S_STRING - 391)) | (1L << (L_D_STRING - 391)))) != 0)) ) {
				((WithOptionItemContext)_localctx).right = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowTablesStmtContext extends ParserRuleContext {
		public TerminalNode T_SHOW() { return getToken(StartDBSqlParser.T_SHOW, 0); }
		public TerminalNode T_TABLES() { return getToken(StartDBSqlParser.T_TABLES, 0); }
		public ShowTablesStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTablesStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitShowTablesStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowTablesStmtContext showTablesStmt() throws RecognitionException {
		ShowTablesStmtContext _localctx = new ShowTablesStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_showTablesStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(T_SHOW);
			setState(379);
			match(T_TABLES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode T_CHAR() { return getToken(StartDBSqlParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(StartDBSqlParser.T_CHARACTER, 0); }
		public TerminalNode T_BIGINT() { return getToken(StartDBSqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(StartDBSqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(StartDBSqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BINARY_INTEGER() { return getToken(StartDBSqlParser.T_BINARY_INTEGER, 0); }
		public TerminalNode T_BIT() { return getToken(StartDBSqlParser.T_BIT, 0); }
		public TerminalNode T_DATE() { return getToken(StartDBSqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(StartDBSqlParser.T_DATETIME, 0); }
		public TerminalNode T_DEC() { return getToken(StartDBSqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(StartDBSqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DOUBLE() { return getToken(StartDBSqlParser.T_DOUBLE, 0); }
		public TerminalNode T_PRECISION() { return getToken(StartDBSqlParser.T_PRECISION, 0); }
		public TerminalNode T_FLOAT() { return getToken(StartDBSqlParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(StartDBSqlParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(StartDBSqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(StartDBSqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(StartDBSqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(StartDBSqlParser.T_INTEGER, 0); }
		public TerminalNode T_NCHAR() { return getToken(StartDBSqlParser.T_NCHAR, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(StartDBSqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NUMBER() { return getToken(StartDBSqlParser.T_NUMBER, 0); }
		public TerminalNode T_NUMERIC() { return getToken(StartDBSqlParser.T_NUMERIC, 0); }
		public TerminalNode T_PLS_INTEGER() { return getToken(StartDBSqlParser.T_PLS_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(StartDBSqlParser.T_REAL, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(StartDBSqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_VARYING() { return getToken(StartDBSqlParser.T_VARYING, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(StartDBSqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(StartDBSqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_INTEGER() { return getToken(StartDBSqlParser.T_SIMPLE_INTEGER, 0); }
		public TerminalNode T_SMALLINT() { return getToken(StartDBSqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(StartDBSqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_STRING() { return getToken(StartDBSqlParser.T_STRING, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(StartDBSqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(StartDBSqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TINYINT() { return getToken(StartDBSqlParser.T_TINYINT, 0); }
		public TerminalNode T_VARCHAR() { return getToken(StartDBSqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(StartDBSqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_XML() { return getToken(StartDBSqlParser.T_XML, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TYPE() { return getToken(StartDBSqlParser.T_TYPE, 0); }
		public TerminalNode T_ROWTYPE() { return getToken(StartDBSqlParser.T_ROWTYPE, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dtype);
		int _la;
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(T_CHARACTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				match(T_BIGINT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				match(T_BINARY_FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(386);
				match(T_BINARY_INTEGER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(387);
				match(T_BIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(388);
				match(T_DATE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(389);
				match(T_DATETIME);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(390);
				match(T_DEC);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(391);
				match(T_DECIMAL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(392);
				match(T_DOUBLE);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_PRECISION) {
					{
					setState(393);
					match(T_PRECISION);
					}
				}

				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(396);
				match(T_FLOAT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(397);
				match(T_INT);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(398);
				match(T_INT2);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(399);
				match(T_INT4);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(400);
				match(T_INT8);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(401);
				match(T_INTEGER);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(402);
				match(T_NCHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(403);
				match(T_NVARCHAR);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(404);
				match(T_NUMBER);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(405);
				match(T_NUMERIC);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(406);
				match(T_PLS_INTEGER);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(407);
				match(T_REAL);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(408);
				match(T_RESULT_SET_LOCATOR);
				setState(409);
				match(T_VARYING);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(410);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(411);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(412);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(413);
				match(T_SMALLINT);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(414);
				match(T_SMALLDATETIME);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(415);
				match(T_STRING);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(416);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(417);
				match(T_TIMESTAMP);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(418);
				match(T_TINYINT);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(419);
				match(T_VARCHAR);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(420);
				match(T_VARCHAR2);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(421);
				match(T_XML);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(422);
				ident();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(423);
					match(T__0);
					setState(424);
					_la = _input.LA(1);
					if ( !(_la==T_ROWTYPE || _la==T_TYPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeLenContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_INT() { return getTokens(StartDBSqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(StartDBSqlParser.L_INT, i);
		}
		public TerminalNode T_MAX() { return getToken(StartDBSqlParser.T_MAX, 0); }
		public TerminalNode T_COMMA() { return getToken(StartDBSqlParser.T_COMMA, 0); }
		public TerminalNode T_CHAR() { return getToken(StartDBSqlParser.T_CHAR, 0); }
		public TerminalNode T_BYTE() { return getToken(StartDBSqlParser.T_BYTE, 0); }
		public DtypeLenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtypeLen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitDtypeLen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeLenContext dtypeLen() throws RecognitionException {
		DtypeLenContext _localctx = new DtypeLenContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dtypeLen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T_OPEN_P);
			setState(430);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(431);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(434);
				match(T_COMMA);
				setState(435);
				match(L_INT);
				}
			}

			setState(438);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDatabaseStmtContext extends ParserRuleContext {
		public Token dbName;
		public TerminalNode T_CREATE() { return getToken(StartDBSqlParser.T_CREATE, 0); }
		public TerminalNode T_DATABASE() { return getToken(StartDBSqlParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(StartDBSqlParser.T_SCHEMA, 0); }
		public TerminalNode L_ID() { return getToken(StartDBSqlParser.L_ID, 0); }
		public TerminalNode T_IF() { return getToken(StartDBSqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(StartDBSqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(StartDBSqlParser.T_EXISTS, 0); }
		public List<CreateDatabaseOptionContext> createDatabaseOption() {
			return getRuleContexts(CreateDatabaseOptionContext.class);
		}
		public CreateDatabaseOptionContext createDatabaseOption(int i) {
			return getRuleContext(CreateDatabaseOptionContext.class,i);
		}
		public CreateDatabaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabaseStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitCreateDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabaseStmtContext createDatabaseStmt() throws RecognitionException {
		CreateDatabaseStmtContext _localctx = new CreateDatabaseStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_createDatabaseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(T_CREATE);
			setState(441);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(442);
				match(T_IF);
				setState(443);
				match(T_NOT);
				setState(444);
				match(T_EXISTS);
				}
			}

			setState(447);
			((CreateDatabaseStmtContext)_localctx).dbName = match(L_ID);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMENT || _la==T_LOCATION) {
				{
				{
				setState(448);
				createDatabaseOption();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowDatabasesStmtContext extends ParserRuleContext {
		public TerminalNode T_SHOW() { return getToken(StartDBSqlParser.T_SHOW, 0); }
		public TerminalNode T_DATABASES() { return getToken(StartDBSqlParser.T_DATABASES, 0); }
		public ShowDatabasesStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDatabasesStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitShowDatabasesStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDatabasesStmtContext showDatabasesStmt() throws RecognitionException {
		ShowDatabasesStmtContext _localctx = new ShowDatabasesStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_showDatabasesStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(T_SHOW);
			setState(455);
			match(T_DATABASES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropDatabaseStmtContext extends ParserRuleContext {
		public Token dbName;
		public TerminalNode T_DROP() { return getToken(StartDBSqlParser.T_DROP, 0); }
		public TerminalNode T_DATABASE() { return getToken(StartDBSqlParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(StartDBSqlParser.T_SCHEMA, 0); }
		public TerminalNode L_ID() { return getToken(StartDBSqlParser.L_ID, 0); }
		public TerminalNode T_IF() { return getToken(StartDBSqlParser.T_IF, 0); }
		public TerminalNode T_EXISTS() { return getToken(StartDBSqlParser.T_EXISTS, 0); }
		public DropDatabaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDatabaseStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitDropDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropDatabaseStmtContext dropDatabaseStmt() throws RecognitionException {
		DropDatabaseStmtContext _localctx = new DropDatabaseStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dropDatabaseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(T_DROP);
			setState(458);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(459);
				match(T_IF);
				setState(460);
				match(T_EXISTS);
				}
			}

			setState(463);
			((DropDatabaseStmtContext)_localctx).dbName = match(L_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDatabaseOptionContext extends ParserRuleContext {
		public TerminalNode T_COMMENT() { return getToken(StartDBSqlParser.T_COMMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_LOCATION() { return getToken(StartDBSqlParser.T_LOCATION, 0); }
		public CreateDatabaseOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabaseOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitCreateDatabaseOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabaseOptionContext createDatabaseOption() throws RecognitionException {
		CreateDatabaseOptionContext _localctx = new CreateDatabaseOptionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_createDatabaseOption);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(T_COMMENT);
				setState(466);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(T_LOCATION);
				setState(468);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTableStmtContext extends ParserRuleContext {
		public TerminalNode T_DROP() { return getToken(StartDBSqlParser.T_DROP, 0); }
		public TerminalNode T_TABLE() { return getToken(StartDBSqlParser.T_TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(StartDBSqlParser.T_IF, 0); }
		public TerminalNode T_EXISTS() { return getToken(StartDBSqlParser.T_EXISTS, 0); }
		public DropTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTableStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitDropTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableStmtContext dropTableStmt() throws RecognitionException {
		DropTableStmtContext _localctx = new DropTableStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dropTableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T_DROP);
			setState(472);
			match(T_TABLE);
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(473);
				match(T_IF);
				setState(474);
				match(T_EXISTS);
				}
				break;
			}
			setState(477);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStmtContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(StartDBSqlParser.T_INSERT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode T_OVERWRITE() { return getToken(StartDBSqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_TABLE() { return getToken(StartDBSqlParser.T_TABLE, 0); }
		public TerminalNode T_INTO() { return getToken(StartDBSqlParser.T_INTO, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public InsertStmtRowsContext insertStmtRows() {
			return getRuleContext(InsertStmtRowsContext.class,0);
		}
		public InsertStmtColsContext insertStmtCols() {
			return getRuleContext(InsertStmtColsContext.class,0);
		}
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitInsertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStmtContext insertStmt() throws RecognitionException {
		InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(T_INSERT);
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_OVERWRITE:
				{
				setState(480);
				match(T_OVERWRITE);
				setState(481);
				match(T_TABLE);
				}
				break;
			case T_INTO:
				{
				setState(482);
				match(T_INTO);
				setState(484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(483);
					match(T_TABLE);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(488);
			tableName();
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(489);
				insertStmtCols();
				}
				break;
			}
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
			case T_WITH:
			case T_OPEN_P:
				{
				setState(492);
				selectStmt();
				}
				break;
			case T_VALUES:
				{
				setState(493);
				insertStmtRows();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStmtColsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public InsertStmtColsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmtCols; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitInsertStmtCols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStmtColsContext insertStmtCols() throws RecognitionException {
		InsertStmtColsContext _localctx = new InsertStmtColsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_insertStmtCols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(T_OPEN_P);
			setState(497);
			ident();
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(498);
				match(T_COMMA);
				setState(499);
				ident();
				}
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStmtRowsContext extends ParserRuleContext {
		public TerminalNode T_VALUES() { return getToken(StartDBSqlParser.T_VALUES, 0); }
		public List<InsertStmtRowContext> insertStmtRow() {
			return getRuleContexts(InsertStmtRowContext.class);
		}
		public InsertStmtRowContext insertStmtRow(int i) {
			return getRuleContext(InsertStmtRowContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public InsertStmtRowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmtRows; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitInsertStmtRows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStmtRowsContext insertStmtRows() throws RecognitionException {
		InsertStmtRowsContext _localctx = new InsertStmtRowsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_insertStmtRows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(T_VALUES);
			setState(508);
			insertStmtRow();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(509);
				match(T_COMMA);
				setState(510);
				insertStmtRow();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStmtRowContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public InsertStmtRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmtRow; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitInsertStmtRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStmtRowContext insertStmtRow() throws RecognitionException {
		InsertStmtRowContext _localctx = new InsertStmtRowContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_insertStmtRow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(T_OPEN_P);
			setState(517);
			expr(0);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(518);
				match(T_COMMA);
				setState(519);
				expr(0);
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncateStmtContext extends ParserRuleContext {
		public TerminalNode T_TRUNCATE() { return getToken(StartDBSqlParser.T_TRUNCATE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TABLE() { return getToken(StartDBSqlParser.T_TABLE, 0); }
		public TruncateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitTruncateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateStmtContext truncateStmt() throws RecognitionException {
		TruncateStmtContext _localctx = new TruncateStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_truncateStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(T_TRUNCATE);
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(528);
				match(T_TABLE);
				}
				break;
			}
			setState(531);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseStmtContext extends ParserRuleContext {
		public Token dbName;
		public TerminalNode T_USE() { return getToken(StartDBSqlParser.T_USE, 0); }
		public TerminalNode L_ID() { return getToken(StartDBSqlParser.L_ID, 0); }
		public TerminalNode T_DEFAULT() { return getToken(StartDBSqlParser.T_DEFAULT, 0); }
		public UseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitUseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStmtContext useStmt() throws RecognitionException {
		UseStmtContext _localctx = new UseStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_useStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(T_USE);
			setState(534);
			((UseStmtContext)_localctx).dbName = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T_DEFAULT || _la==L_ID) ) {
				((UseStmtContext)_localctx).dbName = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStmtContext extends ParserRuleContext {
		public FullselectStmtContext fullselectStmt() {
			return getRuleContext(FullselectStmtContext.class,0);
		}
		public CteSelectStmtContext cteSelectStmt() {
			return getRuleContext(CteSelectStmtContext.class,0);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(536);
				cteSelectStmt();
				}
			}

			setState(539);
			fullselectStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CteSelectStmtContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(StartDBSqlParser.T_WITH, 0); }
		public List<CteSelectStmtItemContext> cteSelectStmtItem() {
			return getRuleContexts(CteSelectStmtItemContext.class);
		}
		public CteSelectStmtItemContext cteSelectStmtItem(int i) {
			return getRuleContext(CteSelectStmtItemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public CteSelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteSelectStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitCteSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CteSelectStmtContext cteSelectStmt() throws RecognitionException {
		CteSelectStmtContext _localctx = new CteSelectStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cteSelectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(T_WITH);
			setState(542);
			cteSelectStmtItem();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(543);
				match(T_COMMA);
				setState(544);
				cteSelectStmtItem();
				}
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CteSelectStmtItemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(StartDBSqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public FullselectStmtContext fullselectStmt() {
			return getRuleContext(FullselectStmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public CteSelectColsContext cteSelectCols() {
			return getRuleContext(CteSelectColsContext.class,0);
		}
		public CteSelectStmtItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteSelectStmtItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitCteSelectStmtItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CteSelectStmtItemContext cteSelectStmtItem() throws RecognitionException {
		CteSelectStmtItemContext _localctx = new CteSelectStmtItemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cteSelectStmtItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			ident();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(551);
				cteSelectCols();
				}
			}

			setState(554);
			match(T_AS);
			setState(555);
			match(T_OPEN_P);
			setState(556);
			fullselectStmt();
			setState(557);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CteSelectColsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public CteSelectColsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteSelectCols; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitCteSelectCols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CteSelectColsContext cteSelectCols() throws RecognitionException {
		CteSelectColsContext _localctx = new CteSelectColsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cteSelectCols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(T_OPEN_P);
			setState(560);
			ident();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(561);
				match(T_COMMA);
				setState(562);
				ident();
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullselectStmtContext extends ParserRuleContext {
		public List<FullselectStmtItemContext> fullselectStmtItem() {
			return getRuleContexts(FullselectStmtItemContext.class);
		}
		public FullselectStmtItemContext fullselectStmtItem(int i) {
			return getRuleContext(FullselectStmtItemContext.class,i);
		}
		public List<FullselectSetClauseContext> fullselectSetClause() {
			return getRuleContexts(FullselectSetClauseContext.class);
		}
		public FullselectSetClauseContext fullselectSetClause(int i) {
			return getRuleContext(FullselectSetClauseContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public FullselectStmtContext fullselectStmt() {
			return getRuleContext(FullselectStmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public FullselectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselectStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitFullselectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullselectStmtContext fullselectStmt() throws RecognitionException {
		FullselectStmtContext _localctx = new FullselectStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fullselectStmt);
		int _la;
		try {
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				fullselectStmtItem();
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_EXCEPT || _la==T_INTERSECT || _la==T_UNION) {
					{
					{
					setState(571);
					fullselectSetClause();
					setState(572);
					fullselectStmtItem();
					}
					}
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(T_OPEN_P);
				setState(580);
				fullselectStmt();
				setState(581);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullselectStmtItemContext extends ParserRuleContext {
		public SubselectStmtContext subselectStmt() {
			return getRuleContext(SubselectStmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public FullselectStmtContext fullselectStmt() {
			return getRuleContext(FullselectStmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public FullselectStmtItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselectStmtItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitFullselectStmtItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullselectStmtItemContext fullselectStmtItem() throws RecognitionException {
		FullselectStmtItemContext _localctx = new FullselectStmtItemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fullselectStmtItem);
		try {
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				subselectStmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				match(T_OPEN_P);
				setState(587);
				fullselectStmt();
				setState(588);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullselectSetClauseContext extends ParserRuleContext {
		public TerminalNode T_UNION() { return getToken(StartDBSqlParser.T_UNION, 0); }
		public TerminalNode T_ALL() { return getToken(StartDBSqlParser.T_ALL, 0); }
		public TerminalNode T_EXCEPT() { return getToken(StartDBSqlParser.T_EXCEPT, 0); }
		public TerminalNode T_INTERSECT() { return getToken(StartDBSqlParser.T_INTERSECT, 0); }
		public FullselectSetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselectSetClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitFullselectSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullselectSetClauseContext fullselectSetClause() throws RecognitionException {
		FullselectSetClauseContext _localctx = new FullselectSetClauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fullselectSetClause);
		int _la;
		try {
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				match(T_UNION);
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(593);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				match(T_EXCEPT);
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(597);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(600);
				match(T_INTERSECT);
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(601);
					match(T_ALL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubselectStmtContext extends ParserRuleContext {
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode T_SELECT() { return getToken(StartDBSqlParser.T_SELECT, 0); }
		public TerminalNode T_SEL() { return getToken(StartDBSqlParser.T_SEL, 0); }
		public IntoClauseContext intoClause() {
			return getRuleContext(IntoClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public QualifyClauseContext qualifyClause() {
			return getRuleContext(QualifyClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public SelectOptionsContext selectOptions() {
			return getRuleContext(SelectOptionsContext.class,0);
		}
		public SubselectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselectStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitSubselectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubselectStmtContext subselectStmt() throws RecognitionException {
		SubselectStmtContext _localctx = new SubselectStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_subselectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(607);
			selectList();
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_INTO) {
				{
				setState(608);
				intoClause();
				}
			}

			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_FROM) {
				{
				setState(611);
				fromClause();
				}
			}

			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WHERE) {
				{
				setState(614);
				whereClause();
				}
			}

			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GROUP) {
				{
				setState(617);
				groupByClause();
				}
			}

			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_HAVING:
				{
				setState(620);
				havingClause();
				}
				break;
			case T_QUALIFY:
				{
				setState(621);
				qualifyClause();
				}
				break;
			case EOF:
			case T_EXCEPT:
			case T_INTERSECT:
			case T_LIMIT:
			case T_ORDER:
			case T_UNION:
			case T_WITH:
			case T_CLOSE_P:
			case T_SEMICOLON:
				break;
			default:
				break;
			}
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(624);
				orderByClause();
				}
			}

			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(627);
				selectOptions();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectListContext extends ParserRuleContext {
		public List<SelectListItemContext> selectListItem() {
			return getRuleContexts(SelectListItemContext.class);
		}
		public SelectListItemContext selectListItem(int i) {
			return getRuleContext(SelectListItemContext.class,i);
		}
		public SelectListSetContext selectListSet() {
			return getRuleContext(SelectListSetContext.class,0);
		}
		public SelectListLimitContext selectListLimit() {
			return getRuleContext(SelectListLimitContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_selectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(630);
				selectListSet();
				}
				break;
			}
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(633);
				selectListLimit();
				}
				break;
			}
			setState(636);
			selectListItem();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(637);
				match(T_COMMA);
				setState(638);
				selectListItem();
				}
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectListSetContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(StartDBSqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(StartDBSqlParser.T_DISTINCT, 0); }
		public SelectListSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectListSet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitSelectListSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListSetContext selectListSet() throws RecognitionException {
		SelectListSetContext _localctx = new SelectListSetContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_selectListSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectListLimitContext extends ParserRuleContext {
		public TerminalNode T_TOP() { return getToken(StartDBSqlParser.T_TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SelectListLimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectListLimit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitSelectListLimit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListLimitContext selectListLimit() throws RecognitionException {
		SelectListLimitContext _localctx = new SelectListLimitContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_selectListLimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(T_TOP);
			setState(647);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectListItemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SelectListAsteriskContext selectListAsterisk() {
			return getRuleContext(SelectListAsteriskContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(StartDBSqlParser.T_EQUAL, 0); }
		public SelectListAliasContext selectListAlias() {
			return getRuleContext(SelectListAliasContext.class,0);
		}
		public SelectListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectListItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitSelectListItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListItemContext selectListItem() throws RecognitionException {
		SelectListItemContext _localctx = new SelectListItemContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_selectListItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(649);
					ident();
					setState(650);
					match(T_EQUAL);
					}
					break;
				}
				setState(654);
				expr(0);
				setState(656);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(655);
					selectListAlias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(658);
				selectListAsterisk();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectListAliasContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_AS() { return getToken(StartDBSqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public TerminalNode T_TITLE() { return getToken(StartDBSqlParser.T_TITLE, 0); }
		public TerminalNode L_S_STRING() { return getToken(StartDBSqlParser.L_S_STRING, 0); }
		public SelectListAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectListAlias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitSelectListAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListAliasContext selectListAlias() throws RecognitionException {
		SelectListAliasContext _localctx = new SelectListAliasContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_selectListAlias);
		int _la;
		try {
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(661);
					match(T_AS);
					}
					break;
				}
				setState(664);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(665);
					match(T_AS);
					}
				}

				setState(668);
				match(T_OPEN_P);
				setState(669);
				ident();
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(670);
					match(T_COMMA);
					setState(671);
					ident();
					}
					}
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(677);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(679);
				match(T_OPEN_P);
				setState(680);
				match(T_TITLE);
				setState(681);
				match(L_S_STRING);
				setState(682);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectListAsteriskContext extends ParserRuleContext {
		public TerminalNode T_MUL() { return getToken(StartDBSqlParser.T_MUL, 0); }
		public TerminalNode L_ID() { return getToken(StartDBSqlParser.L_ID, 0); }
		public TerminalNode T_DOT() { return getToken(StartDBSqlParser.T_DOT, 0); }
		public SelectListAsteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectListAsterisk; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitSelectListAsterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListAsteriskContext selectListAsterisk() throws RecognitionException {
		SelectListAsteriskContext _localctx = new SelectListAsteriskContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_selectListAsterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(685);
				match(L_ID);
				setState(686);
				match(T_DOT);
				}
			}

			setState(689);
			match(T_MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntoClauseContext extends ParserRuleContext {
		public TerminalNode T_INTO() { return getToken(StartDBSqlParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public IntoClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intoClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitIntoClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntoClauseContext intoClause() throws RecognitionException {
		IntoClauseContext _localctx = new IntoClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_intoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(T_INTO);
			setState(692);
			ident();
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(693);
				match(T_COMMA);
				setState(694);
				ident();
				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode T_FROM() { return getToken(StartDBSqlParser.T_FROM, 0); }
		public FromTableClauseContext fromTableClause() {
			return getRuleContext(FromTableClauseContext.class,0);
		}
		public List<FromJoinClauseContext> fromJoinClause() {
			return getRuleContexts(FromJoinClauseContext.class);
		}
		public FromJoinClauseContext fromJoinClause(int i) {
			return getRuleContext(FromJoinClauseContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(T_FROM);
			setState(701);
			fromTableClause();
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(702);
					fromJoinClause();
					}
					} 
				}
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromTableClauseContext extends ParserRuleContext {
		public FromTableNameClauseContext fromTableNameClause() {
			return getRuleContext(FromTableNameClauseContext.class,0);
		}
		public FromSubselectClauseContext fromSubselectClause() {
			return getRuleContext(FromSubselectClauseContext.class,0);
		}
		public FromTableValuesClauseContext fromTableValuesClause() {
			return getRuleContext(FromTableValuesClauseContext.class,0);
		}
		public FromTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromTableClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitFromTableClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromTableClauseContext fromTableClause() throws RecognitionException {
		FromTableClauseContext _localctx = new FromTableClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fromTableClause);
		try {
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				fromTableNameClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				fromSubselectClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(710);
				fromTableValuesClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromTableNameClauseContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public FromAliasClauseContext fromAliasClause() {
			return getRuleContext(FromAliasClauseContext.class,0);
		}
		public SampleClauseContext sampleClause() {
			return getRuleContext(SampleClauseContext.class,0);
		}
		public FromTableNameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromTableNameClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitFromTableNameClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromTableNameClauseContext fromTableNameClause() throws RecognitionException {
		FromTableNameClauseContext _localctx = new FromTableNameClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fromTableNameClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			tableName();
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(714);
				fromAliasClause();
				}
				break;
			}
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TABLESAMPLE) {
				{
				setState(717);
				sampleClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromSubselectClauseContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public FromAliasClauseContext fromAliasClause() {
			return getRuleContext(FromAliasClauseContext.class,0);
		}
		public FromSubselectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromSubselectClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitFromSubselectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromSubselectClauseContext fromSubselectClause() throws RecognitionException {
		FromSubselectClauseContext _localctx = new FromSubselectClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_fromSubselectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(T_OPEN_P);
			setState(721);
			selectStmt();
			setState(722);
			match(T_CLOSE_P);
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(723);
				fromAliasClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromJoinClauseContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(StartDBSqlParser.T_COMMA, 0); }
		public FromTableClauseContext fromTableClause() {
			return getRuleContext(FromTableClauseContext.class,0);
		}
		public FromJoinTypeClauseContext fromJoinTypeClause() {
			return getRuleContext(FromJoinTypeClauseContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(StartDBSqlParser.T_ON, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public FromJoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromJoinClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitFromJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromJoinClauseContext fromJoinClause() throws RecognitionException {
		FromJoinClauseContext _localctx = new FromJoinClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fromJoinClause);
		try {
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				match(T_COMMA);
				setState(727);
				fromTableClause();
				}
				break;
			case T_FULL:
			case T_INNER:
			case T_JOIN:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				fromJoinTypeClause();
				setState(729);
				fromTableClause();
				setState(730);
				match(T_ON);
				setState(731);
				boolExpr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromJoinTypeClauseContext extends ParserRuleContext {
		public TerminalNode T_JOIN() { return getToken(StartDBSqlParser.T_JOIN, 0); }
		public TerminalNode T_INNER() { return getToken(StartDBSqlParser.T_INNER, 0); }
		public TerminalNode T_LEFT() { return getToken(StartDBSqlParser.T_LEFT, 0); }
		public TerminalNode T_RIGHT() { return getToken(StartDBSqlParser.T_RIGHT, 0); }
		public TerminalNode T_FULL() { return getToken(StartDBSqlParser.T_FULL, 0); }
		public TerminalNode T_OUTER() { return getToken(StartDBSqlParser.T_OUTER, 0); }
		public FromJoinTypeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromJoinTypeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitFromJoinTypeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromJoinTypeClauseContext fromJoinTypeClause() throws RecognitionException {
		FromJoinTypeClauseContext _localctx = new FromJoinTypeClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fromJoinTypeClause);
		int _la;
		try {
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(735);
					match(T_INNER);
					}
				}

				setState(738);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(740);
					match(T_OUTER);
					}
				}

				setState(743);
				match(T_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromTableValuesClauseContext extends ParserRuleContext {
		public TerminalNode T_TABLE() { return getToken(StartDBSqlParser.T_TABLE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_VALUES() { return getToken(StartDBSqlParser.T_VALUES, 0); }
		public List<FromTableValuesRowContext> fromTableValuesRow() {
			return getRuleContexts(FromTableValuesRowContext.class);
		}
		public FromTableValuesRowContext fromTableValuesRow(int i) {
			return getRuleContext(FromTableValuesRowContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public FromAliasClauseContext fromAliasClause() {
			return getRuleContext(FromAliasClauseContext.class,0);
		}
		public FromTableValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromTableValuesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitFromTableValuesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromTableValuesClauseContext fromTableValuesClause() throws RecognitionException {
		FromTableValuesClauseContext _localctx = new FromTableValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_fromTableValuesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(T_TABLE);
			setState(747);
			match(T_OPEN_P);
			setState(748);
			match(T_VALUES);
			setState(749);
			fromTableValuesRow();
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(750);
				match(T_COMMA);
				setState(751);
				fromTableValuesRow();
				}
				}
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(757);
			match(T_CLOSE_P);
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(758);
				fromAliasClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromTableValuesRowContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public FromTableValuesRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromTableValuesRow; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitFromTableValuesRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromTableValuesRowContext fromTableValuesRow() throws RecognitionException {
		FromTableValuesRowContext _localctx = new FromTableValuesRowContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_fromTableValuesRow);
		int _la;
		try {
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				match(T_OPEN_P);
				setState(763);
				expr(0);
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(764);
					match(T_COMMA);
					setState(765);
					expr(0);
					}
					}
					setState(770);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(771);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromAliasClauseContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(StartDBSqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public List<TerminalNode> L_ID() { return getTokens(StartDBSqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(StartDBSqlParser.L_ID, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public FromAliasClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromAliasClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitFromAliasClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromAliasClauseContext fromAliasClause() throws RecognitionException {
		FromAliasClauseContext _localctx = new FromAliasClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fromAliasClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(776);
				match(T_AS);
				}
				break;
			}
			setState(779);
			ident();
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(780);
				match(T_OPEN_P);
				setState(781);
				match(L_ID);
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(782);
					match(T_COMMA);
					setState(783);
					match(L_ID);
					}
					}
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(789);
				match(T_CLOSE_P);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode T_WHERE() { return getToken(StartDBSqlParser.T_WHERE, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(T_WHERE);
			setState(795);
			boolExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode T_GROUP() { return getToken(StartDBSqlParser.T_GROUP, 0); }
		public TerminalNode T_BY() { return getToken(StartDBSqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(T_GROUP);
			setState(798);
			match(T_BY);
			setState(799);
			expr(0);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(800);
				match(T_COMMA);
				setState(801);
				expr(0);
				}
				}
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode T_HAVING() { return getToken(StartDBSqlParser.T_HAVING, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(T_HAVING);
			setState(808);
			boolExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifyClauseContext extends ParserRuleContext {
		public TerminalNode T_QUALIFY() { return getToken(StartDBSqlParser.T_QUALIFY, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public QualifyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifyClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitQualifyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifyClauseContext qualifyClause() throws RecognitionException {
		QualifyClauseContext _localctx = new QualifyClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_qualifyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(T_QUALIFY);
			setState(811);
			boolExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode T_ORDER() { return getToken(StartDBSqlParser.T_ORDER, 0); }
		public TerminalNode T_BY() { return getToken(StartDBSqlParser.T_BY, 0); }
		public List<OrderByClauseItemContext> orderByClauseItem() {
			return getRuleContexts(OrderByClauseItemContext.class);
		}
		public OrderByClauseItemContext orderByClauseItem(int i) {
			return getRuleContext(OrderByClauseItemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(T_ORDER);
			setState(814);
			match(T_BY);
			setState(815);
			orderByClauseItem();
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(816);
				match(T_COMMA);
				setState(817);
				orderByClauseItem();
				}
				}
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseItemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_ASC() { return getToken(StartDBSqlParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(StartDBSqlParser.T_DESC, 0); }
		public OrderByClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClauseItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitOrderByClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseItemContext orderByClauseItem() throws RecognitionException {
		OrderByClauseItemContext _localctx = new OrderByClauseItemContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_orderByClauseItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			expr(0);
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(824);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleClauseContext extends ParserRuleContext {
		public TerminalNode T_TABLESAMPLE() { return getToken(StartDBSqlParser.T_TABLESAMPLE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public TerminalNode L_INT() { return getToken(StartDBSqlParser.L_INT, 0); }
		public TerminalNode T_PERCENT() { return getToken(StartDBSqlParser.T_PERCENT, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public SampleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitSampleClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleClauseContext sampleClause() throws RecognitionException {
		SampleClauseContext _localctx = new SampleClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_sampleClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(T_TABLESAMPLE);
			setState(828);
			match(T_OPEN_P);
			setState(829);
			match(L_INT);
			setState(830);
			match(T_PERCENT);
			setState(831);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectOptionsContext extends ParserRuleContext {
		public List<SelectOptionsItemContext> selectOptionsItem() {
			return getRuleContexts(SelectOptionsItemContext.class);
		}
		public SelectOptionsItemContext selectOptionsItem(int i) {
			return getRuleContext(SelectOptionsItemContext.class,i);
		}
		public SelectOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitSelectOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectOptionsContext selectOptions() throws RecognitionException {
		SelectOptionsContext _localctx = new SelectOptionsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_selectOptions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(834); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(833);
					selectOptionsItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(836); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectOptionsItemContext extends ParserRuleContext {
		public TerminalNode T_LIMIT() { return getToken(StartDBSqlParser.T_LIMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_WITH() { return getToken(StartDBSqlParser.T_WITH, 0); }
		public TerminalNode T_RR() { return getToken(StartDBSqlParser.T_RR, 0); }
		public TerminalNode T_RS() { return getToken(StartDBSqlParser.T_RS, 0); }
		public TerminalNode T_CS() { return getToken(StartDBSqlParser.T_CS, 0); }
		public TerminalNode T_UR() { return getToken(StartDBSqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(StartDBSqlParser.T_USE, 0); }
		public TerminalNode T_AND() { return getToken(StartDBSqlParser.T_AND, 0); }
		public TerminalNode T_KEEP() { return getToken(StartDBSqlParser.T_KEEP, 0); }
		public TerminalNode T_LOCKS() { return getToken(StartDBSqlParser.T_LOCKS, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(StartDBSqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_UPDATE() { return getToken(StartDBSqlParser.T_UPDATE, 0); }
		public SelectOptionsItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectOptionsItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitSelectOptionsItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectOptionsItemContext selectOptionsItem() throws RecognitionException {
		SelectOptionsItemContext _localctx = new SelectOptionsItemContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_selectOptionsItem);
		int _la;
		try {
			setState(849);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				match(T_LIMIT);
				setState(839);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				match(T_WITH);
				setState(841);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (T_RR - 258)) | (1L << (T_RS - 258)) | (1L << (T_UR - 258)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_USE) {
					{
					setState(842);
					match(T_USE);
					setState(843);
					match(T_AND);
					setState(844);
					match(T_KEEP);
					setState(845);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(846);
					match(T_LOCKS);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateStmtContext extends ParserRuleContext {
		public TerminalNode T_UPDATE() { return getToken(StartDBSqlParser.T_UPDATE, 0); }
		public UpdateTableContext updateTable() {
			return getRuleContext(UpdateTableContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(StartDBSqlParser.T_SET, 0); }
		public UpdateAssignmentContext updateAssignment() {
			return getRuleContext(UpdateAssignmentContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateUpsertContext updateUpsert() {
			return getRuleContext(UpdateUpsertContext.class,0);
		}
		public UpdateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitUpdateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStmtContext updateStmt() throws RecognitionException {
		UpdateStmtContext _localctx = new UpdateStmtContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_updateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(T_UPDATE);
			setState(852);
			updateTable();
			setState(853);
			match(T_SET);
			setState(854);
			updateAssignment();
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WHERE) {
				{
				setState(855);
				whereClause();
				}
			}

			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(858);
				updateUpsert();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateAssignmentContext extends ParserRuleContext {
		public List<AssignmentStmtItemContext> assignmentStmtItem() {
			return getRuleContexts(AssignmentStmtItemContext.class);
		}
		public AssignmentStmtItemContext assignmentStmtItem(int i) {
			return getRuleContext(AssignmentStmtItemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public UpdateAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitUpdateAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateAssignmentContext updateAssignment() throws RecognitionException {
		UpdateAssignmentContext _localctx = new UpdateAssignmentContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_updateAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			assignmentStmtItem();
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(862);
				match(T_COMMA);
				setState(863);
				assignmentStmtItem();
				}
				}
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateTableContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(StartDBSqlParser.T_AS, 0); }
		public UpdateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateTableContext updateTable() throws RecognitionException {
		UpdateTableContext _localctx = new UpdateTableContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_updateTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DOWNLOAD:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIME:
			case T_PI:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
			case T_HDFS:
			case T_HIVE:
				{
				setState(869);
				tableName();
				setState(871);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(870);
					fromClause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(873);
				match(T_OPEN_P);
				setState(874);
				selectStmt();
				setState(875);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(879);
					match(T_AS);
					}
					break;
				}
				setState(882);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateUpsertContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(StartDBSqlParser.T_ELSE, 0); }
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public UpdateUpsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateUpsert; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitUpdateUpsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateUpsertContext updateUpsert() throws RecognitionException {
		UpdateUpsertContext _localctx = new UpdateUpsertContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_updateUpsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(T_ELSE);
			setState(886);
			insertStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteStmtContext extends ParserRuleContext {
		public TerminalNode T_DELETE() { return getToken(StartDBSqlParser.T_DELETE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode T_FROM() { return getToken(StartDBSqlParser.T_FROM, 0); }
		public DeleteAliasContext deleteAlias() {
			return getRuleContext(DeleteAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode T_ALL() { return getToken(StartDBSqlParser.T_ALL, 0); }
		public DeleteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitDeleteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStmtContext deleteStmt() throws RecognitionException {
		DeleteStmtContext _localctx = new DeleteStmtContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_deleteStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(T_DELETE);
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(889);
				match(T_FROM);
				}
				break;
			}
			setState(892);
			tableName();
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(893);
				deleteAlias();
				}
				break;
			}
			setState(898);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WHERE:
				{
				setState(896);
				whereClause();
				}
				break;
			case T_ALL:
				{
				setState(897);
				match(T_ALL);
				}
				break;
			case EOF:
			case T_SEMICOLON:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteAliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(StartDBSqlParser.T_AS, 0); }
		public DeleteAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteAlias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitDeleteAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteAliasContext deleteAlias() throws RecognitionException {
		DeleteAliasContext _localctx = new DeleteAliasContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_deleteAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("ALL"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"ALL\")");
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(901);
				match(T_AS);
				}
				break;
			}
			setState(904);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeStmtContext extends ParserRuleContext {
		public UserDotDbDotTableContext userDotDbDotTable() {
			return getRuleContext(UserDotDbDotTableContext.class,0);
		}
		public TerminalNode T_DESCRIBE() { return getToken(StartDBSqlParser.T_DESCRIBE, 0); }
		public TerminalNode T_DESC() { return getToken(StartDBSqlParser.T_DESC, 0); }
		public TerminalNode T_TABLE() { return getToken(StartDBSqlParser.T_TABLE, 0); }
		public TerminalNode T_VIEW() { return getToken(StartDBSqlParser.T_VIEW, 0); }
		public DescribeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitDescribeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeStmtContext describeStmt() throws RecognitionException {
		DescribeStmtContext _localctx = new DescribeStmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_describeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			_la = _input.LA(1);
			if ( !(_la==T_DESC || _la==T_DESCRIBE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TABLE || _la==T_VIEW) {
				{
				setState(907);
				_la = _input.LA(1);
				if ( !(_la==T_TABLE || _la==T_VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(910);
			userDotDbDotTable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(StartDBSqlParser.T_NOT, 0); }
		public BoolExprAtomContext boolExprAtom() {
			return getRuleContext(BoolExprAtomContext.class,0);
		}
		public BoolExprLogicalOperatorContext boolExprLogicalOperator() {
			return getRuleContext(BoolExprLogicalOperatorContext.class,0);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_boolExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(913);
					match(T_NOT);
					}
				}

				setState(916);
				match(T_OPEN_P);
				setState(917);
				boolExpr(0);
				setState(918);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(920);
				boolExprAtom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(929);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
					setState(923);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(924);
					boolExprLogicalOperator();
					setState(925);
					boolExpr(3);
					}
					} 
				}
				setState(931);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolExprAtomContext extends ParserRuleContext {
		public BoolExprUnaryContext boolExprUnary() {
			return getRuleContext(BoolExprUnaryContext.class,0);
		}
		public BoolExprBinaryContext boolExprBinary() {
			return getRuleContext(BoolExprBinaryContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolExprAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExprAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitBoolExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprAtomContext boolExprAtom() throws RecognitionException {
		BoolExprAtomContext _localctx = new BoolExprAtomContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_boolExprAtom);
		try {
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				boolExprUnary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				boolExprBinary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(934);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExprUnaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IS() { return getToken(StartDBSqlParser.T_IS, 0); }
		public TerminalNode T_NULL() { return getToken(StartDBSqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(StartDBSqlParser.T_NOT, 0); }
		public TerminalNode T_BETWEEN() { return getToken(StartDBSqlParser.T_BETWEEN, 0); }
		public TerminalNode T_AND() { return getToken(StartDBSqlParser.T_AND, 0); }
		public TerminalNode T_EXISTS() { return getToken(StartDBSqlParser.T_EXISTS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public BoolExprSingleInContext boolExprSingleIn() {
			return getRuleContext(BoolExprSingleInContext.class,0);
		}
		public BoolExprMultiInContext boolExprMultiIn() {
			return getRuleContext(BoolExprMultiInContext.class,0);
		}
		public BoolExprUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExprUnary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitBoolExprUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprUnaryContext boolExprUnary() throws RecognitionException {
		BoolExprUnaryContext _localctx = new BoolExprUnaryContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_boolExprUnary);
		int _la;
		try {
			setState(960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				expr(0);
				setState(938);
				match(T_IS);
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(939);
					match(T_NOT);
					}
				}

				setState(942);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(944);
				expr(0);
				setState(945);
				match(T_BETWEEN);
				setState(946);
				expr(0);
				setState(947);
				match(T_AND);
				setState(948);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(950);
					match(T_NOT);
					}
				}

				setState(953);
				match(T_EXISTS);
				setState(954);
				match(T_OPEN_P);
				setState(955);
				selectStmt();
				setState(956);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(958);
				boolExprSingleIn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(959);
				boolExprMultiIn();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExprSingleInContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IN() { return getToken(StartDBSqlParser.T_IN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(StartDBSqlParser.T_NOT, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public BoolExprSingleInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExprSingleIn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitBoolExprSingleIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprSingleInContext boolExprSingleIn() throws RecognitionException {
		BoolExprSingleInContext _localctx = new BoolExprSingleInContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_boolExprSingleIn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			expr(0);
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(963);
				match(T_NOT);
				}
			}

			setState(966);
			match(T_IN);
			setState(967);
			match(T_OPEN_P);
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				{
				setState(968);
				expr(0);
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(969);
					match(T_COMMA);
					setState(970);
					expr(0);
					}
					}
					setState(975);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(976);
				selectStmt();
				}
				break;
			}
			setState(979);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExprMultiInContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(StartDBSqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(StartDBSqlParser.T_OPEN_P, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(StartDBSqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(StartDBSqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_IN() { return getToken(StartDBSqlParser.T_IN, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public TerminalNode T_NOT() { return getToken(StartDBSqlParser.T_NOT, 0); }
		public BoolExprMultiInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExprMultiIn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitBoolExprMultiIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprMultiInContext boolExprMultiIn() throws RecognitionException {
		BoolExprMultiInContext _localctx = new BoolExprMultiInContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_boolExprMultiIn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(T_OPEN_P);
			setState(982);
			expr(0);
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(983);
				match(T_COMMA);
				setState(984);
				expr(0);
				}
				}
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(990);
			match(T_CLOSE_P);
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(991);
				match(T_NOT);
				}
			}

			setState(994);
			match(T_IN);
			setState(995);
			match(T_OPEN_P);
			setState(996);
			selectStmt();
			setState(997);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExprBinaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BoolExprBinaryOperatorContext boolExprBinaryOperator() {
			return getRuleContext(BoolExprBinaryOperatorContext.class,0);
		}
		public BoolExprBinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExprBinary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitBoolExprBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprBinaryContext boolExprBinary() throws RecognitionException {
		BoolExprBinaryContext _localctx = new BoolExprBinaryContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_boolExprBinary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			expr(0);
			setState(1000);
			boolExprBinaryOperator();
			setState(1001);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExprLogicalOperatorContext extends ParserRuleContext {
		public TerminalNode T_AND() { return getToken(StartDBSqlParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(StartDBSqlParser.T_OR, 0); }
		public BoolExprLogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExprLogicalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitBoolExprLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprLogicalOperatorContext boolExprLogicalOperator() throws RecognitionException {
		BoolExprLogicalOperatorContext _localctx = new BoolExprLogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_boolExprLogicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			_la = _input.LA(1);
			if ( !(_la==T_AND || _la==T_OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExprBinaryOperatorContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(StartDBSqlParser.T_EQUAL, 0); }
		public TerminalNode T_EQUAL2() { return getToken(StartDBSqlParser.T_EQUAL2, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(StartDBSqlParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(StartDBSqlParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_LESS() { return getToken(StartDBSqlParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(StartDBSqlParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(StartDBSqlParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(StartDBSqlParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LIKE() { return getToken(StartDBSqlParser.T_LIKE, 0); }
		public TerminalNode T_RLIKE() { return getToken(StartDBSqlParser.T_RLIKE, 0); }
		public TerminalNode T_REGEXP() { return getToken(StartDBSqlParser.T_REGEXP, 0); }
		public TerminalNode T_NOT() { return getToken(StartDBSqlParser.T_NOT, 0); }
		public BoolExprBinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExprBinaryOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitBoolExprBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprBinaryOperatorContext boolExprBinaryOperator() throws RecognitionException {
		BoolExprBinaryOperatorContext _localctx = new BoolExprBinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_boolExprBinaryOperator);
		int _la;
		try {
			setState(1017);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1007);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1009);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1010);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(1011);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1012);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1013);
					match(T_NOT);
					}
				}

				setState(1016);
				_la = _input.LA(1);
				if ( !(_la==T_LIKE || _la==T_REGEXP || _la==T_RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprIntervalContext exprInterval() {
			return getRuleContext(ExprIntervalContext.class,0);
		}
		public ExprConcatContext exprConcat() {
			return getRuleContext(ExprConcatContext.class,0);
		}
		public ExprCaseContext exprCase() {
			return getRuleContext(ExprCaseContext.class,0);
		}
		public ExprCursorAttributeContext exprCursorAttribute() {
			return getRuleContext(ExprCursorAttributeContext.class,0);
		}
		public ExprAggWindowFuncContext exprAggWindowFunc() {
			return getRuleContext(ExprAggWindowFuncContext.class,0);
		}
		public ExprSpecFuncContext exprSpecFunc() {
			return getRuleContext(ExprSpecFuncContext.class,0);
		}
		public ExprFuncContext exprFunc() {
			return getRuleContext(ExprFuncContext.class,0);
		}
		public ExprAtomContext exprAtom() {
			return getRuleContext(ExprAtomContext.class,0);
		}
		public TerminalNode T_MUL() { return getToken(StartDBSqlParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(StartDBSqlParser.T_DIV, 0); }
		public TerminalNode T_ADD() { return getToken(StartDBSqlParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(StartDBSqlParser.T_SUB, 0); }
		public IntervalItemContext intervalItem() {
			return getRuleContext(IntervalItemContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 156;
		enterRecursionRule(_localctx, 156, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1020);
				match(T_OPEN_P);
				setState(1021);
				selectStmt();
				setState(1022);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1024);
				match(T_OPEN_P);
				setState(1025);
				expr(0);
				setState(1026);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(1028);
				exprInterval();
				}
				break;
			case 4:
				{
				setState(1029);
				exprConcat();
				}
				break;
			case 5:
				{
				setState(1030);
				exprCase();
				}
				break;
			case 6:
				{
				setState(1031);
				exprCursorAttribute();
				}
				break;
			case 7:
				{
				setState(1032);
				exprAggWindowFunc();
				}
				break;
			case 8:
				{
				setState(1033);
				exprSpecFunc();
				}
				break;
			case 9:
				{
				setState(1034);
				exprFunc();
				}
				break;
			case 10:
				{
				setState(1035);
				exprAtom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1052);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1038);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1039);
						match(T_MUL);
						setState(1040);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1041);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1042);
						match(T_DIV);
						setState(1043);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1044);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1045);
						match(T_ADD);
						setState(1046);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1047);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1048);
						match(T_SUB);
						setState(1049);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1050);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1051);
						intervalItem();
						}
						break;
					}
					} 
				}
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprAtomContext extends ParserRuleContext {
		public DateLiteralContext dateLiteral() {
			return getRuleContext(DateLiteralContext.class,0);
		}
		public TimestampLiteralContext timestampLiteral() {
			return getRuleContext(TimestampLiteralContext.class,0);
		}
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DecNumberContext decNumber() {
			return getRuleContext(DecNumberContext.class,0);
		}
		public IntNumberContext intNumber() {
			return getRuleContext(IntNumberContext.class,0);
		}
		public NullConstContext nullConst() {
			return getRuleContext(NullConstContext.class,0);
		}
		public ExprAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAtomContext exprAtom() throws RecognitionException {
		ExprAtomContext _localctx = new ExprAtomContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_exprAtom);
		try {
			setState(1065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057);
				dateLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				timestampLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1059);
				boolLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1060);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1061);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1062);
				decNumber();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1063);
				intNumber();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1064);
				nullConst();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprIntervalContext extends ParserRuleContext {
		public TerminalNode T_INTERVAL() { return getToken(StartDBSqlParser.T_INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntervalItemContext intervalItem() {
			return getRuleContext(IntervalItemContext.class,0);
		}
		public ExprIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprInterval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprIntervalContext exprInterval() throws RecognitionException {
		ExprIntervalContext _localctx = new ExprIntervalContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_exprInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(T_INTERVAL);
			setState(1068);
			expr(0);
			setState(1069);
			intervalItem();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalItemContext extends ParserRuleContext {
		public TerminalNode T_DAY() { return getToken(StartDBSqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(StartDBSqlParser.T_DAYS, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(StartDBSqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(StartDBSqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_SECOND() { return getToken(StartDBSqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(StartDBSqlParser.T_SECONDS, 0); }
		public IntervalItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitIntervalItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalItemContext intervalItem() throws RecognitionException {
		IntervalItemContext _localctx = new IntervalItemContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_intervalItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || _la==T_MICROSECOND || _la==T_MICROSECONDS || _la==T_SECOND || _la==T_SECONDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprConcatContext extends ParserRuleContext {
		public List<ExprConcatItemContext> exprConcatItem() {
			return getRuleContexts(ExprConcatItemContext.class);
		}
		public ExprConcatItemContext exprConcatItem(int i) {
			return getRuleContext(ExprConcatItemContext.class,i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(StartDBSqlParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(StartDBSqlParser.T_PIPE, i);
		}
		public List<TerminalNode> T_CONCAT() { return getTokens(StartDBSqlParser.T_CONCAT); }
		public TerminalNode T_CONCAT(int i) {
			return getToken(StartDBSqlParser.T_CONCAT, i);
		}
		public ExprConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprConcat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprConcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprConcatContext exprConcat() throws RecognitionException {
		ExprConcatContext _localctx = new ExprConcatContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_exprConcat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			exprConcatItem();
			setState(1074);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1075);
			exprConcatItem();
			setState(1080);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1076);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1077);
					exprConcatItem();
					}
					} 
				}
				setState(1082);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprConcatItemContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public ExprCaseContext exprCase() {
			return getRuleContext(ExprCaseContext.class,0);
		}
		public ExprAggWindowFuncContext exprAggWindowFunc() {
			return getRuleContext(ExprAggWindowFuncContext.class,0);
		}
		public ExprSpecFuncContext exprSpecFunc() {
			return getRuleContext(ExprSpecFuncContext.class,0);
		}
		public ExprFuncContext exprFunc() {
			return getRuleContext(ExprFuncContext.class,0);
		}
		public ExprAtomContext exprAtom() {
			return getRuleContext(ExprAtomContext.class,0);
		}
		public ExprConcatItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprConcatItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprConcatItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprConcatItemContext exprConcatItem() throws RecognitionException {
		ExprConcatItemContext _localctx = new ExprConcatItemContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_exprConcatItem);
		try {
			setState(1092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1083);
				match(T_OPEN_P);
				setState(1084);
				expr(0);
				setState(1085);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1087);
				exprCase();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1088);
				exprAggWindowFunc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1089);
				exprSpecFunc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1090);
				exprFunc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1091);
				exprAtom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprCaseContext extends ParserRuleContext {
		public ExprCaseSimpleContext exprCaseSimple() {
			return getRuleContext(ExprCaseSimpleContext.class,0);
		}
		public ExprCaseSearchedContext exprCaseSearched() {
			return getRuleContext(ExprCaseSearchedContext.class,0);
		}
		public ExprCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseContext exprCase() throws RecognitionException {
		ExprCaseContext _localctx = new ExprCaseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_exprCase);
		try {
			setState(1096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				exprCaseSimple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1095);
				exprCaseSearched();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprCaseSimpleContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(StartDBSqlParser.T_CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_END() { return getToken(StartDBSqlParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(StartDBSqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(StartDBSqlParser.T_WHEN, i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(StartDBSqlParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(StartDBSqlParser.T_THEN, i);
		}
		public TerminalNode T_ELSE() { return getToken(StartDBSqlParser.T_ELSE, 0); }
		public ExprCaseSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCaseSimple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprCaseSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseSimpleContext exprCaseSimple() throws RecognitionException {
		ExprCaseSimpleContext _localctx = new ExprCaseSimpleContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_exprCaseSimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			match(T_CASE);
			setState(1099);
			expr(0);
			setState(1105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1100);
				match(T_WHEN);
				setState(1101);
				expr(0);
				setState(1102);
				match(T_THEN);
				setState(1103);
				expr(0);
				}
				}
				setState(1107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1109);
				match(T_ELSE);
				setState(1110);
				expr(0);
				}
			}

			setState(1113);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprCaseSearchedContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(StartDBSqlParser.T_CASE, 0); }
		public TerminalNode T_END() { return getToken(StartDBSqlParser.T_END, 0); }
		public List<ExprCaseItemContext> exprCaseItem() {
			return getRuleContexts(ExprCaseItemContext.class);
		}
		public ExprCaseItemContext exprCaseItem(int i) {
			return getRuleContext(ExprCaseItemContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(StartDBSqlParser.T_ELSE, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ExprCaseSearchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCaseSearched; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprCaseSearched(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseSearchedContext exprCaseSearched() throws RecognitionException {
		ExprCaseSearchedContext _localctx = new ExprCaseSearchedContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_exprCaseSearched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			match(T_CASE);
			setState(1117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1116);
				exprCaseItem();
				}
				}
				setState(1119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1121);
				match(T_ELSE);
				setState(1122);
				boolExpr(0);
				}
			}

			setState(1125);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprCaseItemContext extends ParserRuleContext {
		public BoolExprContext whenExpr;
		public BoolExprContext thenExpr;
		public TerminalNode T_WHEN() { return getToken(StartDBSqlParser.T_WHEN, 0); }
		public TerminalNode T_THEN() { return getToken(StartDBSqlParser.T_THEN, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public ExprCaseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCaseItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprCaseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseItemContext exprCaseItem() throws RecognitionException {
		ExprCaseItemContext _localctx = new ExprCaseItemContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_exprCaseItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			match(T_WHEN);
			setState(1128);
			((ExprCaseItemContext)_localctx).whenExpr = boolExpr(0);
			setState(1129);
			match(T_THEN);
			setState(1130);
			((ExprCaseItemContext)_localctx).thenExpr = boolExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprCursorAttributeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ISOPEN() { return getToken(StartDBSqlParser.T_ISOPEN, 0); }
		public TerminalNode T_FOUND() { return getToken(StartDBSqlParser.T_FOUND, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(StartDBSqlParser.T_NOTFOUND, 0); }
		public ExprCursorAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCursorAttribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprCursorAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCursorAttributeContext exprCursorAttribute() throws RecognitionException {
		ExprCursorAttributeContext _localctx = new ExprCursorAttributeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_exprCursorAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			ident();
			setState(1133);
			match(T__0);
			setState(1134);
			_la = _input.LA(1);
			if ( !(_la==T_FOUND || _la==T_ISOPEN || _la==T_NOTFOUND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprAggWindowFuncContext extends ParserRuleContext {
		public TerminalNode T_AVG() { return getToken(StartDBSqlParser.T_AVG, 0); }
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public ExprFuncAllDistinctContext exprFuncAllDistinct() {
			return getRuleContext(ExprFuncAllDistinctContext.class,0);
		}
		public ExprFuncOverClauseContext exprFuncOverClause() {
			return getRuleContext(ExprFuncOverClauseContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(StartDBSqlParser.T_COUNT, 0); }
		public TerminalNode T_MUL() { return getToken(StartDBSqlParser.T_MUL, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(StartDBSqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(StartDBSqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(StartDBSqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(StartDBSqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_LAG() { return getToken(StartDBSqlParser.T_LAG, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public TerminalNode T_LAST_VALUE() { return getToken(StartDBSqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(StartDBSqlParser.T_LEAD, 0); }
		public TerminalNode T_MAX() { return getToken(StartDBSqlParser.T_MAX, 0); }
		public TerminalNode T_MIN() { return getToken(StartDBSqlParser.T_MIN, 0); }
		public TerminalNode T_RANK() { return getToken(StartDBSqlParser.T_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(StartDBSqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_STDEV() { return getToken(StartDBSqlParser.T_STDEV, 0); }
		public TerminalNode T_SUM() { return getToken(StartDBSqlParser.T_SUM, 0); }
		public TerminalNode T_VAR() { return getToken(StartDBSqlParser.T_VAR, 0); }
		public TerminalNode T_VARIANCE() { return getToken(StartDBSqlParser.T_VARIANCE, 0); }
		public ExprAggWindowFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAggWindowFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprAggWindowFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAggWindowFuncContext exprAggWindowFunc() throws RecognitionException {
		ExprAggWindowFuncContext _localctx = new ExprAggWindowFuncContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_exprAggWindowFunc);
		int _la;
		try {
			setState(1288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(1136);
				match(T_AVG);
				setState(1137);
				match(T_OPEN_P);
				setState(1139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1138);
					exprFuncAllDistinct();
					}
					break;
				}
				setState(1141);
				expr(0);
				setState(1142);
				match(T_CLOSE_P);
				setState(1144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1143);
					exprFuncOverClause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1146);
				match(T_COUNT);
				setState(1147);
				match(T_OPEN_P);
				setState(1153);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DOWNLOAD:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIME:
				case T_PI:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
				case T_HDFS:
				case T_HIVE:
					{
					{
					setState(1149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
					case 1:
						{
						setState(1148);
						exprFuncAllDistinct();
						}
						break;
					}
					setState(1151);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(1152);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1155);
				match(T_CLOSE_P);
				setState(1157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1156);
					exprFuncOverClause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(1159);
				match(T_COUNT_BIG);
				setState(1160);
				match(T_OPEN_P);
				setState(1166);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DOWNLOAD:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIME:
				case T_PI:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
				case T_HDFS:
				case T_HIVE:
					{
					{
					setState(1162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
					case 1:
						{
						setState(1161);
						exprFuncAllDistinct();
						}
						break;
					}
					setState(1164);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(1165);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1168);
				match(T_CLOSE_P);
				setState(1170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1169);
					exprFuncOverClause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(1172);
				match(T_CUME_DIST);
				setState(1173);
				match(T_OPEN_P);
				setState(1174);
				match(T_CLOSE_P);
				setState(1175);
				exprFuncOverClause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1176);
				match(T_DENSE_RANK);
				setState(1177);
				match(T_OPEN_P);
				setState(1178);
				match(T_CLOSE_P);
				setState(1179);
				exprFuncOverClause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1180);
				match(T_FIRST_VALUE);
				setState(1181);
				match(T_OPEN_P);
				setState(1182);
				expr(0);
				setState(1183);
				match(T_CLOSE_P);
				setState(1184);
				exprFuncOverClause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(1186);
				match(T_LAG);
				setState(1187);
				match(T_OPEN_P);
				setState(1188);
				expr(0);
				setState(1195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(1189);
					match(T_COMMA);
					setState(1190);
					expr(0);
					setState(1193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(1191);
						match(T_COMMA);
						setState(1192);
						expr(0);
						}
					}

					}
				}

				setState(1197);
				match(T_CLOSE_P);
				setState(1198);
				exprFuncOverClause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1200);
				match(T_LAST_VALUE);
				setState(1201);
				match(T_OPEN_P);
				setState(1202);
				expr(0);
				setState(1203);
				match(T_CLOSE_P);
				setState(1204);
				exprFuncOverClause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(1206);
				match(T_LEAD);
				setState(1207);
				match(T_OPEN_P);
				setState(1208);
				expr(0);
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(1209);
					match(T_COMMA);
					setState(1210);
					expr(0);
					setState(1213);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(1211);
						match(T_COMMA);
						setState(1212);
						expr(0);
						}
					}

					}
				}

				setState(1217);
				match(T_CLOSE_P);
				setState(1218);
				exprFuncOverClause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(1220);
				match(T_MAX);
				setState(1221);
				match(T_OPEN_P);
				setState(1223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1222);
					exprFuncAllDistinct();
					}
					break;
				}
				setState(1225);
				expr(0);
				setState(1226);
				match(T_CLOSE_P);
				setState(1228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1227);
					exprFuncOverClause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(1230);
				match(T_MIN);
				setState(1231);
				match(T_OPEN_P);
				setState(1233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1232);
					exprFuncAllDistinct();
					}
					break;
				}
				setState(1235);
				expr(0);
				setState(1236);
				match(T_CLOSE_P);
				setState(1238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1237);
					exprFuncOverClause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(1240);
				match(T_RANK);
				setState(1241);
				match(T_OPEN_P);
				setState(1242);
				match(T_CLOSE_P);
				setState(1243);
				exprFuncOverClause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(1244);
				match(T_ROW_NUMBER);
				setState(1245);
				match(T_OPEN_P);
				setState(1246);
				match(T_CLOSE_P);
				setState(1247);
				exprFuncOverClause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(1248);
				match(T_STDEV);
				setState(1249);
				match(T_OPEN_P);
				setState(1251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1250);
					exprFuncAllDistinct();
					}
					break;
				}
				setState(1253);
				expr(0);
				setState(1254);
				match(T_CLOSE_P);
				setState(1256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1255);
					exprFuncOverClause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(1258);
				match(T_SUM);
				setState(1259);
				match(T_OPEN_P);
				setState(1261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1260);
					exprFuncAllDistinct();
					}
					break;
				}
				setState(1263);
				expr(0);
				setState(1264);
				match(T_CLOSE_P);
				setState(1266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1265);
					exprFuncOverClause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(1268);
				match(T_VAR);
				setState(1269);
				match(T_OPEN_P);
				setState(1271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1270);
					exprFuncAllDistinct();
					}
					break;
				}
				setState(1273);
				expr(0);
				setState(1274);
				match(T_CLOSE_P);
				setState(1276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1275);
					exprFuncOverClause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(1278);
				match(T_VARIANCE);
				setState(1279);
				match(T_OPEN_P);
				setState(1281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1280);
					exprFuncAllDistinct();
					}
					break;
				}
				setState(1283);
				expr(0);
				setState(1284);
				match(T_CLOSE_P);
				setState(1286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1285);
					exprFuncOverClause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprFuncAllDistinctContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(StartDBSqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(StartDBSqlParser.T_DISTINCT, 0); }
		public ExprFuncAllDistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprFuncAllDistinct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprFuncAllDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprFuncAllDistinctContext exprFuncAllDistinct() throws RecognitionException {
		ExprFuncAllDistinctContext _localctx = new ExprFuncAllDistinctContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_exprFuncAllDistinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprFuncOverClauseContext extends ParserRuleContext {
		public TerminalNode T_OVER() { return getToken(StartDBSqlParser.T_OVER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public ExprFuncPartitionByClauseContext exprFuncPartitionByClause() {
			return getRuleContext(ExprFuncPartitionByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public ExprFuncOverClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprFuncOverClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprFuncOverClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprFuncOverClauseContext exprFuncOverClause() throws RecognitionException {
		ExprFuncOverClauseContext _localctx = new ExprFuncOverClauseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_exprFuncOverClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(T_OVER);
			setState(1293);
			match(T_OPEN_P);
			setState(1295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(1294);
				exprFuncPartitionByClause();
				}
			}

			setState(1298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(1297);
				orderByClause();
				}
			}

			setState(1300);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprFuncPartitionByClauseContext extends ParserRuleContext {
		public TerminalNode T_PARTITION() { return getToken(StartDBSqlParser.T_PARTITION, 0); }
		public TerminalNode T_BY() { return getToken(StartDBSqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public ExprFuncPartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprFuncPartitionByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprFuncPartitionByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprFuncPartitionByClauseContext exprFuncPartitionByClause() throws RecognitionException {
		ExprFuncPartitionByClauseContext _localctx = new ExprFuncPartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_exprFuncPartitionByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			match(T_PARTITION);
			setState(1303);
			match(T_BY);
			setState(1304);
			expr(0);
			setState(1309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1305);
				match(T_COMMA);
				setState(1306);
				expr(0);
				}
				}
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprSpecFuncContext extends ParserRuleContext {
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(StartDBSqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_CAST() { return getToken(StartDBSqlParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_AS() { return getToken(StartDBSqlParser.T_AS, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public DtypeLenContext dtypeLen() {
			return getRuleContext(DtypeLenContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(StartDBSqlParser.T_COUNT, 0); }
		public TerminalNode T_MUL() { return getToken(StartDBSqlParser.T_MUL, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(StartDBSqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT() { return getToken(StartDBSqlParser.T_CURRENT, 0); }
		public TerminalNode T_DATE() { return getToken(StartDBSqlParser.T_DATE, 0); }
		public TerminalNode T_CURRENT_TIME() { return getToken(StartDBSqlParser.T_CURRENT_TIME, 0); }
		public TerminalNode T_PI() { return getToken(StartDBSqlParser.T_PI, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(StartDBSqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(StartDBSqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(StartDBSqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_USER() { return getToken(StartDBSqlParser.T_USER, 0); }
		public TerminalNode T_MAX_PART_STRING() { return getToken(StartDBSqlParser.T_MAX_PART_STRING, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(StartDBSqlParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(StartDBSqlParser.T_EQUAL, i);
		}
		public TerminalNode T_MIN_PART_STRING() { return getToken(StartDBSqlParser.T_MIN_PART_STRING, 0); }
		public TerminalNode T_MAX_PART_INT() { return getToken(StartDBSqlParser.T_MAX_PART_INT, 0); }
		public TerminalNode T_MIN_PART_INT() { return getToken(StartDBSqlParser.T_MIN_PART_INT, 0); }
		public TerminalNode T_MAX_PART_DATE() { return getToken(StartDBSqlParser.T_MAX_PART_DATE, 0); }
		public TerminalNode T_MIN_PART_DATE() { return getToken(StartDBSqlParser.T_MIN_PART_DATE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(StartDBSqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(StartDBSqlParser.T_PART_LOC, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(StartDBSqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_FROM() { return getToken(StartDBSqlParser.T_FROM, 0); }
		public TerminalNode T_FOR() { return getToken(StartDBSqlParser.T_FOR, 0); }
		public TerminalNode T_SYSDATE() { return getToken(StartDBSqlParser.T_SYSDATE, 0); }
		public ExprSpecFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSpecFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprSpecFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprSpecFuncContext exprSpecFunc() throws RecognitionException {
		ExprSpecFuncContext _localctx = new ExprSpecFuncContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_exprSpecFunc);
		int _la;
		try {
			int _alt;
			setState(1509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1312);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1313);
				match(T_CAST);
				setState(1314);
				match(T_OPEN_P);
				setState(1315);
				expr(0);
				setState(1316);
				match(T_AS);
				setState(1317);
				dtype();
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1318);
					dtypeLen();
					}
				}

				setState(1321);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1323);
				match(T_COUNT);
				setState(1324);
				match(T_OPEN_P);
				setState(1327);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DOWNLOAD:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIME:
				case T_PI:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
				case T_HDFS:
				case T_HIVE:
					{
					setState(1325);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(1326);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1329);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1330);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1331);
				match(T_CURRENT);
				setState(1332);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1333);
				match(T_CURRENT_TIME);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1334);
				match(T_PI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1338);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(1335);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(1336);
					match(T_CURRENT);
					setState(1337);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1340);
					match(T_OPEN_P);
					setState(1341);
					expr(0);
					setState(1342);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1346);
				match(T_CURRENT_USER);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1347);
				match(T_CURRENT);
				setState(1348);
				match(T_USER);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1349);
				match(T_MAX_PART_STRING);
				setState(1350);
				match(T_OPEN_P);
				setState(1351);
				expr(0);
				setState(1364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(1352);
					match(T_COMMA);
					setState(1353);
					expr(0);
					setState(1361);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(1354);
						match(T_COMMA);
						setState(1355);
						expr(0);
						setState(1356);
						match(T_EQUAL);
						setState(1357);
						expr(0);
						}
						}
						setState(1363);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1366);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1368);
				match(T_MIN_PART_STRING);
				setState(1369);
				match(T_OPEN_P);
				setState(1370);
				expr(0);
				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(1371);
					match(T_COMMA);
					setState(1372);
					expr(0);
					setState(1380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(1373);
						match(T_COMMA);
						setState(1374);
						expr(0);
						setState(1375);
						match(T_EQUAL);
						setState(1376);
						expr(0);
						}
						}
						setState(1382);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1385);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1387);
				match(T_MAX_PART_INT);
				setState(1388);
				match(T_OPEN_P);
				setState(1389);
				expr(0);
				setState(1402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(1390);
					match(T_COMMA);
					setState(1391);
					expr(0);
					setState(1399);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(1392);
						match(T_COMMA);
						setState(1393);
						expr(0);
						setState(1394);
						match(T_EQUAL);
						setState(1395);
						expr(0);
						}
						}
						setState(1401);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1404);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1406);
				match(T_MIN_PART_INT);
				setState(1407);
				match(T_OPEN_P);
				setState(1408);
				expr(0);
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(1409);
					match(T_COMMA);
					setState(1410);
					expr(0);
					setState(1418);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(1411);
						match(T_COMMA);
						setState(1412);
						expr(0);
						setState(1413);
						match(T_EQUAL);
						setState(1414);
						expr(0);
						}
						}
						setState(1420);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1423);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1425);
				match(T_MAX_PART_DATE);
				setState(1426);
				match(T_OPEN_P);
				setState(1427);
				expr(0);
				setState(1440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(1428);
					match(T_COMMA);
					setState(1429);
					expr(0);
					setState(1437);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(1430);
						match(T_COMMA);
						setState(1431);
						expr(0);
						setState(1432);
						match(T_EQUAL);
						setState(1433);
						expr(0);
						}
						}
						setState(1439);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1442);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1444);
				match(T_MIN_PART_DATE);
				setState(1445);
				match(T_OPEN_P);
				setState(1446);
				expr(0);
				setState(1459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(1447);
					match(T_COMMA);
					setState(1448);
					expr(0);
					setState(1456);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(1449);
						match(T_COMMA);
						setState(1450);
						expr(0);
						setState(1451);
						match(T_EQUAL);
						setState(1452);
						expr(0);
						}
						}
						setState(1458);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1461);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1463);
				match(T_PART_COUNT);
				setState(1464);
				match(T_OPEN_P);
				setState(1465);
				expr(0);
				setState(1473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1466);
					match(T_COMMA);
					setState(1467);
					expr(0);
					setState(1468);
					match(T_EQUAL);
					setState(1469);
					expr(0);
					}
					}
					setState(1475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1476);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1478);
				match(T_PART_LOC);
				setState(1479);
				match(T_OPEN_P);
				setState(1480);
				expr(0);
				setState(1486); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1481);
						match(T_COMMA);
						setState(1482);
						expr(0);
						setState(1483);
						match(T_EQUAL);
						setState(1484);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1488); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(1490);
					match(T_COMMA);
					setState(1491);
					expr(0);
					}
				}

				setState(1494);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1496);
				match(T_SUBSTRING);
				setState(1497);
				match(T_OPEN_P);
				setState(1498);
				expr(0);
				setState(1499);
				match(T_FROM);
				setState(1500);
				expr(0);
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(1501);
					match(T_FOR);
					setState(1502);
					expr(0);
					}
				}

				setState(1505);
				match(T_CLOSE_P);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1507);
				match(T_SYSDATE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1508);
				match(T_USER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprFuncContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(StartDBSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(StartDBSqlParser.T_CLOSE_P, 0); }
		public ExprFuncParamsContext exprFuncParams() {
			return getRuleContext(ExprFuncParamsContext.class,0);
		}
		public ExprFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprFuncContext exprFunc() throws RecognitionException {
		ExprFuncContext _localctx = new ExprFuncContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_exprFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1511);
			ident();
			setState(1512);
			match(T_OPEN_P);
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1513);
				exprFuncParams();
				}
				break;
			}
			setState(1516);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprFuncParamsContext extends ParserRuleContext {
		public List<FuncParamContext> funcParam() {
			return getRuleContexts(FuncParamContext.class);
		}
		public FuncParamContext funcParam(int i) {
			return getRuleContext(FuncParamContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(StartDBSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(StartDBSqlParser.T_COMMA, i);
		}
		public ExprFuncParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprFuncParams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitExprFuncParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprFuncParamsContext exprFuncParams() throws RecognitionException {
		ExprFuncParamsContext _localctx = new ExprFuncParamsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_exprFuncParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			funcParam();
			setState(1523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1519);
				match(T_COMMA);
				setState(1520);
				funcParam();
				}
				}
				setState(1525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncParamContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(StartDBSqlParser.T_EQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(StartDBSqlParser.T_GREATER, 0); }
		public TerminalNode T_MUL() { return getToken(StartDBSqlParser.T_MUL, 0); }
		public FuncParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitFuncParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamContext funcParam() throws RecognitionException {
		FuncParamContext _localctx = new FuncParamContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_funcParam);
		int _la;
		try {
			setState(1537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1527);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
				setState(1533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1528);
					ident();
					setState(1529);
					match(T_EQUAL);
					setState(1531);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_GREATER) {
						{
						setState(1530);
						match(T_GREATER);
						}
					}

					}
					break;
				}
				setState(1535);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1536);
				match(T_MUL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateLiteralContext extends ParserRuleContext {
		public TerminalNode T_DATE() { return getToken(StartDBSqlParser.T_DATE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitDateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateLiteralContext dateLiteral() throws RecognitionException {
		DateLiteralContext _localctx = new DateLiteralContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			match(T_DATE);
			setState(1540);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimestampLiteralContext extends ParserRuleContext {
		public TerminalNode T_TIMESTAMP() { return getToken(StartDBSqlParser.T_TIMESTAMP, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TimestampLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestampLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitTimestampLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimestampLiteralContext timestampLiteral() throws RecognitionException {
		TimestampLiteralContext _localctx = new TimestampLiteralContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_timestampLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			match(T_TIMESTAMP);
			setState(1543);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public List<IdentItemContext> identItem() {
			return getRuleContexts(IdentItemContext.class);
		}
		public IdentItemContext identItem(int i) {
			return getRuleContext(IdentItemContext.class,i);
		}
		public TerminalNode T_SUB() { return getToken(StartDBSqlParser.T_SUB, 0); }
		public List<TerminalNode> T_DOT() { return getTokens(StartDBSqlParser.T_DOT); }
		public TerminalNode T_DOT(int i) {
			return getToken(StartDBSqlParser.T_DOT, i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_ident);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_SUB) {
				{
				setState(1545);
				match(T_SUB);
				}
			}

			setState(1548);
			identItem();
			setState(1553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1549);
					match(T_DOT);
					setState(1550);
					identItem();
					}
					} 
				}
				setState(1555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentItemContext extends ParserRuleContext {
		public TerminalNode L_ID() { return getToken(StartDBSqlParser.L_ID, 0); }
		public NonReservedWordsContext nonReservedWords() {
			return getRuleContext(NonReservedWordsContext.class,0);
		}
		public IdentItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitIdentItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentItemContext identItem() throws RecognitionException {
		IdentItemContext _localctx = new IdentItemContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_identItem);
		try {
			setState(1558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1556);
				match(L_ID);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DOWNLOAD:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIME:
			case T_PI:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_HDFS:
			case T_HIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1557);
				nonReservedWords();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleQuotedStringContext extends StringContext {
		public TerminalNode L_S_STRING() { return getToken(StartDBSqlParser.L_S_STRING, 0); }
		public SingleQuotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitSingleQuotedString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleQuotedStringContext extends StringContext {
		public TerminalNode L_D_STRING() { return getToken(StartDBSqlParser.L_D_STRING, 0); }
		public DoubleQuotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitDoubleQuotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_string);
		try {
			setState(1562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new SingleQuotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1560);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new DoubleQuotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1561);
				match(L_D_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntNumberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(StartDBSqlParser.L_INT, 0); }
		public TerminalNode T_SUB() { return getToken(StartDBSqlParser.T_SUB, 0); }
		public TerminalNode T_ADD() { return getToken(StartDBSqlParser.T_ADD, 0); }
		public IntNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitIntNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntNumberContext intNumber() throws RecognitionException {
		IntNumberContext _localctx = new IntNumberContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_intNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(1564);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1567);
			match(L_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecNumberContext extends ParserRuleContext {
		public TerminalNode L_DEC() { return getToken(StartDBSqlParser.L_DEC, 0); }
		public TerminalNode T_SUB() { return getToken(StartDBSqlParser.T_SUB, 0); }
		public TerminalNode T_ADD() { return getToken(StartDBSqlParser.T_ADD, 0); }
		public DecNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitDecNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecNumberContext decNumber() throws RecognitionException {
		DecNumberContext _localctx = new DecNumberContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_decNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(1569);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1572);
			match(L_DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolLiteralContext extends ParserRuleContext {
		public TerminalNode T_TRUE() { return getToken(StartDBSqlParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(StartDBSqlParser.T_FALSE, 0); }
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			_la = _input.LA(1);
			if ( !(_la==T_FALSE || _la==T_TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullConstContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(StartDBSqlParser.T_NULL, 0); }
		public NullConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullConst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitNullConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullConstContext nullConst() throws RecognitionException {
		NullConstContext _localctx = new NullConstContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_nullConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedWordsContext extends ParserRuleContext {
		public TerminalNode T_ACTION() { return getToken(StartDBSqlParser.T_ACTION, 0); }
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(StartDBSqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_ADD2() { return getToken(StartDBSqlParser.T_ADD2, 0); }
		public TerminalNode T_ALL() { return getToken(StartDBSqlParser.T_ALL, 0); }
		public TerminalNode T_ALLOCATE() { return getToken(StartDBSqlParser.T_ALLOCATE, 0); }
		public TerminalNode T_ALTER() { return getToken(StartDBSqlParser.T_ALTER, 0); }
		public TerminalNode T_AND() { return getToken(StartDBSqlParser.T_AND, 0); }
		public TerminalNode T_ANSI_NULLS() { return getToken(StartDBSqlParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(StartDBSqlParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_AS() { return getToken(StartDBSqlParser.T_AS, 0); }
		public TerminalNode T_ASC() { return getToken(StartDBSqlParser.T_ASC, 0); }
		public TerminalNode T_ASSOCIATE() { return getToken(StartDBSqlParser.T_ASSOCIATE, 0); }
		public TerminalNode T_AT() { return getToken(StartDBSqlParser.T_AT, 0); }
		public TerminalNode T_AVG() { return getToken(StartDBSqlParser.T_AVG, 0); }
		public TerminalNode T_BATCHSIZE() { return getToken(StartDBSqlParser.T_BATCHSIZE, 0); }
		public TerminalNode T_BEGIN() { return getToken(StartDBSqlParser.T_BEGIN, 0); }
		public TerminalNode T_BETWEEN() { return getToken(StartDBSqlParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(StartDBSqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(StartDBSqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(StartDBSqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BIT() { return getToken(StartDBSqlParser.T_BIT, 0); }
		public TerminalNode T_BODY() { return getToken(StartDBSqlParser.T_BODY, 0); }
		public TerminalNode T_BREAK() { return getToken(StartDBSqlParser.T_BREAK, 0); }
		public TerminalNode T_BY() { return getToken(StartDBSqlParser.T_BY, 0); }
		public TerminalNode T_BYTE() { return getToken(StartDBSqlParser.T_BYTE, 0); }
		public TerminalNode T_CALL() { return getToken(StartDBSqlParser.T_CALL, 0); }
		public TerminalNode T_CALLER() { return getToken(StartDBSqlParser.T_CALLER, 0); }
		public TerminalNode T_CASCADE() { return getToken(StartDBSqlParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(StartDBSqlParser.T_CASE, 0); }
		public TerminalNode T_CASESPECIFIC() { return getToken(StartDBSqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CAST() { return getToken(StartDBSqlParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(StartDBSqlParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(StartDBSqlParser.T_CHARACTER, 0); }
		public TerminalNode T_CHARSET() { return getToken(StartDBSqlParser.T_CHARSET, 0); }
		public TerminalNode T_CLIENT() { return getToken(StartDBSqlParser.T_CLIENT, 0); }
		public TerminalNode T_CLOSE() { return getToken(StartDBSqlParser.T_CLOSE, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(StartDBSqlParser.T_CLUSTERED, 0); }
		public TerminalNode T_CMP() { return getToken(StartDBSqlParser.T_CMP, 0); }
		public TerminalNode T_COLLECT() { return getToken(StartDBSqlParser.T_COLLECT, 0); }
		public TerminalNode T_COLLECTION() { return getToken(StartDBSqlParser.T_COLLECTION, 0); }
		public TerminalNode T_COLUMN() { return getToken(StartDBSqlParser.T_COLUMN, 0); }
		public TerminalNode T_COMMENT() { return getToken(StartDBSqlParser.T_COMMENT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(StartDBSqlParser.T_COMPRESS, 0); }
		public TerminalNode T_CONSTANT() { return getToken(StartDBSqlParser.T_CONSTANT, 0); }
		public TerminalNode T_COPY() { return getToken(StartDBSqlParser.T_COPY, 0); }
		public TerminalNode T_COMMIT() { return getToken(StartDBSqlParser.T_COMMIT, 0); }
		public TerminalNode T_CONCAT() { return getToken(StartDBSqlParser.T_CONCAT, 0); }
		public TerminalNode T_CONDITION() { return getToken(StartDBSqlParser.T_CONDITION, 0); }
		public TerminalNode T_CONSTRAINT() { return getToken(StartDBSqlParser.T_CONSTRAINT, 0); }
		public TerminalNode T_CONTINUE() { return getToken(StartDBSqlParser.T_CONTINUE, 0); }
		public TerminalNode T_COUNT() { return getToken(StartDBSqlParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(StartDBSqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CREATE() { return getToken(StartDBSqlParser.T_CREATE, 0); }
		public TerminalNode T_CREATION() { return getToken(StartDBSqlParser.T_CREATION, 0); }
		public TerminalNode T_CREATOR() { return getToken(StartDBSqlParser.T_CREATOR, 0); }
		public TerminalNode T_CS() { return getToken(StartDBSqlParser.T_CS, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(StartDBSqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_CURRENT() { return getToken(StartDBSqlParser.T_CURRENT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(StartDBSqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_TIME() { return getToken(StartDBSqlParser.T_CURRENT_TIME, 0); }
		public TerminalNode T_PI() { return getToken(StartDBSqlParser.T_PI, 0); }
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(StartDBSqlParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(StartDBSqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(StartDBSqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_CURSOR() { return getToken(StartDBSqlParser.T_CURSOR, 0); }
		public TerminalNode T_DATA() { return getToken(StartDBSqlParser.T_DATA, 0); }
		public TerminalNode T_DATABASE() { return getToken(StartDBSqlParser.T_DATABASE, 0); }
		public TerminalNode T_DATE() { return getToken(StartDBSqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(StartDBSqlParser.T_DATETIME, 0); }
		public TerminalNode T_DAY() { return getToken(StartDBSqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(StartDBSqlParser.T_DAYS, 0); }
		public TerminalNode T_DEC() { return getToken(StartDBSqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(StartDBSqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DECLARE() { return getToken(StartDBSqlParser.T_DECLARE, 0); }
		public TerminalNode T_DEFAULT() { return getToken(StartDBSqlParser.T_DEFAULT, 0); }
		public TerminalNode T_DEFERRED() { return getToken(StartDBSqlParser.T_DEFERRED, 0); }
		public TerminalNode T_DEFINED() { return getToken(StartDBSqlParser.T_DEFINED, 0); }
		public TerminalNode T_DEFINER() { return getToken(StartDBSqlParser.T_DEFINER, 0); }
		public TerminalNode T_DEFINITION() { return getToken(StartDBSqlParser.T_DEFINITION, 0); }
		public TerminalNode T_DELETE() { return getToken(StartDBSqlParser.T_DELETE, 0); }
		public TerminalNode T_DELIMITED() { return getToken(StartDBSqlParser.T_DELIMITED, 0); }
		public TerminalNode T_DELIMITER() { return getToken(StartDBSqlParser.T_DELIMITER, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(StartDBSqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_DESC() { return getToken(StartDBSqlParser.T_DESC, 0); }
		public TerminalNode T_DESCRIBE() { return getToken(StartDBSqlParser.T_DESCRIBE, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(StartDBSqlParser.T_DIAGNOSTICS, 0); }
		public TerminalNode T_DIR() { return getToken(StartDBSqlParser.T_DIR, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(StartDBSqlParser.T_DIRECTORY, 0); }
		public TerminalNode T_DISTINCT() { return getToken(StartDBSqlParser.T_DISTINCT, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(StartDBSqlParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_DO() { return getToken(StartDBSqlParser.T_DO, 0); }
		public TerminalNode T_DOUBLE() { return getToken(StartDBSqlParser.T_DOUBLE, 0); }
		public TerminalNode T_DOWNLOAD() { return getToken(StartDBSqlParser.T_DOWNLOAD, 0); }
		public TerminalNode T_DROP() { return getToken(StartDBSqlParser.T_DROP, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(StartDBSqlParser.T_DYNAMIC, 0); }
		public TerminalNode T_ENABLE() { return getToken(StartDBSqlParser.T_ENABLE, 0); }
		public TerminalNode T_ENGINE() { return getToken(StartDBSqlParser.T_ENGINE, 0); }
		public TerminalNode T_ESCAPED() { return getToken(StartDBSqlParser.T_ESCAPED, 0); }
		public TerminalNode T_EXCEPT() { return getToken(StartDBSqlParser.T_EXCEPT, 0); }
		public TerminalNode T_EXEC() { return getToken(StartDBSqlParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(StartDBSqlParser.T_EXECUTE, 0); }
		public TerminalNode T_EXCEPTION() { return getToken(StartDBSqlParser.T_EXCEPTION, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(StartDBSqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_EXISTS() { return getToken(StartDBSqlParser.T_EXISTS, 0); }
		public TerminalNode T_EXIT() { return getToken(StartDBSqlParser.T_EXIT, 0); }
		public TerminalNode T_FALLBACK() { return getToken(StartDBSqlParser.T_FALLBACK, 0); }
		public TerminalNode T_FALSE() { return getToken(StartDBSqlParser.T_FALSE, 0); }
		public TerminalNode T_FETCH() { return getToken(StartDBSqlParser.T_FETCH, 0); }
		public TerminalNode T_FIELDS() { return getToken(StartDBSqlParser.T_FIELDS, 0); }
		public TerminalNode T_FILE() { return getToken(StartDBSqlParser.T_FILE, 0); }
		public TerminalNode T_FILES() { return getToken(StartDBSqlParser.T_FILES, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(StartDBSqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_FLOAT() { return getToken(StartDBSqlParser.T_FLOAT, 0); }
		public TerminalNode T_FOR() { return getToken(StartDBSqlParser.T_FOR, 0); }
		public TerminalNode T_FOREIGN() { return getToken(StartDBSqlParser.T_FOREIGN, 0); }
		public TerminalNode T_FORMAT() { return getToken(StartDBSqlParser.T_FORMAT, 0); }
		public TerminalNode T_FOUND() { return getToken(StartDBSqlParser.T_FOUND, 0); }
		public TerminalNode T_FROM() { return getToken(StartDBSqlParser.T_FROM, 0); }
		public TerminalNode T_FULL() { return getToken(StartDBSqlParser.T_FULL, 0); }
		public TerminalNode T_FUNCTION() { return getToken(StartDBSqlParser.T_FUNCTION, 0); }
		public TerminalNode T_GET() { return getToken(StartDBSqlParser.T_GET, 0); }
		public TerminalNode T_GLOBAL() { return getToken(StartDBSqlParser.T_GLOBAL, 0); }
		public TerminalNode T_GO() { return getToken(StartDBSqlParser.T_GO, 0); }
		public TerminalNode T_GRANT() { return getToken(StartDBSqlParser.T_GRANT, 0); }
		public TerminalNode T_GROUP() { return getToken(StartDBSqlParser.T_GROUP, 0); }
		public TerminalNode T_HANDLER() { return getToken(StartDBSqlParser.T_HANDLER, 0); }
		public TerminalNode T_HASH() { return getToken(StartDBSqlParser.T_HASH, 0); }
		public TerminalNode T_HAVING() { return getToken(StartDBSqlParser.T_HAVING, 0); }
		public TerminalNode T_HDFS() { return getToken(StartDBSqlParser.T_HDFS, 0); }
		public TerminalNode T_HIVE() { return getToken(StartDBSqlParser.T_HIVE, 0); }
		public TerminalNode T_HOST() { return getToken(StartDBSqlParser.T_HOST, 0); }
		public TerminalNode T_IDENTITY() { return getToken(StartDBSqlParser.T_IDENTITY, 0); }
		public TerminalNode T_IF() { return getToken(StartDBSqlParser.T_IF, 0); }
		public TerminalNode T_IGNORE() { return getToken(StartDBSqlParser.T_IGNORE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(StartDBSqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_IN() { return getToken(StartDBSqlParser.T_IN, 0); }
		public TerminalNode T_INCLUDE() { return getToken(StartDBSqlParser.T_INCLUDE, 0); }
		public TerminalNode T_INDEX() { return getToken(StartDBSqlParser.T_INDEX, 0); }
		public TerminalNode T_INITRANS() { return getToken(StartDBSqlParser.T_INITRANS, 0); }
		public TerminalNode T_INNER() { return getToken(StartDBSqlParser.T_INNER, 0); }
		public TerminalNode T_INOUT() { return getToken(StartDBSqlParser.T_INOUT, 0); }
		public TerminalNode T_INSERT() { return getToken(StartDBSqlParser.T_INSERT, 0); }
		public TerminalNode T_INT() { return getToken(StartDBSqlParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(StartDBSqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(StartDBSqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(StartDBSqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(StartDBSqlParser.T_INTEGER, 0); }
		public TerminalNode T_INTERSECT() { return getToken(StartDBSqlParser.T_INTERSECT, 0); }
		public TerminalNode T_INTERVAL() { return getToken(StartDBSqlParser.T_INTERVAL, 0); }
		public TerminalNode T_INTO() { return getToken(StartDBSqlParser.T_INTO, 0); }
		public TerminalNode T_INVOKER() { return getToken(StartDBSqlParser.T_INVOKER, 0); }
		public TerminalNode T_ITEMS() { return getToken(StartDBSqlParser.T_ITEMS, 0); }
		public TerminalNode T_IS() { return getToken(StartDBSqlParser.T_IS, 0); }
		public TerminalNode T_ISOPEN() { return getToken(StartDBSqlParser.T_ISOPEN, 0); }
		public TerminalNode T_JOIN() { return getToken(StartDBSqlParser.T_JOIN, 0); }
		public TerminalNode T_KEEP() { return getToken(StartDBSqlParser.T_KEEP, 0); }
		public TerminalNode T_KEY() { return getToken(StartDBSqlParser.T_KEY, 0); }
		public TerminalNode T_KEYS() { return getToken(StartDBSqlParser.T_KEYS, 0); }
		public TerminalNode T_LAG() { return getToken(StartDBSqlParser.T_LAG, 0); }
		public TerminalNode T_LANGUAGE() { return getToken(StartDBSqlParser.T_LANGUAGE, 0); }
		public TerminalNode T_LAST_VALUE() { return getToken(StartDBSqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(StartDBSqlParser.T_LEAD, 0); }
		public TerminalNode T_LEAVE() { return getToken(StartDBSqlParser.T_LEAVE, 0); }
		public TerminalNode T_LEFT() { return getToken(StartDBSqlParser.T_LEFT, 0); }
		public TerminalNode T_LIKE() { return getToken(StartDBSqlParser.T_LIKE, 0); }
		public TerminalNode T_LIMIT() { return getToken(StartDBSqlParser.T_LIMIT, 0); }
		public TerminalNode T_LINES() { return getToken(StartDBSqlParser.T_LINES, 0); }
		public TerminalNode T_LOCAL() { return getToken(StartDBSqlParser.T_LOCAL, 0); }
		public TerminalNode T_LOCATION() { return getToken(StartDBSqlParser.T_LOCATION, 0); }
		public TerminalNode T_LOCATOR() { return getToken(StartDBSqlParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(StartDBSqlParser.T_LOCATORS, 0); }
		public TerminalNode T_LOCKS() { return getToken(StartDBSqlParser.T_LOCKS, 0); }
		public TerminalNode T_LOG() { return getToken(StartDBSqlParser.T_LOG, 0); }
		public TerminalNode T_LOGGED() { return getToken(StartDBSqlParser.T_LOGGED, 0); }
		public TerminalNode T_LOGGING() { return getToken(StartDBSqlParser.T_LOGGING, 0); }
		public TerminalNode T_LOOP() { return getToken(StartDBSqlParser.T_LOOP, 0); }
		public TerminalNode T_MAP() { return getToken(StartDBSqlParser.T_MAP, 0); }
		public TerminalNode T_MATCHED() { return getToken(StartDBSqlParser.T_MATCHED, 0); }
		public TerminalNode T_MAX() { return getToken(StartDBSqlParser.T_MAX, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(StartDBSqlParser.T_MAXTRANS, 0); }
		public TerminalNode T_MERGE() { return getToken(StartDBSqlParser.T_MERGE, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(StartDBSqlParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(StartDBSqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(StartDBSqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_MIN() { return getToken(StartDBSqlParser.T_MIN, 0); }
		public TerminalNode T_MULTISET() { return getToken(StartDBSqlParser.T_MULTISET, 0); }
		public TerminalNode T_NCHAR() { return getToken(StartDBSqlParser.T_NCHAR, 0); }
		public TerminalNode T_NEW() { return getToken(StartDBSqlParser.T_NEW, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(StartDBSqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NO() { return getToken(StartDBSqlParser.T_NO, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(StartDBSqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(StartDBSqlParser.T_NOCOUNT, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(StartDBSqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_NONE() { return getToken(StartDBSqlParser.T_NONE, 0); }
		public TerminalNode T_NOT() { return getToken(StartDBSqlParser.T_NOT, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(StartDBSqlParser.T_NOTFOUND, 0); }
		public TerminalNode T_NUMERIC() { return getToken(StartDBSqlParser.T_NUMERIC, 0); }
		public TerminalNode T_NUMBER() { return getToken(StartDBSqlParser.T_NUMBER, 0); }
		public TerminalNode T_OBJECT() { return getToken(StartDBSqlParser.T_OBJECT, 0); }
		public TerminalNode T_OFF() { return getToken(StartDBSqlParser.T_OFF, 0); }
		public TerminalNode T_ON() { return getToken(StartDBSqlParser.T_ON, 0); }
		public TerminalNode T_ONLY() { return getToken(StartDBSqlParser.T_ONLY, 0); }
		public TerminalNode T_OPEN() { return getToken(StartDBSqlParser.T_OPEN, 0); }
		public TerminalNode T_OR() { return getToken(StartDBSqlParser.T_OR, 0); }
		public TerminalNode T_ORDER() { return getToken(StartDBSqlParser.T_ORDER, 0); }
		public TerminalNode T_OUT() { return getToken(StartDBSqlParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(StartDBSqlParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(StartDBSqlParser.T_OVER, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(StartDBSqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_OWNER() { return getToken(StartDBSqlParser.T_OWNER, 0); }
		public TerminalNode T_PACKAGE() { return getToken(StartDBSqlParser.T_PACKAGE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(StartDBSqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(StartDBSqlParser.T_PART_LOC, 0); }
		public TerminalNode T_PARTITION() { return getToken(StartDBSqlParser.T_PARTITION, 0); }
		public TerminalNode T_PCTFREE() { return getToken(StartDBSqlParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(StartDBSqlParser.T_PCTUSED, 0); }
		public TerminalNode T_PRECISION() { return getToken(StartDBSqlParser.T_PRECISION, 0); }
		public TerminalNode T_PRESERVE() { return getToken(StartDBSqlParser.T_PRESERVE, 0); }
		public TerminalNode T_PRIMARY() { return getToken(StartDBSqlParser.T_PRIMARY, 0); }
		public TerminalNode T_PRINT() { return getToken(StartDBSqlParser.T_PRINT, 0); }
		public TerminalNode T_PROC() { return getToken(StartDBSqlParser.T_PROC, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(StartDBSqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PWD() { return getToken(StartDBSqlParser.T_PWD, 0); }
		public TerminalNode T_QUALIFY() { return getToken(StartDBSqlParser.T_QUALIFY, 0); }
		public TerminalNode T_QUERY_BAND() { return getToken(StartDBSqlParser.T_QUERY_BAND, 0); }
		public TerminalNode T_QUIT() { return getToken(StartDBSqlParser.T_QUIT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(StartDBSqlParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_RAISE() { return getToken(StartDBSqlParser.T_RAISE, 0); }
		public TerminalNode T_RANK() { return getToken(StartDBSqlParser.T_RANK, 0); }
		public TerminalNode T_REAL() { return getToken(StartDBSqlParser.T_REAL, 0); }
		public TerminalNode T_REFERENCES() { return getToken(StartDBSqlParser.T_REFERENCES, 0); }
		public TerminalNode T_REGEXP() { return getToken(StartDBSqlParser.T_REGEXP, 0); }
		public TerminalNode T_RR() { return getToken(StartDBSqlParser.T_RR, 0); }
		public TerminalNode T_REPLACE() { return getToken(StartDBSqlParser.T_REPLACE, 0); }
		public TerminalNode T_RESIGNAL() { return getToken(StartDBSqlParser.T_RESIGNAL, 0); }
		public TerminalNode T_RESTRICT() { return getToken(StartDBSqlParser.T_RESTRICT, 0); }
		public TerminalNode T_RESULT() { return getToken(StartDBSqlParser.T_RESULT, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(StartDBSqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_RETURN() { return getToken(StartDBSqlParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(StartDBSqlParser.T_RETURNS, 0); }
		public TerminalNode T_REVERSE() { return getToken(StartDBSqlParser.T_REVERSE, 0); }
		public TerminalNode T_RIGHT() { return getToken(StartDBSqlParser.T_RIGHT, 0); }
		public TerminalNode T_RLIKE() { return getToken(StartDBSqlParser.T_RLIKE, 0); }
		public TerminalNode T_RS() { return getToken(StartDBSqlParser.T_RS, 0); }
		public TerminalNode T_ROLE() { return getToken(StartDBSqlParser.T_ROLE, 0); }
		public TerminalNode T_ROLLBACK() { return getToken(StartDBSqlParser.T_ROLLBACK, 0); }
		public TerminalNode T_ROW() { return getToken(StartDBSqlParser.T_ROW, 0); }
		public TerminalNode T_ROWS() { return getToken(StartDBSqlParser.T_ROWS, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(StartDBSqlParser.T_ROW_COUNT, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(StartDBSqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_SCHEMA() { return getToken(StartDBSqlParser.T_SCHEMA, 0); }
		public TerminalNode T_SECOND() { return getToken(StartDBSqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(StartDBSqlParser.T_SECONDS, 0); }
		public TerminalNode T_SECURITY() { return getToken(StartDBSqlParser.T_SECURITY, 0); }
		public TerminalNode T_SEGMENT() { return getToken(StartDBSqlParser.T_SEGMENT, 0); }
		public TerminalNode T_SEL() { return getToken(StartDBSqlParser.T_SEL, 0); }
		public TerminalNode T_SELECT() { return getToken(StartDBSqlParser.T_SELECT, 0); }
		public TerminalNode T_SESSION() { return getToken(StartDBSqlParser.T_SESSION, 0); }
		public TerminalNode T_SESSIONS() { return getToken(StartDBSqlParser.T_SESSIONS, 0); }
		public TerminalNode T_SET() { return getToken(StartDBSqlParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(StartDBSqlParser.T_SETS, 0); }
		public TerminalNode T_SIGNAL() { return getToken(StartDBSqlParser.T_SIGNAL, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(StartDBSqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(StartDBSqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(StartDBSqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(StartDBSqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SQL() { return getToken(StartDBSqlParser.T_SQL, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(StartDBSqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(StartDBSqlParser.T_SQLINSERT, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(StartDBSqlParser.T_SQLSTATE, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(StartDBSqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_STATS() { return getToken(StartDBSqlParser.T_STATS, 0); }
		public TerminalNode T_STATISTICS() { return getToken(StartDBSqlParser.T_STATISTICS, 0); }
		public TerminalNode T_STEP() { return getToken(StartDBSqlParser.T_STEP, 0); }
		public TerminalNode T_STDEV() { return getToken(StartDBSqlParser.T_STDEV, 0); }
		public TerminalNode T_STORAGE() { return getToken(StartDBSqlParser.T_STORAGE, 0); }
		public TerminalNode T_STORE() { return getToken(StartDBSqlParser.T_STORE, 0); }
		public TerminalNode T_STORED() { return getToken(StartDBSqlParser.T_STORED, 0); }
		public TerminalNode T_STRING() { return getToken(StartDBSqlParser.T_STRING, 0); }
		public TerminalNode T_SUBDIR() { return getToken(StartDBSqlParser.T_SUBDIR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(StartDBSqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUM() { return getToken(StartDBSqlParser.T_SUM, 0); }
		public TerminalNode T_SUMMARY() { return getToken(StartDBSqlParser.T_SUMMARY, 0); }
		public TerminalNode T_SYSDATE() { return getToken(StartDBSqlParser.T_SYSDATE, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(StartDBSqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TABLE() { return getToken(StartDBSqlParser.T_TABLE, 0); }
		public TerminalNode T_TABLESPACE() { return getToken(StartDBSqlParser.T_TABLESPACE, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(StartDBSqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_TERMINATED() { return getToken(StartDBSqlParser.T_TERMINATED, 0); }
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(StartDBSqlParser.T_TEXTIMAGE_ON, 0); }
		public TerminalNode T_THEN() { return getToken(StartDBSqlParser.T_THEN, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(StartDBSqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TITLE() { return getToken(StartDBSqlParser.T_TITLE, 0); }
		public TerminalNode T_TO() { return getToken(StartDBSqlParser.T_TO, 0); }
		public TerminalNode T_TOP() { return getToken(StartDBSqlParser.T_TOP, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(StartDBSqlParser.T_TRANSACTION, 0); }
		public TerminalNode T_TRIM() { return getToken(StartDBSqlParser.T_TRIM, 0); }
		public TerminalNode T_TRUE() { return getToken(StartDBSqlParser.T_TRUE, 0); }
		public TerminalNode T_TRUNCATE() { return getToken(StartDBSqlParser.T_TRUNCATE, 0); }
		public TerminalNode T_UNIQUE() { return getToken(StartDBSqlParser.T_UNIQUE, 0); }
		public TerminalNode T_UPDATE() { return getToken(StartDBSqlParser.T_UPDATE, 0); }
		public TerminalNode T_UR() { return getToken(StartDBSqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(StartDBSqlParser.T_USE, 0); }
		public TerminalNode T_USER() { return getToken(StartDBSqlParser.T_USER, 0); }
		public TerminalNode T_USING() { return getToken(StartDBSqlParser.T_USING, 0); }
		public TerminalNode T_VALUE() { return getToken(StartDBSqlParser.T_VALUE, 0); }
		public TerminalNode T_VALUES() { return getToken(StartDBSqlParser.T_VALUES, 0); }
		public TerminalNode T_VAR() { return getToken(StartDBSqlParser.T_VAR, 0); }
		public TerminalNode T_VARCHAR() { return getToken(StartDBSqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(StartDBSqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_VARYING() { return getToken(StartDBSqlParser.T_VARYING, 0); }
		public TerminalNode T_VARIANCE() { return getToken(StartDBSqlParser.T_VARIANCE, 0); }
		public TerminalNode T_VOLATILE() { return getToken(StartDBSqlParser.T_VOLATILE, 0); }
		public TerminalNode T_WHILE() { return getToken(StartDBSqlParser.T_WHILE, 0); }
		public TerminalNode T_WITH() { return getToken(StartDBSqlParser.T_WITH, 0); }
		public TerminalNode T_WITHOUT() { return getToken(StartDBSqlParser.T_WITHOUT, 0); }
		public TerminalNode T_WORK() { return getToken(StartDBSqlParser.T_WORK, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(StartDBSqlParser.T_XACT_ABORT, 0); }
		public TerminalNode T_XML() { return getToken(StartDBSqlParser.T_XML, 0); }
		public TerminalNode T_YES() { return getToken(StartDBSqlParser.T_YES, 0); }
		public NonReservedWordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReservedWords; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StartDBSqlVisitor ) return ((StartDBSqlVisitor<? extends T>)visitor).visitNonReservedWords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedWordsContext nonReservedWords() throws RecognitionException {
		NonReservedWordsContext _localctx = new NonReservedWordsContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_nonReservedWords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DOWNLOAD - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NO - 192)) | (1L << (T_NOCOUNT - 192)) | (1L << (T_NOCOMPRESS - 192)) | (1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (T_ROW_COUNT - 257)) | (1L << (T_RR - 257)) | (1L << (T_RS - 257)) | (1L << (T_PWD - 257)) | (1L << (T_TRIM - 257)) | (1L << (T_SCHEMA - 257)) | (1L << (T_SECOND - 257)) | (1L << (T_SECONDS - 257)) | (1L << (T_SECURITY - 257)) | (1L << (T_SEGMENT - 257)) | (1L << (T_SEL - 257)) | (1L << (T_SELECT - 257)) | (1L << (T_SET - 257)) | (1L << (T_SESSION - 257)) | (1L << (T_SESSIONS - 257)) | (1L << (T_SETS - 257)) | (1L << (T_SIGNAL - 257)) | (1L << (T_SIMPLE_DOUBLE - 257)) | (1L << (T_SIMPLE_FLOAT - 257)) | (1L << (T_SMALLDATETIME - 257)) | (1L << (T_SMALLINT - 257)) | (1L << (T_SQL - 257)) | (1L << (T_SQLEXCEPTION - 257)) | (1L << (T_SQLINSERT - 257)) | (1L << (T_SQLSTATE - 257)) | (1L << (T_SQLWARNING - 257)) | (1L << (T_STATS - 257)) | (1L << (T_STATISTICS - 257)) | (1L << (T_STEP - 257)) | (1L << (T_STORAGE - 257)) | (1L << (T_STORE - 257)) | (1L << (T_STORED - 257)) | (1L << (T_STRING - 257)) | (1L << (T_SUBDIR - 257)) | (1L << (T_SUBSTRING - 257)) | (1L << (T_SUM - 257)) | (1L << (T_SUMMARY - 257)) | (1L << (T_SYS_REFCURSOR - 257)) | (1L << (T_TABLE - 257)) | (1L << (T_TABLESPACE - 257)) | (1L << (T_TEMPORARY - 257)) | (1L << (T_TERMINATED - 257)) | (1L << (T_TEXTIMAGE_ON - 257)) | (1L << (T_THEN - 257)) | (1L << (T_TIMESTAMP - 257)) | (1L << (T_TITLE - 257)) | (1L << (T_TO - 257)) | (1L << (T_TOP - 257)) | (1L << (T_TRANSACTION - 257)) | (1L << (T_TRUE - 257)) | (1L << (T_TRUNCATE - 257)) | (1L << (T_UNIQUE - 257)) | (1L << (T_UPDATE - 257)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (T_UR - 321)) | (1L << (T_USE - 321)) | (1L << (T_USING - 321)) | (1L << (T_VALUE - 321)) | (1L << (T_VALUES - 321)) | (1L << (T_VAR - 321)) | (1L << (T_VARCHAR - 321)) | (1L << (T_VARCHAR2 - 321)) | (1L << (T_VARYING - 321)) | (1L << (T_VOLATILE - 321)) | (1L << (T_WHILE - 321)) | (1L << (T_WITH - 321)) | (1L << (T_WITHOUT - 321)) | (1L << (T_WORK - 321)) | (1L << (T_XACT_ABORT - 321)) | (1L << (T_XML - 321)) | (1L << (T_YES - 321)) | (1L << (T_ACTIVITY_COUNT - 321)) | (1L << (T_CUME_DIST - 321)) | (1L << (T_CURRENT_DATE - 321)) | (1L << (T_CURRENT_TIME - 321)) | (1L << (T_PI - 321)) | (1L << (T_CURRENT_TIMESTAMP - 321)) | (1L << (T_CURRENT_USER - 321)) | (1L << (T_DENSE_RANK - 321)) | (1L << (T_FIRST_VALUE - 321)) | (1L << (T_LAG - 321)) | (1L << (T_LAST_VALUE - 321)) | (1L << (T_LEAD - 321)) | (1L << (T_PART_COUNT - 321)) | (1L << (T_PART_LOC - 321)) | (1L << (T_RANK - 321)) | (1L << (T_ROW_NUMBER - 321)) | (1L << (T_STDEV - 321)) | (1L << (T_SYSDATE - 321)) | (1L << (T_VARIANCE - 321)) | (1L << (T_USER - 321)))) != 0) || _la==T_HDFS || _la==T_HIVE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 52:
			return fromAliasClause_sempred((FromAliasClauseContext)_localctx, predIndex);
		case 68:
			return deleteAlias_sempred((DeleteAliasContext)_localctx, predIndex);
		case 70:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 78:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 96:
			return funcParam_sempred((FuncParamContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean fromAliasClause_sempred(FromAliasClauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
		        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
		        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
		        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("WITH");
		}
		return true;
	}
	private boolean deleteAlias_sempred(DeleteAliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !_input.LT(1).getText().equalsIgnoreCase("ALL");
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean funcParam_sempred(FuncParamContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0193\u062f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\3\2\3\2\5\2\u00db\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00ed\n\3\3\4\3\4\5\4\u00f1\n\4\3\4\3\4\3"+
		"\5\3\5\3\5\5\5\u00f8\n\5\3\5\5\5\u00fb\n\5\3\6\3\6\3\6\5\6\u0100\n\6\3"+
		"\7\3\7\5\7\u0104\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u010d\n\7\3\7\3\7"+
		"\3\7\5\7\u0112\n\7\3\b\3\b\3\b\3\b\7\b\u0118\n\b\f\b\16\b\u011b\13\b\3"+
		"\b\3\b\5\b\u011f\n\b\3\b\3\b\3\b\3\b\3\b\7\b\u0126\n\b\f\b\16\b\u0129"+
		"\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u0132\n\t\f\t\16\t\u0135\13\t\3"+
		"\t\3\t\5\t\u0139\n\t\3\t\5\t\u013c\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\5\13\u014a\n\13\3\f\3\f\3\f\5\f\u014f\n\f\3\f\3\f\3"+
		"\f\3\f\5\f\u0155\n\f\3\f\3\f\3\f\3\f\5\f\u015b\n\f\3\r\3\r\3\r\5\r\u0160"+
		"\n\r\3\r\3\r\3\r\3\r\5\r\u0166\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\7\17\u0174\n\17\f\17\16\17\u0177\13\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u018d\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01ac\n\22\5\22\u01ae\n"+
		"\22\3\23\3\23\3\23\5\23\u01b3\n\23\3\23\3\23\5\23\u01b7\n\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u01c0\n\24\3\24\3\24\7\24\u01c4\n\24\f"+
		"\24\16\24\u01c7\13\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u01d0\n"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u01d8\n\27\3\30\3\30\3\30\3\30"+
		"\5\30\u01de\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u01e7\n\31\5"+
		"\31\u01e9\n\31\3\31\3\31\5\31\u01ed\n\31\3\31\3\31\5\31\u01f1\n\31\3\32"+
		"\3\32\3\32\3\32\7\32\u01f7\n\32\f\32\16\32\u01fa\13\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\7\33\u0202\n\33\f\33\16\33\u0205\13\33\3\34\3\34\3\34"+
		"\3\34\7\34\u020b\n\34\f\34\16\34\u020e\13\34\3\34\3\34\3\35\3\35\5\35"+
		"\u0214\n\35\3\35\3\35\3\36\3\36\3\36\3\37\5\37\u021c\n\37\3\37\3\37\3"+
		" \3 \3 \3 \7 \u0224\n \f \16 \u0227\13 \3!\3!\5!\u022b\n!\3!\3!\3!\3!"+
		"\3!\3\"\3\"\3\"\3\"\7\"\u0236\n\"\f\"\16\"\u0239\13\"\3\"\3\"\3#\3#\3"+
		"#\3#\7#\u0241\n#\f#\16#\u0244\13#\3#\3#\3#\3#\5#\u024a\n#\3$\3$\3$\3$"+
		"\3$\5$\u0251\n$\3%\3%\5%\u0255\n%\3%\3%\5%\u0259\n%\3%\3%\5%\u025d\n%"+
		"\5%\u025f\n%\3&\3&\3&\5&\u0264\n&\3&\5&\u0267\n&\3&\5&\u026a\n&\3&\5&"+
		"\u026d\n&\3&\3&\5&\u0271\n&\3&\5&\u0274\n&\3&\5&\u0277\n&\3\'\5\'\u027a"+
		"\n\'\3\'\5\'\u027d\n\'\3\'\3\'\3\'\7\'\u0282\n\'\f\'\16\'\u0285\13\'\3"+
		"(\3(\3)\3)\3)\3*\3*\3*\5*\u028f\n*\3*\3*\5*\u0293\n*\3*\5*\u0296\n*\3"+
		"+\5+\u0299\n+\3+\3+\5+\u029d\n+\3+\3+\3+\3+\7+\u02a3\n+\f+\16+\u02a6\13"+
		"+\3+\3+\3+\3+\3+\3+\5+\u02ae\n+\3,\3,\5,\u02b2\n,\3,\3,\3-\3-\3-\3-\7"+
		"-\u02ba\n-\f-\16-\u02bd\13-\3.\3.\3.\7.\u02c2\n.\f.\16.\u02c5\13.\3/\3"+
		"/\3/\5/\u02ca\n/\3\60\3\60\5\60\u02ce\n\60\3\60\5\60\u02d1\n\60\3\61\3"+
		"\61\3\61\3\61\5\61\u02d7\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u02e0\n\62\3\63\5\63\u02e3\n\63\3\63\3\63\3\63\5\63\u02e8\n\63\3\63\5"+
		"\63\u02eb\n\63\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u02f3\n\64\f\64\16\64"+
		"\u02f6\13\64\3\64\3\64\5\64\u02fa\n\64\3\65\3\65\3\65\3\65\3\65\7\65\u0301"+
		"\n\65\f\65\16\65\u0304\13\65\3\65\3\65\5\65\u0308\n\65\3\66\3\66\5\66"+
		"\u030c\n\66\3\66\3\66\3\66\3\66\3\66\7\66\u0313\n\66\f\66\16\66\u0316"+
		"\13\66\3\66\5\66\u0319\n\66\3\67\3\67\38\38\38\39\39\39\39\39\79\u0325"+
		"\n9\f9\169\u0328\139\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\7<\u0335\n<\f<\16"+
		"<\u0338\13<\3=\3=\5=\u033c\n=\3>\3>\3>\3>\3>\3>\3?\6?\u0345\n?\r?\16?"+
		"\u0346\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0352\n@\5@\u0354\n@\3A\3A\3A\3A"+
		"\3A\5A\u035b\nA\3A\5A\u035e\nA\3B\3B\3B\7B\u0363\nB\fB\16B\u0366\13B\3"+
		"C\3C\5C\u036a\nC\3C\3C\3C\3C\5C\u0370\nC\3C\5C\u0373\nC\3C\5C\u0376\n"+
		"C\3D\3D\3D\3E\3E\5E\u037d\nE\3E\3E\5E\u0381\nE\3E\3E\5E\u0385\nE\3F\3"+
		"F\5F\u0389\nF\3F\3F\3G\3G\5G\u038f\nG\3G\3G\3H\3H\5H\u0395\nH\3H\3H\3"+
		"H\3H\3H\5H\u039c\nH\3H\3H\3H\3H\7H\u03a2\nH\fH\16H\u03a5\13H\3I\3I\3I"+
		"\5I\u03aa\nI\3J\3J\3J\5J\u03af\nJ\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u03ba"+
		"\nJ\3J\3J\3J\3J\3J\3J\3J\5J\u03c3\nJ\3K\3K\5K\u03c7\nK\3K\3K\3K\3K\3K"+
		"\7K\u03ce\nK\fK\16K\u03d1\13K\3K\5K\u03d4\nK\3K\3K\3L\3L\3L\3L\7L\u03dc"+
		"\nL\fL\16L\u03df\13L\3L\3L\5L\u03e3\nL\3L\3L\3L\3L\3L\3M\3M\3M\3M\3N\3"+
		"N\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u03f9\nO\3O\5O\u03fc\nO\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u040f\nP\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\7P\u041f\nP\fP\16P\u0422\13P\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\5Q\u042c\nQ\3R\3R\3R\3R\3S\3S\3T\3T\3T\3T\3T\7T\u0439\nT\fT\16"+
		"T\u043c\13T\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0447\nU\3V\3V\5V\u044b\nV\3"+
		"W\3W\3W\3W\3W\3W\3W\6W\u0454\nW\rW\16W\u0455\3W\3W\5W\u045a\nW\3W\3W\3"+
		"X\3X\6X\u0460\nX\rX\16X\u0461\3X\3X\5X\u0466\nX\3X\3X\3Y\3Y\3Y\3Y\3Y\3"+
		"Z\3Z\3Z\3Z\3[\3[\3[\5[\u0476\n[\3[\3[\3[\5[\u047b\n[\3[\3[\3[\5[\u0480"+
		"\n[\3[\3[\5[\u0484\n[\3[\3[\5[\u0488\n[\3[\3[\3[\5[\u048d\n[\3[\3[\5["+
		"\u0491\n[\3[\3[\5[\u0495\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\3[\5[\u04ac\n[\5[\u04ae\n[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\3[\3[\5[\u04c0\n[\5[\u04c2\n[\3[\3[\3[\3[\3[\3[\5["+
		"\u04ca\n[\3[\3[\3[\5[\u04cf\n[\3[\3[\3[\5[\u04d4\n[\3[\3[\3[\5[\u04d9"+
		"\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u04e6\n[\3[\3[\3[\5[\u04eb\n["+
		"\3[\3[\3[\5[\u04f0\n[\3[\3[\3[\5[\u04f5\n[\3[\3[\3[\5[\u04fa\n[\3[\3["+
		"\3[\5[\u04ff\n[\3[\3[\3[\5[\u0504\n[\3[\3[\3[\5[\u0509\n[\5[\u050b\n["+
		"\3\\\3\\\3]\3]\3]\5]\u0512\n]\3]\5]\u0515\n]\3]\3]\3^\3^\3^\3^\3^\7^\u051e"+
		"\n^\f^\16^\u0521\13^\3_\3_\3_\3_\3_\3_\3_\5_\u052a\n_\3_\3_\3_\3_\3_\3"+
		"_\5_\u0532\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u053d\n_\3_\3_\3_\3_\5_\u0543"+
		"\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\7_\u0552\n_\f_\16_\u0555\13"+
		"_\5_\u0557\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\7_\u0565\n_\f_\16_\u0568"+
		"\13_\5_\u056a\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\7_\u0578\n_\f_\16"+
		"_\u057b\13_\5_\u057d\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\7_\u058b\n"+
		"_\f_\16_\u058e\13_\5_\u0590\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\7_"+
		"\u059e\n_\f_\16_\u05a1\13_\5_\u05a3\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\7_\u05b1\n_\f_\16_\u05b4\13_\5_\u05b6\n_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\7_\u05c2\n_\f_\16_\u05c5\13_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\6_\u05d1"+
		"\n_\r_\16_\u05d2\3_\3_\5_\u05d7\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u05e2"+
		"\n_\3_\3_\3_\3_\5_\u05e8\n_\3`\3`\3`\5`\u05ed\n`\3`\3`\3a\3a\3a\7a\u05f4"+
		"\na\fa\16a\u05f7\13a\3b\3b\3b\3b\3b\5b\u05fe\nb\5b\u0600\nb\3b\3b\5b\u0604"+
		"\nb\3c\3c\3c\3d\3d\3d\3e\5e\u060d\ne\3e\3e\3e\7e\u0612\ne\fe\16e\u0615"+
		"\13e\3f\3f\5f\u0619\nf\3g\3g\5g\u061d\ng\3h\5h\u0620\nh\3h\3h\3i\5i\u0625"+
		"\ni\3i\3i\3j\3j\3k\3k\3l\3l\3l\2\4\u008e\u009em\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\2\31\5\2LL\u0180"+
		"\u0180\u0189\u0189\3\2\u0189\u018b\4\2\u0102\u0102\u013f\u013f\4\2\u00b7"+
		"\u00b7\u018c\u018c\4\2\36\36%%\4\2BB\u0109\u0109\4\2LL\u0189\u0189\3\2"+
		"\u010e\u010f\4\2\6\6YY\5\2zz\u00a7\u00a7\u00fc\u00fc\4\2\r\rTT\5\2>>\u0104"+
		"\u0105\u0143\u0143\4\2kk\u0142\u0142\3\2TU\4\2\u012d\u012d\u012f\u012f"+
		"\4\2\t\t\u00d1\u00d1\5\2\u00a8\u00a8\u00f1\u00f1\u00fd\u00fd\5\2GH\u00bb"+
		"\u00bc\u010a\u010b\4\2\64\64\u0174\u0174\5\2xx\u009d\u009d\u00c8\u00c8"+
		"\4\2\u0171\u0171\u0188\u0188\4\2oo\u013d\u013d\"\2\4\17\21\27\31\33\35"+
		"/\61BD_cce\177\u0081\u0086\u0088\u008c\u008e\u00a0\u00a2\u00a3\u00a5\u00aa"+
		"\u00ac\u00c8\u00ca\u00d9\u00db\u00dc\u00df\u00e0\u00e2\u00e5\u00ea\u00f1"+
		"\u00f3\u00fa\u00fc\u0101\u0103\u0107\u0109\u0113\u0115\u0117\u0119\u011f"+
		"\u0121\u012d\u0132\u0137\u0139\u013e\u0141\u014c\u014f\u0161\u0168\u016f"+
		"\u0192\u0193\2\u06f9\2\u00d8\3\2\2\2\4\u00ec\3\2\2\2\6\u00f0\3\2\2\2\b"+
		"\u00fa\3\2\2\2\n\u00ff\3\2\2\2\f\u0111\3\2\2\2\16\u0113\3\2\2\2\20\u0138"+
		"\3\2\2\2\22\u0142\3\2\2\2\24\u0149\3\2\2\2\26\u014b\3\2\2\2\30\u015c\3"+
		"\2\2\2\32\u016b\3\2\2\2\34\u0170\3\2\2\2\36\u0178\3\2\2\2 \u017c\3\2\2"+
		"\2\"\u01ad\3\2\2\2$\u01af\3\2\2\2&\u01ba\3\2\2\2(\u01c8\3\2\2\2*\u01cb"+
		"\3\2\2\2,\u01d7\3\2\2\2.\u01d9\3\2\2\2\60\u01e1\3\2\2\2\62\u01f2\3\2\2"+
		"\2\64\u01fd\3\2\2\2\66\u0206\3\2\2\28\u0211\3\2\2\2:\u0217\3\2\2\2<\u021b"+
		"\3\2\2\2>\u021f\3\2\2\2@\u0228\3\2\2\2B\u0231\3\2\2\2D\u0249\3\2\2\2F"+
		"\u0250\3\2\2\2H\u025e\3\2\2\2J\u0260\3\2\2\2L\u0279\3\2\2\2N\u0286\3\2"+
		"\2\2P\u0288\3\2\2\2R\u0295\3\2\2\2T\u02ad\3\2\2\2V\u02b1\3\2\2\2X\u02b5"+
		"\3\2\2\2Z\u02be\3\2\2\2\\\u02c9\3\2\2\2^\u02cb\3\2\2\2`\u02d2\3\2\2\2"+
		"b\u02df\3\2\2\2d\u02ea\3\2\2\2f\u02ec\3\2\2\2h\u0307\3\2\2\2j\u0309\3"+
		"\2\2\2l\u031a\3\2\2\2n\u031c\3\2\2\2p\u031f\3\2\2\2r\u0329\3\2\2\2t\u032c"+
		"\3\2\2\2v\u032f\3\2\2\2x\u0339\3\2\2\2z\u033d\3\2\2\2|\u0344\3\2\2\2~"+
		"\u0353\3\2\2\2\u0080\u0355\3\2\2\2\u0082\u035f\3\2\2\2\u0084\u036f\3\2"+
		"\2\2\u0086\u0377\3\2\2\2\u0088\u037a\3\2\2\2\u008a\u0386\3\2\2\2\u008c"+
		"\u038c\3\2\2\2\u008e\u039b\3\2\2\2\u0090\u03a9\3\2\2\2\u0092\u03c2\3\2"+
		"\2\2\u0094\u03c4\3\2\2\2\u0096\u03d7\3\2\2\2\u0098\u03e9\3\2\2\2\u009a"+
		"\u03ed\3\2\2\2\u009c\u03fb\3\2\2\2\u009e\u040e\3\2\2\2\u00a0\u042b\3\2"+
		"\2\2\u00a2\u042d\3\2\2\2\u00a4\u0431\3\2\2\2\u00a6\u0433\3\2\2\2\u00a8"+
		"\u0446\3\2\2\2\u00aa\u044a\3\2\2\2\u00ac\u044c\3\2\2\2\u00ae\u045d\3\2"+
		"\2\2\u00b0\u0469\3\2\2\2\u00b2\u046e\3\2\2\2\u00b4\u050a\3\2\2\2\u00b6"+
		"\u050c\3\2\2\2\u00b8\u050e\3\2\2\2\u00ba\u0518\3\2\2\2\u00bc\u05e7\3\2"+
		"\2\2\u00be\u05e9\3\2\2\2\u00c0\u05f0\3\2\2\2\u00c2\u0603\3\2\2\2\u00c4"+
		"\u0605\3\2\2\2\u00c6\u0608\3\2\2\2\u00c8\u060c\3\2\2\2\u00ca\u0618\3\2"+
		"\2\2\u00cc\u061c\3\2\2\2\u00ce\u061f\3\2\2\2\u00d0\u0624\3\2\2\2\u00d2"+
		"\u0628\3\2\2\2\u00d4\u062a\3\2\2\2\u00d6\u062c\3\2\2\2\u00d8\u00da\5\4"+
		"\3\2\u00d9\u00db\7\u0187\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\7\2\2\3\u00dd\3\3\2\2\2\u00de\u00ed\5&\24\2"+
		"\u00df\u00ed\5\24\13\2\u00e0\u00ed\5\u008cG\2\u00e1\u00ed\5*\26\2\u00e2"+
		"\u00ed\5.\30\2\u00e3\u00ed\58\35\2\u00e4\u00ed\5:\36\2\u00e5\u00ed\5("+
		"\25\2\u00e6\u00ed\5 \21\2\u00e7\u00ed\5\22\n\2\u00e8\u00ed\5\60\31\2\u00e9"+
		"\u00ed\5\u0080A\2\u00ea\u00ed\5\u0088E\2\u00eb\u00ed\5<\37\2\u00ec\u00de"+
		"\3\2\2\2\u00ec\u00df\3\2\2\2\u00ec\u00e0\3\2\2\2\u00ec\u00e1\3\2\2\2\u00ec"+
		"\u00e2\3\2\2\2\u00ec\u00e3\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ec\u00e5\3\2"+
		"\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec"+
		"\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\5\3\2\2\2"+
		"\u00ee\u00ef\t\2\2\2\u00ef\u00f1\7\u0176\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\t\2\2\2\u00f3\7\3\2\2\2"+
		"\u00f4\u00fb\5\6\4\2\u00f5\u00f6\7\u0189\2\2\u00f6\u00f8\7\u0176\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\5\6"+
		"\4\2\u00fa\u00f4\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fb\t\3\2\2\2\u00fc\u0100"+
		"\5\f\7\2\u00fd\u0100\5\16\b\2\u00fe\u0100\5\20\t\2\u00ff\u00fc\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\13\3\2\2\2\u0101\u0103"+
		"\5\u00c8e\2\u0102\u0104\7\u0172\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3"+
		"\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7\u0178\2\2\u0106\u0107\5\u009e"+
		"P\2\u0107\u0112\3\2\2\2\u0108\u0109\7\u0182\2\2\u0109\u010a\5\u00c8e\2"+
		"\u010a\u010c\7\u0185\2\2\u010b\u010d\7\u0172\2\2\u010c\u010b\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\u0178\2\2\u010f\u0110"+
		"\5\u009eP\2\u0110\u0112\3\2\2\2\u0111\u0101\3\2\2\2\u0111\u0108\3\2\2"+
		"\2\u0112\r\3\2\2\2\u0113\u0114\7\u0182\2\2\u0114\u0119\5\u00c8e\2\u0115"+
		"\u0116\7\u0173\2\2\u0116\u0118\5\u00c8e\2\u0117\u0115\3\2\2\2\u0118\u011b"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011c\u011e\7\u0185\2\2\u011d\u011f\7\u0172\2\2\u011e\u011d"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\u0178\2"+
		"\2\u0121\u0122\7\u0182\2\2\u0122\u0127\5\u009eP\2\u0123\u0124\7\u0173"+
		"\2\2\u0124\u0126\5\u009eP\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\u012b\7\u0185\2\2\u012b\17\3\2\2\2\u012c\u0139\5\u00c8e\2\u012d"+
		"\u012e\7\u0182\2\2\u012e\u0133\5\u00c8e\2\u012f\u0130\7\u0173\2\2\u0130"+
		"\u0132\5\u00c8e\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u0137\7\u0185\2\2\u0137\u0139\3\2\2\2\u0138\u012c\3\2\2\2\u0138\u012d"+
		"\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u013c\7\u0172\2\2\u013b\u013a\3\2\2"+
		"\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7\u0178\2\2\u013e"+
		"\u013f\7\u0182\2\2\u013f\u0140\5<\37\2\u0140\u0141\7\u0185\2\2\u0141\21"+
		"\3\2\2\2\u0142\u0143\7\u0114\2\2\u0143\u0144\7;\2\2\u0144\u0145\7\u012d"+
		"\2\2\u0145\u0146\5\u00c8e\2\u0146\23\3\2\2\2\u0147\u014a\5\26\f\2\u0148"+
		"\u014a\5\30\r\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a\25\3\2\2"+
		"\2\u014b\u014e\7;\2\2\u014c\u014d\7\u00d1\2\2\u014d\u014f\7\u00f3\2\2"+
		"\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0154"+
		"\7\u012d\2\2\u0151\u0152\7\u0088\2\2\u0152\u0153\7\u00c7\2\2\u0153\u0155"+
		"\7l\2\2\u0154\u0151\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0157\5l\67\2\u0157\u0158\7\f\2\2\u0158\u015a\5<\37\2\u0159\u015b\5\32"+
		"\16\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\27\3\2\2\2\u015c\u015f"+
		"\7;\2\2\u015d\u015e\7\u00d1\2\2\u015e\u0160\7\u00f3\2\2\u015f\u015d\3"+
		"\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0165\7\u012d\2\2"+
		"\u0162\u0163\7\u0088\2\2\u0163\u0164\7\u00c7\2\2\u0164\u0166\7l\2\2\u0165"+
		"\u0162\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\5l"+
		"\67\2\u0168\u0169\7\u00a8\2\2\u0169\u016a\5l\67\2\u016a\31\3\2\2\2\u016b"+
		"\u016c\7\u0150\2\2\u016c\u016d\7\u0182\2\2\u016d\u016e\5\34\17\2\u016e"+
		"\u016f\7\u0185\2\2\u016f\33\3\2\2\2\u0170\u0175\5\36\20\2\u0171\u0172"+
		"\7\u0173\2\2\u0172\u0174\5\36\20\2\u0173\u0171\3\2\2\2\u0174\u0177\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\35\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0178\u0179\t\3\2\2\u0179\u017a\7\u0178\2\2\u017a\u017b\t\3\2"+
		"\2\u017b\37\3\2\2\2\u017c\u017d\7\u0114\2\2\u017d\u017e\7\u0130\2\2\u017e"+
		"!\3\2\2\2\u017f\u01ae\7%\2\2\u0180\u01ae\7&\2\2\u0181\u01ae\7\25\2\2\u0182"+
		"\u01ae\7\26\2\2\u0183\u01ae\7\27\2\2\u0184\u01ae\7\30\2\2\u0185\u01ae"+
		"\7\31\2\2\u0186\u01ae\7E\2\2\u0187\u01ae\7F\2\2\u0188\u01ae\7I\2\2\u0189"+
		"\u01ae\7J\2\2\u018a\u018c\7\\\2\2\u018b\u018d\7\u00df\2\2\u018c\u018b"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u01ae\3\2\2\2\u018e\u01ae\7t\2\2\u018f"+
		"\u01ae\7\u0093\2\2\u0190\u01ae\7\u0094\2\2\u0191\u01ae\7\u0095\2\2\u0192"+
		"\u01ae\7\u0096\2\2\u0193\u01ae\7\u0097\2\2\u0194\u01ae\7\u00bf\2\2\u0195"+
		"\u01ae\7\u00c1\2\2\u0196\u01ae\7\u00cb\2\2\u0197\u01ae\7\u00ca\2\2\u0198"+
		"\u01ae\7\u00de\2\2\u0199\u01ae\7\u00ef\2\2\u019a\u019b\7\u00f7\2\2\u019b"+
		"\u01ae\7\u014b\2\2\u019c\u01ae\7\u0117\2\2\u019d\u01ae\7\u0116\2\2\u019e"+
		"\u01ae\7\u0118\2\2\u019f\u01ae\7\u011a\2\2\u01a0\u01ae\7\u0119\2\2\u01a1"+
		"\u01ae\7\u0127\2\2\u01a2\u01ae\7\u012c\2\2\u01a3\u01ae\7\u0137\2\2\u01a4"+
		"\u01ae\7\u0138\2\2\u01a5\u01ae\7\u0149\2\2\u01a6\u01ae\7\u014a\2\2\u01a7"+
		"\u01ae\7\u0154\2\2\u01a8\u01ab\5\u00c8e\2\u01a9\u01aa\7\3\2\2\u01aa\u01ac"+
		"\t\4\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad"+
		"\u017f\3\2\2\2\u01ad\u0180\3\2\2\2\u01ad\u0181\3\2\2\2\u01ad\u0182\3\2"+
		"\2\2\u01ad\u0183\3\2\2\2\u01ad\u0184\3\2\2\2\u01ad\u0185\3\2\2\2\u01ad"+
		"\u0186\3\2\2\2\u01ad\u0187\3\2\2\2\u01ad\u0188\3\2\2\2\u01ad\u0189\3\2"+
		"\2\2\u01ad\u018a\3\2\2\2\u01ad\u018e\3\2\2\2\u01ad\u018f\3\2\2\2\u01ad"+
		"\u0190\3\2\2\2\u01ad\u0191\3\2\2\2\u01ad\u0192\3\2\2\2\u01ad\u0193\3\2"+
		"\2\2\u01ad\u0194\3\2\2\2\u01ad\u0195\3\2\2\2\u01ad\u0196\3\2\2\2\u01ad"+
		"\u0197\3\2\2\2\u01ad\u0198\3\2\2\2\u01ad\u0199\3\2\2\2\u01ad\u019a\3\2"+
		"\2\2\u01ad\u019c\3\2\2\2\u01ad\u019d\3\2\2\2\u01ad\u019e\3\2\2\2\u01ad"+
		"\u019f\3\2\2\2\u01ad\u01a0\3\2\2\2\u01ad\u01a1\3\2\2\2\u01ad\u01a2\3\2"+
		"\2\2\u01ad\u01a3\3\2\2\2\u01ad\u01a4\3\2\2\2\u01ad\u01a5\3\2\2\2\u01ad"+
		"\u01a6\3\2\2\2\u01ad\u01a7\3\2\2\2\u01ad\u01a8\3\2\2\2\u01ae#\3\2\2\2"+
		"\u01af\u01b0\7\u0182\2\2\u01b0\u01b2\t\5\2\2\u01b1\u01b3\t\6\2\2\u01b2"+
		"\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b5\7\u0173"+
		"\2\2\u01b5\u01b7\7\u018c\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01b9\7\u0185\2\2\u01b9%\3\2\2\2\u01ba\u01bb\7;\2"+
		"\2\u01bb\u01bf\t\7\2\2\u01bc\u01bd\7\u0088\2\2\u01bd\u01be\7\u00c7\2\2"+
		"\u01be\u01c0\7l\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1"+
		"\3\2\2\2\u01c1\u01c5\7\u0189\2\2\u01c2\u01c4\5,\27\2\u01c3\u01c2\3\2\2"+
		"\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\'"+
		"\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7\u0114\2\2\u01c9\u01ca\7C\2"+
		"\2\u01ca)\3\2\2\2\u01cb\u01cc\7^\2\2\u01cc\u01cf\t\7\2\2\u01cd\u01ce\7"+
		"\u0088\2\2\u01ce\u01d0\7l\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2"+
		"\u01d0\u01d1\3\2\2\2\u01d1\u01d2\7\u0189\2\2\u01d2+\3\2\2\2\u01d3\u01d4"+
		"\7/\2\2\u01d4\u01d8\5\u009eP\2\u01d5\u01d6\7\u00ad\2\2\u01d6\u01d8\5\u009e"+
		"P\2\u01d7\u01d3\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8-\3\2\2\2\u01d9\u01da"+
		"\7^\2\2\u01da\u01dd\7\u012d\2\2\u01db\u01dc\7\u0088\2\2\u01dc\u01de\7"+
		"l\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e0\5l\67\2\u01e0/\3\2\2\2\u01e1\u01e8\7\u0092\2\2\u01e2\u01e3\7\u00d6"+
		"\2\2\u01e3\u01e9\7\u012d\2\2\u01e4\u01e6\7\u009a\2\2\u01e5\u01e7\7\u012d"+
		"\2\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8"+
		"\u01e2\3\2\2\2\u01e8\u01e4\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\5l"+
		"\67\2\u01eb\u01ed\5\62\32\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01f0\3\2\2\2\u01ee\u01f1\5<\37\2\u01ef\u01f1\5\64\33\2\u01f0\u01ee\3"+
		"\2\2\2\u01f0\u01ef\3\2\2\2\u01f1\61\3\2\2\2\u01f2\u01f3\7\u0182\2\2\u01f3"+
		"\u01f8\5\u00c8e\2\u01f4\u01f5\7\u0173\2\2\u01f5\u01f7\5\u00c8e\2\u01f6"+
		"\u01f4\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2"+
		"\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fc\7\u0185\2\2\u01fc"+
		"\63\3\2\2\2\u01fd\u01fe\7\u0147\2\2\u01fe\u0203\5\66\34\2\u01ff\u0200"+
		"\7\u0173\2\2\u0200\u0202\5\66\34\2\u0201\u01ff\3\2\2\2\u0202\u0205\3\2"+
		"\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\65\3\2\2\2\u0205\u0203"+
		"\3\2\2\2\u0206\u0207\7\u0182\2\2\u0207\u020c\5\u009eP\2\u0208\u0209\7"+
		"\u0173\2\2\u0209\u020b\5\u009eP\2\u020a\u0208\3\2\2\2\u020b\u020e\3\2"+
		"\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e"+
		"\u020c\3\2\2\2\u020f\u0210\7\u0185\2\2\u0210\67\3\2\2\2\u0211\u0213\7"+
		"\u013e\2\2\u0212\u0214\7\u012d\2\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2"+
		"\2\2\u0214\u0215\3\2\2\2\u0215\u0216\5\u00c8e\2\u02169\3\2\2\2\u0217\u0218"+
		"\7\u0144\2\2\u0218\u0219\t\b\2\2\u0219;\3\2\2\2\u021a\u021c\5> \2\u021b"+
		"\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\5D"+
		"#\2\u021e=\3\2\2\2\u021f\u0220\7\u0150\2\2\u0220\u0225\5@!\2\u0221\u0222"+
		"\7\u0173\2\2\u0222\u0224\5@!\2\u0223\u0221\3\2\2\2\u0224\u0227\3\2\2\2"+
		"\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226?\3\2\2\2\u0227\u0225\3"+
		"\2\2\2\u0228\u022a\5\u00c8e\2\u0229\u022b\5B\"\2\u022a\u0229\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\7\f\2\2\u022d\u022e\7\u0182"+
		"\2\2\u022e\u022f\5D#\2\u022f\u0230\7\u0185\2\2\u0230A\3\2\2\2\u0231\u0232"+
		"\7\u0182\2\2\u0232\u0237\5\u00c8e\2\u0233\u0234\7\u0173\2\2\u0234\u0236"+
		"\5\u00c8e\2\u0235\u0233\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2"+
		"\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023b"+
		"\7\u0185\2\2\u023bC\3\2\2\2\u023c\u0242\5F$\2\u023d\u023e\5H%\2\u023e"+
		"\u023f\5F$\2\u023f\u0241\3\2\2\2\u0240\u023d\3\2\2\2\u0241\u0244\3\2\2"+
		"\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u024a\3\2\2\2\u0244\u0242"+
		"\3\2\2\2\u0245\u0246\7\u0182\2\2\u0246\u0247\5D#\2\u0247\u0248\7\u0185"+
		"\2\2\u0248\u024a\3\2\2\2\u0249\u023c\3\2\2\2\u0249\u0245\3\2\2\2\u024a"+
		"E\3\2\2\2\u024b\u0251\5J&\2\u024c\u024d\7\u0182\2\2\u024d\u024e\5D#\2"+
		"\u024e\u024f\7\u0185\2\2\u024f\u0251\3\2\2\2\u0250\u024b\3\2\2\2\u0250"+
		"\u024c\3\2\2\2\u0251G\3\2\2\2\u0252\u0254\7\u0140\2\2\u0253\u0255\7\6"+
		"\2\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u025f\3\2\2\2\u0256"+
		"\u0258\7g\2\2\u0257\u0259\7\6\2\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259\u025f\3\2\2\2\u025a\u025c\7\u0098\2\2\u025b\u025d\7\6\2\2\u025c"+
		"\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u0252\3\2"+
		"\2\2\u025e\u0256\3\2\2\2\u025e\u025a\3\2\2\2\u025fI\3\2\2\2\u0260\u0261"+
		"\t\t\2\2\u0261\u0263\5L\'\2\u0262\u0264\5X-\2\u0263\u0262\3\2\2\2\u0263"+
		"\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0267\5Z.\2\u0266\u0265\3\2\2"+
		"\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u026a\5n8\2\u0269\u0268"+
		"\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b\u026d\5p9\2\u026c"+
		"\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u0271\5r"+
		":\2\u026f\u0271\5t;\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2\2\2\u0270\u0271"+
		"\3\2\2\2\u0271\u0273\3\2\2\2\u0272\u0274\5v<\2\u0273\u0272\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0276\3\2\2\2\u0275\u0277\5|?\2\u0276\u0275\3\2\2"+
		"\2\u0276\u0277\3\2\2\2\u0277K\3\2\2\2\u0278\u027a\5N(\2\u0279\u0278\3"+
		"\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u027d\5P)\2\u027c"+
		"\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0283\5R"+
		"*\2\u027f\u0280\7\u0173\2\2\u0280\u0282\5R*\2\u0281\u027f\3\2\2\2\u0282"+
		"\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284M\3\2\2\2"+
		"\u0285\u0283\3\2\2\2\u0286\u0287\t\n\2\2\u0287O\3\2\2\2\u0288\u0289\7"+
		"\u013b\2\2\u0289\u028a\5\u009eP\2\u028aQ\3\2\2\2\u028b\u028c\5\u00c8e"+
		"\2\u028c\u028d\7\u0178\2\2\u028d\u028f\3\2\2\2\u028e\u028b\3\2\2\2\u028e"+
		"\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\5\u009eP\2\u0291\u0293"+
		"\5T+\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0296\3\2\2\2\u0294"+
		"\u0296\5V,\2\u0295\u028e\3\2\2\2\u0295\u0294\3\2\2\2\u0296S\3\2\2\2\u0297"+
		"\u0299\7\f\2\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\3\2"+
		"\2\2\u029a\u02ae\5\u00c8e\2\u029b\u029d\7\f\2\2\u029c\u029b\3\2\2\2\u029c"+
		"\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\7\u0182\2\2\u029f\u02a4"+
		"\5\u00c8e\2\u02a0\u02a1\7\u0173\2\2\u02a1\u02a3\5\u00c8e\2\u02a2\u02a0"+
		"\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a7\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8\7\u0185\2\2\u02a8\u02ae"+
		"\3\2\2\2\u02a9\u02aa\7\u0182\2\2\u02aa\u02ab\7\u0139\2\2\u02ab\u02ac\7"+
		"\u018a\2\2\u02ac\u02ae\7\u0185\2\2\u02ad\u0298\3\2\2\2\u02ad\u029c\3\2"+
		"\2\2\u02ad\u02a9\3\2\2\2\u02aeU\3\2\2\2\u02af\u02b0\7\u0189\2\2\u02b0"+
		"\u02b2\7\u0176\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3"+
		"\3\2\2\2\u02b3\u02b4\7\u0180\2\2\u02b4W\3\2\2\2\u02b5\u02b6\7\u009a\2"+
		"\2\u02b6\u02bb\5\u00c8e\2\u02b7\u02b8\7\u0173\2\2\u02b8\u02ba\5\u00c8"+
		"e\2\u02b9\u02b7\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb"+
		"\u02bc\3\2\2\2\u02bcY\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02bf\7y\2\2\u02bf"+
		"\u02c3\5\\/\2\u02c0\u02c2\5b\62\2\u02c1\u02c0\3\2\2\2\u02c2\u02c5\3\2"+
		"\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4[\3\2\2\2\u02c5\u02c3"+
		"\3\2\2\2\u02c6\u02ca\5^\60\2\u02c7\u02ca\5`\61\2\u02c8\u02ca\5f\64\2\u02c9"+
		"\u02c6\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02c8\3\2\2\2\u02ca]\3\2\2\2"+
		"\u02cb\u02cd\5l\67\2\u02cc\u02ce\5j\66\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce"+
		"\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02d1\5z>\2\u02d0\u02cf\3\2\2\2\u02d0"+
		"\u02d1\3\2\2\2\u02d1_\3\2\2\2\u02d2\u02d3\7\u0182\2\2\u02d3\u02d4\5<\37"+
		"\2\u02d4\u02d6\7\u0185\2\2\u02d5\u02d7\5j\66\2\u02d6\u02d5\3\2\2\2\u02d6"+
		"\u02d7\3\2\2\2\u02d7a\3\2\2\2\u02d8\u02d9\7\u0173\2\2\u02d9\u02e0\5\\"+
		"/\2\u02da\u02db\5d\63\2\u02db\u02dc\5\\/\2\u02dc\u02dd\7\u00ce\2\2\u02dd"+
		"\u02de\5\u008eH\2\u02de\u02e0\3\2\2\2\u02df\u02d8\3\2\2\2\u02df\u02da"+
		"\3\2\2\2\u02e0c\3\2\2\2\u02e1\u02e3\7\u0090\2\2\u02e2\u02e1\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02eb\7\u009f\2\2\u02e5\u02e7"+
		"\t\13\2\2\u02e6\u02e8\7\u00d4\2\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\7\u009f\2\2\u02ea\u02e2\3\2\2\2\u02ea"+
		"\u02e5\3\2\2\2\u02ebe\3\2\2\2\u02ec\u02ed\7\u012d\2\2\u02ed\u02ee\7\u0182"+
		"\2\2\u02ee\u02ef\7\u0147\2\2\u02ef\u02f4\5h\65\2\u02f0\u02f1\7\u0173\2"+
		"\2\u02f1\u02f3\5h\65\2\u02f2\u02f0\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2"+
		"\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7"+
		"\u02f9\7\u0185\2\2\u02f8\u02fa\5j\66\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa"+
		"\3\2\2\2\u02fag\3\2\2\2\u02fb\u0308\5\u009eP\2\u02fc\u02fd\7\u0182\2\2"+
		"\u02fd\u0302\5\u009eP\2\u02fe\u02ff\7\u0173\2\2\u02ff\u0301\5\u009eP\2"+
		"\u0300\u02fe\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303"+
		"\3\2\2\2\u0303\u0305\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0306\7\u0185\2"+
		"\2\u0306\u0308\3\2\2\2\u0307\u02fb\3\2\2\2\u0307\u02fc\3\2\2\2\u0308i"+
		"\3\2\2\2\u0309\u030b\6\66\2\2\u030a\u030c\7\f\2\2\u030b\u030a\3\2\2\2"+
		"\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0318\5\u00c8e\2\u030e"+
		"\u030f\7\u0182\2\2\u030f\u0314\7\u0189\2\2\u0310\u0311\7\u0173\2\2\u0311"+
		"\u0313\7\u0189\2\2\u0312\u0310\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312"+
		"\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0314\3\2\2\2\u0317"+
		"\u0319\7\u0185\2\2\u0318\u030e\3\2\2\2\u0318\u0319\3\2\2\2\u0319k\3\2"+
		"\2\2\u031a\u031b\5\u00c8e\2\u031bm\3\2\2\2\u031c\u031d\7\u014e\2\2\u031d"+
		"\u031e\5\u008eH\2\u031eo\3\2\2\2\u031f\u0320\7\u0081\2\2\u0320\u0321\7"+
		"\35\2\2\u0321\u0326\5\u009eP\2\u0322\u0323\7\u0173\2\2\u0323\u0325\5\u009e"+
		"P\2\u0324\u0322\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326"+
		"\u0327\3\2\2\2\u0327q\3\2\2\2\u0328\u0326\3\2\2\2\u0329\u032a\7\u0084"+
		"\2\2\u032a\u032b\5\u008eH\2\u032bs\3\2\2\2\u032c\u032d\7\u00ea\2\2\u032d"+
		"\u032e\5\u008eH\2\u032eu\3\2\2\2\u032f\u0330\7\u00d2\2\2\u0330\u0331\7"+
		"\35\2\2\u0331\u0336\5x=\2\u0332\u0333\7\u0173\2\2\u0333\u0335\5x=\2\u0334"+
		"\u0332\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2"+
		"\2\2\u0337w\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u033b\5\u009eP\2\u033a\u033c"+
		"\t\f\2\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033cy\3\2\2\2\u033d"+
		"\u033e\7\u0108\2\2\u033e\u033f\7\u0182\2\2\u033f\u0340\7\u018c\2\2\u0340"+
		"\u0341\7\u00dd\2\2\u0341\u0342\7\u0185\2\2\u0342{\3\2\2\2\u0343\u0345"+
		"\5~@\2\u0344\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0344\3\2\2\2\u0346"+
		"\u0347\3\2\2\2\u0347}\3\2\2\2\u0348\u0349\7\u00a9\2\2\u0349\u0354\5\u009e"+
		"P\2\u034a\u034b\7\u0150\2\2\u034b\u0351\t\r\2\2\u034c\u034d\7\u0144\2"+
		"\2\u034d\u034e\7\t\2\2\u034e\u034f\7\u00a0\2\2\u034f\u0350\t\16\2\2\u0350"+
		"\u0352\7\u00b0\2\2\u0351\u034c\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354"+
		"\3\2\2\2\u0353\u0348\3\2\2\2\u0353\u034a\3\2\2\2\u0354\177\3\2\2\2\u0355"+
		"\u0356\7\u0142\2\2\u0356\u0357\5\u0084C\2\u0357\u0358\7\u0110\2\2\u0358"+
		"\u035a\5\u0082B\2\u0359\u035b\5n8\2\u035a\u0359\3\2\2\2\u035a\u035b\3"+
		"\2\2\2\u035b\u035d\3\2\2\2\u035c\u035e\5\u0086D\2\u035d\u035c\3\2\2\2"+
		"\u035d\u035e\3\2\2\2\u035e\u0081\3\2\2\2\u035f\u0364\5\n\6\2\u0360\u0361"+
		"\7\u0173\2\2\u0361\u0363\5\n\6\2\u0362\u0360\3\2\2\2\u0363\u0366\3\2\2"+
		"\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0083\3\2\2\2\u0366\u0364"+
		"\3\2\2\2\u0367\u0369\5l\67\2\u0368\u036a\5Z.\2\u0369\u0368\3\2\2\2\u0369"+
		"\u036a\3\2\2\2\u036a\u0370\3\2\2\2\u036b\u036c\7\u0182\2\2\u036c\u036d"+
		"\5<\37\2\u036d\u036e\7\u0185\2\2\u036e\u0370\3\2\2\2\u036f\u0367\3\2\2"+
		"\2\u036f\u036b\3\2\2\2\u0370\u0375\3\2\2\2\u0371\u0373\7\f\2\2\u0372\u0371"+
		"\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0376\5\u00c8e"+
		"\2\u0375\u0372\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0085\3\2\2\2\u0377\u0378"+
		"\7`\2\2\u0378\u0379\5\60\31\2\u0379\u0087\3\2\2\2\u037a\u037c\7Q\2\2\u037b"+
		"\u037d\7y\2\2\u037c\u037b\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\3\2"+
		"\2\2\u037e\u0380\5l\67\2\u037f\u0381\5\u008aF\2\u0380\u037f\3\2\2\2\u0380"+
		"\u0381\3\2\2\2\u0381\u0384\3\2\2\2\u0382\u0385\5n8\2\u0383\u0385\7\6\2"+
		"\2\u0384\u0382\3\2\2\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0089"+
		"\3\2\2\2\u0386\u0388\6F\3\2\u0387\u0389\7\f\2\2\u0388\u0387\3\2\2\2\u0388"+
		"\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b\5\u00c8e\2\u038b\u008b"+
		"\3\2\2\2\u038c\u038e\t\17\2\2\u038d\u038f\t\20\2\2\u038e\u038d\3\2\2\2"+
		"\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\5\b\5\2\u0391\u008d"+
		"\3\2\2\2\u0392\u0394\bH\1\2\u0393\u0395\7\u00c7\2\2\u0394\u0393\3\2\2"+
		"\2\u0394\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\7\u0182\2\2\u0397"+
		"\u0398\5\u008eH\2\u0398\u0399\7\u0185\2\2\u0399\u039c\3\2\2\2\u039a\u039c"+
		"\5\u0090I\2\u039b\u0392\3\2\2\2\u039b\u039a\3\2\2\2\u039c\u03a3\3\2\2"+
		"\2\u039d\u039e\f\4\2\2\u039e\u039f\5\u009aN\2\u039f\u03a0\5\u008eH\5\u03a0"+
		"\u03a2\3\2\2\2\u03a1\u039d\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2"+
		"\2\2\u03a3\u03a4\3\2\2\2\u03a4\u008f\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6"+
		"\u03aa\5\u0092J\2\u03a7\u03aa\5\u0098M\2\u03a8\u03aa\5\u009eP\2\u03a9"+
		"\u03a6\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03a8\3\2\2\2\u03aa\u0091\3\2"+
		"\2\2\u03ab\u03ac\5\u009eP\2\u03ac\u03ae\7\u009c\2\2\u03ad\u03af\7\u00c7"+
		"\2\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0"+
		"\u03b1\7\u00c9\2\2\u03b1\u03c3\3\2\2\2\u03b2\u03b3\5\u009eP\2\u03b3\u03b4"+
		"\7\24\2\2\u03b4\u03b5\5\u009eP\2\u03b5\u03b6\7\t\2\2\u03b6\u03b7\5\u009e"+
		"P\2\u03b7\u03c3\3\2\2\2\u03b8\u03ba\7\u00c7\2\2\u03b9\u03b8\3\2\2\2\u03b9"+
		"\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\7l\2\2\u03bc\u03bd\7\u0182"+
		"\2\2\u03bd\u03be\5<\37\2\u03be\u03bf\7\u0185\2\2\u03bf\u03c3\3\2\2\2\u03c0"+
		"\u03c3\5\u0094K\2\u03c1\u03c3\5\u0096L\2\u03c2\u03ab\3\2\2\2\u03c2\u03b2"+
		"\3\2\2\2\u03c2\u03b9\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c1\3\2\2\2\u03c3"+
		"\u0093\3\2\2\2\u03c4\u03c6\5\u009eP\2\u03c5\u03c7\7\u00c7\2\2\u03c6\u03c5"+
		"\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\7\u008b\2"+
		"\2\u03c9\u03d3\7\u0182\2\2\u03ca\u03cf\5\u009eP\2\u03cb\u03cc\7\u0173"+
		"\2\2\u03cc\u03ce\5\u009eP\2\u03cd\u03cb\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf"+
		"\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d4\3\2\2\2\u03d1\u03cf\3\2"+
		"\2\2\u03d2\u03d4\5<\37\2\u03d3\u03ca\3\2\2\2\u03d3\u03d2\3\2\2\2\u03d4"+
		"\u03d5\3\2\2\2\u03d5\u03d6\7\u0185\2\2\u03d6\u0095\3\2\2\2\u03d7\u03d8"+
		"\7\u0182\2\2\u03d8\u03dd\5\u009eP\2\u03d9\u03da\7\u0173\2\2\u03da\u03dc"+
		"\5\u009eP\2\u03db\u03d9\3\2\2\2\u03dc\u03df\3\2\2\2\u03dd\u03db\3\2\2"+
		"\2\u03dd\u03de\3\2\2\2\u03de\u03e0\3\2\2\2\u03df\u03dd\3\2\2\2\u03e0\u03e2"+
		"\7\u0185\2\2\u03e1\u03e3\7\u00c7\2\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3\3"+
		"\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\7\u008b\2\2\u03e5\u03e6\7\u0182"+
		"\2\2\u03e6\u03e7\5<\37\2\u03e7\u03e8\7\u0185\2\2\u03e8\u0097\3\2\2\2\u03e9"+
		"\u03ea\5\u009eP\2\u03ea\u03eb\5\u009cO\2\u03eb\u03ec\5\u009eP\2\u03ec"+
		"\u0099\3\2\2\2\u03ed\u03ee\t\21\2\2\u03ee\u009b\3\2\2\2\u03ef\u03fc\7"+
		"\u0178\2\2\u03f0\u03fc\7\u0179\2\2\u03f1\u03fc\7\u017a\2\2\u03f2\u03fc"+
		"\7\u017b\2\2\u03f3\u03fc\7\u017e\2\2\u03f4\u03fc\7\u017f\2\2\u03f5\u03fc"+
		"\7\u017c\2\2\u03f6\u03fc\7\u017d\2\2\u03f7\u03f9\7\u00c7\2\2\u03f8\u03f7"+
		"\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\t\22\2\2"+
		"\u03fb\u03ef\3\2\2\2\u03fb\u03f0\3\2\2\2\u03fb\u03f1\3\2\2\2\u03fb\u03f2"+
		"\3\2\2\2\u03fb\u03f3\3\2\2\2\u03fb\u03f4\3\2\2\2\u03fb\u03f5\3\2\2\2\u03fb"+
		"\u03f6\3\2\2\2\u03fb\u03f8\3\2\2\2\u03fc\u009d\3\2\2\2\u03fd\u03fe\bP"+
		"\1\2\u03fe\u03ff\7\u0182\2\2\u03ff\u0400\5<\37\2\u0400\u0401\7\u0185\2"+
		"\2\u0401\u040f\3\2\2\2\u0402\u0403\7\u0182\2\2\u0403\u0404\5\u009eP\2"+
		"\u0404\u0405\7\u0185\2\2\u0405\u040f\3\2\2\2\u0406\u040f\5\u00a2R\2\u0407"+
		"\u040f\5\u00a6T\2\u0408\u040f\5\u00aaV\2\u0409\u040f\5\u00b2Z\2\u040a"+
		"\u040f\5\u00b4[\2\u040b\u040f\5\u00bc_\2\u040c\u040f\5\u00be`\2\u040d"+
		"\u040f\5\u00a0Q\2\u040e\u03fd\3\2\2\2\u040e\u0402\3\2\2\2\u040e\u0406"+
		"\3\2\2\2\u040e\u0407\3\2\2\2\u040e\u0408\3\2\2\2\u040e\u0409\3\2\2\2\u040e"+
		"\u040a\3\2\2\2\u040e\u040b\3\2\2\2\u040e\u040c\3\2\2\2\u040e\u040d\3\2"+
		"\2\2\u040f\u0420\3\2\2\2\u0410\u0411\f\20\2\2\u0411\u0412\7\u0180\2\2"+
		"\u0412\u041f\5\u009eP\21\u0413\u0414\f\17\2\2\u0414\u0415\7\u0175\2\2"+
		"\u0415\u041f\5\u009eP\20\u0416\u0417\f\16\2\2\u0417\u0418\7\u0171\2\2"+
		"\u0418\u041f\5\u009eP\17\u0419\u041a\f\r\2\2\u041a\u041b\7\u0188\2\2\u041b"+
		"\u041f\5\u009eP\16\u041c\u041d\f\21\2\2\u041d\u041f\5\u00a4S\2\u041e\u0410"+
		"\3\2\2\2\u041e\u0413\3\2\2\2\u041e\u0416\3\2\2\2\u041e\u0419\3\2\2\2\u041e"+
		"\u041c\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2"+
		"\2\2\u0421\u009f\3\2\2\2\u0422\u0420\3\2\2\2\u0423\u042c\5\u00c4c\2\u0424"+
		"\u042c\5\u00c6d\2\u0425\u042c\5\u00d2j\2\u0426\u042c\5\u00c8e\2\u0427"+
		"\u042c\5\u00ccg\2\u0428\u042c\5\u00d0i\2\u0429\u042c\5\u00ceh\2\u042a"+
		"\u042c\5\u00d4k\2\u042b\u0423\3\2\2\2\u042b\u0424\3\2\2\2\u042b\u0425"+
		"\3\2\2\2\u042b\u0426\3\2\2\2\u042b\u0427\3\2\2\2\u042b\u0428\3\2\2\2\u042b"+
		"\u0429\3\2\2\2\u042b\u042a\3\2\2\2\u042c\u00a1\3\2\2\2\u042d\u042e\7\u0099"+
		"\2\2\u042e\u042f\5\u009eP\2\u042f\u0430\5\u00a4S\2\u0430\u00a3\3\2\2\2"+
		"\u0431\u0432\t\23\2\2\u0432\u00a5\3\2\2\2\u0433\u0434\5\u00a8U\2\u0434"+
		"\u0435\t\24\2\2\u0435\u043a\5\u00a8U\2\u0436\u0437\t\24\2\2\u0437\u0439"+
		"\5\u00a8U\2\u0438\u0436\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2"+
		"\2\u043a\u043b\3\2\2\2\u043b\u00a7\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u043e"+
		"\7\u0182\2\2\u043e\u043f\5\u009eP\2\u043f\u0440\7\u0185\2\2\u0440\u0447"+
		"\3\2\2\2\u0441\u0447\5\u00aaV\2\u0442\u0447\5\u00b4[\2\u0443\u0447\5\u00bc"+
		"_\2\u0444\u0447\5\u00be`\2\u0445\u0447\5\u00a0Q\2\u0446\u043d\3\2\2\2"+
		"\u0446\u0441\3\2\2\2\u0446\u0442\3\2\2\2\u0446\u0443\3\2\2\2\u0446\u0444"+
		"\3\2\2\2\u0446\u0445\3\2\2\2\u0447\u00a9\3\2\2\2\u0448\u044b\5\u00acW"+
		"\2\u0449\u044b\5\u00aeX\2\u044a\u0448\3\2\2\2\u044a\u0449\3\2\2\2\u044b"+
		"\u00ab\3\2\2\2\u044c\u044d\7\"\2\2\u044d\u0453\5\u009eP\2\u044e\u044f"+
		"\7\u014d\2\2\u044f\u0450\5\u009eP\2\u0450\u0451\7\u0136\2\2\u0451\u0452"+
		"\5\u009eP\2\u0452\u0454\3\2\2\2\u0453\u044e\3\2\2\2\u0454\u0455\3\2\2"+
		"\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0459\3\2\2\2\u0457\u0458"+
		"\7`\2\2\u0458\u045a\5\u009eP\2\u0459\u0457\3\2\2\2\u0459\u045a\3\2\2\2"+
		"\u045a\u045b\3\2\2\2\u045b\u045c\7d\2\2\u045c\u00ad\3\2\2\2\u045d\u045f"+
		"\7\"\2\2\u045e\u0460\5\u00b0Y\2\u045f\u045e\3\2\2\2\u0460\u0461\3\2\2"+
		"\2\u0461\u045f\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0465\3\2\2\2\u0463\u0464"+
		"\7`\2\2\u0464\u0466\5\u008eH\2\u0465\u0463\3\2\2\2\u0465\u0466\3\2\2\2"+
		"\u0466\u0467\3\2\2\2\u0467\u0468\7d\2\2\u0468\u00af\3\2\2\2\u0469\u046a"+
		"\7\u014d\2\2\u046a\u046b\5\u008eH\2\u046b\u046c\7\u0136\2\2\u046c\u046d"+
		"\5\u008eH\2\u046d\u00b1\3\2\2\2\u046e\u046f\5\u00c8e\2\u046f\u0470\7\3"+
		"\2\2\u0470\u0471\t\25\2\2\u0471\u00b3\3\2\2\2\u0472\u0473\7\21\2\2\u0473"+
		"\u0475\7\u0182\2\2\u0474\u0476\5\u00b6\\\2\u0475\u0474\3\2\2\2\u0475\u0476"+
		"\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0478\5\u009eP\2\u0478\u047a\7\u0185"+
		"\2\2\u0479\u047b\5\u00b8]\2\u047a\u0479\3\2\2\2\u047a\u047b\3\2\2\2\u047b"+
		"\u050b\3\2\2\2\u047c\u047d\79\2\2\u047d\u0483\7\u0182\2\2\u047e\u0480"+
		"\5\u00b6\\\2\u047f\u047e\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0481\3\2\2"+
		"\2\u0481\u0484\5\u009eP\2\u0482\u0484\7\u0180\2\2\u0483\u047f\3\2\2\2"+
		"\u0483\u0482\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0487\7\u0185\2\2\u0486"+
		"\u0488\5\u00b8]\2\u0487\u0486\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u050b"+
		"\3\2\2\2\u0489\u048a\7:\2\2\u048a\u0490\7\u0182\2\2\u048b\u048d\5\u00b6"+
		"\\\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e"+
		"\u0491\5\u009eP\2\u048f\u0491\7\u0180\2\2\u0490\u048c\3\2\2\2\u0490\u048f"+
		"\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0494\7\u0185\2\2\u0493\u0495\5\u00b8"+
		"]\2\u0494\u0493\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u050b\3\2\2\2\u0496"+
		"\u0497\7\u0157\2\2\u0497\u0498\7\u0182\2\2\u0498\u0499\7\u0185\2\2\u0499"+
		"\u050b\5\u00b8]\2\u049a\u049b\7\u015d\2\2\u049b\u049c\7\u0182\2\2\u049c"+
		"\u049d\7\u0185\2\2\u049d\u050b\5\u00b8]\2\u049e\u049f\7\u015e\2\2\u049f"+
		"\u04a0\7\u0182\2\2\u04a0\u04a1\5\u009eP\2\u04a1\u04a2\7\u0185\2\2\u04a2"+
		"\u04a3\5\u00b8]\2\u04a3\u050b\3\2\2\2\u04a4\u04a5\7\u015f\2\2\u04a5\u04a6"+
		"\7\u0182\2\2\u04a6\u04ad\5\u009eP\2\u04a7\u04a8\7\u0173\2\2\u04a8\u04ab"+
		"\5\u009eP\2\u04a9\u04aa\7\u0173\2\2\u04aa\u04ac\5\u009eP\2\u04ab\u04a9"+
		"\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ae\3\2\2\2\u04ad\u04a7\3\2\2\2\u04ad"+
		"\u04ae\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\7\u0185\2\2\u04b0\u04b1"+
		"\5\u00b8]\2\u04b1\u050b\3\2\2\2\u04b2\u04b3\7\u0160\2\2\u04b3\u04b4\7"+
		"\u0182\2\2\u04b4\u04b5\5\u009eP\2\u04b5\u04b6\7\u0185\2\2\u04b6\u04b7"+
		"\5\u00b8]\2\u04b7\u050b\3\2\2\2\u04b8\u04b9\7\u0161\2\2\u04b9\u04ba\7"+
		"\u0182\2\2\u04ba\u04c1\5\u009eP\2\u04bb\u04bc\7\u0173\2\2\u04bc\u04bf"+
		"\5\u009eP\2\u04bd\u04be\7\u0173\2\2\u04be\u04c0\5\u009eP\2\u04bf\u04bd"+
		"\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c2\3\2\2\2\u04c1\u04bb\3\2\2\2\u04c1"+
		"\u04c2\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\7\u0185\2\2\u04c4\u04c5"+
		"\5\u00b8]\2\u04c5\u050b\3\2\2\2\u04c6\u04c7\7\u00b7\2\2\u04c7\u04c9\7"+
		"\u0182\2\2\u04c8\u04ca\5\u00b6\\\2\u04c9\u04c8\3\2\2\2\u04c9\u04ca\3\2"+
		"\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\5\u009eP\2\u04cc\u04ce\7\u0185\2"+
		"\2\u04cd\u04cf\5\u00b8]\2\u04ce\u04cd\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf"+
		"\u050b\3\2\2\2\u04d0\u04d1\7\u00bd\2\2\u04d1\u04d3\7\u0182\2\2\u04d2\u04d4"+
		"\5\u00b6\\\2\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2"+
		"\2\u04d5\u04d6\5\u009eP\2\u04d6\u04d8\7\u0185\2\2\u04d7\u04d9\5\u00b8"+
		"]\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u050b\3\2\2\2\u04da"+
		"\u04db\7\u016a\2\2\u04db\u04dc\7\u0182\2\2\u04dc\u04dd\7\u0185\2\2\u04dd"+
		"\u050b\5\u00b8]\2\u04de\u04df\7\u016b\2\2\u04df\u04e0\7\u0182\2\2\u04e0"+
		"\u04e1\7\u0185\2\2\u04e1\u050b\5\u00b8]\2\u04e2\u04e3\7\u016c\2\2\u04e3"+
		"\u04e5\7\u0182\2\2\u04e4\u04e6\5\u00b6\\\2\u04e5\u04e4\3\2\2\2\u04e5\u04e6"+
		"\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\5\u009eP\2\u04e8\u04ea\7\u0185"+
		"\2\2\u04e9\u04eb\5\u00b8]\2\u04ea\u04e9\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb"+
		"\u050b\3\2\2\2\u04ec\u04ed\7\u012a\2\2\u04ed\u04ef\7\u0182\2\2\u04ee\u04f0"+
		"\5\u00b6\\\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\3\2\2"+
		"\2\u04f1\u04f2\5\u009eP\2\u04f2\u04f4\7\u0185\2\2\u04f3\u04f5\5\u00b8"+
		"]\2\u04f4\u04f3\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u050b\3\2\2\2\u04f6"+
		"\u04f7\7\u0148\2\2\u04f7\u04f9\7\u0182\2\2\u04f8\u04fa\5\u00b6\\\2\u04f9"+
		"\u04f8\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\5\u009e"+
		"P\2\u04fc\u04fe\7\u0185\2\2\u04fd\u04ff\5\u00b8]\2\u04fe\u04fd\3\2\2\2"+
		"\u04fe\u04ff\3\2\2\2\u04ff\u050b\3\2\2\2\u0500\u0501\7\u016e\2\2\u0501"+
		"\u0503\7\u0182\2\2\u0502\u0504\5\u00b6\\\2\u0503\u0502\3\2\2\2\u0503\u0504"+
		"\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\5\u009eP\2\u0506\u0508\7\u0185"+
		"\2\2\u0507\u0509\5\u00b8]\2\u0508\u0507\3\2\2\2\u0508\u0509\3\2\2\2\u0509"+
		"\u050b\3\2\2\2\u050a\u0472\3\2\2\2\u050a\u047c\3\2\2\2\u050a\u0489\3\2"+
		"\2\2\u050a\u0496\3\2\2\2\u050a\u049a\3\2\2\2\u050a\u049e\3\2\2\2\u050a"+
		"\u04a4\3\2\2\2\u050a\u04b2\3\2\2\2\u050a\u04b8\3\2\2\2\u050a\u04c6\3\2"+
		"\2\2\u050a\u04d0\3\2\2\2\u050a\u04da\3\2\2\2\u050a\u04de\3\2\2\2\u050a"+
		"\u04e2\3\2\2\2\u050a\u04ec\3\2\2\2\u050a\u04f6\3\2\2\2\u050a\u0500\3\2"+
		"\2\2\u050b\u00b5\3\2\2\2\u050c\u050d\t\n\2\2\u050d\u00b7\3\2\2\2\u050e"+
		"\u050f\7\u00d5\2\2\u050f\u0511\7\u0182\2\2\u0510\u0512\5\u00ba^\2\u0511"+
		"\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0514\3\2\2\2\u0513\u0515\5v"+
		"<\2\u0514\u0513\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0516\3\2\2\2\u0516"+
		"\u0517\7\u0185\2\2\u0517\u00b9\3\2\2\2\u0518\u0519\7\u00d9\2\2\u0519\u051a"+
		"\7\35\2\2\u051a\u051f\5\u009eP\2\u051b\u051c\7\u0173\2\2\u051c\u051e\5"+
		"\u009eP\2\u051d\u051b\3\2\2\2\u051e\u0521\3\2\2\2\u051f\u051d\3\2\2\2"+
		"\u051f\u0520\3\2\2\2\u0520\u00bb\3\2\2\2\u0521\u051f\3\2\2\2\u0522\u05e8"+
		"\7\u0156\2\2\u0523\u0524\7$\2\2\u0524\u0525\7\u0182\2\2\u0525\u0526\5"+
		"\u009eP\2\u0526\u0527\7\f\2\2\u0527\u0529\5\"\22\2\u0528\u052a\5$\23\2"+
		"\u0529\u0528\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c"+
		"\7\u0185\2\2\u052c\u05e8\3\2\2\2\u052d\u052e\79\2\2\u052e\u0531\7\u0182"+
		"\2\2\u052f\u0532\5\u009eP\2\u0530\u0532\7\u0180\2\2\u0531\u052f\3\2\2"+
		"\2\u0531\u0530\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u05e8\7\u0185\2\2\u0534"+
		"\u05e8\7\u0158\2\2\u0535\u0536\7?\2\2\u0536\u05e8\7E\2\2\u0537\u05e8\7"+
		"\u0159\2\2\u0538\u05e8\7\u015a\2\2\u0539\u053d\7\u015b\2\2\u053a\u053b"+
		"\7?\2\2\u053b\u053d\7\u0137\2\2\u053c\u0539\3\2\2\2\u053c\u053a\3\2\2"+
		"\2\u053d\u0542\3\2\2\2\u053e\u053f\7\u0182\2\2\u053f\u0540\5\u009eP\2"+
		"\u0540\u0541\7\u0185\2\2\u0541\u0543\3\2\2\2\u0542\u053e\3\2\2\2\u0542"+
		"\u0543\3\2\2\2\u0543\u05e8\3\2\2\2\u0544\u05e8\7\u015c\2\2\u0545\u0546"+
		"\7?\2\2\u0546\u05e8\7\u016f\2\2\u0547\u0548\7\u0162\2\2\u0548\u0549\7"+
		"\u0182\2\2\u0549\u0556\5\u009eP\2\u054a\u054b\7\u0173\2\2\u054b\u0553"+
		"\5\u009eP\2\u054c\u054d\7\u0173\2\2\u054d\u054e\5\u009eP\2\u054e\u054f"+
		"\7\u0178\2\2\u054f\u0550\5\u009eP\2\u0550\u0552\3\2\2\2\u0551\u054c\3"+
		"\2\2\2\u0552\u0555\3\2\2\2\u0553\u0551\3\2\2\2\u0553\u0554\3\2\2\2\u0554"+
		"\u0557\3\2\2\2\u0555\u0553\3\2\2\2\u0556\u054a\3\2\2\2\u0556\u0557\3\2"+
		"\2\2\u0557\u0558\3\2\2\2\u0558\u0559\7\u0185\2\2\u0559\u05e8\3\2\2\2\u055a"+
		"\u055b\7\u0163\2\2\u055b\u055c\7\u0182\2\2\u055c\u0569\5\u009eP\2\u055d"+
		"\u055e\7\u0173\2\2\u055e\u0566\5\u009eP\2\u055f\u0560\7\u0173\2\2\u0560"+
		"\u0561\5\u009eP\2\u0561\u0562\7\u0178\2\2\u0562\u0563\5\u009eP\2\u0563"+
		"\u0565\3\2\2\2\u0564\u055f\3\2\2\2\u0565\u0568\3\2\2\2\u0566\u0564\3\2"+
		"\2\2\u0566\u0567\3\2\2\2\u0567\u056a\3\2\2\2\u0568\u0566\3\2\2\2\u0569"+
		"\u055d\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056c\7\u0185"+
		"\2\2\u056c\u05e8\3\2\2\2\u056d\u056e\7\u0164\2\2\u056e\u056f\7\u0182\2"+
		"\2\u056f\u057c\5\u009eP\2\u0570\u0571\7\u0173\2\2\u0571\u0579\5\u009e"+
		"P\2\u0572\u0573\7\u0173\2\2\u0573\u0574\5\u009eP\2\u0574\u0575\7\u0178"+
		"\2\2\u0575\u0576\5\u009eP\2\u0576\u0578\3\2\2\2\u0577\u0572\3\2\2\2\u0578"+
		"\u057b\3\2\2\2\u0579\u0577\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057d\3\2"+
		"\2\2\u057b\u0579\3\2\2\2\u057c\u0570\3\2\2\2\u057c\u057d\3\2\2\2\u057d"+
		"\u057e\3\2\2\2\u057e\u057f\7\u0185\2\2\u057f\u05e8\3\2\2\2\u0580\u0581"+
		"\7\u0165\2\2\u0581\u0582\7\u0182\2\2\u0582\u058f\5\u009eP\2\u0583\u0584"+
		"\7\u0173\2\2\u0584\u058c\5\u009eP\2\u0585\u0586\7\u0173\2\2\u0586\u0587"+
		"\5\u009eP\2\u0587\u0588\7\u0178\2\2\u0588\u0589\5\u009eP\2\u0589\u058b"+
		"\3\2\2\2\u058a\u0585\3\2\2\2\u058b\u058e\3\2\2\2\u058c\u058a\3\2\2\2\u058c"+
		"\u058d\3\2\2\2\u058d\u0590\3\2\2\2\u058e\u058c\3\2\2\2\u058f\u0583\3\2"+
		"\2\2\u058f\u0590\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0592\7\u0185\2\2\u0592"+
		"\u05e8\3\2\2\2\u0593\u0594\7\u0166\2\2\u0594\u0595\7\u0182\2\2\u0595\u05a2"+
		"\5\u009eP\2\u0596\u0597\7\u0173\2\2\u0597\u059f\5\u009eP\2\u0598\u0599"+
		"\7\u0173\2\2\u0599\u059a\5\u009eP\2\u059a\u059b\7\u0178\2\2\u059b\u059c"+
		"\5\u009eP\2\u059c\u059e\3\2\2\2\u059d\u0598\3\2\2\2\u059e\u05a1\3\2\2"+
		"\2\u059f\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1\u059f"+
		"\3\2\2\2\u05a2\u0596\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4"+
		"\u05a5\7\u0185\2\2\u05a5\u05e8\3\2\2\2\u05a6\u05a7\7\u0167\2\2\u05a7\u05a8"+
		"\7\u0182\2\2\u05a8\u05b5\5\u009eP\2\u05a9\u05aa\7\u0173\2\2\u05aa\u05b2"+
		"\5\u009eP\2\u05ab\u05ac\7\u0173\2\2\u05ac\u05ad\5\u009eP\2\u05ad\u05ae"+
		"\7\u0178\2\2\u05ae\u05af\5\u009eP\2\u05af\u05b1\3\2\2\2\u05b0\u05ab\3"+
		"\2\2\2\u05b1\u05b4\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3"+
		"\u05b6\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b5\u05a9\3\2\2\2\u05b5\u05b6\3\2"+
		"\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b8\7\u0185\2\2\u05b8\u05e8\3\2\2\2\u05b9"+
		"\u05ba\7\u0168\2\2\u05ba\u05bb\7\u0182\2\2\u05bb\u05c3\5\u009eP\2\u05bc"+
		"\u05bd\7\u0173\2\2\u05bd\u05be\5\u009eP\2\u05be\u05bf\7\u0178\2\2\u05bf"+
		"\u05c0\5\u009eP\2\u05c0\u05c2\3\2\2\2\u05c1\u05bc\3\2\2\2\u05c2\u05c5"+
		"\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c6\3\2\2\2\u05c5"+
		"\u05c3\3\2\2\2\u05c6\u05c7\7\u0185\2\2\u05c7\u05e8\3\2\2\2\u05c8\u05c9"+
		"\7\u0169\2\2\u05c9\u05ca\7\u0182\2\2\u05ca\u05d0\5\u009eP\2\u05cb\u05cc"+
		"\7\u0173\2\2\u05cc\u05cd\5\u009eP\2\u05cd\u05ce\7\u0178\2\2\u05ce\u05cf"+
		"\5\u009eP\2\u05cf\u05d1\3\2\2\2\u05d0\u05cb\3\2\2\2\u05d1\u05d2\3\2\2"+
		"\2\u05d2\u05d0\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d6\3\2\2\2\u05d4\u05d5"+
		"\7\u0173\2\2\u05d5\u05d7\5\u009eP\2\u05d6\u05d4\3\2\2\2\u05d6\u05d7\3"+
		"\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05d9\7\u0185\2\2\u05d9\u05e8\3\2\2\2"+
		"\u05da\u05db\7\u0129\2\2\u05db\u05dc\7\u0182\2\2\u05dc\u05dd\5\u009eP"+
		"\2\u05dd\u05de\7y\2\2\u05de\u05e1\5\u009eP\2\u05df\u05e0\7u\2\2\u05e0"+
		"\u05e2\5\u009eP\2\u05e1\u05df\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3"+
		"\3\2\2\2\u05e3\u05e4\7\u0185\2\2\u05e4\u05e8\3\2\2\2\u05e5\u05e8\7\u016d"+
		"\2\2\u05e6\u05e8\7\u016f\2\2\u05e7\u0522\3\2\2\2\u05e7\u0523\3\2\2\2\u05e7"+
		"\u052d\3\2\2\2\u05e7\u0534\3\2\2\2\u05e7\u0535\3\2\2\2\u05e7\u0537\3\2"+
		"\2\2\u05e7\u0538\3\2\2\2\u05e7\u053c\3\2\2\2\u05e7\u0544\3\2\2\2\u05e7"+
		"\u0545\3\2\2\2\u05e7\u0547\3\2\2\2\u05e7\u055a\3\2\2\2\u05e7\u056d\3\2"+
		"\2\2\u05e7\u0580\3\2\2\2\u05e7\u0593\3\2\2\2\u05e7\u05a6\3\2\2\2\u05e7"+
		"\u05b9\3\2\2\2\u05e7\u05c8\3\2\2\2\u05e7\u05da\3\2\2\2\u05e7\u05e5\3\2"+
		"\2\2\u05e7\u05e6\3\2\2\2\u05e8\u00bd\3\2\2\2\u05e9\u05ea\5\u00c8e\2\u05ea"+
		"\u05ec\7\u0182\2\2\u05eb\u05ed\5\u00c0a\2\u05ec\u05eb\3\2\2\2\u05ec\u05ed"+
		"\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef\7\u0185\2\2\u05ef\u00bf\3\2\2"+
		"\2\u05f0\u05f5\5\u00c2b\2\u05f1\u05f2\7\u0173\2\2\u05f2\u05f4\5\u00c2"+
		"b\2\u05f3\u05f1\3\2\2\2\u05f4\u05f7\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f5"+
		"\u05f6\3\2\2\2\u05f6\u00c1\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f8\u0604\3\2"+
		"\2\2\u05f9\u05ff\6b\n\2\u05fa\u05fb\5\u00c8e\2\u05fb\u05fd\7\u0178\2\2"+
		"\u05fc\u05fe\7\u017c\2\2\u05fd\u05fc\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe"+
		"\u0600\3\2\2\2\u05ff\u05fa\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0601\3\2"+
		"\2\2\u0601\u0604\5\u009eP\2\u0602\u0604\7\u0180\2\2\u0603\u05f8\3\2\2"+
		"\2\u0603\u05f9\3\2\2\2\u0603\u0602\3\2\2\2\u0604\u00c3\3\2\2\2\u0605\u0606"+
		"\7E\2\2\u0606\u0607\5\u00ccg\2\u0607\u00c5\3\2\2\2\u0608\u0609\7\u0137"+
		"\2\2\u0609\u060a\5\u00ccg\2\u060a\u00c7\3\2\2\2\u060b\u060d\7\u0188\2"+
		"\2\u060c\u060b\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u0613"+
		"\5\u00caf\2\u060f\u0610\7\u0176\2\2\u0610\u0612\5\u00caf\2\u0611\u060f"+
		"\3\2\2\2\u0612\u0615\3\2\2\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614"+
		"\u00c9\3\2\2\2\u0615\u0613\3\2\2\2\u0616\u0619\7\u0189\2\2\u0617\u0619"+
		"\5\u00d6l\2\u0618\u0616\3\2\2\2\u0618\u0617\3\2\2\2\u0619\u00cb\3\2\2"+
		"\2\u061a\u061d\7\u018a\2\2\u061b\u061d\7\u018b\2\2\u061c\u061a\3\2\2\2"+
		"\u061c\u061b\3\2\2\2\u061d\u00cd\3\2\2\2\u061e\u0620\t\26\2\2\u061f\u061e"+
		"\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0622\7\u018c\2"+
		"\2\u0622\u00cf\3\2\2\2\u0623\u0625\t\26\2\2\u0624\u0623\3\2\2\2\u0624"+
		"\u0625\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0627\7\u018d\2\2\u0627\u00d1"+
		"\3\2\2\2\u0628\u0629\t\27\2\2\u0629\u00d3\3\2\2\2\u062a\u062b\7\u00c9"+
		"\2\2\u062b\u00d5\3\2\2\2\u062c\u062d\t\30\2\2\u062d\u00d7\3\2\2\2\u00bf"+
		"\u00da\u00ec\u00f0\u00f7\u00fa\u00ff\u0103\u010c\u0111\u0119\u011e\u0127"+
		"\u0133\u0138\u013b\u0149\u014e\u0154\u015a\u015f\u0165\u0175\u018c\u01ab"+
		"\u01ad\u01b2\u01b6\u01bf\u01c5\u01cf\u01d7\u01dd\u01e6\u01e8\u01ec\u01f0"+
		"\u01f8\u0203\u020c\u0213\u021b\u0225\u022a\u0237\u0242\u0249\u0250\u0254"+
		"\u0258\u025c\u025e\u0263\u0266\u0269\u026c\u0270\u0273\u0276\u0279\u027c"+
		"\u0283\u028e\u0292\u0295\u0298\u029c\u02a4\u02ad\u02b1\u02bb\u02c3\u02c9"+
		"\u02cd\u02d0\u02d6\u02df\u02e2\u02e7\u02ea\u02f4\u02f9\u0302\u0307\u030b"+
		"\u0314\u0318\u0326\u0336\u033b\u0346\u0351\u0353\u035a\u035d\u0364\u0369"+
		"\u036f\u0372\u0375\u037c\u0380\u0384\u0388\u038e\u0394\u039b\u03a3\u03a9"+
		"\u03ae\u03b9\u03c2\u03c6\u03cf\u03d3\u03dd\u03e2\u03f8\u03fb\u040e\u041e"+
		"\u0420\u042b\u043a\u0446\u044a\u0455\u0459\u0461\u0465\u0475\u047a\u047f"+
		"\u0483\u0487\u048c\u0490\u0494\u04ab\u04ad\u04bf\u04c1\u04c9\u04ce\u04d3"+
		"\u04d8\u04e5\u04ea\u04ef\u04f4\u04f9\u04fe\u0503\u0508\u050a\u0511\u0514"+
		"\u051f\u0529\u0531\u053c\u0542\u0553\u0556\u0566\u0569\u0579\u057c\u058c"+
		"\u058f\u059f\u05a2\u05b2\u05b5\u05c3\u05d2\u05d6\u05e1\u05e7\u05ec\u05f5"+
		"\u05fd\u05ff\u0603\u060c\u0613\u0618\u061c\u061f\u0624";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}