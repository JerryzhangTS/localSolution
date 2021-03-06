/**
 * This class is generated by jOOQ
 */
package library.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import library.tables.RuleParam;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class RuleParamRecord extends UpdatableRecordImpl<RuleParamRecord> implements Record7<String, String, String, Timestamp, Timestamp, String, String> {

    private static final long serialVersionUID = -1051686714;

    /**
     * Setter for <code>invoice.rule_param.rule_id</code>.
     */
    public void setRuleId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>invoice.rule_param.rule_id</code>.
     */
    public String getRuleId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>invoice.rule_param.rule_param_name</code>.
     */
    public void setRuleParamName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>invoice.rule_param.rule_param_name</code>.
     */
    public String getRuleParamName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>invoice.rule_param.rule_param_type</code>.
     */
    public void setRuleParamType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>invoice.rule_param.rule_param_type</code>.
     */
    public String getRuleParamType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>invoice.rule_param.created_time</code>.
     */
    public void setCreatedTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>invoice.rule_param.created_time</code>.
     */
    public Timestamp getCreatedTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>invoice.rule_param.updated_time</code>.
     */
    public void setUpdatedTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>invoice.rule_param.updated_time</code>.
     */
    public Timestamp getUpdatedTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>invoice.rule_param.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>invoice.rule_param.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>invoice.rule_param.updated_by</code>.
     */
    public void setUpdatedBy(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>invoice.rule_param.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Timestamp, Timestamp, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Timestamp, Timestamp, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return RuleParam.RULE_PARAM.RULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RuleParam.RULE_PARAM.RULE_PARAM_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RuleParam.RULE_PARAM.RULE_PARAM_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return RuleParam.RULE_PARAM.CREATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return RuleParam.RULE_PARAM.UPDATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return RuleParam.RULE_PARAM.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return RuleParam.RULE_PARAM.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRuleParamName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRuleParamType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleParamRecord value1(String value) {
        setRuleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleParamRecord value2(String value) {
        setRuleParamName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleParamRecord value3(String value) {
        setRuleParamType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleParamRecord value4(Timestamp value) {
        setCreatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleParamRecord value5(Timestamp value) {
        setUpdatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleParamRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleParamRecord value7(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleParamRecord values(String value1, String value2, String value3, Timestamp value4, Timestamp value5, String value6, String value7) {
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
     * Create a detached RuleParamRecord
     */
    public RuleParamRecord() {
        super(RuleParam.RULE_PARAM);
    }

    /**
     * Create a detached, initialised RuleParamRecord
     */
    public RuleParamRecord(String ruleId, String ruleParamName, String ruleParamType, Timestamp createdTime, Timestamp updatedTime, String createdBy, String updatedBy) {
        super(RuleParam.RULE_PARAM);

        set(0, ruleId);
        set(1, ruleParamName);
        set(2, ruleParamType);
        set(3, createdTime);
        set(4, updatedTime);
        set(5, createdBy);
        set(6, updatedBy);
    }
}
