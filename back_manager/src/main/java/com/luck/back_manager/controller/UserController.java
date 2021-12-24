package com.luck.back_manager.controller;

import com.luck.common.utils.request.CloudRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/back_manager/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/getUser")
    public String getTodayStatistic(){
        CloudRequestUtil cloudRequestUtil = new CloudRequestUtil();
        String resultStr = cloudRequestUtil.call(restTemplate, discoveryClient,"cloud-user", "/owner/test");
        return resultStr;
    }
}
