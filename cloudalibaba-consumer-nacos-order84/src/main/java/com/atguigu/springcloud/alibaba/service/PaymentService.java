package com.atguigu.springcloud.alibaba.service;


import com.zjh.springcloud.pojo.CommonResult;
import com.zjh.springcloud.pojo.payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @auther zzyy
 * @create 2020-02-25 18:15
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService
{
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<payment> paymentSQL(@PathVariable("id") Long id);
}
