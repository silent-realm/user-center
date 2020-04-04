package com.fate.usercenter.service.impl;

import com.fate.core.annotation.FateRequestMapping;
import com.fate.usercenter.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: user-center
 * @Package: com.fate.usercenter.service.impl
 * @ClassName: UserServiceImpl
 * @Author: LJP
 * @Description:
 * @Date: 2020/4/2 0:58
 * @Version: 1.0
 */
@Service
@FateRequestMapping(value = "/user")
public class UserServiceImpl implements UserService {

    @ResponseBody
    @FateRequestMapping(value = "/getUser2",method = RequestMethod.GET)
    public String user(){
        return "33333";
    }
}
