package com.luck.common.utils.request;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * springCloud请求工具类
 */
public class CloudRequestUtil {

    public String call(RestTemplate restTemplate, DiscoveryClient discoveryClient, String serveId, String methodName){
        // 使用discoveryClient 类能够与eureka server 交互， getInstances 获取注册到eureka server
        // 的"spring-cloud-order-service-provider" 实例列表
        List<ServiceInstance> instances = discoveryClient.getInstances(serveId);
        // 获取第一个服务信息
        ServiceInstance instanceInfo = instances.get(0);
        //获取ip
        String ip = instanceInfo.getHost();
        //获取port
        int port = instanceInfo.getPort();
        String url  ="http://" + ip+":" + port + methodName;
        return restTemplate.getForObject(url, String.class);
    }
}
