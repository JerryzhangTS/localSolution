/**
 * This class is generated by jOOQ
 */
package library.tables.records;


import javax.annotation.Generated;

import library.tables.RuleScript;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class RuleScriptRecord extends UpdatableRecordImpl<RuleScriptRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 742758492;

    /**
     * Setter for <code>invoice.rule_script.rule_id</code>.
     */
    public void setRuleId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>invoice.rule_script.rule_id</code>.
     */
    public String getRuleId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>invoice.rule_script.expression</code>.
     */
    public void setExpression(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>invoice.rule_script.expression</code>.
     */
    public String getExpression() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return RuleScript.RULE_SCRIPT.RULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RuleScript.RULE_SCRIPT.EXPRESSION;
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
        return getExpression();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleScriptRecord value1(String value) {
        setRuleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleScriptRecord value2(String value) {
        setExpression(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleScriptRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RuleScriptRecord
     */
    public RuleScriptRecord() {
        super(RuleScript.RULE_SCRIPT);
    }

    /**
     * Create a detached, initialised RuleScriptRecord
     */
    public RuleScriptRecord(String ruleId, String expression) {
        super(RuleScript.RULE_SCRIPT);

        set(0, ruleId);
        set(1, expression);
    }
}
