package com.office.automation.modules.pojo.menu;

import com.office.automation.bases.pojo.StringPojo;

/**
 * Created by zhangfan on 2017/2/17.
 */
public class Menu extends StringPojo {

    private String title;
    private String orderIndex;
    private String url;
    private String param;
    private int status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(String orderIndex) {
        this.orderIndex = orderIndex;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
