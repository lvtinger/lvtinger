package com.lvtinger.core.object;

import java.io.Serializable;

/**
 * @author qiuxu
 */
public class PersistentObject<T extends Serializable> implements Serializable {

    private static final long serialVersionUID = -5371292342379329179L;

    private T Id;
    private Long createTime;
    private Long updateTime;
    private Integer objectStatus;

    public T getId() {
        return Id;
    }

    public void setId(T id) {
        Id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getObjectStatus() {
        return objectStatus;
    }

    public void setObjectStatus(Integer objectStatus) {
        this.objectStatus = objectStatus;
    }

    @Override
    public String toString() {
        return "PersistentObject{" +
                "Id=" + Id +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", objectStatus=" + objectStatus +
                '}';
    }

    public String[] cacheDimension() {
        return new String[]{this.Id.toString()};
    }
}
