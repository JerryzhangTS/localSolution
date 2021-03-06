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
import library.tables.records.FapiaoDeletionRecordRecord;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FapiaoDeletionRecord extends TableImpl<FapiaoDeletionRecordRecord> {

    private static final long serialVersionUID = -2050001089;

    /**
     * The reference instance of <code>invoice.fapiao_deletion_record</code>
     */
    public static final FapiaoDeletionRecord FAPIAO_DELETION_RECORD = new FapiaoDeletionRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FapiaoDeletionRecordRecord> getRecordType() {
        return FapiaoDeletionRecordRecord.class;
    }

    /**
     * The column <code>invoice.fapiao_deletion_record.id</code>. 唯一标识符
     */
    public final TableField<FapiaoDeletionRecordRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "唯一标识符");

    /**
     * The column <code>invoice.fapiao_deletion_record.input_id</code>. 被删除的input id
     */
    public final TableField<FapiaoDeletionRecordRecord, String> INPUT_ID = createField("input_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "被删除的input id");

    /**
     * The column <code>invoice.fapiao_deletion_record.invoice_code</code>. 发票代码
     */
    public final TableField<FapiaoDeletionRecordRecord, String> INVOICE_CODE = createField("invoice_code", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "发票代码");

    /**
     * The column <code>invoice.fapiao_deletion_record.invoice_number</code>. 发票号码
     */
    public final TableField<FapiaoDeletionRecordRecord, String> INVOICE_NUMBER = createField("invoice_number", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "发票号码");

    /**
     * The column <code>invoice.fapiao_deletion_record.issue_date</code>. 开票日期
     */
    public final TableField<FapiaoDeletionRecordRecord, Date> ISSUE_DATE = createField("issue_date", org.jooq.impl.SQLDataType.DATE, this, "开票日期");

    /**
     * The column <code>invoice.fapiao_deletion_record.total_ex_tax</code>. 不含税金额
     */
    public final TableField<FapiaoDeletionRecordRecord, BigDecimal> TOTAL_EX_TAX = createField("total_ex_tax", org.jooq.impl.SQLDataType.DECIMAL.precision(17, 6), this, "不含税金额");

    /**
     * The column <code>invoice.fapiao_deletion_record.vat_type</code>. 发票类别
     */
    public final TableField<FapiaoDeletionRecordRecord, String> VAT_TYPE = createField("vat_type", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "发票类别");

    /**
     * The column <code>invoice.fapiao_deletion_record.fapiao_id</code>. 发票唯一id
     */
    public final TableField<FapiaoDeletionRecordRecord, String> FAPIAO_ID = createField("fapiao_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "发票唯一id");

    /**
     * The column <code>invoice.fapiao_deletion_record.business_type</code>. 业务类型
     */
    public final TableField<FapiaoDeletionRecordRecord, String> BUSINESS_TYPE = createField("business_type", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "业务类型");

    /**
     * The column <code>invoice.fapiao_deletion_record.input_type</code>. 录入方式
     */
    public final TableField<FapiaoDeletionRecordRecord, String> INPUT_TYPE = createField("input_type", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "录入方式");

    /**
     * The column <code>invoice.fapiao_deletion_record.input_user_id</code>. 录入用户id
     */
    public final TableField<FapiaoDeletionRecordRecord, String> INPUT_USER_ID = createField("input_user_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "录入用户id");

    /**
     * The column <code>invoice.fapiao_deletion_record.input_time</code>. 录入时间
     */
    public final TableField<FapiaoDeletionRecordRecord, Timestamp> INPUT_TIME = createField("input_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "录入时间");

    /**
     * The column <code>invoice.fapiao_deletion_record.delete_user_id</code>. 删除用户id
     */
    public final TableField<FapiaoDeletionRecordRecord, String> DELETE_USER_ID = createField("delete_user_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "删除用户id");

    /**
     * The column <code>invoice.fapiao_deletion_record.delete_time</code>. 删除时间
     */
    public final TableField<FapiaoDeletionRecordRecord, Timestamp> DELETE_TIME = createField("delete_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "删除时间");

    /**
     * The column <code>invoice.fapiao_deletion_record.file_name</code>. 影像文件名称
     */
    public final TableField<FapiaoDeletionRecordRecord, String> FILE_NAME = createField("file_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "影像文件名称");

    /**
     * The column <code>invoice.fapiao_deletion_record.tenant_id</code>. 所属公司id
     */
    public final TableField<FapiaoDeletionRecordRecord, String> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "所属公司id");

    /**
     * The column <code>invoice.fapiao_deletion_record.create_by</code>.
     */
    public final TableField<FapiaoDeletionRecordRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.fapiao_deletion_record.create_time</code>.
     */
    public final TableField<FapiaoDeletionRecordRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>invoice.fapiao_deletion_record.update_by</code>.
     */
    public final TableField<FapiaoDeletionRecordRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.fapiao_deletion_record.update_time</code>.
     */
    public final TableField<FapiaoDeletionRecordRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>invoice.fapiao_deletion_record</code> table reference
     */
    public FapiaoDeletionRecord() {
        this("fapiao_deletion_record", null);
    }

    /**
     * Create an aliased <code>invoice.fapiao_deletion_record</code> table reference
     */
    public FapiaoDeletionRecord(String alias) {
        this(alias, FAPIAO_DELETION_RECORD);
    }

    private FapiaoDeletionRecord(String alias, Table<FapiaoDeletionRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private FapiaoDeletionRecord(String alias, Table<FapiaoDeletionRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
    public UniqueKey<FapiaoDeletionRecordRecord> getPrimaryKey() {
        return Keys.KEY_FAPIAO_DELETION_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FapiaoDeletionRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<FapiaoDeletionRecordRecord>>asList(Keys.KEY_FAPIAO_DELETION_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoDeletionRecord as(String alias) {
        return new FapiaoDeletionRecord(alias, this);
    }

    /**
     * Rename this table
     */
    public FapiaoDeletionRecord rename(String name) {
        return new FapiaoDeletionRecord(name, null);
    }
}
