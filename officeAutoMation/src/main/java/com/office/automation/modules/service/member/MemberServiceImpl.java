package com.office.automation.modules.service.member;

import com.office.automation.bases.service.StringPojoBaseServiceImpl;
import com.office.automation.bases.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.office.automation.modules.pojo.member.Member;
import com.office.automation.modules.dao.member.MemberMapper;
/**
 * Created by ZF-PC on 2017/02/25 .
 */
@Service
public class MemberServiceImpl extends StringPojoBaseServiceImpl<Member>
        implements MemberService {
    private MemberMapper memberMapper;

    @Autowired
    public void setMemberMapper(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    protected BaseDao<Member, String> getDao() {
        return memberMapper;
    }
}