package com.zjh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @auther zheng jianghai
 * @create 2021-06-26 15:32
 */
@SpringBootApplication
@EnableEurekaServer
public class OrderMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain7002.class,args);
    }
}
