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
import library.tables.records.DistributeTransactionHistoryRecord;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 业务事务进程历史表。
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DistributeTransactionHistory extends TableImpl<DistributeTransactionHistoryRecord> {

    private static final long serialVersionUID = -1745976255;

    /**
     * The reference instance of <code>invoice.distribute_transaction_history</code>
     */
    public static final DistributeTransactionHistory DISTRIBUTE_TRANSACTION_HISTORY = new DistributeTransactionHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DistributeTransactionHistoryRecord> getRecordType() {
        return DistributeTransactionHistoryRecord.class;
    }

    /**
     * The column <code>invoice.distribute_transaction_history.id</code>. 分布式事务历史表唯一标识
     */
    public final TableField<DistributeTransactionHistoryRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "分布式事务历史表唯一标识");

    /**
     * The column <code>invoice.distribute_transaction_history.distribute_transaction_id</code>. distribute_transaction表的外键
     */
    public final TableField<DistributeTransactionHistoryRecord, String> DISTRIBUTE_TRANSACTION_ID = createField("distribute_transaction_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "distribute_transaction表的外键");

    /**
     * The column <code>invoice.distribute_transaction_history.object_id</code>. 原始对象的id
     */
    public final TableField<DistributeTransactionHistoryRecord, String> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "原始对象的id");

    /**
     * The column <code>invoice.distribute_transaction_history.is_async</code>.
     */
    public final TableField<DistributeTransactionHistoryRecord, Byte> IS_ASYNC = createField("is_async", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>invoice.distribute_transaction_history.business_type</code>. 业务类型
     */
    public final TableField<DistributeTransactionHistoryRecord, String> BUSINESS_TYPE = createField("business_type", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "业务类型");

    /**
     * The column <code>invoice.distribute_transaction_history.status</code>. 事务状态：PROCESSING, PERMANENTLY_FAILED, FAILED, SUCCESS
     */
    public final TableField<DistributeTransactionHistoryRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.CHAR.length(20), this, "事务状态：PROCESSING, PERMANENTLY_FAILED, FAILED, SUCCESS");

    /**
     * The column <code>invoice.distribute_transaction_history.is_validation_error</code>. 是否验证异常
     */
    public final TableField<DistributeTransactionHistoryRecord, Byte> IS_VALIDATION_ERROR = createField("is_validation_error", org.jooq.impl.SQLDataType.TINYINT, this, "是否验证异常");

    /**
     * The column <code>invoice.distribute_transaction_history.error_code</code>. 错误代码
     */
    public final TableField<DistributeTransactionHistoryRecord, String> ERROR_CODE = createField("error_code", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "错误代码");

    /**
     * The column <code>invoice.distribute_transaction_history.error_message</code>. 错误详细信息
     */
    public final TableField<DistributeTransactionHistoryRecord, String> ERROR_MESSAGE = createField("error_message", org.jooq.impl.SQLDataType.CLOB, this, "错误详细信息");

    /**
     * The column <code>invoice.distribute_transaction_history.retry_time</code>. 重试次数
     */
    public final TableField<DistributeTransactionHistoryRecord, Integer> RETRY_TIME = createField("retry_time", org.jooq.impl.SQLDataType.INTEGER, this, "重试次数");

    /**
     * The column <code>invoice.distribute_transaction_history.max_retry_time</code>. 最大重试次数
     */
    public final TableField<DistributeTransactionHistoryRecord, Integer> MAX_RETRY_TIME = createField("max_retry_time", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("3", org.jooq.impl.SQLDataType.INTEGER)), this, "最大重试次数");

    /**
     * The column <code>invoice.distribute_transaction_history.param</code>. 参数
     */
    public final TableField<DistributeTransactionHistoryRecord, String> PARAM = createField("param", org.jooq.impl.SQLDataType.CLOB, this, "参数");

    /**
     * The column <code>invoice.distribute_transaction_history.tenant_id</code>.
     */
    public final TableField<DistributeTransactionHistoryRecord, String> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>invoice.distribute_transaction_history.user_id</code>.
     */
    public final TableField<DistributeTransactionHistoryRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.distribute_transaction_history.created_by</code>.
     */
    public final TableField<DistributeTransactionHistoryRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.distribute_transaction_history.updated_by</code>.
     */
    public final TableField<DistributeTransactionHistoryRecord, String> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.distribute_transaction_history.created_time</code>. 创建时间
     */
    public final TableField<DistributeTransactionHistoryRecord, Timestamp> CREATED_TIME = createField("created_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP(6)", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>invoice.distribute_transaction_history.updated_time</code>. 更新时间
     */
    public final TableField<DistributeTransactionHistoryRecord, Timestamp> UPDATED_TIME = createField("updated_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00.000000", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>invoice.distribute_transaction_history</code> table reference
     */
    public DistributeTransactionHistory() {
        this("distribute_transaction_history", null);
    }

    /**
     * Create an aliased <code>invoice.distribute_transaction_history</code> table reference
     */
    public DistributeTransactionHistory(String alias) {
        this(alias, DISTRIBUTE_TRANSACTION_HISTORY);
    }

    private DistributeTransactionHistory(String alias, Table<DistributeTransactionHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private DistributeTransactionHistory(String alias, Table<DistributeTransactionHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "业务事务进程历史表。");
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
    public UniqueKey<DistributeTransactionHistoryRecord> getPrimaryKey() {
        return Keys.KEY_DISTRIBUTE_TRANSACTION_HISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DistributeTransactionHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<DistributeTransactionHistoryRecord>>asList(Keys.KEY_DISTRIBUTE_TRANSACTION_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributeTransactionHistory as(String alias) {
        return new DistributeTransactionHistory(alias, this);
    }

    /**
     * Rename this table
     */
    public DistributeTransactionHistory rename(String name) {
        return new DistributeTransactionHistory(name, null);
    }
}
