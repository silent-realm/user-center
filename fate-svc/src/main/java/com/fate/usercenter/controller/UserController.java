package com.fate.usercenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: user-center
 * @Package: com.fate.usercenter.controller
 * @ClassName: UserController
 * @Author: LJP
 * @Description:
 * @Date: 2020/4/2 12:49
 * @Version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String user(){
        return "111111";
    }
}
