/**
 * This class is generated by jOOQ
 */
package library.tables;


import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import library.Invoice;
import library.Keys;
import library.tables.records.FapiaoBatchInputLineRecord;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 发票批量录入发票处理信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FapiaoBatchInputLine extends TableImpl<FapiaoBatchInputLineRecord> {

    private static final long serialVersionUID = 1853161864;

    /**
     * The reference instance of <code>invoice.fapiao_batch_input_line</code>
     */
    public static final FapiaoBatchInputLine FAPIAO_BATCH_INPUT_LINE = new FapiaoBatchInputLine();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FapiaoBatchInputLineRecord> getRecordType() {
        return FapiaoBatchInputLineRecord.class;
    }

    /**
     * The column <code>invoice.fapiao_batch_input_line.id</code>. 主键唯一ID
     */
    public final TableField<FapiaoBatchInputLineRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "主键唯一ID");

    /**
     * The column <code>invoice.fapiao_batch_input_line.batch_id</code>. 主键唯一ID
     */
    public final TableField<FapiaoBatchInputLineRecord, String> BATCH_ID = createField("batch_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "主键唯一ID");

    /**
     * The column <code>invoice.fapiao_batch_input_line.line_number</code>. 发票序列
     */
    public final TableField<FapiaoBatchInputLineRecord, Integer> LINE_NUMBER = createField("line_number", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "发票序列");

    /**
     * The column <code>invoice.fapiao_batch_input_line.fapiao_type</code>. 发票类型
     */
    public final TableField<FapiaoBatchInputLineRecord, String> FAPIAO_TYPE = createField("fapiao_type", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "发票类型");

    /**
     * The column <code>invoice.fapiao_batch_input_line.fapiao_code</code>. 发票代码
     */
    public final TableField<FapiaoBatchInputLineRecord, String> FAPIAO_CODE = createField("fapiao_code", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "发票代码");

    /**
     * The column <code>invoice.fapiao_batch_input_line.fapiao_number</code>. 发票号码
     */
    public final TableField<FapiaoBatchInputLineRecord, String> FAPIAO_NUMBER = createField("fapiao_number", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "发票号码");

    /**
     * The column <code>invoice.fapiao_batch_input_line.issue_date</code>. 开票日期
     */
    public final TableField<FapiaoBatchInputLineRecord, Date> ISSUE_DATE = createField("issue_date", org.jooq.impl.SQLDataType.DATE, this, "开票日期");

    /**
     * The column <code>invoice.fapiao_batch_input_line.check_code</code>. 校验码
     */
    public final TableField<FapiaoBatchInputLineRecord, String> CHECK_CODE = createField("check_code", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "校验码");

    /**
     * The column <code>invoice.fapiao_batch_input_line.total_ex_tax</code>. 税前金额
     */
    public final TableField<FapiaoBatchInputLineRecord, BigDecimal> TOTAL_EX_TAX = createField("total_ex_tax", org.jooq.impl.SQLDataType.DECIMAL.precision(17, 6), this, "税前金额");

    /**
     * The column <code>invoice.fapiao_batch_input_line.inputted</code>. 是否已被录入
     */
    public final TableField<FapiaoBatchInputLineRecord, Boolean> INPUTTED = createField("inputted", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "是否已被录入");

    /**
     * The column <code>invoice.fapiao_batch_input_line.parse_status</code>. 发票行解析状态
     */
    public final TableField<FapiaoBatchInputLineRecord, String> PARSE_STATUS = createField("parse_status", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "发票行解析状态");

    /**
     * The column <code>invoice.fapiao_batch_input_line.error_message</code>. 错误信息
     */
    public final TableField<FapiaoBatchInputLineRecord, String> ERROR_MESSAGE = createField("error_message", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "错误信息");

    /**
     * The column <code>invoice.fapiao_batch_input_line.create_time</code>. 记录创建时间
     */
    public final TableField<FapiaoBatchInputLineRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP(3)", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "记录创建时间");

    /**
     * The column <code>invoice.fapiao_batch_input_line.create_by</code>. 记录创建者
     */
    public final TableField<FapiaoBatchInputLineRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "记录创建者");

    /**
     * The column <code>invoice.fapiao_batch_input_line.update_time</code>. 记录更新时间
     */
    public final TableField<FapiaoBatchInputLineRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP(3)", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "记录更新时间");

    /**
     * The column <code>invoice.fapiao_batch_input_line.update_by</code>. 记录更新者
     */
    public final TableField<FapiaoBatchInputLineRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "记录更新者");

    /**
     * The column <code>invoice.fapiao_batch_input_line.content</code>. 发票全票面信息
     */
    public final TableField<FapiaoBatchInputLineRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB, this, "发票全票面信息");

    /**
     * Create a <code>invoice.fapiao_batch_input_line</code> table reference
     */
    public FapiaoBatchInputLine() {
        this("fapiao_batch_input_line", null);
    }

    /**
     * Create an aliased <code>invoice.fapiao_batch_input_line</code> table reference
     */
    public FapiaoBatchInputLine(String alias) {
        this(alias, FAPIAO_BATCH_INPUT_LINE);
    }

    private FapiaoBatchInputLine(String alias, Table<FapiaoBatchInputLineRecord> aliased) {
        this(alias, aliased, null);
    }

    private FapiaoBatchInputLine(String alias, Table<FapiaoBatchInputLineRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "发票批量录入发票处理信息表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Invoice.INVOICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FapiaoBatchInputLineRecord> getPrimaryKey() {
        return Keys.KEY_FAPIAO_BATCH_INPUT_LINE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FapiaoBatchInputLineRecord>> getKeys() {
        return Arrays.<UniqueKey<FapiaoBatchInputLineRecord>>asList(Keys.KEY_FAPIAO_BATCH_INPUT_LINE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputLine as(String alias) {
        return new FapiaoBatchInputLine(alias, this);
    }

    /**
     * Rename this table
     */
    public FapiaoBatchInputLine rename(String name) {
        return new FapiaoBatchInputLine(name, null);
    }
}
