package com.office.automation.modules.pojo.position;

import com.office.automation.bases.pojo.StringPojo;

/**
 * Created by zhangfan on 2017/2/17.
 */
public class Position extends StringPojo {

    private String deptId;
    private String name;
    private String rootIndex;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRootIndex() {
        return rootIndex;
    }

    public void setRootIndex(String rootIndex) {
        this.rootIndex = rootIndex;
    }
}
