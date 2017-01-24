package com.office.automation.bases.pojo;

import java.util.Date;

/**
 * Created by zhangfan on 2016/12/30.
 */
public class BasePojo extends StringPojo {

    private boolean deleted;
    private boolean enable;
    private Date createTime;

    public BasePojo() {
    }

    public BasePojo(String id) {
        super(id);
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
