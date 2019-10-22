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
import library.tables.records.BizRuleRecord;

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
public class BizRule extends TableImpl<BizRuleRecord> {

    private static final long serialVersionUID = -139082375;

    /**
     * The reference instance of <code>invoice.biz_rule</code>
     */
    public static final BizRule BIZ_RULE = new BizRule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BizRuleRecord> getRecordType() {
        return BizRuleRecord.class;
    }

    /**
     * The column <code>invoice.biz_rule.id</code>.
     */
    public final TableField<BizRuleRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>invoice.biz_rule.name</code>.
     */
    public final TableField<BizRuleRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>invoice.biz_rule.description</code>.
     */
    public final TableField<BizRuleRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>invoice.biz_rule.tenant_id</code>.
     */
    public final TableField<BizRuleRecord, String> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>invoice.biz_rule.sequence</code>.
     */
    public final TableField<BizRuleRecord, Integer> SEQUENCE = createField("sequence", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>invoice.biz_rule.status</code>.
     */
    public final TableField<BizRuleRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>invoice.biz_rule.version</code>.
     */
    public final TableField<BizRuleRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>invoice.biz_rule.business_type</code>.
     */
    public final TableField<BizRuleRecord, String> BUSINESS_TYPE = createField("business_type", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("AP", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>invoice.biz_rule.create_time</code>.
     */
    public final TableField<BizRuleRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>invoice.biz_rule.update_time</code>.
     */
    public final TableField<BizRuleRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>invoice.biz_rule.delete_time</code>.
     */
    public final TableField<BizRuleRecord, Timestamp> DELETE_TIME = createField("delete_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>invoice.biz_rule.create_by</code>.
     */
    public final TableField<BizRuleRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.biz_rule.update_by</code>.
     */
    public final TableField<BizRuleRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * Create a <code>invoice.biz_rule</code> table reference
     */
    public BizRule() {
        this("biz_rule", null);
    }

    /**
     * Create an aliased <code>invoice.biz_rule</code> table reference
     */
    public BizRule(String alias) {
        this(alias, BIZ_RULE);
    }

    private BizRule(String alias, Table<BizRuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private BizRule(String alias, Table<BizRuleRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<BizRuleRecord> getPrimaryKey() {
        return Keys.KEY_BIZ_RULE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BizRuleRecord>> getKeys() {
        return Arrays.<UniqueKey<BizRuleRecord>>asList(Keys.KEY_BIZ_RULE_PRIMARY, Keys.KEY_BIZ_RULE_BIZ_RULE_UK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BizRule as(String alias) {
        return new BizRule(alias, this);
    }

    /**
     * Rename this table
     */
    public BizRule rename(String name) {
        return new BizRule(name, null);
    }
}