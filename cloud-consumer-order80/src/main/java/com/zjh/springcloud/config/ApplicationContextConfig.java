package com.zjh.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther zheng jianghai
 * @create 2021-06-25 15:37
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced     //赋予restTemplate负载均衡的能力
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
