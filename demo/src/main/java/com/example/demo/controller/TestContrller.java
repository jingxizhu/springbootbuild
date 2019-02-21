package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.model.TtaiUser;
import com.example.demo.service.TtaiUserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: JingXi
 * Date:2019/2/21
 * Description:
 */
@RestController
public class TestContrller {

    private final TtaiUserService ttaiUserService;

    @Autowired
    public TestContrller(TtaiUserService ttaiUserService) {
        this.ttaiUserService = ttaiUserService;
    }

    @PostMapping("/test")
    public String add(@RequestParam("account") String account,
                      @RequestParam("pwd") String pwd){
        TtaiUser user = new TtaiUser();
        user.setUserAccount(account);
        user.setUserPwd(pwd);
        user.setUserNickname("null");
        user.setUserEmail("null");
        this.ttaiUserService.insertSelective(user);
        return new Gson().toJson(new Result());
    }
}
