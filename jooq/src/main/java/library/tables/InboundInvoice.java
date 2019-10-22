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
import library.tables.records.InboundInvoiceRecord;

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
public class InboundInvoice extends TableImpl<InboundInvoiceRecord> {

    private static final long serialVersionUID = -1664124308;

    /**
     * The reference instance of <code>invoice.inbound_invoice</code>
     */
    public static final InboundInvoice INBOUND_INVOICE = new InboundInvoice();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InboundInvoiceRecord> getRecordType() {
        return InboundInvoiceRecord.class;
    }

    /**
     * The column <code>invoice.inbound_invoice.id</code>.
     */
    public final TableField<InboundInvoiceRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>invoice.inbound_invoice.fapiao_id</code>.
     */
    public final TableField<InboundInvoiceRecord, String> FAPIAO_ID = createField("fapiao_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.inbound_invoice.tenant_id</code>.
     */
    public final TableField<InboundInvoiceRecord, String> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>invoice.inbound_invoice.invoice_code</code>.
     */
    public final TableField<InboundInvoiceRecord, String> INVOICE_CODE = createField("invoice_code", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>invoice.inbound_invoice.invoice_number</code>.
     */
    public final TableField<InboundInvoiceRecord, String> INVOICE_NUMBER = createField("invoice_number", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>invoice.inbound_invoice.vat_type</code>. 增值税发票类型
     */
    public final TableField<InboundInvoiceRecord, String> VAT_TYPE = createField("vat_type", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "增值税发票类型");

    /**
     * The column <code>invoice.inbound_invoice.invoice_status</code>. 发票状态,0正常,1作废,2红冲,3失控,4异常
     */
    public final TableField<InboundInvoiceRecord, String> INVOICE_STATUS = createField("invoice_status", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "发票状态,0正常,1作废,2红冲,3失控,4异常");

    /**
     * The column <code>invoice.inbound_invoice.total_ex_tax</code>. 税前金额
     */
    public final TableField<InboundInvoiceRecord, BigDecimal> TOTAL_EX_TAX = createField("total_ex_tax", org.jooq.impl.SQLDataType.DECIMAL.precision(17, 6).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.000000", org.jooq.impl.SQLDataType.DECIMAL)), this, "税前金额");

    /**
     * The column <code>invoice.inbound_invoice.total_tax</code>. 税额
     */
    public final TableField<InboundInvoiceRecord, BigDecimal> TOTAL_TAX = createField("total_tax", org.jooq.impl.SQLDataType.DECIMAL.precision(17, 6).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.000000", org.jooq.impl.SQLDataType.DECIMAL)), this, "税额");

    /**
     * The column <code>invoice.inbound_invoice.issue_date</code>. 开票日期
     */
    public final TableField<InboundInvoiceRecord, Date> ISSUE_DATE = createField("issue_date", org.jooq.impl.SQLDataType.DATE, this, "开票日期");

    /**
     * The column <code>invoice.inbound_invoice.supplier_tax_number</code>. 销方税号
     */
    public final TableField<InboundInvoiceRecord, String> SUPPLIER_TAX_NUMBER = createField("supplier_tax_number", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "销方税号");

    /**
     * The column <code>invoice.inbound_invoice.buyer_tax_number</code>. 买方税号
     */
    public final TableField<InboundInvoiceRecord, String> BUYER_TAX_NUMBER = createField("buyer_tax_number", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "买方税号");

    /**
     * The column <code>invoice.inbound_invoice.supplier_name</code>.
     */
    public final TableField<InboundInvoiceRecord, String> SUPPLIER_NAME = createField("supplier_name", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

    /**
     * The column <code>invoice.inbound_invoice.expiration_date</code>.
     */
    public final TableField<InboundInvoiceRecord, Date> EXPIRATION_DATE = createField("expiration_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>invoice.inbound_invoice.check_time</code>. 勾选时间，没有勾选为null
     */
    public final TableField<InboundInvoiceRecord, Timestamp> CHECK_TIME = createField("check_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "勾选时间，没有勾选为null");

    /**
     * The column <code>invoice.inbound_invoice.confirm_time</code>. 认证时间，没有认证为null
     */
    public final TableField<InboundInvoiceRecord, Timestamp> CONFIRM_TIME = createField("confirm_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "认证时间，没有认证为null");

    /**
     * The column <code>invoice.inbound_invoice.confirm_type</code>. 勾选认证或者扫描认证
     */
    public final TableField<InboundInvoiceRecord, String> CONFIRM_TYPE = createField("confirm_type", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "勾选认证或者扫描认证");

    /**
     * The column <code>invoice.inbound_invoice.deductible_period</code>. 税款所属期
     */
    public final TableField<InboundInvoiceRecord, String> DEDUCTIBLE_PERIOD = createField("deductible_period", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "税款所属期");

    /**
     * The column <code>invoice.inbound_invoice.source_type</code>. 数据来源：BW 或者 TS
     */
    public final TableField<InboundInvoiceRecord, String> SOURCE_TYPE = createField("source_type", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "数据来源：BW 或者 TS");

    /**
     * The column <code>invoice.inbound_invoice.create_time</code>.
     */
    public final TableField<InboundInvoiceRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>invoice.inbound_invoice.update_time</code>.
     */
    public final TableField<InboundInvoiceRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>invoice.inbound_invoice.update_by</code>.
     */
    public final TableField<InboundInvoiceRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.inbound_invoice.create_by</code>.
     */
    public final TableField<InboundInvoiceRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.inbound_invoice.confirm_status</code>.
     */
    public final TableField<InboundInvoiceRecord, String> CONFIRM_STATUS = createField("confirm_status", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

    /**
     * The column <code>invoice.inbound_invoice.confirm_error_message</code>.
     */
    public final TableField<InboundInvoiceRecord, String> CONFIRM_ERROR_MESSAGE = createField("confirm_error_message", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>invoice.inbound_invoice.lookup_status</code>. 全票面查询状态
     */
    public final TableField<InboundInvoiceRecord, String> LOOKUP_STATUS = createField("lookup_status", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "全票面查询状态");

    /**
     * The column <code>invoice.inbound_invoice.business_status</code>. 状态
     */
    public final TableField<InboundInvoiceRecord, String> BUSINESS_STATUS = createField("business_status", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "状态");

    /**
     * The column <code>invoice.inbound_invoice.input_status</code>. 录入状态
     */
    public final TableField<InboundInvoiceRecord, String> INPUT_STATUS = createField("input_status", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "录入状态");

    /**
     * The column <code>invoice.inbound_invoice.freezing_flag</code>. 冻结标记
     */
    public final TableField<InboundInvoiceRecord, Short> FREEZING_FLAG = createField("freezing_flag", org.jooq.impl.SQLDataType.SMALLINT, this, "冻结标记");

    /**
     * Create a <code>invoice.inbound_invoice</code> table reference
     */
    public InboundInvoice() {
        this("inbound_invoice", null);
    }

    /**
     * Create an aliased <code>invoice.inbound_invoice</code> table reference
     */
    public InboundInvoice(String alias) {
        this(alias, INBOUND_INVOICE);
    }

    private InboundInvoice(String alias, Table<InboundInvoiceRecord> aliased) {
        this(alias, aliased, null);
    }

    private InboundInvoice(String alias, Table<InboundInvoiceRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<InboundInvoiceRecord> getPrimaryKey() {
        return Keys.KEY_INBOUND_INVOICE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InboundInvoiceRecord>> getKeys() {
        return Arrays.<UniqueKey<InboundInvoiceRecord>>asList(Keys.KEY_INBOUND_INVOICE_PRIMARY, Keys.KEY_INBOUND_INVOICE_INBOUND_INVOICE_UNIQUE_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoice as(String alias) {
        return new InboundInvoice(alias, this);
    }

    /**
     * Rename this table
     */
    public InboundInvoice rename(String name) {
        return new InboundInvoice(name, null);
    }
}