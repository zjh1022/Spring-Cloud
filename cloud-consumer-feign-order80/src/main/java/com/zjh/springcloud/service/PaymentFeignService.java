package com.zjh.springcloud.service;

import com.zjh.springcloud.pojo.CommonResult;
import com.zjh.springcloud.pojo.payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @auther zheng jianghai
 * @create 2021-07-05 21:46
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/payment/get/{id}")
    public CommonResult<payment> getPayment(@PathVariable("id") Long id);
}
