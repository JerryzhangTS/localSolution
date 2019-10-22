/**
 * This class is generated by jOOQ
 */
package library.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import library.Invoice;
import library.Keys;
import library.tables.records.InvoiceLineRecord;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 发票商品明细表。
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InvoiceLine extends TableImpl<InvoiceLineRecord> {

    private static final long serialVersionUID = 1339658225;

    /**
     * The reference instance of <code>invoice.invoice_line</code>
     */
    public static final InvoiceLine INVOICE_LINE = new InvoiceLine();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InvoiceLineRecord> getRecordType() {
        return InvoiceLineRecord.class;
    }

    /**
     * The column <code>invoice.invoice_line.id</code>. 唯一标识符
     */
    public final TableField<InvoiceLineRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "唯一标识符");

    /**
     * The column <code>invoice.invoice_line.name</code>. 商品名称
     */
    public final TableField<InvoiceLineRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "商品名称");

    /**
     * The column <code>invoice.invoice_line.model</code>. 商品型号
     */
    public final TableField<InvoiceLineRecord, String> MODEL = createField("model", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "商品型号");

    /**
     * The column <code>invoice.invoice_line.quantity</code>. 上平数量
     */
    public final TableField<InvoiceLineRecord, BigDecimal> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.DECIMAL.precision(21, 10), this, "上平数量");

    /**
     * The column <code>invoice.invoice_line.unit</code>. 商品单位
     */
    public final TableField<InvoiceLineRecord, String> UNIT = createField("unit", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "商品单位");

    /**
     * The column <code>invoice.invoice_line.unit_price</code>. 商品单价
     */
    public final TableField<InvoiceLineRecord, BigDecimal> UNIT_PRICE = createField("unit_price", org.jooq.impl.SQLDataType.DECIMAL.precision(37, 16), this, "商品单价");

    /**
     * The column <code>invoice.invoice_line.price_amount</code>. 商品金额
     */
    public final TableField<InvoiceLineRecord, BigDecimal> PRICE_AMOUNT = createField("price_amount", org.jooq.impl.SQLDataType.DECIMAL.precision(23, 6), this, "商品金额");

    /**
     * The column <code>invoice.invoice_line.tax_rate</code>. 商品税率
     */
    public final TableField<InvoiceLineRecord, BigDecimal> TAX_RATE = createField("tax_rate", org.jooq.impl.SQLDataType.DECIMAL.precision(23, 6), this, "商品税率");

    /**
     * The column <code>invoice.invoice_line.tax_amount</code>. 商品税额
     */
    public final TableField<InvoiceLineRecord, BigDecimal> TAX_AMOUNT = createField("tax_amount", org.jooq.impl.SQLDataType.DECIMAL.precision(23, 6), this, "商品税额");

    /**
     * The column <code>invoice.invoice_line.create_by</code>.
     */
    public final TableField<InvoiceLineRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.invoice_line.create_time</code>.
     */
    public final TableField<InvoiceLineRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>invoice.invoice_line.update_by</code>.
     */
    public final TableField<InvoiceLineRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.invoice_line.update_time</code>.
     */
    public final TableField<InvoiceLineRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>invoice.invoice_line.tenant_id</code>. invoice 唯一标识符
     */
    public final TableField<InvoiceLineRecord, String> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "invoice 唯一标识符");

    /**
     * The column <code>invoice.invoice_line.invoice_id</code>. invoice 唯一标识符
     */
    public final TableField<InvoiceLineRecord, String> INVOICE_ID = createField("invoice_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "invoice 唯一标识符");

    /**
     * The column <code>invoice.invoice_line.line_number</code>. 行号
     */
    public final TableField<InvoiceLineRecord, Integer> LINE_NUMBER = createField("line_number", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "行号");

    /**
     * The column <code>invoice.invoice_line.total_ex_tax</code>. 不含税金额
     */
    public final TableField<InvoiceLineRecord, BigDecimal> TOTAL_EX_TAX = createField("total_ex_tax", org.jooq.impl.SQLDataType.DECIMAL.precision(23, 6), this, "不含税金额");

    /**
     * The column <code>invoice.invoice_line.total_in_tax</code>. 含税金额
     */
    public final TableField<InvoiceLineRecord, BigDecimal> TOTAL_IN_TAX = createField("total_in_tax", org.jooq.impl.SQLDataType.DECIMAL.precision(23, 6), this, "含税金额");

    /**
     * The column <code>invoice.invoice_line.is_delete</code>. 软删除标志
     */
    public final TableField<InvoiceLineRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "软删除标志");

    /**
     * Create a <code>invoice.invoice_line</code> table reference
     */
    public InvoiceLine() {
        this("invoice_line", null);
    }

    /**
     * Create an aliased <code>invoice.invoice_line</code> table reference
     */
    public InvoiceLine(String alias) {
        this(alias, INVOICE_LINE);
    }

    private InvoiceLine(String alias, Table<InvoiceLineRecord> aliased) {
        this(alias, aliased, null);
    }

    private InvoiceLine(String alias, Table<InvoiceLineRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "发票商品明细表。");
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
    public UniqueKey<InvoiceLineRecord> getPrimaryKey() {
        return Keys.KEY_INVOICE_LINE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InvoiceLineRecord>> getKeys() {
        return Arrays.<UniqueKey<InvoiceLineRecord>>asList(Keys.KEY_INVOICE_LINE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceLine as(String alias) {
        return new InvoiceLine(alias, this);
    }

    /**
     * Rename this table
     */
    public InvoiceLine rename(String name) {
        return new InvoiceLine(name, null);
    }
}