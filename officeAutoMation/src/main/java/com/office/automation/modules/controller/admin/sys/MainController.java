package com.office.automation.modules.controller.admin.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangfan on 2017/1/20.
 */
@Controller
public class MainController {

    private final static String GO_TO_LOGIN = "/login";

    @RequestMapping(value = GO_TO_LOGIN)
    public String goToLogin(){
        return GO_TO_LOGIN;
    }

    private final static String GO_TO_MAIN = "/main";

    @RequestMapping(value = GO_TO_MAIN)
    public String getGoToMain(){
        return GO_TO_MAIN;
    }
}
