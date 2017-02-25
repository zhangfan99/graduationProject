package com.office.automation.modules.pojo.department;

import com.office.automation.bases.pojo.StringPojo;

/**
 * Created by zhangfan on 2017/2/17.
 */
public class Department extends StringPojo {

    private String parentId;
    private String name;
    private String orderIndex;

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(String orderIndex) {
        this.orderIndex = orderIndex;
    }
}
