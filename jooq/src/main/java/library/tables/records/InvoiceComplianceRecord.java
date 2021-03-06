/**
 * This class is generated by jOOQ
 */
package library.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import library.tables.InvoiceCompliance;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


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
public class InvoiceComplianceRecord extends UpdatableRecordImpl<InvoiceComplianceRecord> {

    private static final long serialVersionUID = 1636687809;

    /**
     * Setter for <code>invoice.invoice_compliance.master_id</code>.
     */
    public void setMasterId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.master_id</code>.
     */
    public String getMasterId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.warning_flag</code>. 合规性警告标志位
     */
    public void setWarningFlag(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.warning_flag</code>. 合规性警告标志位
     */
    public Short getWarningFlag() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.invoice_code_err</code>. 发票代码不合规信息
     */
    public void setInvoiceCodeErr(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.invoice_code_err</code>. 发票代码不合规信息
     */
    public String getInvoiceCodeErr() {
        return (String) get(2);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.invoice_number_err</code>. 发票号码不合规信息
     */
    public void setInvoiceNumberErr(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.invoice_number_err</code>. 发票号码不合规信息
     */
    public String getInvoiceNumberErr() {
        return (String) get(3);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.check_code_err</code>. 校验码不合规信息
     */
    public void setCheckCodeErr(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.check_code_err</code>. 校验码不合规信息
     */
    public String getCheckCodeErr() {
        return (String) get(4);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.issue_date_err</code>. 开票日期不合规信息
     */
    public void setIssueDateErr(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.issue_date_err</code>. 开票日期不合规信息
     */
    public String getIssueDateErr() {
        return (String) get(5);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.total_ex_tax_err</code>. 税前金额不合规信息
     */
    public void setTotalExTaxErr(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.total_ex_tax_err</code>. 税前金额不合规信息
     */
    public String getTotalExTaxErr() {
        return (String) get(6);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.total_in_tax_err</code>. 税后金额不合规信息
     */
    public void setTotalInTaxErr(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.total_in_tax_err</code>. 税后金额不合规信息
     */
    public String getTotalInTaxErr() {
        return (String) get(7);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.total_tax_err</code>. 税额不合规信息
     */
    public void setTotalTaxErr(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.total_tax_err</code>. 税额不合规信息
     */
    public String getTotalTaxErr() {
        return (String) get(8);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.supplier_name_err</code>. 供应商名称不合规信息
     */
    public void setSupplierNameErr(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.supplier_name_err</code>. 供应商名称不合规信息
     */
    public String getSupplierNameErr() {
        return (String) get(9);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.supplier_tax_number_err</code>. 供应商税号不合规信息
     */
    public void setSupplierTaxNumberErr(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.supplier_tax_number_err</code>. 供应商税号不合规信息
     */
    public String getSupplierTaxNumberErr() {
        return (String) get(10);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.supplier_bank_account_err</code>. 供应商银行账号不合规信息
     */
    public void setSupplierBankAccountErr(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.supplier_bank_account_err</code>. 供应商银行账号不合规信息
     */
    public String getSupplierBankAccountErr() {
        return (String) get(11);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.supplier_addr_phone_err</code>. 供应商地址电话不合规信息
     */
    public void setSupplierAddrPhoneErr(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.supplier_addr_phone_err</code>. 供应商地址电话不合规信息
     */
    public String getSupplierAddrPhoneErr() {
        return (String) get(12);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.buyer_name_err</code>. 买方名称不合规信息
     */
    public void setBuyerNameErr(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.buyer_name_err</code>. 买方名称不合规信息
     */
    public String getBuyerNameErr() {
        return (String) get(13);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.buyer_bank_account_err</code>. 买方银行账号不合规信息
     */
    public void setBuyerBankAccountErr(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.buyer_bank_account_err</code>. 买方银行账号不合规信息
     */
    public String getBuyerBankAccountErr() {
        return (String) get(14);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.buyer_tax_number_err</code>. 买方税号不合规信息
     */
    public void setBuyerTaxNumberErr(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.buyer_tax_number_err</code>. 买方税号不合规信息
     */
    public String getBuyerTaxNumberErr() {
        return (String) get(15);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.buyer_addr_phone_err</code>. 买方地址电话不合规信息
     */
    public void setBuyerAddrPhoneErr(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.buyer_addr_phone_err</code>. 买方地址电话不合规信息
     */
    public String getBuyerAddrPhoneErr() {
        return (String) get(16);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.region_err</code>. 地区不合规信息
     */
    public void setRegionErr(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.region_err</code>. 地区不合规信息
     */
    public String getRegionErr() {
        return (String) get(17);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.note_err</code>. 备注不合规信息
     */
    public void setNoteErr(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.note_err</code>. 备注不合规信息
     */
    public String getNoteErr() {
        return (String) get(18);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.reviewer_err</code>. 审核员不合规信息
     */
    public void setReviewerErr(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.reviewer_err</code>. 审核员不合规信息
     */
    public String getReviewerErr() {
        return (String) get(19);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.drawer_err</code>. 开票员不合规信息
     */
    public void setDrawerErr(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.drawer_err</code>. 开票员不合规信息
     */
    public String getDrawerErr() {
        return (String) get(20);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.cipher_err</code>. 密码区不合规信息
     */
    public void setCipherErr(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.cipher_err</code>. 密码区不合规信息
     */
    public String getCipherErr() {
        return (String) get(21);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.tax_auth_sig_err</code>. 认证签名不合规信息
     */
    public void setTaxAuthSigErr(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.tax_auth_sig_err</code>. 认证签名不合规信息
     */
    public String getTaxAuthSigErr() {
        return (String) get(22);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.items_err</code>. 清单不合规信息
     */
    public void setItemsErr(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.items_err</code>. 清单不合规信息
     */
    public String getItemsErr() {
        return (String) get(23);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.machine_number_err</code>. 机器码不合规信息
     */
    public void setMachineNumberErr(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.machine_number_err</code>. 机器码不合规信息
     */
    public String getMachineNumberErr() {
        return (String) get(24);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.overall_err</code>. 发票整体不合规信息
     */
    public void setOverallErr(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.overall_err</code>. 发票整体不合规信息
     */
    public String getOverallErr() {
        return (String) get(25);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(26, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(26);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.create_by</code>.
     */
    public void setCreateBy(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.create_by</code>.
     */
    public String getCreateBy() {
        return (String) get(27);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(28, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(28);
    }

    /**
     * Setter for <code>invoice.invoice_compliance.update_by</code>.
     */
    public void setUpdateBy(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>invoice.invoice_compliance.update_by</code>.
     */
    public String getUpdateBy() {
        return (String) get(29);
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
     * Create a detached InvoiceComplianceRecord
     */
    public InvoiceComplianceRecord() {
        super(InvoiceCompliance.INVOICE_COMPLIANCE);
    }

    /**
     * Create a detached, initialised InvoiceComplianceRecord
     */
    public InvoiceComplianceRecord(String masterId, Short warningFlag, String invoiceCodeErr, String invoiceNumberErr, String checkCodeErr, String issueDateErr, String totalExTaxErr, String totalInTaxErr, String totalTaxErr, String supplierNameErr, String supplierTaxNumberErr, String supplierBankAccountErr, String supplierAddrPhoneErr, String buyerNameErr, String buyerBankAccountErr, String buyerTaxNumberErr, String buyerAddrPhoneErr, String regionErr, String noteErr, String reviewerErr, String drawerErr, String cipherErr, String taxAuthSigErr, String itemsErr, String machineNumberErr, String overallErr, Timestamp createTime, String createBy, Timestamp updateTime, String updateBy) {
        super(InvoiceCompliance.INVOICE_COMPLIANCE);

        set(0, masterId);
        set(1, warningFlag);
        set(2, invoiceCodeErr);
        set(3, invoiceNumberErr);
        set(4, checkCodeErr);
        set(5, issueDateErr);
        set(6, totalExTaxErr);
        set(7, totalInTaxErr);
        set(8, totalTaxErr);
        set(9, supplierNameErr);
        set(10, supplierTaxNumberErr);
        set(11, supplierBankAccountErr);
        set(12, supplierAddrPhoneErr);
        set(13, buyerNameErr);
        set(14, buyerBankAccountErr);
        set(15, buyerTaxNumberErr);
        set(16, buyerAddrPhoneErr);
        set(17, regionErr);
        set(18, noteErr);
        set(19, reviewerErr);
        set(20, drawerErr);
        set(21, cipherErr);
        set(22, taxAuthSigErr);
        set(23, itemsErr);
        set(24, machineNumberErr);
        set(25, overallErr);
        set(26, createTime);
        set(27, createBy);
        set(28, updateTime);
        set(29, updateBy);
    }
}
