/**
 * This class is generated by jOOQ
 */
package library.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import library.tables.InvoiceCollection;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 该表用以保存发票归集记录。
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InvoiceCollectionRecord extends UpdatableRecordImpl<InvoiceCollectionRecord> implements Record10<String, String, String, String, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -974845135;

    /**
     * Setter for <code>invoice.invoice_collection.master_id</code>. 总公司被归集的发票唯一标识
     */
    public void setMasterId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>invoice.invoice_collection.master_id</code>. 总公司被归集的发票唯一标识
     */
    public String getMasterId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>invoice.invoice_collection.action_type</code>. 归集方式,如自动归集,手动归集
     */
    public void setActionType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>invoice.invoice_collection.action_type</code>. 归集方式,如自动归集,手动归集
     */
    public String getActionType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>invoice.invoice_collection.branch_master_id</code>. 归集到子公司的发票唯一标识
     */
    public void setBranchMasterId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>invoice.invoice_collection.branch_master_id</code>. 归集到子公司的发票唯一标识
     */
    public String getBranchMasterId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>invoice.invoice_collection.branch_tenant_id</code>. 归集到子公司的租户ID
     */
    public void setBranchTenantId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>invoice.invoice_collection.branch_tenant_id</code>. 归集到子公司的租户ID
     */
    public String getBranchTenantId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>invoice.invoice_collection.branch_tax_num</code>. 归集到子公司的税号
     */
    public void setBranchTaxNum(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>invoice.invoice_collection.branch_tax_num</code>. 归集到子公司的税号
     */
    public String getBranchTaxNum() {
        return (String) get(4);
    }

    /**
     * Setter for <code>invoice.invoice_collection.branch_tenant_name</code>. 归集到子公司的公司名称
     */
    public void setBranchTenantName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>invoice.invoice_collection.branch_tenant_name</code>. 归集到子公司的公司名称
     */
    public String getBranchTenantName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>invoice.invoice_collection.create_by</code>.
     */
    public void setCreateBy(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>invoice.invoice_collection.create_by</code>.
     */
    public String getCreateBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>invoice.invoice_collection.update_by</code>.
     */
    public void setUpdateBy(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>invoice.invoice_collection.update_by</code>.
     */
    public String getUpdateBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>invoice.invoice_collection.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>invoice.invoice_collection.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>invoice.invoice_collection.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>invoice.invoice_collection.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return InvoiceCollection.INVOICE_COLLECTION.MASTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InvoiceCollection.INVOICE_COLLECTION.ACTION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return InvoiceCollection.INVOICE_COLLECTION.BRANCH_MASTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InvoiceCollection.INVOICE_COLLECTION.BRANCH_TENANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return InvoiceCollection.INVOICE_COLLECTION.BRANCH_TAX_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return InvoiceCollection.INVOICE_COLLECTION.BRANCH_TENANT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return InvoiceCollection.INVOICE_COLLECTION.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return InvoiceCollection.INVOICE_COLLECTION.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return InvoiceCollection.INVOICE_COLLECTION.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return InvoiceCollection.INVOICE_COLLECTION.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getMasterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getActionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getBranchMasterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBranchTenantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBranchTaxNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getBranchTenantName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCollectionRecord value1(String value) {
        setMasterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCollectionRecord value2(String value) {
        setActionType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCollectionRecord value3(String value) {
        setBranchMasterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCollectionRecord value4(String value) {
        setBranchTenantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCollectionRecord value5(String value) {
        setBranchTaxNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCollectionRecord value6(String value) {
        setBranchTenantName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCollectionRecord value7(String value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCollectionRecord value8(String value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCollectionRecord value9(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCollectionRecord value10(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCollectionRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, Timestamp value9, Timestamp value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InvoiceCollectionRecord
     */
    public InvoiceCollectionRecord() {
        super(InvoiceCollection.INVOICE_COLLECTION);
    }

    /**
     * Create a detached, initialised InvoiceCollectionRecord
     */
    public InvoiceCollectionRecord(String masterId, String actionType, String branchMasterId, String branchTenantId, String branchTaxNum, String branchTenantName, String createBy, String updateBy, Timestamp createTime, Timestamp updateTime) {
        super(InvoiceCollection.INVOICE_COLLECTION);

        set(0, masterId);
        set(1, actionType);
        set(2, branchMasterId);
        set(3, branchTenantId);
        set(4, branchTaxNum);
        set(5, branchTenantName);
        set(6, createBy);
        set(7, updateBy);
        set(8, createTime);
        set(9, updateTime);
    }
}
