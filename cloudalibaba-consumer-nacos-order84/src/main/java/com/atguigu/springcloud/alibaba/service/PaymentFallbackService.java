package com.atguigu.springcloud.alibaba.service;


import com.zjh.springcloud.pojo.CommonResult;
import com.zjh.springcloud.pojo.payment;
import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2020-02-25 18:30
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new payment(id,"errorSerial"));
    }
}
