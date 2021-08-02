package com.zjh.springcloudalibaba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther zheng jianghai
 * @create 2021-07-16 16:40
 */
@Configuration
public class ApplicationContexConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
