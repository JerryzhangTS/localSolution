/**
 * This class is generated by jOOQ
 */
package library.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import library.tables.InboundInvoiceDocument;

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
public class InboundInvoiceDocumentRecord extends UpdatableRecordImpl<InboundInvoiceDocumentRecord> {

    private static final long serialVersionUID = 1835250269;

    /**
     * Setter for <code>invoice.inbound_invoice_document.source_document_id</code>.
     */
    public void setSourceDocumentId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.source_document_id</code>.
     */
    public String getSourceDocumentId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.source_document_riak_id</code>.
     */
    public void setSourceDocumentRiakId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.source_document_riak_id</code>.
     */
    public String getSourceDocumentRiakId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.source_document_name</code>.
     */
    public void setSourceDocumentName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.source_document_name</code>.
     */
    public String getSourceDocumentName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.business_type</code>.
     */
    public void setBusinessType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.business_type</code>.
     */
    public String getBusinessType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.tenant_id</code>.
     */
    public void setTenantId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.tenant_id</code>.
     */
    public String getTenantId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.upload_time</code>.
     */
    public void setUploadTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.upload_time</code>.
     */
    public Timestamp getUploadTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.status</code>.
     */
    public void setStatus(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.status</code>.
     */
    public String getStatus() {
        return (String) get(6);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.generate_document_riak_id</code>.
     */
    public void setGenerateDocumentRiakId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.generate_document_riak_id</code>.
     */
    public String getGenerateDocumentRiakId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.generate_document_name</code>.
     */
    public void setGenerateDocumentName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.generate_document_name</code>.
     */
    public String getGenerateDocumentName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.generate_status</code>.
     */
    public void setGenerateStatus(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.generate_status</code>.
     */
    public String getGenerateStatus() {
        return (String) get(9);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.result</code>.
     */
    public void setResult(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.result</code>.
     */
    public String getResult() {
        return (String) get(10);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.total</code>.
     */
    public void setTotal(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.total</code>.
     */
    public Integer getTotal() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.success</code>.
     */
    public void setSuccess(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.success</code>.
     */
    public Integer getSuccess() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.failed</code>.
     */
    public void setFailed(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.failed</code>.
     */
    public Integer getFailed() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.processing</code>.
     */
    public void setProcessing(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.processing</code>.
     */
    public Integer getProcessing() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.cancel</code>.
     */
    public void setCancel(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.cancel</code>.
     */
    public Integer getCancel() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.success_total_in_tax</code>.
     */
    public void setSuccessTotalInTax(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.success_total_in_tax</code>.
     */
    public BigDecimal getSuccessTotalInTax() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.success_total_tax</code>.
     */
    public void setSuccessTotalTax(BigDecimal value) {
        set(17, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.success_total_tax</code>.
     */
    public BigDecimal getSuccessTotalTax() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.failed_total_in_tax</code>.
     */
    public void setFailedTotalInTax(BigDecimal value) {
        set(18, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.failed_total_in_tax</code>.
     */
    public BigDecimal getFailedTotalInTax() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.failed_total_tax</code>.
     */
    public void setFailedTotalTax(BigDecimal value) {
        set(19, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.failed_total_tax</code>.
     */
    public BigDecimal getFailedTotalTax() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.error_message</code>.
     */
    public void setErrorMessage(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.error_message</code>.
     */
    public String getErrorMessage() {
        return (String) get(20);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(21, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.create_by</code>.
     */
    public void setCreateBy(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.create_by</code>.
     */
    public String getCreateBy() {
        return (String) get(22);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(23, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(23);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_document.update_by</code>.
     */
    public void setUpdateBy(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_document.update_by</code>.
     */
    public String getUpdateBy() {
        return (String) get(24);
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
     * Create a detached InboundInvoiceDocumentRecord
     */
    public InboundInvoiceDocumentRecord() {
        super(InboundInvoiceDocument.INBOUND_INVOICE_DOCUMENT);
    }

    /**
     * Create a detached, initialised InboundInvoiceDocumentRecord
     */
    public InboundInvoiceDocumentRecord(String sourceDocumentId, String sourceDocumentRiakId, String sourceDocumentName, String businessType, String tenantId, Timestamp uploadTime, String status, String generateDocumentRiakId, String generateDocumentName, String generateStatus, String result, Integer total, Integer success, Integer failed, Integer processing, Integer cancel, BigDecimal successTotalInTax, BigDecimal successTotalTax, BigDecimal failedTotalInTax, BigDecimal failedTotalTax, String errorMessage, Timestamp createTime, String createBy, Timestamp updateTime, String updateBy) {
        super(InboundInvoiceDocument.INBOUND_INVOICE_DOCUMENT);

        set(0, sourceDocumentId);
        set(1, sourceDocumentRiakId);
        set(2, sourceDocumentName);
        set(3, businessType);
        set(4, tenantId);
        set(5, uploadTime);
        set(6, status);
        set(7, generateDocumentRiakId);
        set(8, generateDocumentName);
        set(9, generateStatus);
        set(10, result);
        set(11, total);
        set(12, success);
        set(13, failed);
        set(14, processing);
        set(15, cancel);
        set(16, successTotalInTax);
        set(17, successTotalTax);
        set(18, failedTotalInTax);
        set(19, failedTotalTax);
        set(20, errorMessage);
        set(21, createTime);
        set(22, createBy);
        set(23, updateTime);
        set(24, updateBy);
    }
}
