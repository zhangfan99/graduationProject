package com.office.automation.modules.pojo.member;

import com.office.automation.bases.pojo.StringPojo;
import com.office.automation.modules.pojo.department.Department;
import com.office.automation.modules.pojo.position.Position;

/**
 * Created by zhangfan on 2017/2/17.
 */
public class MemberPosition extends StringPojo {

    private String memberId;
    private Member member;

    private String deptId;
    private Department department;

    private String postionId;
    private Position position;

    private int status;

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

    public String getPostionId() {
        return postionId;
    }

    public void setPostionId(String postionId) {
        this.postionId = postionId;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
