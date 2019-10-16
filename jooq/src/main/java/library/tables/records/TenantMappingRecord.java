/**
 * This class is generated by jOOQ
 */
package library.tables.records;


import javax.annotation.Generated;

import library.tables.TenantMapping;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * 租户映射表。
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TenantMappingRecord extends TableRecordImpl<TenantMappingRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -1188203838;

    /**
     * Setter for <code>invoice.tenant_mapping.ts_tenant_id</code>. GLOBAL租户ID
     */
    public void setTsTenantId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>invoice.tenant_mapping.ts_tenant_id</code>. GLOBAL租户ID
     */
    public String getTsTenantId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>invoice.tenant_mapping.bwts_tenant_id</code>. BWTS租户ID
     */
    public void setBwtsTenantId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>invoice.tenant_mapping.bwts_tenant_id</code>. BWTS租户ID
     */
    public String getBwtsTenantId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>invoice.tenant_mapping.tenant_name</code>. 租户名称
     */
    public void setTenantName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>invoice.tenant_mapping.tenant_name</code>. 租户名称
     */
    public String getTenantName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TenantMapping.TENANT_MAPPING.TS_TENANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TenantMapping.TENANT_MAPPING.BWTS_TENANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TenantMapping.TENANT_MAPPING.TENANT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTsTenantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getBwtsTenantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTenantName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TenantMappingRecord value1(String value) {
        setTsTenantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TenantMappingRecord value2(String value) {
        setBwtsTenantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TenantMappingRecord value3(String value) {
        setTenantName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TenantMappingRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TenantMappingRecord
     */
    public TenantMappingRecord() {
        super(TenantMapping.TENANT_MAPPING);
    }

    /**
     * Create a detached, initialised TenantMappingRecord
     */
    public TenantMappingRecord(String tsTenantId, String bwtsTenantId, String tenantName) {
        super(TenantMapping.TENANT_MAPPING);

        set(0, tsTenantId);
        set(1, bwtsTenantId);
        set(2, tenantName);
    }
}
