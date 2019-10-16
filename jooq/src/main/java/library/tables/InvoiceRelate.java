/**
 * This class is generated by jOOQ
 */
package library.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import library.Invoice;
import library.Keys;
import library.tables.records.InvoiceRelateRecord;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 该表用以保存发票影像关联数据。
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InvoiceRelate extends TableImpl<InvoiceRelateRecord> {

    private static final long serialVersionUID = 870297656;

    /**
     * The reference instance of <code>invoice.invoice_relate</code>
     */
    public static final InvoiceRelate INVOICE_RELATE = new InvoiceRelate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InvoiceRelateRecord> getRecordType() {
        return InvoiceRelateRecord.class;
    }

    /**
     * The column <code>invoice.invoice_relate.id</code>. 唯一标识
     */
    public final TableField<InvoiceRelateRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "唯一标识");

    /**
     * The column <code>invoice.invoice_relate.business_type</code>. 发票对应的业务类型EXP, AP, AR
     */
    public final TableField<InvoiceRelateRecord, String> BUSINESS_TYPE = createField("business_type", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "发票对应的业务类型EXP, AP, AR");

    /**
     * The column <code>invoice.invoice_relate.tenant_id</code>. 发票录入所属租户ID
     */
    public final TableField<InvoiceRelateRecord, String> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "发票录入所属租户ID");

    /**
     * The column <code>invoice.invoice_relate.input_user_id</code>. 录入人ID
     */
    public final TableField<InvoiceRelateRecord, String> INPUT_USER_ID = createField("input_user_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "录入人ID");

    /**
     * The column <code>invoice.invoice_relate.input_time</code>. 录入时间
     */
    public final TableField<InvoiceRelateRecord, Timestamp> INPUT_TIME = createField("input_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "录入时间");

    /**
     * The column <code>invoice.invoice_relate.activate</code>.
     */
    public final TableField<InvoiceRelateRecord, Boolean> ACTIVATE = createField("activate", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>invoice.invoice_relate.group_id</code>. 开云定制组ID
     */
    public final TableField<InvoiceRelateRecord, String> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "开云定制组ID");

    /**
     * The column <code>invoice.invoice_relate.invoice_code</code>. 发票代码
     */
    public final TableField<InvoiceRelateRecord, String> INVOICE_CODE = createField("invoice_code", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "发票代码");

    /**
     * The column <code>invoice.invoice_relate.invoice_number</code>. 发票号码
     */
    public final TableField<InvoiceRelateRecord, String> INVOICE_NUMBER = createField("invoice_number", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "发票号码");

    /**
     * The column <code>invoice.invoice_relate.invoice_code_number</code>. 发票代码:发票号码
     */
    public final TableField<InvoiceRelateRecord, String> INVOICE_CODE_NUMBER = createField("invoice_code_number", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "发票代码:发票号码");

    /**
     * The column <code>invoice.invoice_relate.input_type</code>. 录入类型
     */
    public final TableField<InvoiceRelateRecord, String> INPUT_TYPE = createField("input_type", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "录入类型");

    /**
     * The column <code>invoice.invoice_relate.file_name</code>. 文件名称
     */
    public final TableField<InvoiceRelateRecord, String> FILE_NAME = createField("file_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "文件名称");

    /**
     * The column <code>invoice.invoice_relate.parse_start_time</code>. 发票影像解析开始时间
     */
    public final TableField<InvoiceRelateRecord, Timestamp> PARSE_START_TIME = createField("parse_start_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "发票影像解析开始时间");

    /**
     * The column <code>invoice.invoice_relate.parse_end_time</code>. 发票影像解析结束时间
     */
    public final TableField<InvoiceRelateRecord, Timestamp> PARSE_END_TIME = createField("parse_end_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "发票影像解析结束时间");

    /**
     * The column <code>invoice.invoice_relate.parse_status</code>. 发票影像解析状态
     */
    public final TableField<InvoiceRelateRecord, String> PARSE_STATUS = createField("parse_status", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "发票影像解析状态");

    /**
     * The column <code>invoice.invoice_relate.relate_status</code>. 关联状态RELATE_SUCCESS, RELATE_FAILURE
     */
    public final TableField<InvoiceRelateRecord, String> RELATE_STATUS = createField("relate_status", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "关联状态RELATE_SUCCESS, RELATE_FAILURE");

    /**
     * The column <code>invoice.invoice_relate.create_by</code>. 创建者
     */
    public final TableField<InvoiceRelateRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "创建者");

    /**
     * The column <code>invoice.invoice_relate.create_time</code>. 创建时间
     */
    public final TableField<InvoiceRelateRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * The column <code>invoice.invoice_relate.update_by</code>. 更新者
     */
    public final TableField<InvoiceRelateRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "更新者");

    /**
     * The column <code>invoice.invoice_relate.update_time</code>. 更新时间
     */
    public final TableField<InvoiceRelateRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * Create a <code>invoice.invoice_relate</code> table reference
     */
    public InvoiceRelate() {
        this("invoice_relate", null);
    }

    /**
     * Create an aliased <code>invoice.invoice_relate</code> table reference
     */
    public InvoiceRelate(String alias) {
        this(alias, INVOICE_RELATE);
    }

    private InvoiceRelate(String alias, Table<InvoiceRelateRecord> aliased) {
        this(alias, aliased, null);
    }

    private InvoiceRelate(String alias, Table<InvoiceRelateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "该表用以保存发票影像关联数据。");
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
    public UniqueKey<InvoiceRelateRecord> getPrimaryKey() {
        return Keys.KEY_INVOICE_RELATE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InvoiceRelateRecord>> getKeys() {
        return Arrays.<UniqueKey<InvoiceRelateRecord>>asList(Keys.KEY_INVOICE_RELATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelate as(String alias) {
        return new InvoiceRelate(alias, this);
    }

    /**
     * Rename this table
     */
    public InvoiceRelate rename(String name) {
        return new InvoiceRelate(name, null);
    }
}
