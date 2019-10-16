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
import library.tables.records.FapiaoMetadataRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 定制开票数据扩展表。
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FapiaoMetadata extends TableImpl<FapiaoMetadataRecord> {

    private static final long serialVersionUID = 1358661662;

    /**
     * The reference instance of <code>invoice.fapiao_metadata</code>
     */
    public static final FapiaoMetadata FAPIAO_METADATA = new FapiaoMetadata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FapiaoMetadataRecord> getRecordType() {
        return FapiaoMetadataRecord.class;
    }

    /**
     * The column <code>invoice.fapiao_metadata.id</code>. 唯一标识符
     */
    public final TableField<FapiaoMetadataRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "唯一标识符");

    /**
     * The column <code>invoice.fapiao_metadata.tenant_id</code>. 元数据所属租户ID
     */
    public final TableField<FapiaoMetadataRecord, String> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "元数据所属租户ID");

    /**
     * The column <code>invoice.fapiao_metadata.object_id</code>. 扩展父表的唯一键
     */
    public final TableField<FapiaoMetadataRecord, String> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "扩展父表的唯一键");

    /**
     * The column <code>invoice.fapiao_metadata.key</code>. 元数据key
     */
    public final TableField<FapiaoMetadataRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "元数据key");

    /**
     * The column <code>invoice.fapiao_metadata.usage</code>. 元数据使用类型
     */
    public final TableField<FapiaoMetadataRecord, String> USAGE = createField("usage", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "元数据使用类型");

    /**
     * The column <code>invoice.fapiao_metadata.string_value</code>. 元数据字符值
     */
    public final TableField<FapiaoMetadataRecord, String> STRING_VALUE = createField("string_value", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "元数据字符值");

    /**
     * The column <code>invoice.fapiao_metadata.decimal_value</code>. 元数据数值
     */
    public final TableField<FapiaoMetadataRecord, BigDecimal> DECIMAL_VALUE = createField("decimal_value", org.jooq.impl.SQLDataType.DECIMAL.precision(17, 6), this, "元数据数值");

    /**
     * The column <code>invoice.fapiao_metadata.bool_value</code>. 元数据boolean值
     */
    public final TableField<FapiaoMetadataRecord, Short> BOOL_VALUE = createField("bool_value", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "元数据boolean值");

    /**
     * The column <code>invoice.fapiao_metadata.time_value</code>. 元数据时间值
     */
    public final TableField<FapiaoMetadataRecord, Timestamp> TIME_VALUE = createField("time_value", org.jooq.impl.SQLDataType.TIMESTAMP, this, "元数据时间值");

    /**
     * The column <code>invoice.fapiao_metadata.create_time</code>. 创建时间
     */
    public final TableField<FapiaoMetadataRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP(6)", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>invoice.fapiao_metadata.update_time</code>. 更新时间
     */
    public final TableField<FapiaoMetadataRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP(6)", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>invoice.fapiao_metadata.create_by</code>. 创建者
     */
    public final TableField<FapiaoMetadataRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "创建者");

    /**
     * The column <code>invoice.fapiao_metadata.update_by</code>. 更新者
     */
    public final TableField<FapiaoMetadataRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "更新者");

    /**
     * Create a <code>invoice.fapiao_metadata</code> table reference
     */
    public FapiaoMetadata() {
        this("fapiao_metadata", null);
    }

    /**
     * Create an aliased <code>invoice.fapiao_metadata</code> table reference
     */
    public FapiaoMetadata(String alias) {
        this(alias, FAPIAO_METADATA);
    }

    private FapiaoMetadata(String alias, Table<FapiaoMetadataRecord> aliased) {
        this(alias, aliased, null);
    }

    private FapiaoMetadata(String alias, Table<FapiaoMetadataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "定制开票数据扩展表。");
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
    public Identity<FapiaoMetadataRecord, Long> getIdentity() {
        return Keys.IDENTITY_FAPIAO_METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FapiaoMetadataRecord> getPrimaryKey() {
        return Keys.KEY_FAPIAO_METADATA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FapiaoMetadataRecord>> getKeys() {
        return Arrays.<UniqueKey<FapiaoMetadataRecord>>asList(Keys.KEY_FAPIAO_METADATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoMetadata as(String alias) {
        return new FapiaoMetadata(alias, this);
    }

    /**
     * Rename this table
     */
    public FapiaoMetadata rename(String name) {
        return new FapiaoMetadata(name, null);
    }
}
