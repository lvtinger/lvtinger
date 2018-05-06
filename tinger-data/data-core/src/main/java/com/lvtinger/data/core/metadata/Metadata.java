package com.lvtinger.data.core.metadata;

import java.util.List;

/**
 * 元数据描述
 */
public class Metadata {
    /**
     * 存储服务器
     */
    private String host;
    /**
     * 存储数据库
     */
    private String base;
    /**
     * 存储数据表
     */
    private String table;
    /**
     * 数据属性
     */
    private List<Property> properties;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

}