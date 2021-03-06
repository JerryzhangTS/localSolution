/**
 * This class is generated by jOOQ
 */
package library.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import library.Invoice;
import library.Keys;
import library.tables.records.QrtzSchedulerStateRecord;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class QrtzSchedulerState extends TableImpl<QrtzSchedulerStateRecord> {

    private static final long serialVersionUID = -1077115946;

    /**
     * The reference instance of <code>invoice.QRTZ_SCHEDULER_STATE</code>
     */
    public static final QrtzSchedulerState QRTZ_SCHEDULER_STATE = new QrtzSchedulerState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QrtzSchedulerStateRecord> getRecordType() {
        return QrtzSchedulerStateRecord.class;
    }

    /**
     * The column <code>invoice.QRTZ_SCHEDULER_STATE.SCHED_NAME</code>.
     */
    public final TableField<QrtzSchedulerStateRecord, String> SCHED_NAME = createField("SCHED_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(120).nullable(false), this, "");

    /**
     * The column <code>invoice.QRTZ_SCHEDULER_STATE.INSTANCE_NAME</code>.
     */
    public final TableField<QrtzSchedulerStateRecord, String> INSTANCE_NAME = createField("INSTANCE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>invoice.QRTZ_SCHEDULER_STATE.LAST_CHECKIN_TIME</code>.
     */
    public final TableField<QrtzSchedulerStateRecord, Long> LAST_CHECKIN_TIME = createField("LAST_CHECKIN_TIME", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>invoice.QRTZ_SCHEDULER_STATE.CHECKIN_INTERVAL</code>.
     */
    public final TableField<QrtzSchedulerStateRecord, Long> CHECKIN_INTERVAL = createField("CHECKIN_INTERVAL", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>invoice.QRTZ_SCHEDULER_STATE</code> table reference
     */
    public QrtzSchedulerState() {
        this("QRTZ_SCHEDULER_STATE", null);
    }

    /**
     * Create an aliased <code>invoice.QRTZ_SCHEDULER_STATE</code> table reference
     */
    public QrtzSchedulerState(String alias) {
        this(alias, QRTZ_SCHEDULER_STATE);
    }

    private QrtzSchedulerState(String alias, Table<QrtzSchedulerStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private QrtzSchedulerState(String alias, Table<QrtzSchedulerStateRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<QrtzSchedulerStateRecord> getPrimaryKey() {
        return Keys.KEY_QRTZ_SCHEDULER_STATE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<QrtzSchedulerStateRecord>> getKeys() {
        return Arrays.<UniqueKey<QrtzSchedulerStateRecord>>asList(Keys.KEY_QRTZ_SCHEDULER_STATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QrtzSchedulerState as(String alias) {
        return new QrtzSchedulerState(alias, this);
    }

    /**
     * Rename this table
     */
    public QrtzSchedulerState rename(String name) {
        return new QrtzSchedulerState(name, null);
    }
}
