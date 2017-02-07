package com.office.automation.bases.dao;

import com.office.automation.bases.pojo.StringPojo;
import easybuild.core.utils.StringUtils;
import easybuild.core.utils.UUIDGenerator;

/**
 * Created by zhangfan on 2017/1/20.
 */
public abstract class BaseDaoImpl<P extends StringPojo> extends StringPojoMyBatisDaoImpl<P> {
    /**
     * 获取要操作的表名
     *
     * @return
     */
    protected abstract String getTableName();

    protected abstract Class<P> getPojoClass();

    public String save(P pojo) {

        setUpPojoEntityId(pojo);

        return save(pojo);
    }

    /**
     * 如果pojo未设置id值，则生成UUID并设置到pojo中
     *
     * @param pojo
     */
    protected void setUpPojoEntityId(P pojo) {
        if (StringUtils.isEmpty(pojo.getId())) {
            pojo.setId(UUIDGenerator.generateUUID());
        }
    }
}
