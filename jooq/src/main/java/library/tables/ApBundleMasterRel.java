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
import library.tables.records.ApBundleMasterRelRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 发票与应付绑定关联表。
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ApBundleMasterRel extends TableImpl<ApBundleMasterRelRecord> {

    private static final long serialVersionUID = -965527370;

    /**
     * The reference instance of <code>invoice.ap_bundle_master_rel</code>
     */
    public static final ApBundleMasterRel AP_BUNDLE_MASTER_REL = new ApBundleMasterRel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApBundleMasterRelRecord> getRecordType() {
        return ApBundleMasterRelRecord.class;
    }

    /**
     * The column <code>invoice.ap_bundle_master_rel.id</code>. 唯一标识
     */
    public final TableField<ApBundleMasterRelRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "唯一标识");

    /**
     * The column <code>invoice.ap_bundle_master_rel.bundle_id</code>. 应付ID
     */
    public final TableField<ApBundleMasterRelRecord, String> BUNDLE_ID = createField("bundle_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "应付ID");

    /**
     * The column <code>invoice.ap_bundle_master_rel.master_id</code>. 发票ID
     */
    public final TableField<ApBundleMasterRelRecord, String> MASTER_ID = createField("master_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "发票ID");

    /**
     * The column <code>invoice.ap_bundle_master_rel.create_by</code>.
     */
    public final TableField<ApBundleMasterRelRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.ap_bundle_master_rel.create_time</code>.
     */
    public final TableField<ApBundleMasterRelRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>invoice.ap_bundle_master_rel.update_by</code>.
     */
    public final TableField<ApBundleMasterRelRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.ap_bundle_master_rel.update_time</code>.
     */
    public final TableField<ApBundleMasterRelRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>invoice.ap_bundle_master_rel</code> table reference
     */
    public ApBundleMasterRel() {
        this("ap_bundle_master_rel", null);
    }

    /**
     * Create an aliased <code>invoice.ap_bundle_master_rel</code> table reference
     */
    public ApBundleMasterRel(String alias) {
        this(alias, AP_BUNDLE_MASTER_REL);
    }

    private ApBundleMasterRel(String alias, Table<ApBundleMasterRelRecord> aliased) {
        this(alias, aliased, null);
    }

    private ApBundleMasterRel(String alias, Table<ApBundleMasterRelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "发票与应付绑定关联表。");
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
    public Identity<ApBundleMasterRelRecord, Integer> getIdentity() {
        return Keys.IDENTITY_AP_BUNDLE_MASTER_REL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ApBundleMasterRelRecord> getPrimaryKey() {
        return Keys.KEY_AP_BUNDLE_MASTER_REL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ApBundleMasterRelRecord>> getKeys() {
        return Arrays.<UniqueKey<ApBundleMasterRelRecord>>asList(Keys.KEY_AP_BUNDLE_MASTER_REL_PRIMARY, Keys.KEY_AP_BUNDLE_MASTER_REL_BUNDLE_MASTER_ID_UIDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ApBundleMasterRelRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ApBundleMasterRelRecord, ?>>asList(Keys.FK_BUNDLE_MASTER, Keys.FK_BUNDLE_MASTER_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApBundleMasterRel as(String alias) {
        return new ApBundleMasterRel(alias, this);
    }

    /**
     * Rename this table
     */
    public ApBundleMasterRel rename(String name) {
        return new ApBundleMasterRel(name, null);
    }
}
