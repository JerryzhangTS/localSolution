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
import library.tables.records.NotificationCenterMessageRecord;

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
public class NotificationCenterMessage extends TableImpl<NotificationCenterMessageRecord> {

    private static final long serialVersionUID = 195448704;

    /**
     * The reference instance of <code>invoice.notification_center_message</code>
     */
    public static final NotificationCenterMessage NOTIFICATION_CENTER_MESSAGE = new NotificationCenterMessage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NotificationCenterMessageRecord> getRecordType() {
        return NotificationCenterMessageRecord.class;
    }

    /**
     * The column <code>invoice.notification_center_message.id</code>. 唯一标识符
     */
    public final TableField<NotificationCenterMessageRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "唯一标识符");

    /**
     * The column <code>invoice.notification_center_message.message_type</code>. 消息类型
     */
    public final TableField<NotificationCenterMessageRecord, String> MESSAGE_TYPE = createField("message_type", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "消息类型");

    /**
     * The column <code>invoice.notification_center_message.notify_time</code>. 通知时间
     */
    public final TableField<NotificationCenterMessageRecord, Timestamp> NOTIFY_TIME = createField("notify_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "通知时间");

    /**
     * The column <code>invoice.notification_center_message.context</code>. 消息内容
     */
    public final TableField<NotificationCenterMessageRecord, String> CONTEXT = createField("context", org.jooq.impl.SQLDataType.CLOB, this, "消息内容");

    /**
     * The column <code>invoice.notification_center_message.read_status</code>. 已读未读状态
     */
    public final TableField<NotificationCenterMessageRecord, String> READ_STATUS = createField("read_status", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "已读未读状态");

    /**
     * The column <code>invoice.notification_center_message.business_type</code>. 发票类型AP AR EXP
     */
    public final TableField<NotificationCenterMessageRecord, String> BUSINESS_TYPE = createField("business_type", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "发票类型AP AR EXP");

    /**
     * The column <code>invoice.notification_center_message.tenant_id</code>.
     */
    public final TableField<NotificationCenterMessageRecord, String> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>invoice.notification_center_message.create_by</code>.
     */
    public final TableField<NotificationCenterMessageRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.notification_center_message.create_time</code>.
     */
    public final TableField<NotificationCenterMessageRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>invoice.notification_center_message.update_by</code>.
     */
    public final TableField<NotificationCenterMessageRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.notification_center_message.update_time</code>.
     */
    public final TableField<NotificationCenterMessageRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>invoice.notification_center_message</code> table reference
     */
    public NotificationCenterMessage() {
        this("notification_center_message", null);
    }

    /**
     * Create an aliased <code>invoice.notification_center_message</code> table reference
     */
    public NotificationCenterMessage(String alias) {
        this(alias, NOTIFICATION_CENTER_MESSAGE);
    }

    private NotificationCenterMessage(String alias, Table<NotificationCenterMessageRecord> aliased) {
        this(alias, aliased, null);
    }

    private NotificationCenterMessage(String alias, Table<NotificationCenterMessageRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<NotificationCenterMessageRecord> getPrimaryKey() {
        return Keys.KEY_NOTIFICATION_CENTER_MESSAGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<NotificationCenterMessageRecord>> getKeys() {
        return Arrays.<UniqueKey<NotificationCenterMessageRecord>>asList(Keys.KEY_NOTIFICATION_CENTER_MESSAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotificationCenterMessage as(String alias) {
        return new NotificationCenterMessage(alias, this);
    }

    /**
     * Rename this table
     */
    public NotificationCenterMessage rename(String name) {
        return new NotificationCenterMessage(name, null);
    }
}