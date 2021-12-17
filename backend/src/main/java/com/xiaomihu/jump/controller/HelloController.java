package com.xiaomihu.jump.controller;

import static com.xiaomihu.jump.constants.Constants.API_URL_PREFIX;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wei.yang
 * 2/23/21
 **/
@RestController
@RequestMapping(API_URL_PREFIX + "/hello")
public class HelloController {

    @GetMapping
    @ResponseBody
    public String say() {
        return "hello";
    }
}