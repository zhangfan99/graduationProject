package com.office.automation.modules.service.massage;

import com.office.automation.bases.service.StringPojoBaseServiceImpl;
import com.office.automation.bases.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.office.automation.modules.pojo.massage.Massage;
import com.office.automation.modules.dao.massage.MassageMapper;
/**
 * Created by ZF-PC on 2017/02/25 .
 */
@Service
public class MassageServiceImpl extends StringPojoBaseServiceImpl<Massage>
        implements MassageService {
    private MassageMapper massageMapper;

    @Autowired
    public void setMassageMapper(MassageMapper massageMapper) {
        this.massageMapper = massageMapper;
    }

    @Override
    protected BaseDao<Massage, String> getDao() {
        return massageMapper;
    }
}