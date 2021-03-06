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
import library.tables.records.CredentialsRecord;

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
public class Credentials extends TableImpl<CredentialsRecord> {

    private static final long serialVersionUID = -297312688;

    /**
     * The reference instance of <code>invoice.credentials</code>
     */
    public static final Credentials CREDENTIALS = new Credentials();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CredentialsRecord> getRecordType() {
        return CredentialsRecord.class;
    }

    /**
     * The column <code>invoice.credentials.open_tenant_id</code>.
     */
    public final TableField<CredentialsRecord, String> OPEN_TENANT_ID = createField("open_tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>invoice.credentials.app_id</code>.
     */
    public final TableField<CredentialsRecord, String> APP_ID = createField("app_id", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>invoice.credentials.token</code>.
     */
    public final TableField<CredentialsRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>invoice.credentials.token_secret</code>.
     */
    public final TableField<CredentialsRecord, String> TOKEN_SECRET = createField("token_secret", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>invoice.credentials.owning_tenant_id</code>.
     */
    public final TableField<CredentialsRecord, String> OWNING_TENANT_ID = createField("owning_tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.credentials.status</code>.
     */
    public final TableField<CredentialsRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>invoice.credentials.create_by</code>.
     */
    public final TableField<CredentialsRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.credentials.create_time</code>.
     */
    public final TableField<CredentialsRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>invoice.credentials.update_by</code>.
     */
    public final TableField<CredentialsRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>invoice.credentials.update_time</code>.
     */
    public final TableField<CredentialsRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>invoice.credentials</code> table reference
     */
    public Credentials() {
        this("credentials", null);
    }

    /**
     * Create an aliased <code>invoice.credentials</code> table reference
     */
    public Credentials(String alias) {
        this(alias, CREDENTIALS);
    }

    private Credentials(String alias, Table<CredentialsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Credentials(String alias, Table<CredentialsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CredentialsRecord> getPrimaryKey() {
        return Keys.KEY_CREDENTIALS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CredentialsRecord>> getKeys() {
        return Arrays.<UniqueKey<CredentialsRecord>>asList(Keys.KEY_CREDENTIALS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Credentials as(String alias) {
        return new Credentials(alias, this);
    }

    /**
     * Rename this table
     */
    public Credentials rename(String name) {
        return new Credentials(name, null);
    }
}
