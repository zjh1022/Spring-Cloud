package com.zjh.springcloud.controller;

import com.zjh.springcloud.pojo.CommonResult;
import com.zjh.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.zjh.springcloud.pojo.payment;
import javax.annotation.Resource;

/**
 * @auther zheng jianghai
 * @create 2021-07-05 21:51
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<payment> getPayment(@PathVariable("id") Long id){
        return paymentFeignService.getPayment(id);
    }
}
