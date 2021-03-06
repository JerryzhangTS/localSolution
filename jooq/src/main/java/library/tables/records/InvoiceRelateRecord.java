/**
 * This class is generated by jOOQ
 */
package library.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import library.tables.InvoiceRelate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 该表用以保存发票影像关联数据。
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InvoiceRelateRecord extends UpdatableRecordImpl<InvoiceRelateRecord> implements Record20<String, String, String, String, Timestamp, Boolean, String, String, String, String, String, String, Timestamp, Timestamp, String, String, String, Timestamp, String, Timestamp> {

    private static final long serialVersionUID = 521809354;

    /**
     * Setter for <code>invoice.invoice_relate.id</code>. 唯一标识
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.id</code>. 唯一标识
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>invoice.invoice_relate.business_type</code>. 发票对应的业务类型EXP, AP, AR
     */
    public void setBusinessType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.business_type</code>. 发票对应的业务类型EXP, AP, AR
     */
    public String getBusinessType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>invoice.invoice_relate.tenant_id</code>. 发票录入所属租户ID
     */
    public void setTenantId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.tenant_id</code>. 发票录入所属租户ID
     */
    public String getTenantId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>invoice.invoice_relate.input_user_id</code>. 录入人ID
     */
    public void setInputUserId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.input_user_id</code>. 录入人ID
     */
    public String getInputUserId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>invoice.invoice_relate.input_time</code>. 录入时间
     */
    public void setInputTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.input_time</code>. 录入时间
     */
    public Timestamp getInputTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>invoice.invoice_relate.activate</code>.
     */
    public void setActivate(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.activate</code>.
     */
    public Boolean getActivate() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>invoice.invoice_relate.group_id</code>. 开云定制组ID
     */
    public void setGroupId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.group_id</code>. 开云定制组ID
     */
    public String getGroupId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>invoice.invoice_relate.invoice_code</code>. 发票代码
     */
    public void setInvoiceCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.invoice_code</code>. 发票代码
     */
    public String getInvoiceCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>invoice.invoice_relate.invoice_number</code>. 发票号码
     */
    public void setInvoiceNumber(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.invoice_number</code>. 发票号码
     */
    public String getInvoiceNumber() {
        return (String) get(8);
    }

    /**
     * Setter for <code>invoice.invoice_relate.invoice_code_number</code>. 发票代码:发票号码
     */
    public void setInvoiceCodeNumber(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.invoice_code_number</code>. 发票代码:发票号码
     */
    public String getInvoiceCodeNumber() {
        return (String) get(9);
    }

    /**
     * Setter for <code>invoice.invoice_relate.input_type</code>. 录入类型
     */
    public void setInputType(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.input_type</code>. 录入类型
     */
    public String getInputType() {
        return (String) get(10);
    }

    /**
     * Setter for <code>invoice.invoice_relate.file_name</code>. 文件名称
     */
    public void setFileName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.file_name</code>. 文件名称
     */
    public String getFileName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>invoice.invoice_relate.parse_start_time</code>. 发票影像解析开始时间
     */
    public void setParseStartTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.parse_start_time</code>. 发票影像解析开始时间
     */
    public Timestamp getParseStartTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>invoice.invoice_relate.parse_end_time</code>. 发票影像解析结束时间
     */
    public void setParseEndTime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.parse_end_time</code>. 发票影像解析结束时间
     */
    public Timestamp getParseEndTime() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>invoice.invoice_relate.parse_status</code>. 发票影像解析状态
     */
    public void setParseStatus(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.parse_status</code>. 发票影像解析状态
     */
    public String getParseStatus() {
        return (String) get(14);
    }

    /**
     * Setter for <code>invoice.invoice_relate.relate_status</code>. 关联状态RELATE_SUCCESS, RELATE_FAILURE
     */
    public void setRelateStatus(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.relate_status</code>. 关联状态RELATE_SUCCESS, RELATE_FAILURE
     */
    public String getRelateStatus() {
        return (String) get(15);
    }

    /**
     * Setter for <code>invoice.invoice_relate.create_by</code>. 创建者
     */
    public void setCreateBy(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.create_by</code>. 创建者
     */
    public String getCreateBy() {
        return (String) get(16);
    }

    /**
     * Setter for <code>invoice.invoice_relate.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>invoice.invoice_relate.update_by</code>. 更新者
     */
    public void setUpdateBy(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.update_by</code>. 更新者
     */
    public String getUpdateBy() {
        return (String) get(18);
    }

    /**
     * Setter for <code>invoice.invoice_relate.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>invoice.invoice_relate.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<String, String, String, String, Timestamp, Boolean, String, String, String, String, String, String, Timestamp, Timestamp, String, String, String, Timestamp, String, Timestamp> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<String, String, String, String, Timestamp, Boolean, String, String, String, String, String, String, Timestamp, Timestamp, String, String, String, Timestamp, String, Timestamp> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return InvoiceRelate.INVOICE_RELATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InvoiceRelate.INVOICE_RELATE.BUSINESS_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return InvoiceRelate.INVOICE_RELATE.TENANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InvoiceRelate.INVOICE_RELATE.INPUT_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return InvoiceRelate.INVOICE_RELATE.INPUT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return InvoiceRelate.INVOICE_RELATE.ACTIVATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return InvoiceRelate.INVOICE_RELATE.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return InvoiceRelate.INVOICE_RELATE.INVOICE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return InvoiceRelate.INVOICE_RELATE.INVOICE_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return InvoiceRelate.INVOICE_RELATE.INVOICE_CODE_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return InvoiceRelate.INVOICE_RELATE.INPUT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return InvoiceRelate.INVOICE_RELATE.FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return InvoiceRelate.INVOICE_RELATE.PARSE_START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return InvoiceRelate.INVOICE_RELATE.PARSE_END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return InvoiceRelate.INVOICE_RELATE.PARSE_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return InvoiceRelate.INVOICE_RELATE.RELATE_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return InvoiceRelate.INVOICE_RELATE.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return InvoiceRelate.INVOICE_RELATE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return InvoiceRelate.INVOICE_RELATE.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field20() {
        return InvoiceRelate.INVOICE_RELATE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getBusinessType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTenantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getInputUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getInputTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getActivate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getInvoiceCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getInvoiceNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getInvoiceCodeNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getInputType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getParseStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getParseEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getParseStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getRelateStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value20() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value2(String value) {
        setBusinessType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value3(String value) {
        setTenantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value4(String value) {
        setInputUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value5(Timestamp value) {
        setInputTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value6(Boolean value) {
        setActivate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value7(String value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value8(String value) {
        setInvoiceCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value9(String value) {
        setInvoiceNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value10(String value) {
        setInvoiceCodeNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value11(String value) {
        setInputType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value12(String value) {
        setFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value13(Timestamp value) {
        setParseStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value14(Timestamp value) {
        setParseEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value15(String value) {
        setParseStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value16(String value) {
        setRelateStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value17(String value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value18(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value19(String value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord value20(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRelateRecord values(String value1, String value2, String value3, String value4, Timestamp value5, Boolean value6, String value7, String value8, String value9, String value10, String value11, String value12, Timestamp value13, Timestamp value14, String value15, String value16, String value17, Timestamp value18, String value19, Timestamp value20) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InvoiceRelateRecord
     */
    public InvoiceRelateRecord() {
        super(InvoiceRelate.INVOICE_RELATE);
    }

    /**
     * Create a detached, initialised InvoiceRelateRecord
     */
    public InvoiceRelateRecord(String id, String businessType, String tenantId, String inputUserId, Timestamp inputTime, Boolean activate, String groupId, String invoiceCode, String invoiceNumber, String invoiceCodeNumber, String inputType, String fileName, Timestamp parseStartTime, Timestamp parseEndTime, String parseStatus, String relateStatus, String createBy, Timestamp createTime, String updateBy, Timestamp updateTime) {
        super(InvoiceRelate.INVOICE_RELATE);

        set(0, id);
        set(1, businessType);
        set(2, tenantId);
        set(3, inputUserId);
        set(4, inputTime);
        set(5, activate);
        set(6, groupId);
        set(7, invoiceCode);
        set(8, invoiceNumber);
        set(9, invoiceCodeNumber);
        set(10, inputType);
        set(11, fileName);
        set(12, parseStartTime);
        set(13, parseEndTime);
        set(14, parseStatus);
        set(15, relateStatus);
        set(16, createBy);
        set(17, createTime);
        set(18, updateBy);
        set(19, updateTime);
    }
}
