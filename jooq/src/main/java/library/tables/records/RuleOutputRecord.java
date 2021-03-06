/**
 * This class is generated by jOOQ
 */
package library.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import library.tables.RuleOutput;

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
public class RuleOutputRecord extends UpdatableRecordImpl<RuleOutputRecord> implements Record7<String, String, String, Timestamp, Timestamp, String, String> {

    private static final long serialVersionUID = -1668089770;

    /**
     * Setter for <code>invoice.rule_output.rule_id</code>.
     */
    public void setRuleId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>invoice.rule_output.rule_id</code>.
     */
    public String getRuleId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>invoice.rule_output.rule_output_name</code>.
     */
    public void setRuleOutputName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>invoice.rule_output.rule_output_name</code>.
     */
    public String getRuleOutputName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>invoice.rule_output.rule_output_type</code>.
     */
    public void setRuleOutputType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>invoice.rule_output.rule_output_type</code>.
     */
    public String getRuleOutputType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>invoice.rule_output.created_time</code>.
     */
    public void setCreatedTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>invoice.rule_output.created_time</code>.
     */
    public Timestamp getCreatedTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>invoice.rule_output.updated_time</code>.
     */
    public void setUpdatedTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>invoice.rule_output.updated_time</code>.
     */
    public Timestamp getUpdatedTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>invoice.rule_output.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>invoice.rule_output.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>invoice.rule_output.updated_by</code>.
     */
    public void setUpdatedBy(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>invoice.rule_output.updated_by</code>.
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
        return RuleOutput.RULE_OUTPUT.RULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RuleOutput.RULE_OUTPUT.RULE_OUTPUT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RuleOutput.RULE_OUTPUT.RULE_OUTPUT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return RuleOutput.RULE_OUTPUT.CREATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return RuleOutput.RULE_OUTPUT.UPDATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return RuleOutput.RULE_OUTPUT.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return RuleOutput.RULE_OUTPUT.UPDATED_BY;
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
        return getRuleOutputName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRuleOutputType();
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
    public RuleOutputRecord value1(String value) {
        setRuleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleOutputRecord value2(String value) {
        setRuleOutputName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleOutputRecord value3(String value) {
        setRuleOutputType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleOutputRecord value4(Timestamp value) {
        setCreatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleOutputRecord value5(Timestamp value) {
        setUpdatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleOutputRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleOutputRecord value7(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleOutputRecord values(String value1, String value2, String value3, Timestamp value4, Timestamp value5, String value6, String value7) {
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
     * Create a detached RuleOutputRecord
     */
    public RuleOutputRecord() {
        super(RuleOutput.RULE_OUTPUT);
    }

    /**
     * Create a detached, initialised RuleOutputRecord
     */
    public RuleOutputRecord(String ruleId, String ruleOutputName, String ruleOutputType, Timestamp createdTime, Timestamp updatedTime, String createdBy, String updatedBy) {
        super(RuleOutput.RULE_OUTPUT);

        set(0, ruleId);
        set(1, ruleOutputName);
        set(2, ruleOutputType);
        set(3, createdTime);
        set(4, updatedTime);
        set(5, createdBy);
        set(6, updatedBy);
    }
}
