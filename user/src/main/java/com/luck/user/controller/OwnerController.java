package com.luck.user.controller;
import com.alibaba.fastjson.JSON;
import com.luck.common.entity.user.Owner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("owner")
public class OwnerController {

    @GetMapping("/test")
    private String test(){
        System.out.println("ok");
        Owner owner = new Owner();
        owner.setName("牛");
        owner.setLoginName("123asd");
        owner.setPassword("asdaf");
        return JSON.toJSONString(owner);
    }

    public static void main(String[] args) {
        Owner owner = new Owner();
        owner.setName("牛");
        owner.setLoginName("123asd");
        owner.setPassword("asdaf");
        System.out.println(JSON.toJSONString(owner));
    }
}
