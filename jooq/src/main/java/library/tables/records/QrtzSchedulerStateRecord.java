/**
 * This class is generated by jOOQ
 */
package library.tables.records;


import javax.annotation.Generated;

import library.tables.QrtzSchedulerState;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class QrtzSchedulerStateRecord extends UpdatableRecordImpl<QrtzSchedulerStateRecord> implements Record4<String, String, Long, Long> {

    private static final long serialVersionUID = 861870786;

    /**
     * Setter for <code>invoice.QRTZ_SCHEDULER_STATE.SCHED_NAME</code>.
     */
    public void setSchedName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>invoice.QRTZ_SCHEDULER_STATE.SCHED_NAME</code>.
     */
    public String getSchedName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>invoice.QRTZ_SCHEDULER_STATE.INSTANCE_NAME</code>.
     */
    public void setInstanceName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>invoice.QRTZ_SCHEDULER_STATE.INSTANCE_NAME</code>.
     */
    public String getInstanceName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>invoice.QRTZ_SCHEDULER_STATE.LAST_CHECKIN_TIME</code>.
     */
    public void setLastCheckinTime(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>invoice.QRTZ_SCHEDULER_STATE.LAST_CHECKIN_TIME</code>.
     */
    public Long getLastCheckinTime() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>invoice.QRTZ_SCHEDULER_STATE.CHECKIN_INTERVAL</code>.
     */
    public void setCheckinInterval(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>invoice.QRTZ_SCHEDULER_STATE.CHECKIN_INTERVAL</code>.
     */
    public Long getCheckinInterval() {
        return (Long) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Long, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return QrtzSchedulerState.QRTZ_SCHEDULER_STATE.SCHED_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return QrtzSchedulerState.QRTZ_SCHEDULER_STATE.INSTANCE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return QrtzSchedulerState.QRTZ_SCHEDULER_STATE.LAST_CHECKIN_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return QrtzSchedulerState.QRTZ_SCHEDULER_STATE.CHECKIN_INTERVAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSchedName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getInstanceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getLastCheckinTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getCheckinInterval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QrtzSchedulerStateRecord value1(String value) {
        setSchedName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QrtzSchedulerStateRecord value2(String value) {
        setInstanceName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QrtzSchedulerStateRecord value3(Long value) {
        setLastCheckinTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QrtzSchedulerStateRecord value4(Long value) {
        setCheckinInterval(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QrtzSchedulerStateRecord values(String value1, String value2, Long value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QrtzSchedulerStateRecord
     */
    public QrtzSchedulerStateRecord() {
        super(QrtzSchedulerState.QRTZ_SCHEDULER_STATE);
    }

    /**
     * Create a detached, initialised QrtzSchedulerStateRecord
     */
    public QrtzSchedulerStateRecord(String schedName, String instanceName, Long lastCheckinTime, Long checkinInterval) {
        super(QrtzSchedulerState.QRTZ_SCHEDULER_STATE);

        set(0, schedName);
        set(1, instanceName);
        set(2, lastCheckinTime);
        set(3, checkinInterval);
    }
}
