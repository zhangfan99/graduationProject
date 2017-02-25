package com.office.automation.modules.pojo.announcement;

import com.office.automation.bases.pojo.StringPojo;
import com.office.automation.modules.pojo.member.Member;

/**
 * Created by zhangfan on 2017/2/17.
 */
public class AnnoMember extends StringPojo {

    private String memberId;
    private Member member;

    private String anno_id;
    private Announcement announcement;

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

    public String getAnno_id() {
        return anno_id;
    }

    public void setAnno_id(String anno_id) {
        this.anno_id = anno_id;
    }

    public Announcement getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Announcement announcement) {
        this.announcement = announcement;
    }
}
