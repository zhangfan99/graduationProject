package com.office.automation.modules.pojo.advice;

import com.office.automation.bases.pojo.StringPojo;

import java.util.Date;

/**
 * Created by zhangfan on 2017/2/17.
 */
public class AdviceContent extends StringPojo {

    private String adviceId;
    private Advice advice;

    private String content;
    private Date createTime;
    private String orderIndex;
    private int status;

    public String getAdviceId() {
        return adviceId;
    }

    public void setAdviceId(String adviceId) {
        this.adviceId = adviceId;
    }

    public Advice getAdvice() {
        return advice;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(String orderIndex) {
        this.orderIndex = orderIndex;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
