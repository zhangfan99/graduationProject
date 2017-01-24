package com.office.automation.bases.service;

import com.office.automation.bases.pojo.StringPojo;

/**
 * Created by zhangfan on 2017/1/20.
 */
public abstract class StringPojoBaseServiceImpl<T extends StringPojo> extends BaseServiceImpl<T, String> {
    public StringPojoBaseServiceImpl() {
    }
}
