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
import library.tables.records.InboundInvoiceRecordedMetadataRecord;

import org.jooq.Field;
import org.jooq.Identity;
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
public class InboundInvoiceRecordedMetadata extends TableImpl<InboundInvoiceRecordedMetadataRecord> {

    private static final long serialVersionUID = 727529279;

    /**
     * The reference instance of <code>invoice.inbound_invoice_recorded_metadata</code>
     */
    public static final InboundInvoiceRecordedMetadata INBOUND_INVOICE_RECORDED_METADATA = new InboundInvoiceRecordedMetadata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InboundInvoiceRecordedMetadataRecord> getRecordType() {
        return InboundInvoiceRecordedMetadataRecord.class;
    }

    /**
     * The column <code>invoice.inbound_invoice_recorded_metadata.id</code>. 唯一标识符
     */
    public final TableField<InboundInvoiceRecordedMetadataRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "唯一标识符");

    /**
     * The column <code>invoice.inbound_invoice_recorded_metadata.tenant_id</code>. 元数据所属租户ID
     */
    public final TableField<InboundInvoiceRecordedMetadataRecord, String> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "元数据所属租户ID");

    /**
     * The column <code>invoice.inbound_invoice_recorded_metadata.object_id</code>. 扩展父表的唯一键
     */
    public final TableField<InboundInvoiceRecordedMetadataRecord, String> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "扩展父表的唯一键");

    /**
     * The column <code>invoice.inbound_invoice_recorded_metadata.key</code>. 元数据key
     */
    public final TableField<InboundInvoiceRecordedMetadataRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "元数据key");

    /**
     * The column <code>invoice.inbound_invoice_recorded_metadata.usage</code>. 元数据使用类型
     */
    public final TableField<InboundInvoiceRecordedMetadataRecord, String> USAGE = createField("usage", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "元数据使用类型");

    /**
     * The column <code>invoice.inbound_invoice_recorded_metadata.string_value</code>. 元数据字符值
     */
    public final TableField<InboundInvoiceRecordedMetadataRecord, String> STRING_VALUE = createField("string_value", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "元数据字符值");

    /**
     * The column <code>invoice.inbound_invoice_recorded_metadata.decimal_value</code>. 元数据数值
     */
    public final TableField<InboundInvoiceRecordedMetadataRecord, BigDecimal> DECIMAL_VALUE = createField("decimal_value", org.jooq.impl.SQLDataType.DECIMAL.precision(17, 6), this, "元数据数值");

    /**
     * The column <code>invoice.inbound_invoice_recorded_metadata.bool_value</code>. 元数据boolean值
     */
    public final TableField<InboundInvoiceRecordedMetadataRecord, Short> BOOL_VALUE = createField("bool_value", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "元数据boolean值");

    /**
     * The column <code>invoice.inbound_invoice_recorded_metadata.time_value</code>. 元数据时间值
     */
    public final TableField<InboundInvoiceRecordedMetadataRecord, Timestamp> TIME_VALUE = createField("time_value", org.jooq.impl.SQLDataType.TIMESTAMP, this, "元数据时间值");

    /**
     * The column <code>invoice.inbound_invoice_recorded_metadata.create_by</code>.
     */
    public final TableField<InboundInvoiceRecordedMetadataRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.inbound_invoice_recorded_metadata.create_time</code>.
     */
    public final TableField<InboundInvoiceRecordedMetadataRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>invoice.inbound_invoice_recorded_metadata.update_by</code>.
     */
    public final TableField<InboundInvoiceRecordedMetadataRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.inbound_invoice_recorded_metadata.update_time</code>.
     */
    public final TableField<InboundInvoiceRecordedMetadataRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>invoice.inbound_invoice_recorded_metadata</code> table reference
     */
    public InboundInvoiceRecordedMetadata() {
        this("inbound_invoice_recorded_metadata", null);
    }

    /**
     * Create an aliased <code>invoice.inbound_invoice_recorded_metadata</code> table reference
     */
    public InboundInvoiceRecordedMetadata(String alias) {
        this(alias, INBOUND_INVOICE_RECORDED_METADATA);
    }

    private InboundInvoiceRecordedMetadata(String alias, Table<InboundInvoiceRecordedMetadataRecord> aliased) {
        this(alias, aliased, null);
    }

    private InboundInvoiceRecordedMetadata(String alias, Table<InboundInvoiceRecordedMetadataRecord> aliased, Field<?>[] parameters) {
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
    public Identity<InboundInvoiceRecordedMetadataRecord, Long> getIdentity() {
        return Keys.IDENTITY_INBOUND_INVOICE_RECORDED_METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InboundInvoiceRecordedMetadataRecord> getPrimaryKey() {
        return Keys.KEY_INBOUND_INVOICE_RECORDED_METADATA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InboundInvoiceRecordedMetadataRecord>> getKeys() {
        return Arrays.<UniqueKey<InboundInvoiceRecordedMetadataRecord>>asList(Keys.KEY_INBOUND_INVOICE_RECORDED_METADATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoiceRecordedMetadata as(String alias) {
        return new InboundInvoiceRecordedMetadata(alias, this);
    }

    /**
     * Rename this table
     */
    public InboundInvoiceRecordedMetadata rename(String name) {
        return new InboundInvoiceRecordedMetadata(name, null);
    }
}