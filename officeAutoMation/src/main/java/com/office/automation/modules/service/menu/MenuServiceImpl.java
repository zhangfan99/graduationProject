package com.office.automation.modules.service.menu;

import com.office.automation.bases.service.StringPojoBaseServiceImpl;
import com.office.automation.bases.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.office.automation.modules.pojo.menu.Menu;
import com.office.automation.modules.dao.menu.MenuMapper;
/**
 * Created by ZF-PC on 2017/02/25 .
 */
@Service
public class MenuServiceImpl extends StringPojoBaseServiceImpl<Menu>
        implements MenuService {
    private MenuMapper menuMapper;

    @Autowired
    public void setMenuMapper(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

    @Override
    protected BaseDao<Menu, String> getDao() {
        return menuMapper;
    }
}