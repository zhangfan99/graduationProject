package com.office.automation.modules.service.announcement;

import com.office.automation.bases.service.StringPojoBaseServiceImpl;
import com.office.automation.bases.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.office.automation.modules.pojo.announcement.Announcement;
import com.office.automation.modules.dao.announcement.AnnouncementMapper;
/**
 * Created by ZF-PC on 2017/02/25 .
 */
@Service
public class AnnouncementServiceImpl extends StringPojoBaseServiceImpl<Announcement>
        implements AnnouncementService {
    private AnnouncementMapper announcementMapper;

    @Autowired
    public void setAnnouncementMapper(AnnouncementMapper announcementMapper) {
        this.announcementMapper = announcementMapper;
    }

    @Override
    protected BaseDao<Announcement, String> getDao() {
        return announcementMapper;
    }
}