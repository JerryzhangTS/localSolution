/**
 * This class is generated by jOOQ
 */
package library.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import library.tables.DocumentProfileInfo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 文档附加信息规则的标签及信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DocumentProfileInfoRecord extends UpdatableRecordImpl<DocumentProfileInfoRecord> implements Record10<Long, String, String, String, String, String, String, Timestamp, String, Timestamp> {

    private static final long serialVersionUID = -1337931047;

    /**
     * Setter for <code>invoice.document_profile_info.id</code>. 唯一标识符
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>invoice.document_profile_info.id</code>. 唯一标识符
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>invoice.document_profile_info.profile_id</code>. 关联的规则id
     */
    public void setProfileId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>invoice.document_profile_info.profile_id</code>. 关联的规则id
     */
    public String getProfileId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>invoice.document_profile_info.language</code>. 语言
     */
    public void setLanguage(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>invoice.document_profile_info.language</code>. 语言
     */
    public String getLanguage() {
        return (String) get(2);
    }

    /**
     * Setter for <code>invoice.document_profile_info.label</code>. 标签
     */
    public void setLabel(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>invoice.document_profile_info.label</code>. 标签
     */
    public String getLabel() {
        return (String) get(3);
    }

    /**
     * Setter for <code>invoice.document_profile_info.error_message</code>. 错误信息
     */
    public void setErrorMessage(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>invoice.document_profile_info.error_message</code>. 错误信息
     */
    public String getErrorMessage() {
        return (String) get(4);
    }

    /**
     * Setter for <code>invoice.document_profile_info.tooltips</code>. 提示信息
     */
    public void setTooltips(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>invoice.document_profile_info.tooltips</code>. 提示信息
     */
    public String getTooltips() {
        return (String) get(5);
    }

    /**
     * Setter for <code>invoice.document_profile_info.create_by</code>.
     */
    public void setCreateBy(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>invoice.document_profile_info.create_by</code>.
     */
    public String getCreateBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>invoice.document_profile_info.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>invoice.document_profile_info.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>invoice.document_profile_info.update_by</code>.
     */
    public void setUpdateBy(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>invoice.document_profile_info.update_by</code>.
     */
    public String getUpdateBy() {
        return (String) get(8);
    }

    /**
     * Setter for <code>invoice.document_profile_info.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>invoice.document_profile_info.update_time</code>.
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
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, String, String, String, String, String, String, Timestamp, String, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, String, String, String, String, String, String, Timestamp, String, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return DocumentProfileInfo.DOCUMENT_PROFILE_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DocumentProfileInfo.DOCUMENT_PROFILE_INFO.PROFILE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DocumentProfileInfo.DOCUMENT_PROFILE_INFO.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DocumentProfileInfo.DOCUMENT_PROFILE_INFO.LABEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DocumentProfileInfo.DOCUMENT_PROFILE_INFO.ERROR_MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DocumentProfileInfo.DOCUMENT_PROFILE_INFO.TOOLTIPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DocumentProfileInfo.DOCUMENT_PROFILE_INFO.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return DocumentProfileInfo.DOCUMENT_PROFILE_INFO.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return DocumentProfileInfo.DOCUMENT_PROFILE_INFO.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return DocumentProfileInfo.DOCUMENT_PROFILE_INFO.UPDATE_TIME;
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
        return getProfileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLabel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getErrorMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTooltips();
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
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getUpdateBy();
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
    public DocumentProfileInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentProfileInfoRecord value2(String value) {
        setProfileId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentProfileInfoRecord value3(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentProfileInfoRecord value4(String value) {
        setLabel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentProfileInfoRecord value5(String value) {
        setErrorMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentProfileInfoRecord value6(String value) {
        setTooltips(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentProfileInfoRecord value7(String value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentProfileInfoRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentProfileInfoRecord value9(String value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentProfileInfoRecord value10(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentProfileInfoRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, Timestamp value8, String value9, Timestamp value10) {
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
     * Create a detached DocumentProfileInfoRecord
     */
    public DocumentProfileInfoRecord() {
        super(DocumentProfileInfo.DOCUMENT_PROFILE_INFO);
    }

    /**
     * Create a detached, initialised DocumentProfileInfoRecord
     */
    public DocumentProfileInfoRecord(Long id, String profileId, String language, String label, String errorMessage, String tooltips, String createBy, Timestamp createTime, String updateBy, Timestamp updateTime) {
        super(DocumentProfileInfo.DOCUMENT_PROFILE_INFO);

        set(0, id);
        set(1, profileId);
        set(2, language);
        set(3, label);
        set(4, errorMessage);
        set(5, tooltips);
        set(6, createBy);
        set(7, createTime);
        set(8, updateBy);
        set(9, updateTime);
    }
}
