package com.xiaomihu.jump.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yangwei05 <yangwei05@kuaishou.com>
 * Created on 2021-12-15
 */
@Controller
public class BrowserHistoryController implements ErrorController {

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping(value = "/error")
    public String getIndex() {
        return "index";
    }

//    @RequestMapping(value = {
//            "/",
//            "/user",
//            "/user/**",
//            "/list",
//            "/list/**",
//            "/admin",
//            "/admin/**"
//    })
//    public String forwardIndex() {
//        return "index";
//    }
}