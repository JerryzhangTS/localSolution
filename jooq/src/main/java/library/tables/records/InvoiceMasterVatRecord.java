/**
 * This class is generated by jOOQ
 */
package library.tables.records;


import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import library.tables.InvoiceMasterVat;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 中国增值税发票查询索引表。
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InvoiceMasterVatRecord extends UpdatableRecordImpl<InvoiceMasterVatRecord> {

    private static final long serialVersionUID = 1241774907;

    /**
     * Setter for <code>invoice.invoice_master_vat.master_id</code>. 发票唯一标识
     */
    public void setMasterId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.master_id</code>. 发票唯一标识
     */
    public String getMasterId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.fapiao_id</code>.
     */
    public void setFapiaoId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.fapiao_id</code>.
     */
    public String getFapiaoId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.invoice_code</code>. 发票代码
     */
    public void setInvoiceCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.invoice_code</code>. 发票代码
     */
    public String getInvoiceCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.invoice_number</code>. 发票号码
     */
    public void setInvoiceNumber(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.invoice_number</code>. 发票号码
     */
    public String getInvoiceNumber() {
        return (String) get(3);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.issue_date</code>. 开票日期
     */
    public void setIssueDate(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.issue_date</code>. 开票日期
     */
    public Date getIssueDate() {
        return (Date) get(4);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.check_code</code>. 发票校验码
     */
    public void setCheckCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.check_code</code>. 发票校验码
     */
    public String getCheckCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.sub_check_code</code>.
     */
    public void setSubCheckCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.sub_check_code</code>.
     */
    public String getSubCheckCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.invalid</code>.
     */
    public void setInvalid(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.invalid</code>.
     */
    public Short getInvalid() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.total_ex_tax</code>. 税前金额
     */
    public void setTotalExTax(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.total_ex_tax</code>. 税前金额
     */
    public BigDecimal getTotalExTax() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.total_in_tax</code>. 税后金额
     */
    public void setTotalInTax(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.total_in_tax</code>. 税后金额
     */
    public BigDecimal getTotalInTax() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.vat_type</code>. 增值税发票类型
     */
    public void setVatType(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.vat_type</code>. 增值税发票类型
     */
    public String getVatType() {
        return (String) get(10);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.buyer_name</code>.
     */
    public void setBuyerName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.buyer_name</code>.
     */
    public String getBuyerName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.buyer_tax_number</code>.
     */
    public void setBuyerTaxNumber(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.buyer_tax_number</code>.
     */
    public String getBuyerTaxNumber() {
        return (String) get(12);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.supplier_name</code>. 开票方名称
     */
    public void setSupplierName(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.supplier_name</code>. 开票方名称
     */
    public String getSupplierName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.supplier_tax_number</code>.
     */
    public void setSupplierTaxNumber(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.supplier_tax_number</code>.
     */
    public String getSupplierTaxNumber() {
        return (String) get(14);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.business_type</code>. 发票用途
     */
    public void setBusinessType(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.business_type</code>. 发票用途
     */
    public String getBusinessType() {
        return (String) get(15);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.tenant_id</code>. 发票所属租户ID
     */
    public void setTenantId(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.tenant_id</code>. 发票所属租户ID
     */
    public String getTenantId() {
        return (String) get(16);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.source_id</code>. 发票详情资源ID，如果该字段未空则详情信息从lookup提供的服务获取（国税数据），如果不为空则获取手动录入的详情信息
     */
    public void setSourceId(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.source_id</code>. 发票详情资源ID，如果该字段未空则详情信息从lookup提供的服务获取（国税数据），如果不为空则获取手动录入的详情信息
     */
    public String getSourceId() {
        return (String) get(17);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.source_type</code>. 发票详情来源
     */
    public void setSourceType(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.source_type</code>. 发票详情来源
     */
    public String getSourceType() {
        return (String) get(18);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.create_by</code>.
     */
    public void setCreateBy(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.create_by</code>.
     */
    public String getCreateBy() {
        return (String) get(19);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.update_by</code>.
     */
    public void setUpdateBy(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.update_by</code>.
     */
    public String getUpdateBy() {
        return (String) get(21);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(22, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(22);
    }

    /**
     * Setter for <code>invoice.invoice_master_vat.full_text</code>.
     */
    public void setFullText(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>invoice.invoice_master_vat.full_text</code>.
     */
    public String getFullText() {
        return (String) get(23);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InvoiceMasterVatRecord
     */
    public InvoiceMasterVatRecord() {
        super(InvoiceMasterVat.INVOICE_MASTER_VAT);
    }

    /**
     * Create a detached, initialised InvoiceMasterVatRecord
     */
    public InvoiceMasterVatRecord(String masterId, String fapiaoId, String invoiceCode, String invoiceNumber, Date issueDate, String checkCode, String subCheckCode, Short invalid, BigDecimal totalExTax, BigDecimal totalInTax, String vatType, String buyerName, String buyerTaxNumber, String supplierName, String supplierTaxNumber, String businessType, String tenantId, String sourceId, String sourceType, String createBy, Timestamp createTime, String updateBy, Timestamp updateTime, String fullText) {
        super(InvoiceMasterVat.INVOICE_MASTER_VAT);

        set(0, masterId);
        set(1, fapiaoId);
        set(2, invoiceCode);
        set(3, invoiceNumber);
        set(4, issueDate);
        set(5, checkCode);
        set(6, subCheckCode);
        set(7, invalid);
        set(8, totalExTax);
        set(9, totalInTax);
        set(10, vatType);
        set(11, buyerName);
        set(12, buyerTaxNumber);
        set(13, supplierName);
        set(14, supplierTaxNumber);
        set(15, businessType);
        set(16, tenantId);
        set(17, sourceId);
        set(18, sourceType);
        set(19, createBy);
        set(20, createTime);
        set(21, updateBy);
        set(22, updateTime);
        set(23, fullText);
    }
}