package com.lvtinger.core.object;

import java.io.Serializable;
import java.util.List;

/**
 * @author qiuxu
 */
public class Pageable<E extends Serializable> implements Serializable{
    private static final long serialVersionUID = 8189078608739491014L;
    private Integer page;
    private Integer size;
    private Integer count;
    private List<E> data;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<E> getData() {
        return data;
    }

    public void setData(List<E> data) {
        this.data = data;
    }
}
