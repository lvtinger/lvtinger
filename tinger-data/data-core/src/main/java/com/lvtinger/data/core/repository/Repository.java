package com.lvtinger.data.core.repository;

import com.lvtinger.core.object.PersistentObject;
import com.lvtinger.data.core.criteria.Criteria;

import java.io.Serializable;
import java.util.List;

public interface Repository<E extends PersistentObject<K>, K extends Serializable> {
    int insert(E document);
    int update(E document);
    int delete(E document);
    List<E> query(Criteria criteria);
    int execute();
}