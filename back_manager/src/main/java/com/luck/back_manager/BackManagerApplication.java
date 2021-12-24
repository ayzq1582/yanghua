package com.luck.back_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BackManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackManagerApplication.class, args);
    }

}
