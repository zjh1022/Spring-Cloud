package com.zjh.springcloudalibaba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @auther zheng jianghai
 * @create 2021-07-16 16:51
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${server-url.nacos-user-service")
    private String ServerUrl;

    @GetMapping("/consumer/payment/nacos/{id}")
    public String getPayment(@PathVariable("id")Long id){

      return restTemplate.getForObject(ServerUrl+"/payment/nacos/"+id,String.class);
    }
}
