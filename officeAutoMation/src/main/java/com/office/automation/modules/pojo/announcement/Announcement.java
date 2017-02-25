package com.office.automation.modules.pojo.announcement;

import com.office.automation.bases.pojo.StringPojo;
import com.office.automation.modules.pojo.department.Department;
import com.office.automation.modules.pojo.member.Member;

import java.util.Date;

/**
 * Created by zhangfan on 2017/2/17.
 */
public class Announcement extends StringPojo {

    private String deptId;
    private Department department;

    private String memberId;
    private Member member;

    private String title;
    private String content;
    private Date publicTime;
    private Date createTime;
    private int status;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(Date publicTime) {
        this.publicTime = publicTime;
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
