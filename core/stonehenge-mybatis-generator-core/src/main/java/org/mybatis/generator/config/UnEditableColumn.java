package org.mybatis.generator.config;

import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;
import static org.mybatis.generator.internal.util.messages.Messages.getString;

/**
 * Created by king on 16-4-24.
 */
public class UnEditableColumn {
    /**
     * The column name.
     */
    private String columnName;

    /**
     * Instantiates a new ignored column.
     *
     * @param columnName the column name
     */
    public UnEditableColumn(String columnName) {
        super();
        this.columnName = columnName;
    }

    /**
     * Gets the column name.
     *
     * @return the column name
     */
    public String getColumnName() {
        return columnName;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof IgnoredColumn)) {
            return false;
        }

        return columnName.equals(((IgnoredColumn) obj).getColumnName());
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return columnName.hashCode();
    }

    /**
     * To xml element.
     *
     * @return the xml element
     */
    public XmlElement toXmlElement() {
        XmlElement xmlElement = new XmlElement("unEditableColumn"); //$NON-NLS-1$
        xmlElement.addAttribute(new Attribute("column", columnName)); //$NON-NLS-1$
        return xmlElement;
    }

    /**
     * Validate.
     *
     * @param errors    the errors
     * @param tableName the table name
     */
    public void validate(List<String> errors, String tableName) {
        if (!stringHasValue(columnName)) {
            errors.add(getString("ValidationError.21", //$NON-NLS-1$
                    tableName));
        }
    }
}
