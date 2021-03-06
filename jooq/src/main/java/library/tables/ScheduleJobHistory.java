/**
 * This class is generated by jOOQ
 */
package library.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import library.Invoice;
import library.Keys;
import library.tables.records.ScheduleJobHistoryRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


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
public class ScheduleJobHistory extends TableImpl<ScheduleJobHistoryRecord> {

    private static final long serialVersionUID = 1716300039;

    /**
     * The reference instance of <code>invoice.schedule_job_history</code>
     */
    public static final ScheduleJobHistory SCHEDULE_JOB_HISTORY = new ScheduleJobHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScheduleJobHistoryRecord> getRecordType() {
        return ScheduleJobHistoryRecord.class;
    }

    /**
     * The column <code>invoice.schedule_job_history.id</code>.
     */
    public final TableField<ScheduleJobHistoryRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>invoice.schedule_job_history.object_id</code>.
     */
    public final TableField<ScheduleJobHistoryRecord, String> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>invoice.schedule_job_history.schedule_type</code>.
     */
    public final TableField<ScheduleJobHistoryRecord, String> SCHEDULE_TYPE = createField("schedule_type", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>invoice.schedule_job_history.tenant_id</code>.
     */
    public final TableField<ScheduleJobHistoryRecord, String> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.schedule_job_history.user_id</code>.
     */
    public final TableField<ScheduleJobHistoryRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.schedule_job_history.action</code>.
     */
    public final TableField<ScheduleJobHistoryRecord, String> ACTION = createField("action", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>invoice.schedule_job_history.change_time</code>.
     */
    public final TableField<ScheduleJobHistoryRecord, Timestamp> CHANGE_TIME = createField("change_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>invoice.schedule_job_history.status_old</code>.
     */
    public final TableField<ScheduleJobHistoryRecord, String> STATUS_OLD = createField("status_old", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

    /**
     * The column <code>invoice.schedule_job_history.status_new</code>.
     */
    public final TableField<ScheduleJobHistoryRecord, String> STATUS_NEW = createField("status_new", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

    /**
     * The column <code>invoice.schedule_job_history.parameters_old</code>.
     */
    public final TableField<ScheduleJobHistoryRecord, String> PARAMETERS_OLD = createField("parameters_old", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>invoice.schedule_job_history.parameters_new</code>.
     */
    public final TableField<ScheduleJobHistoryRecord, String> PARAMETERS_NEW = createField("parameters_new", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>invoice.schedule_job_history.scheduled_next_time_old</code>.
     */
    public final TableField<ScheduleJobHistoryRecord, Timestamp> SCHEDULED_NEXT_TIME_OLD = createField("scheduled_next_time_old", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>invoice.schedule_job_history.scheduled_next_time_new</code>.
     */
    public final TableField<ScheduleJobHistoryRecord, Timestamp> SCHEDULED_NEXT_TIME_NEW = createField("scheduled_next_time_new", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>invoice.schedule_job_history</code> table reference
     */
    public ScheduleJobHistory() {
        this("schedule_job_history", null);
    }

    /**
     * Create an aliased <code>invoice.schedule_job_history</code> table reference
     */
    public ScheduleJobHistory(String alias) {
        this(alias, SCHEDULE_JOB_HISTORY);
    }

    private ScheduleJobHistory(String alias, Table<ScheduleJobHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScheduleJobHistory(String alias, Table<ScheduleJobHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Invoice.INVOICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ScheduleJobHistoryRecord, ULong> getIdentity() {
        return Keys.IDENTITY_SCHEDULE_JOB_HISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ScheduleJobHistoryRecord> getPrimaryKey() {
        return Keys.KEY_SCHEDULE_JOB_HISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScheduleJobHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<ScheduleJobHistoryRecord>>asList(Keys.KEY_SCHEDULE_JOB_HISTORY_PRIMARY, Keys.KEY_SCHEDULE_JOB_HISTORY_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ScheduleJobHistoryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ScheduleJobHistoryRecord, ?>>asList(Keys.SCHEDULE_JOB_HISTORY_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduleJobHistory as(String alias) {
        return new ScheduleJobHistory(alias, this);
    }

    /**
     * Rename this table
     */
    public ScheduleJobHistory rename(String name) {
        return new ScheduleJobHistory(name, null);
    }
}
