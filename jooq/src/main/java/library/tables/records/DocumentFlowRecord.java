/**
 * This class is generated by jOOQ
 */
package library.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import library.tables.DocumentFlow;

import org.jooq.impl.TableRecordImpl;


/**
 * For syncing TS & BWTS document flow status
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DocumentFlowRecord extends TableRecordImpl<DocumentFlowRecord> {

    private static final long serialVersionUID = -434930268;

    /**
     * Setter for <code>invoice.document_flow.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>invoice.document_flow.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>invoice.document_flow.id_dep</code>.
     */
    public void setIdDep(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>invoice.document_flow.id_dep</code>.
     */
    public Integer getIdDep() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>invoice.document_flow.fapiao_id</code>.
     */
    public void setFapiaoId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>invoice.document_flow.fapiao_id</code>.
     */
    public String getFapiaoId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>invoice.document_flow.invoice_code</code>.
     */
    public void setInvoiceCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>invoice.document_flow.invoice_code</code>.
     */
    public String getInvoiceCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>invoice.document_flow.invoice_number</code>.
     */
    public void setInvoiceNumber(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>invoice.document_flow.invoice_number</code>.
     */
    public String getInvoiceNumber() {
        return (String) get(4);
    }

    /**
     * Setter for <code>invoice.document_flow.business_type</code>.
     */
    public void setBusinessType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>invoice.document_flow.business_type</code>.
     */
    public String getBusinessType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>invoice.document_flow.mockfapiao_number</code>.
     */
    public void setMockfapiaoNumber(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>invoice.document_flow.mockfapiao_number</code>.
     */
    public String getMockfapiaoNumber() {
        return (String) get(6);
    }

    /**
     * Setter for <code>invoice.document_flow.document_status</code>.
     */
    public void setDocumentStatus(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>invoice.document_flow.document_status</code>.
     */
    public String getDocumentStatus() {
        return (String) get(7);
    }

    /**
     * Setter for <code>invoice.document_flow.document_original_status</code>.
     */
    public void setDocumentOriginalStatus(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>invoice.document_flow.document_original_status</code>.
     */
    public String getDocumentOriginalStatus() {
        return (String) get(8);
    }

    /**
     * Setter for <code>invoice.document_flow.unified_state</code>.
     */
    public void setUnifiedState(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>invoice.document_flow.unified_state</code>.
     */
    public String getUnifiedState() {
        return (String) get(9);
    }

    /**
     * Setter for <code>invoice.document_flow.process_state</code>.
     */
    public void setProcessState(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>invoice.document_flow.process_state</code>.
     */
    public String getProcessState() {
        return (String) get(10);
    }

    /**
     * Setter for <code>invoice.document_flow.delivery_state</code>.
     */
    public void setDeliveryState(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>invoice.document_flow.delivery_state</code>.
     */
    public String getDeliveryState() {
        return (String) get(11);
    }

    /**
     * Setter for <code>invoice.document_flow.dispatch_state</code>.
     */
    public void setDispatchState(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>invoice.document_flow.dispatch_state</code>.
     */
    public String getDispatchState() {
        return (String) get(12);
    }

    /**
     * Setter for <code>invoice.document_flow.dispatch_channel</code>.
     */
    public void setDispatchChannel(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>invoice.document_flow.dispatch_channel</code>.
     */
    public String getDispatchChannel() {
        return (String) get(13);
    }

    /**
     * Setter for <code>invoice.document_flow.workflow_configured</code>. workflow是否配置
     */
    public void setWorkflowConfigured(Short value) {
        set(14, value);
    }

    /**
     * Getter for <code>invoice.document_flow.workflow_configured</code>. workflow是否配置
     */
    public Short getWorkflowConfigured() {
        return (Short) get(14);
    }

    /**
     * Setter for <code>invoice.document_flow.fapiao_match_requirement</code>. 是否需要发票比对
     */
    public void setFapiaoMatchRequirement(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>invoice.document_flow.fapiao_match_requirement</code>. 是否需要发票比对
     */
    public String getFapiaoMatchRequirement() {
        return (String) get(15);
    }

    /**
     * Setter for <code>invoice.document_flow.fapiao_match_result</code>. 发票比对结果
     */
    public void setFapiaoMatchResult(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>invoice.document_flow.fapiao_match_result</code>. 发票比对结果
     */
    public String getFapiaoMatchResult() {
        return (String) get(16);
    }

    /**
     * Setter for <code>invoice.document_flow.document_fail_type</code>.
     */
    public void setDocumentFailType(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>invoice.document_flow.document_fail_type</code>.
     */
    public String getDocumentFailType() {
        return (String) get(17);
    }

    /**
     * Setter for <code>invoice.document_flow.document_fail_message</code>.
     */
    public void setDocumentFailMessage(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>invoice.document_flow.document_fail_message</code>.
     */
    public String getDocumentFailMessage() {
        return (String) get(18);
    }

    /**
     * Setter for <code>invoice.document_flow.ts_document_id</code>.
     */
    public void setTsDocumentId(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>invoice.document_flow.ts_document_id</code>.
     */
    public String getTsDocumentId() {
        return (String) get(19);
    }

    /**
     * Setter for <code>invoice.document_flow.draft_save_failed</code>.
     */
    public void setDraftSaveFailed(Short value) {
        set(20, value);
    }

    /**
     * Getter for <code>invoice.document_flow.draft_save_failed</code>.
     */
    public Short getDraftSaveFailed() {
        return (Short) get(20);
    }

    /**
     * Setter for <code>invoice.document_flow.represent_flag</code>. 买家代替卖家发送文档标记
     */
    public void setRepresentFlag(Short value) {
        set(21, value);
    }

    /**
     * Getter for <code>invoice.document_flow.represent_flag</code>. 买家代替卖家发送文档标记
     */
    public Short getRepresentFlag() {
        return (Short) get(21);
    }

    /**
     * Setter for <code>invoice.document_flow.valid_flag</code>.
     */
    public void setValidFlag(Short value) {
        set(22, value);
    }

    /**
     * Getter for <code>invoice.document_flow.valid_flag</code>.
     */
    public Short getValidFlag() {
        return (Short) get(22);
    }

    /**
     * Setter for <code>invoice.document_flow.forward_status</code>.
     */
    public void setForwardStatus(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>invoice.document_flow.forward_status</code>.
     */
    public String getForwardStatus() {
        return (String) get(23);
    }

    /**
     * Setter for <code>invoice.document_flow.tenant_id</code>.
     */
    public void setTenantId(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>invoice.document_flow.tenant_id</code>.
     */
    public String getTenantId() {
        return (String) get(24);
    }

    /**
     * Setter for <code>invoice.document_flow.create_by</code>.
     */
    public void setCreateBy(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>invoice.document_flow.create_by</code>.
     */
    public String getCreateBy() {
        return (String) get(25);
    }

    /**
     * Setter for <code>invoice.document_flow.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(26, value);
    }

    /**
     * Getter for <code>invoice.document_flow.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(26);
    }

    /**
     * Setter for <code>invoice.document_flow.update_by</code>.
     */
    public void setUpdateBy(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>invoice.document_flow.update_by</code>.
     */
    public String getUpdateBy() {
        return (String) get(27);
    }

    /**
     * Setter for <code>invoice.document_flow.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(28, value);
    }

    /**
     * Getter for <code>invoice.document_flow.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(28);
    }

    /**
     * Setter for <code>invoice.document_flow.submit_flag</code>.
     */
    public void setSubmitFlag(Short value) {
        set(29, value);
    }

    /**
     * Getter for <code>invoice.document_flow.submit_flag</code>.
     */
    public Short getSubmitFlag() {
        return (Short) get(29);
    }

    /**
     * Setter for <code>invoice.document_flow.processing_start_time</code>.
     */
    public void setProcessingStartTime(Timestamp value) {
        set(30, value);
    }

    /**
     * Getter for <code>invoice.document_flow.processing_start_time</code>.
     */
    public Timestamp getProcessingStartTime() {
        return (Timestamp) get(30);
    }

    /**
     * Setter for <code>invoice.document_flow.manual_match_accept</code>.
     */
    public void setManualMatchAccept(Short value) {
        set(31, value);
    }

    /**
     * Getter for <code>invoice.document_flow.manual_match_accept</code>.
     */
    public Short getManualMatchAccept() {
        return (Short) get(31);
    }

    /**
     * Setter for <code>invoice.document_flow.match_type</code>. 发票比对类型
     */
    public void setMatchType(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>invoice.document_flow.match_type</code>. 发票比对类型
     */
    public String getMatchType() {
        return (String) get(32);
    }

    /**
     * Setter for <code>invoice.document_flow.premade_match_status</code>.
     */
    public void setPremadeMatchStatus(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>invoice.document_flow.premade_match_status</code>.
     */
    public String getPremadeMatchStatus() {
        return (String) get(33);
    }

    /**
     * Setter for <code>invoice.document_flow.premade_match_manually</code>.
     */
    public void setPremadeMatchManually(Short value) {
        set(34, value);
    }

    /**
     * Getter for <code>invoice.document_flow.premade_match_manually</code>.
     */
    public Short getPremadeMatchManually() {
        return (Short) get(34);
    }

    /**
     * Setter for <code>invoice.document_flow.transaction_status</code>. 事务状态
     */
    public void setTransactionStatus(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>invoice.document_flow.transaction_status</code>. 事务状态
     */
    public String getTransactionStatus() {
        return (String) get(35);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DocumentFlowRecord
     */
    public DocumentFlowRecord() {
        super(DocumentFlow.DOCUMENT_FLOW);
    }

    /**
     * Create a detached, initialised DocumentFlowRecord
     */
    public DocumentFlowRecord(String id, Integer idDep, String fapiaoId, String invoiceCode, String invoiceNumber, String businessType, String mockfapiaoNumber, String documentStatus, String documentOriginalStatus, String unifiedState, String processState, String deliveryState, String dispatchState, String dispatchChannel, Short workflowConfigured, String fapiaoMatchRequirement, String fapiaoMatchResult, String documentFailType, String documentFailMessage, String tsDocumentId, Short draftSaveFailed, Short representFlag, Short validFlag, String forwardStatus, String tenantId, String createBy, Timestamp createTime, String updateBy, Timestamp updateTime, Short submitFlag, Timestamp processingStartTime, Short manualMatchAccept, String matchType, String premadeMatchStatus, Short premadeMatchManually, String transactionStatus) {
        super(DocumentFlow.DOCUMENT_FLOW);

        set(0, id);
        set(1, idDep);
        set(2, fapiaoId);
        set(3, invoiceCode);
        set(4, invoiceNumber);
        set(5, businessType);
        set(6, mockfapiaoNumber);
        set(7, documentStatus);
        set(8, documentOriginalStatus);
        set(9, unifiedState);
        set(10, processState);
        set(11, deliveryState);
        set(12, dispatchState);
        set(13, dispatchChannel);
        set(14, workflowConfigured);
        set(15, fapiaoMatchRequirement);
        set(16, fapiaoMatchResult);
        set(17, documentFailType);
        set(18, documentFailMessage);
        set(19, tsDocumentId);
        set(20, draftSaveFailed);
        set(21, representFlag);
        set(22, validFlag);
        set(23, forwardStatus);
        set(24, tenantId);
        set(25, createBy);
        set(26, createTime);
        set(27, updateBy);
        set(28, updateTime);
        set(29, submitFlag);
        set(30, processingStartTime);
        set(31, manualMatchAccept);
        set(32, matchType);
        set(33, premadeMatchStatus);
        set(34, premadeMatchManually);
        set(35, transactionStatus);
    }
}
