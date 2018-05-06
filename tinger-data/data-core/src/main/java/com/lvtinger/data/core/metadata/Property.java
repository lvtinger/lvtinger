package com.lvtinger.data.core.metadata;

/**
 * 文档属性
 * @author qiuxu
 */
public class Property {
    private String propertyName;
    private String columnName;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
}