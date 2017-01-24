package com.office.automation.bases.service;

import com.office.automation.bases.pojo.Pojo;

import java.io.Serializable;

/**
 * Created by zhangfan on 2017/1/20.
 */
public interface BaseService<T extends Pojo<A>, A extends Serializable> {
    A save(T var1);

    void update(T var1);

    void deleteById(A var1);

    T getById(A var1);
}