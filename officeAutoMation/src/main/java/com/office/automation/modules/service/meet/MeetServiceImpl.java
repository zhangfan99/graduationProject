package com.office.automation.modules.service.meet;

import com.office.automation.bases.service.StringPojoBaseServiceImpl;
import com.office.automation.bases.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.office.automation.modules.pojo.meet.Meet;
import com.office.automation.modules.dao.meet.MeetMapper;
/**
 * Created by ZF-PC on 2017/02/25 .
 */
@Service
public class MeetServiceImpl extends StringPojoBaseServiceImpl<Meet>
        implements MeetService {
    private MeetMapper meetMapper;

    @Autowired
    public void setMeetMapper(MeetMapper meetMapper) {
        this.meetMapper = meetMapper;
    }

    @Override
    protected BaseDao<Meet, String> getDao() {
        return meetMapper;
    }
}