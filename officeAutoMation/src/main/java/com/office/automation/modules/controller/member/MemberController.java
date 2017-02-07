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

    private static final String GO_MAIN = "/main";

    @RequestMapping(value = GO_MAIN, method = RequestMethod.POST)
    public ModelAndView goMain(String userName, String password){
        if ("admin".equals(userName) && "123456".equals(password)){
            return new ModelAndView("../main");
        }else {
            return new ModelAndView("../login");
        }
    }
}
