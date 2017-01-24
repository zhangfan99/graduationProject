package com.office.automation.bases.pojo;

import java.io.Serializable;

/**
 * Created by zhangfan on 2016/12/30.
 */
public class Pojo<T extends Serializable> implements Serializable{

    private T id;

    public Pojo() {
    }

    public Pojo(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
