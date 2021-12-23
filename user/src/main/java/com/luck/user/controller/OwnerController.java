package com.luck.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("owner")
public class OwnerController {

    @GetMapping("/test")
    private void test(){
        System.out.println("ok");
    }
}
