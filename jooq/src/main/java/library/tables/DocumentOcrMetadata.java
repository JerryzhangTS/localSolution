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
import library.tables.records.DocumentOcrMetadataRecord;

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
public class DocumentOcrMetadata extends TableImpl<DocumentOcrMetadataRecord> {

    private static final long serialVersionUID = 2131137489;

    /**
     * The reference instance of <code>invoice.document_ocr_metadata</code>
     */
    public static final DocumentOcrMetadata DOCUMENT_OCR_METADATA = new DocumentOcrMetadata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DocumentOcrMetadataRecord> getRecordType() {
        return DocumentOcrMetadataRecord.class;
    }

    /**
     * The column <code>invoice.document_ocr_metadata.id</code>. 唯一标识符
     */
    public final TableField<DocumentOcrMetadataRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "唯一标识符");

    /**
     * The column <code>invoice.document_ocr_metadata.document_ocr_id</code>. DocumentOcr ID
     */
    public final TableField<DocumentOcrMetadataRecord, String> DOCUMENT_OCR_ID = createField("document_ocr_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "DocumentOcr ID");

    /**
     * The column <code>invoice.document_ocr_metadata.location_id</code>. Location ID
     */
    public final TableField<DocumentOcrMetadataRecord, String> LOCATION_ID = createField("location_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "Location ID");

    /**
     * The column <code>invoice.document_ocr_metadata.word_name</code>.
     */
    public final TableField<DocumentOcrMetadataRecord, String> WORD_NAME = createField("word_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>invoice.document_ocr_metadata.word</code>.
     */
    public final TableField<DocumentOcrMetadataRecord, String> WORD = createField("word", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>invoice.document_ocr_metadata.tenant_id</code>. Tenant ID
     */
    public final TableField<DocumentOcrMetadataRecord, String> TENANT_ID = createField("tenant_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "Tenant ID");

    /**
     * The column <code>invoice.document_ocr_metadata.input_time</code>. 录入时间
     */
    public final TableField<DocumentOcrMetadataRecord, Timestamp> INPUT_TIME = createField("input_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP(3)", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "录入时间");

    /**
     * The column <code>invoice.document_ocr_metadata.create_time</code>. 创建时间
     */
    public final TableField<DocumentOcrMetadataRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP(3)", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>invoice.document_ocr_metadata.update_time</code>. 更新时间
     */
    public final TableField<DocumentOcrMetadataRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP(3)", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>invoice.document_ocr_metadata.create_by</code>. 创建者
     */
    public final TableField<DocumentOcrMetadataRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "创建者");

    /**
     * The column <code>invoice.document_ocr_metadata.update_by</code>. 更新者
     */
    public final TableField<DocumentOcrMetadataRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "更新者");

    /**
     * Create a <code>invoice.document_ocr_metadata</code> table reference
     */
    public DocumentOcrMetadata() {
        this("document_ocr_metadata", null);
    }

    /**
     * Create an aliased <code>invoice.document_ocr_metadata</code> table reference
     */
    public DocumentOcrMetadata(String alias) {
        this(alias, DOCUMENT_OCR_METADATA);
    }

    private DocumentOcrMetadata(String alias, Table<DocumentOcrMetadataRecord> aliased) {
        this(alias, aliased, null);
    }

    private DocumentOcrMetadata(String alias, Table<DocumentOcrMetadataRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<DocumentOcrMetadataRecord> getPrimaryKey() {
        return Keys.KEY_DOCUMENT_OCR_METADATA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DocumentOcrMetadataRecord>> getKeys() {
        return Arrays.<UniqueKey<DocumentOcrMetadataRecord>>asList(Keys.KEY_DOCUMENT_OCR_METADATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentOcrMetadata as(String alias) {
        return new DocumentOcrMetadata(alias, this);
    }

    /**
     * Rename this table
     */
    public DocumentOcrMetadata rename(String name) {
        return new DocumentOcrMetadata(name, null);
    }
}
