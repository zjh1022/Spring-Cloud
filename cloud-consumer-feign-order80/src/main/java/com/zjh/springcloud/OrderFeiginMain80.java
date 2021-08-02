package com.zjh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther zheng jianghai
 * @create 2021-07-05 21:41
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeiginMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeiginMain80.class,args);
    }
}
