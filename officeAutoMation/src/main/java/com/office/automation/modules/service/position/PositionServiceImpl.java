package com.office.automation.modules.service.position;

import com.office.automation.bases.service.StringPojoBaseServiceImpl;
import com.office.automation.bases.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.office.automation.modules.pojo.position.Position;
import com.office.automation.modules.dao.position.PositionMapper;
/**
 * Created by ZF-PC on 2017/02/25 .
 */
@Service
public class PositionServiceImpl extends StringPojoBaseServiceImpl<Position>
        implements PositionService {
    private PositionMapper positionMapper;

    @Autowired
    public void setPositionMapper(PositionMapper positionMapper) {
        this.positionMapper = positionMapper;
    }

    @Override
    protected BaseDao<Position, String> getDao() {
        return positionMapper;
    }
}