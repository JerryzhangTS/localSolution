/**
 * This class is generated by jOOQ
 */
package library.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import library.tables.ItemPropTenant;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


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
public class ItemPropTenantRecord extends TableRecordImpl<ItemPropTenantRecord> implements Record7<String, String, String, String, Timestamp, String, Timestamp> {

    private static final long serialVersionUID = 72542123;

    /**
     * Setter for <code>invoice.item_prop_tenant.tenant_id</code>. 租户id
     */
    public void setTenantId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>invoice.item_prop_tenant.tenant_id</code>. 租户id
     */
    public String getTenantId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>invoice.item_prop_tenant.tax_category_code</code>. 税率税目code
     */
    public void setTaxCategoryCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>invoice.item_prop_tenant.tax_category_code</code>. 税率税目code
     */
    public String getTaxCategoryCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>invoice.item_prop_tenant.transfer_reason_code</code>. 进项税转出原因code
     */
    public void setTransferReasonCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>invoice.item_prop_tenant.transfer_reason_code</code>. 进项税转出原因code
     */
    public String getTransferReasonCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>invoice.item_prop_tenant.create_by</code>.
     */
    public void setCreateBy(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>invoice.item_prop_tenant.create_by</code>.
     */
    public String getCreateBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>invoice.item_prop_tenant.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>invoice.item_prop_tenant.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>invoice.item_prop_tenant.update_by</code>.
     */
    public void setUpdateBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>invoice.item_prop_tenant.update_by</code>.
     */
    public String getUpdateBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>invoice.item_prop_tenant.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>invoice.item_prop_tenant.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, Timestamp, String, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, Timestamp, String, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ItemPropTenant.ITEM_PROP_TENANT.TENANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ItemPropTenant.ITEM_PROP_TENANT.TAX_CATEGORY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ItemPropTenant.ITEM_PROP_TENANT.TRANSFER_REASON_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ItemPropTenant.ITEM_PROP_TENANT.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ItemPropTenant.ITEM_PROP_TENANT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ItemPropTenant.ITEM_PROP_TENANT.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ItemPropTenant.ITEM_PROP_TENANT.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTenantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTaxCategoryCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTransferReasonCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemPropTenantRecord value1(String value) {
        setTenantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemPropTenantRecord value2(String value) {
        setTaxCategoryCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemPropTenantRecord value3(String value) {
        setTransferReasonCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemPropTenantRecord value4(String value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemPropTenantRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemPropTenantRecord value6(String value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemPropTenantRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemPropTenantRecord values(String value1, String value2, String value3, String value4, Timestamp value5, String value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ItemPropTenantRecord
     */
    public ItemPropTenantRecord() {
        super(ItemPropTenant.ITEM_PROP_TENANT);
    }

    /**
     * Create a detached, initialised ItemPropTenantRecord
     */
    public ItemPropTenantRecord(String tenantId, String taxCategoryCode, String transferReasonCode, String createBy, Timestamp createTime, String updateBy, Timestamp updateTime) {
        super(ItemPropTenant.ITEM_PROP_TENANT);

        set(0, tenantId);
        set(1, taxCategoryCode);
        set(2, transferReasonCode);
        set(3, createBy);
        set(4, createTime);
        set(5, updateBy);
        set(6, updateTime);
    }
}
