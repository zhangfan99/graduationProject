package com.office.automation.modules.pojo.meet;

import com.office.automation.bases.pojo.StringPojo;
import com.office.automation.modules.pojo.member.Member;

import java.util.Date;

/**
 * Created by zhangfan on 2017/2/17.
 */
public class Meet extends StringPojo{

    private String title;

    private String compereId;
    private Member compere;

    private Date time;
    private String content;
    private String address;
    private Date createTime;
    private int status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompereId() {
        return compereId;
    }

    public void setCompereId(String compereId) {
        this.compereId = compereId;
    }

    public Member getCompere() {
        return compere;
    }

    public void setCompere(Member compere) {
        this.compere = compere;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
