/**
 * This class is generated by jOOQ
 */
package library.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import library.tables.InboundInvoiceConfirmHistory;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class InboundInvoiceConfirmHistoryRecord extends UpdatableRecordImpl<InboundInvoiceConfirmHistoryRecord> implements Record13<Long, String, String, String, String, Timestamp, Timestamp, Integer, Timestamp, Timestamp, String, String, String> {

    private static final long serialVersionUID = -1743472513;

    /**
     * Setter for <code>invoice.inbound_invoice_confirm_history.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_confirm_history.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_confirm_history.invoice_number</code>.
     */
    public void setInvoiceNumber(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_confirm_history.invoice_number</code>.
     */
    public String getInvoiceNumber() {
        return (String) get(1);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_confirm_history.invoice_code</code>.
     */
    public void setInvoiceCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_confirm_history.invoice_code</code>.
     */
    public String getInvoiceCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_confirm_history.buyer_tax_number</code>.
     */
    public void setBuyerTaxNumber(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_confirm_history.buyer_tax_number</code>.
     */
    public String getBuyerTaxNumber() {
        return (String) get(3);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_confirm_history.task_no</code>.
     */
    public void setTaskNo(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_confirm_history.task_no</code>.
     */
    public String getTaskNo() {
        return (String) get(4);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_confirm_history.request_time</code>.
     */
    public void setRequestTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_confirm_history.request_time</code>.
     */
    public Timestamp getRequestTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_confirm_history.confirm_time</code>.
     */
    public void setConfirmTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_confirm_history.confirm_time</code>.
     */
    public Timestamp getConfirmTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_confirm_history.duration</code>.
     */
    public void setDuration(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_confirm_history.duration</code>.
     */
    public Integer getDuration() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_confirm_history.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_confirm_history.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_confirm_history.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_confirm_history.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_confirm_history.confirm_source</code>.
     */
    public void setConfirmSource(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_confirm_history.confirm_source</code>.
     */
    public String getConfirmSource() {
        return (String) get(10);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_confirm_history.user_id</code>.
     */
    public void setUserId(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_confirm_history.user_id</code>.
     */
    public String getUserId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>invoice.inbound_invoice_confirm_history.file_id</code>.
     */
    public void setFileId(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>invoice.inbound_invoice_confirm_history.file_id</code>.
     */
    public String getFileId() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, String, String, Timestamp, Timestamp, Integer, Timestamp, Timestamp, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, String, String, Timestamp, Timestamp, Integer, Timestamp, Timestamp, String, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return InboundInvoiceConfirmHistory.INBOUND_INVOICE_CONFIRM_HISTORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InboundInvoiceConfirmHistory.INBOUND_INVOICE_CONFIRM_HISTORY.INVOICE_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return InboundInvoiceConfirmHistory.INBOUND_INVOICE_CONFIRM_HISTORY.INVOICE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InboundInvoiceConfirmHistory.INBOUND_INVOICE_CONFIRM_HISTORY.BUYER_TAX_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return InboundInvoiceConfirmHistory.INBOUND_INVOICE_CONFIRM_HISTORY.TASK_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return InboundInvoiceConfirmHistory.INBOUND_INVOICE_CONFIRM_HISTORY.REQUEST_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return InboundInvoiceConfirmHistory.INBOUND_INVOICE_CONFIRM_HISTORY.CONFIRM_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return InboundInvoiceConfirmHistory.INBOUND_INVOICE_CONFIRM_HISTORY.DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return InboundInvoiceConfirmHistory.INBOUND_INVOICE_CONFIRM_HISTORY.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return InboundInvoiceConfirmHistory.INBOUND_INVOICE_CONFIRM_HISTORY.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return InboundInvoiceConfirmHistory.INBOUND_INVOICE_CONFIRM_HISTORY.CONFIRM_SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return InboundInvoiceConfirmHistory.INBOUND_INVOICE_CONFIRM_HISTORY.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return InboundInvoiceConfirmHistory.INBOUND_INVOICE_CONFIRM_HISTORY.FILE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getInvoiceNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getInvoiceCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBuyerTaxNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTaskNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getRequestTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getConfirmTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getDuration();
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
    public String value11() {
        return getConfirmSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getFileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoiceConfirmHistoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoiceConfirmHistoryRecord value2(String value) {
        setInvoiceNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoiceConfirmHistoryRecord value3(String value) {
        setInvoiceCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoiceConfirmHistoryRecord value4(String value) {
        setBuyerTaxNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoiceConfirmHistoryRecord value5(String value) {
        setTaskNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoiceConfirmHistoryRecord value6(Timestamp value) {
        setRequestTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoiceConfirmHistoryRecord value7(Timestamp value) {
        setConfirmTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoiceConfirmHistoryRecord value8(Integer value) {
        setDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoiceConfirmHistoryRecord value9(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoiceConfirmHistoryRecord value10(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoiceConfirmHistoryRecord value11(String value) {
        setConfirmSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoiceConfirmHistoryRecord value12(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoiceConfirmHistoryRecord value13(String value) {
        setFileId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundInvoiceConfirmHistoryRecord values(Long value1, String value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7, Integer value8, Timestamp value9, Timestamp value10, String value11, String value12, String value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InboundInvoiceConfirmHistoryRecord
     */
    public InboundInvoiceConfirmHistoryRecord() {
        super(InboundInvoiceConfirmHistory.INBOUND_INVOICE_CONFIRM_HISTORY);
    }

    /**
     * Create a detached, initialised InboundInvoiceConfirmHistoryRecord
     */
    public InboundInvoiceConfirmHistoryRecord(Long id, String invoiceNumber, String invoiceCode, String buyerTaxNumber, String taskNo, Timestamp requestTime, Timestamp confirmTime, Integer duration, Timestamp createTime, Timestamp updateTime, String confirmSource, String userId, String fileId) {
        super(InboundInvoiceConfirmHistory.INBOUND_INVOICE_CONFIRM_HISTORY);

        set(0, id);
        set(1, invoiceNumber);
        set(2, invoiceCode);
        set(3, buyerTaxNumber);
        set(4, taskNo);
        set(5, requestTime);
        set(6, confirmTime);
        set(7, duration);
        set(8, createTime);
        set(9, updateTime);
        set(10, confirmSource);
        set(11, userId);
        set(12, fileId);
    }
}
