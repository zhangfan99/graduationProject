package com.office.automation.bases.others;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangfan on 2017/1/20.
 */
public class DataSet<T> implements Serializable {
    private Paging paging;
    private List<T> data = new ArrayList();

    public DataSet() {
    }

    public DataSet(List<T> data) {
        this.data = data;
    }

    public DataSet(List<T> data, Paging paging) {
        this.paging = paging;
        this.data = data;
    }

    public Paging getPaging() {
        return this.paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public List<T> getData() {
        return this.data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}