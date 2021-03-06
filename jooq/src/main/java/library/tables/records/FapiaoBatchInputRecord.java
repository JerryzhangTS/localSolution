/**
 * This class is generated by jOOQ
 */
package library.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import library.tables.FapiaoBatchInput;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 发票批量录入文件索引表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FapiaoBatchInputRecord extends UpdatableRecordImpl<FapiaoBatchInputRecord> implements Record21<String, String, String, String, Timestamp, String, String, String, String, Timestamp, Timestamp, Boolean, Timestamp, String, Timestamp, String, Integer, Boolean, String, Long, String> {

    private static final long serialVersionUID = -2052087276;

    /**
     * Setter for <code>invoice.fapiao_batch_input.id</code>. 主键唯一ID
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.id</code>. 主键唯一ID
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.reference</code>. 文件实体引用
     */
    public void setReference(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.reference</code>. 文件实体引用
     */
    public String getReference() {
        return (String) get(1);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.tenant_id</code>. 租户ID
     */
    public void setTenantId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.tenant_id</code>. 租户ID
     */
    public String getTenantId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.input_user_id</code>. 录入用户ID
     */
    public void setInputUserId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.input_user_id</code>. 录入用户ID
     */
    public String getInputUserId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.input_time</code>. 录入时间
     */
    public void setInputTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.input_time</code>. 录入时间
     */
    public Timestamp getInputTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.business_type</code>. 录入需要处理的业务类型
     */
    public void setBusinessType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.business_type</code>. 录入需要处理的业务类型
     */
    public String getBusinessType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.file_name</code>. 录入文件名
     */
    public void setFileName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.file_name</code>. 录入文件名
     */
    public String getFileName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.file_type</code>. 录入文类型
     */
    public void setFileType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.file_type</code>. 录入文类型
     */
    public String getFileType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.file_size</code>. 录入文件大小
     */
    public void setFileSize(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.file_size</code>. 录入文件大小
     */
    public String getFileSize() {
        return (String) get(8);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.process_start_time</code>. 文件开始处理时间
     */
    public void setProcessStartTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.process_start_time</code>. 文件开始处理时间
     */
    public Timestamp getProcessStartTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.process_end_time</code>. 文件处理结束时间
     */
    public void setProcessEndTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.process_end_time</code>. 文件处理结束时间
     */
    public Timestamp getProcessEndTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.processed</code>. 是否已被处理
     */
    public void setProcessed(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.processed</code>. 是否已被处理
     */
    public Boolean getProcessed() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.create_time</code>. 记录创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.create_time</code>. 记录创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.create_by</code>. 记录创建者
     */
    public void setCreateBy(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.create_by</code>. 记录创建者
     */
    public String getCreateBy() {
        return (String) get(13);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.update_time</code>. 记录更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.update_time</code>. 记录更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.update_by</code>. 记录更新者
     */
    public void setUpdateBy(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.update_by</code>. 记录更新者
     */
    public String getUpdateBy() {
        return (String) get(15);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.total_lines</code>. 发票全票面信息
     */
    public void setTotalLines(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.total_lines</code>. 发票全票面信息
     */
    public Integer getTotalLines() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.voided</code>. 逻辑删除标记位
     */
    public void setVoided(Boolean value) {
        set(17, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.voided</code>. 逻辑删除标记位
     */
    public Boolean getVoided() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.error_message</code>. 批处理错误信息
     */
    public void setErrorMessage(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.error_message</code>. 批处理错误信息
     */
    public String getErrorMessage() {
        return (String) get(18);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.thread_id</code>. 批处理错误信息
     */
    public void setThreadId(Long value) {
        set(19, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.thread_id</code>. 批处理错误信息
     */
    public Long getThreadId() {
        return (Long) get(19);
    }

    /**
     * Setter for <code>invoice.fapiao_batch_input.channel_name</code>. 发票数据录入来源航信或百望
     */
    public void setChannelName(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>invoice.fapiao_batch_input.channel_name</code>. 发票数据录入来源航信或百望
     */
    public String getChannelName() {
        return (String) get(20);
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
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<String, String, String, String, Timestamp, String, String, String, String, Timestamp, Timestamp, Boolean, Timestamp, String, Timestamp, String, Integer, Boolean, String, Long, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<String, String, String, String, Timestamp, String, String, String, String, Timestamp, Timestamp, Boolean, Timestamp, String, Timestamp, String, Integer, Boolean, String, Long, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.REFERENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.TENANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.INPUT_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.INPUT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.BUSINESS_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.FILE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.FILE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.PROCESS_START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.PROCESS_END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.PROCESSED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.TOTAL_LINES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field18() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.VOIDED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.ERROR_MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field20() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return FapiaoBatchInput.FAPIAO_BATCH_INPUT.CHANNEL_NAME;
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
        return getReference();
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
    public String value6() {
        return getBusinessType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getFileType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getFileSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getProcessStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getProcessEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getProcessed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getTotalLines();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value18() {
        return getVoided();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getErrorMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value20() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getChannelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value2(String value) {
        setReference(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value3(String value) {
        setTenantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value4(String value) {
        setInputUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value5(Timestamp value) {
        setInputTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value6(String value) {
        setBusinessType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value7(String value) {
        setFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value8(String value) {
        setFileType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value9(String value) {
        setFileSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value10(Timestamp value) {
        setProcessStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value11(Timestamp value) {
        setProcessEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value12(Boolean value) {
        setProcessed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value13(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value14(String value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value15(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value16(String value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value17(Integer value) {
        setTotalLines(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value18(Boolean value) {
        setVoided(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value19(String value) {
        setErrorMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value20(Long value) {
        setThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord value21(String value) {
        setChannelName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FapiaoBatchInputRecord values(String value1, String value2, String value3, String value4, Timestamp value5, String value6, String value7, String value8, String value9, Timestamp value10, Timestamp value11, Boolean value12, Timestamp value13, String value14, Timestamp value15, String value16, Integer value17, Boolean value18, String value19, Long value20, String value21) {
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
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FapiaoBatchInputRecord
     */
    public FapiaoBatchInputRecord() {
        super(FapiaoBatchInput.FAPIAO_BATCH_INPUT);
    }

    /**
     * Create a detached, initialised FapiaoBatchInputRecord
     */
    public FapiaoBatchInputRecord(String id, String reference, String tenantId, String inputUserId, Timestamp inputTime, String businessType, String fileName, String fileType, String fileSize, Timestamp processStartTime, Timestamp processEndTime, Boolean processed, Timestamp createTime, String createBy, Timestamp updateTime, String updateBy, Integer totalLines, Boolean voided, String errorMessage, Long threadId, String channelName) {
        super(FapiaoBatchInput.FAPIAO_BATCH_INPUT);

        set(0, id);
        set(1, reference);
        set(2, tenantId);
        set(3, inputUserId);
        set(4, inputTime);
        set(5, businessType);
        set(6, fileName);
        set(7, fileType);
        set(8, fileSize);
        set(9, processStartTime);
        set(10, processEndTime);
        set(11, processed);
        set(12, createTime);
        set(13, createBy);
        set(14, updateTime);
        set(15, updateBy);
        set(16, totalLines);
        set(17, voided);
        set(18, errorMessage);
        set(19, threadId);
        set(20, channelName);
    }
}
