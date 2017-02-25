package com.office.automation.modules.pojo.menu;

import com.office.automation.bases.pojo.StringPojo;
import com.office.automation.modules.pojo.department.Department;
import com.office.automation.modules.pojo.position.Position;

/**
 * Created by zhangfan on 2017/2/17.
 */
public class MenuRoot extends StringPojo {

    private String menuId;
    private Menu menu;

    private String deptId;
    private Department department;

    private String positionId;
    private Position position;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
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

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
