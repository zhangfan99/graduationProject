package com.office.automation.modules.controller.admin.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangfan on 2017/1/20.
 */
@Controller
public class MemberAdminController {

    private static final String MODULE_NAME = "/member";

    private static final String LOGIN = MODULE_NAME + "/login";

    @RequestMapping(LOGIN)
    public String login(String username, String password){
        if ("admin".equals(username) && "123456".equals(password)) {
            return "main";
        }else {
            return "login";
        }
    }
}
