package com.office.automation.modules.service.department;

import com.office.automation.bases.service.StringPojoBaseServiceImpl;
import com.office.automation.bases.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.office.automation.modules.pojo.department.Department;
import com.office.automation.modules.dao.department.DepartmentMapper;
/**
 * Created by ZF-PC on 2017/02/25 .
 */
@Service
public class DepartmentServiceImpl extends StringPojoBaseServiceImpl<Department>
        implements DepartmentService {
    private DepartmentMapper departmentMapper;

    @Autowired
    public void setDepartmentMapper(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    @Override
    protected BaseDao<Department, String> getDao() {
        return departmentMapper;
    }
}