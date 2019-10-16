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
import library.tables.records.InvoiceMasterRecord;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 发票列表主表，用以记录各类发票索引数据。
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InvoiceMaster extends TableImpl<InvoiceMasterRecord> {

    private static final long serialVersionUID = -666849681;

    /**
     * The reference instance of <code>invoice.invoice_master</code>
     */
    public static final InvoiceMaster INVOICE_MASTER = new InvoiceMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InvoiceMasterRecord> getRecordType() {
        return InvoiceMasterRecord.class;
    }

    /**
     * The column <code>invoice.invoice_master.id</code>. 发票唯一标识
     */
    public final TableField<InvoiceMasterRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "发票唯一标识");

    /**
     * The column <code>invoice.invoice_master.iid</code>. 发票内联键，比如拷贝的发票该列数据会引用原始的ID，标识该票是从原始哪张票拷贝获得。默认情况ID和IID值相同。
     */
    public final TableField<InvoiceMasterRecord, String> IID = createField("iid", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "发票内联键，比如拷贝的发票该列数据会引用原始的ID，标识该票是从原始哪张票拷贝获得。默认情况ID和IID值相同。");

    /**
     * The column <code>invoice.invoice_master.business_type</code>.
     */
    public final TableField<InvoiceMasterRecord, String> BUSINESS_TYPE = createField("business_type", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

    /**
     * The column <code>invoice.invoice_master.tenant_id</code>. 发票所属租户ID
     */
    public final TableField<InvoiceMasterRecord, String> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "发票所属租户ID");

    /**
     * The column <code>invoice.invoice_master.invoice_category</code>. 发票类别，标识发票类别
     */
    public final TableField<InvoiceMasterRecord, String> INVOICE_CATEGORY = createField("invoice_category", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "发票类别，标识发票类别");

    /**
     * The column <code>invoice.invoice_master.image_related_flag</code>. 影像关联标记位
     */
    public final TableField<InvoiceMasterRecord, Short> IMAGE_RELATED_FLAG = createField("image_related_flag", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "影像关联标记位");

    /**
     * The column <code>invoice.invoice_master.image_flag</code>. 影像关联标记位
     */
    public final TableField<InvoiceMasterRecord, Short> IMAGE_FLAG = createField("image_flag", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "影像关联标记位");

    /**
     * The column <code>invoice.invoice_master.compliance_status</code>. 合规性检查状态
     */
    public final TableField<InvoiceMasterRecord, String> COMPLIANCE_STATUS = createField("compliance_status", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "合规性检查状态");

    /**
     * The column <code>invoice.invoice_master.sub_compliance_status</code>.
     */
    public final TableField<InvoiceMasterRecord, String> SUB_COMPLIANCE_STATUS = createField("sub_compliance_status", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

    /**
     * The column <code>invoice.invoice_master.proforma_status</code>. 形式发票比对状态
     */
    public final TableField<InvoiceMasterRecord, String> PROFORMA_STATUS = createField("proforma_status", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "形式发票比对状态");

    /**
     * The column <code>invoice.invoice_master.collect_status</code>. 发票的归集状态
     */
    public final TableField<InvoiceMasterRecord, String> COLLECT_STATUS = createField("collect_status", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "发票的归集状态");

    /**
     * The column <code>invoice.invoice_master.delete_flag</code>. 删除标志位，标识该发票是否已被删除
     */
    public final TableField<InvoiceMasterRecord, Short> DELETE_FLAG = createField("delete_flag", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "删除标志位，标识该发票是否已被删除");

    /**
     * The column <code>invoice.invoice_master.active_flag</code>. 激活状态标志位，标识发票是否处于激活状态，只有激活状态的票发票列表才会显示
     */
    public final TableField<InvoiceMasterRecord, Short> ACTIVE_FLAG = createField("active_flag", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "激活状态标志位，标识发票是否处于激活状态，只有激活状态的票发票列表才会显示");

    /**
     * The column <code>invoice.invoice_master.freezing_flag</code>.
     */
    public final TableField<InvoiceMasterRecord, Short> FREEZING_FLAG = createField("freezing_flag", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>invoice.invoice_master.group_id</code>.
     */
    public final TableField<InvoiceMasterRecord, String> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.invoice_master.create_by</code>.
     */
    public final TableField<InvoiceMasterRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.invoice_master.create_time</code>.
     */
    public final TableField<InvoiceMasterRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>invoice.invoice_master.update_by</code>.
     */
    public final TableField<InvoiceMasterRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.invoice_master.update_time</code>.
     */
    public final TableField<InvoiceMasterRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>invoice.invoice_master</code> table reference
     */
    public InvoiceMaster() {
        this("invoice_master", null);
    }

    /**
     * Create an aliased <code>invoice.invoice_master</code> table reference
     */
    public InvoiceMaster(String alias) {
        this(alias, INVOICE_MASTER);
    }

    private InvoiceMaster(String alias, Table<InvoiceMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private InvoiceMaster(String alias, Table<InvoiceMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "发票列表主表，用以记录各类发票索引数据。");
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
    public UniqueKey<InvoiceMasterRecord> getPrimaryKey() {
        return Keys.KEY_INVOICE_MASTER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InvoiceMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<InvoiceMasterRecord>>asList(Keys.KEY_INVOICE_MASTER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceMaster as(String alias) {
        return new InvoiceMaster(alias, this);
    }

    /**
     * Rename this table
     */
    public InvoiceMaster rename(String name) {
        return new InvoiceMaster(name, null);
    }
}
