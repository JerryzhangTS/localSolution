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
import library.tables.records.RuleContentRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class RuleContent extends TableImpl<RuleContentRecord> {

    private static final long serialVersionUID = 2122526594;

    /**
     * The reference instance of <code>invoice.rule_content</code>
     */
    public static final RuleContent RULE_CONTENT = new RuleContent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RuleContentRecord> getRecordType() {
        return RuleContentRecord.class;
    }

    /**
     * The column <code>invoice.rule_content.id</code>.
     */
    public final TableField<RuleContentRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>invoice.rule_content.rule_id</code>.
     */
    public final TableField<RuleContentRecord, String> RULE_ID = createField("rule_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>invoice.rule_content.rule_content</code>.
     */
    public final TableField<RuleContentRecord, String> RULE_CONTENT_ = createField("rule_content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>invoice.rule_content.scope</code>.
     */
    public final TableField<RuleContentRecord, String> SCOPE = createField("scope", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>invoice.rule_content.tenant_id</code>.
     */
    public final TableField<RuleContentRecord, String> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>invoice.rule_content.created_time</code>.
     */
    public final TableField<RuleContentRecord, Timestamp> CREATED_TIME = createField("created_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>invoice.rule_content.updated_time</code>.
     */
    public final TableField<RuleContentRecord, Timestamp> UPDATED_TIME = createField("updated_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>invoice.rule_content.created_by</code>.
     */
    public final TableField<RuleContentRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.rule_content.updated_by</code>.
     */
    public final TableField<RuleContentRecord, String> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * Create a <code>invoice.rule_content</code> table reference
     */
    public RuleContent() {
        this("rule_content", null);
    }

    /**
     * Create an aliased <code>invoice.rule_content</code> table reference
     */
    public RuleContent(String alias) {
        this(alias, RULE_CONTENT);
    }

    private RuleContent(String alias, Table<RuleContentRecord> aliased) {
        this(alias, aliased, null);
    }

    private RuleContent(String alias, Table<RuleContentRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<RuleContentRecord> getPrimaryKey() {
        return Keys.KEY_RULE_CONTENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RuleContentRecord>> getKeys() {
        return Arrays.<UniqueKey<RuleContentRecord>>asList(Keys.KEY_RULE_CONTENT_PRIMARY, Keys.KEY_RULE_CONTENT_RULE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RuleContentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RuleContentRecord, ?>>asList(Keys.RULE_CONTENT_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleContent as(String alias) {
        return new RuleContent(alias, this);
    }

    /**
     * Rename this table
     */
    public RuleContent rename(String name) {
        return new RuleContent(name, null);
    }
}
