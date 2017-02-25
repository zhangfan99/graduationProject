package com.office.automation.modules.controller.member;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhangfan on 2017/2/4.
 */
@Controller
public class MemberController{

    private static final String MODULE_NAME = "/member";

    private static final String GO_MAIN = "/toMain";

    @RequestMapping(value = GO_MAIN, method = RequestMethod.POST)
    public String goMain(String username, String password){
        if ("admin".equals(username) && "123456".equals(password)){
            return "sys/main";
        }else {
            return "sys/login";
        }
    }
}
