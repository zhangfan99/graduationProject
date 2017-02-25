package com.office.automation.modules.pojo.meet;

import com.office.automation.bases.pojo.StringPojo;
import com.office.automation.modules.pojo.member.Member;

/**
 * Created by zhangfan on 2017/2/17.
 * 参会人员记录表
 */
public class MeetMember extends StringPojo {

    private String meetId;
    private Meet meet;

    private String memberId;
    private Member member;

    public String getMeetId() {
        return meetId;
    }

    public void setMeetId(String meetId) {
        this.meetId = meetId;
    }

    public Meet getMeet() {
        return meet;
    }

    public void setMeet(Meet meet) {
        this.meet = meet;
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
}
