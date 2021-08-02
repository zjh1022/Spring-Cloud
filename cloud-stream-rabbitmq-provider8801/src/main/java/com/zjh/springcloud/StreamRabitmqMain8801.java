package com.zjh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther zheng jianghai
 * @create 2021-07-09 11:17
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabitmqMain8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamRabitmqMain8801.class,args);
    }
}
