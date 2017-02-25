package com.office.automation.modules.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhangfan on 2017/2/5.
 */
@Controller
public class SystemController {

    private static final String GO_LOGIN = "/login";

    @RequestMapping(value = GO_LOGIN, method = RequestMethod.GET)
    public ModelAndView goLogin(){
        return new ModelAndView("sys/login");
    }
}
