package com.office.automation.bases.service;

import com.office.automation.bases.dao.BaseDao;
import com.office.automation.bases.others.DataSet;
import com.office.automation.bases.others.Paging;
import com.office.automation.bases.pojo.Pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhangfan on 2017/1/20.
 */
public abstract class BaseServiceImpl<T extends Pojo<A>, A extends Serializable> {
    public BaseServiceImpl() {
    }

    protected abstract BaseDao<T, A> getDao();

    public void deleteById(A entityId) {
        this.getDao().deleteById(entityId);
    }

    public T getById(A entityId) {
        return this.getDao().getEntity(entityId);
    }

    public A save(T entity) {
        return this.getDao().save(entity);
    }

    public void update(T entity) {
        this.getDao().update(entity);
    }

}
