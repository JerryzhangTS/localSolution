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
import library.tables.records.DocumentProfileRecord;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 文档附加信息规则配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DocumentProfile extends TableImpl<DocumentProfileRecord> {

    private static final long serialVersionUID = 129750320;

    /**
     * The reference instance of <code>invoice.document_profile</code>
     */
    public static final DocumentProfile DOCUMENT_PROFILE = new DocumentProfile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DocumentProfileRecord> getRecordType() {
        return DocumentProfileRecord.class;
    }

    /**
     * The column <code>invoice.document_profile.id</code>. 唯一标识符
     */
    public final TableField<DocumentProfileRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "唯一标识符");

    /**
     * The column <code>invoice.document_profile.no</code>.
     */
    public final TableField<DocumentProfileRecord, Short> NO = createField("no", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>invoice.document_profile.tenant_id</code>. 所属租户ID
     */
    public final TableField<DocumentProfileRecord, String> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "所属租户ID");

    /**
     * The column <code>invoice.document_profile.field_name</code>. 字段名称
     */
    public final TableField<DocumentProfileRecord, String> FIELD_NAME = createField("field_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "字段名称");

    /**
     * The column <code>invoice.document_profile.validation</code>. 验证规则
     */
    public final TableField<DocumentProfileRecord, String> VALIDATION = createField("validation", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "验证规则");

    /**
     * The column <code>invoice.document_profile.required</code>. 是否必填
     */
    public final TableField<DocumentProfileRecord, Short> REQUIRED = createField("required", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "是否必填");

    /**
     * The column <code>invoice.document_profile.create_by</code>.
     */
    public final TableField<DocumentProfileRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.document_profile.create_time</code>.
     */
    public final TableField<DocumentProfileRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>invoice.document_profile.update_by</code>.
     */
    public final TableField<DocumentProfileRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.document_profile.update_time</code>.
     */
    public final TableField<DocumentProfileRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>invoice.document_profile</code> table reference
     */
    public DocumentProfile() {
        this("document_profile", null);
    }

    /**
     * Create an aliased <code>invoice.document_profile</code> table reference
     */
    public DocumentProfile(String alias) {
        this(alias, DOCUMENT_PROFILE);
    }

    private DocumentProfile(String alias, Table<DocumentProfileRecord> aliased) {
        this(alias, aliased, null);
    }

    private DocumentProfile(String alias, Table<DocumentProfileRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "文档附加信息规则配置表");
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
    public UniqueKey<DocumentProfileRecord> getPrimaryKey() {
        return Keys.KEY_DOCUMENT_PROFILE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DocumentProfileRecord>> getKeys() {
        return Arrays.<UniqueKey<DocumentProfileRecord>>asList(Keys.KEY_DOCUMENT_PROFILE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentProfile as(String alias) {
        return new DocumentProfile(alias, this);
    }

    /**
     * Rename this table
     */
    public DocumentProfile rename(String name) {
        return new DocumentProfile(name, null);
    }
}
