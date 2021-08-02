package springcloud.controller;

import com.zjh.springcloud.pojo.CommonResult;
import com.zjh.springcloud.pojo.payment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @auther zheng jianghai
 * @create 2021-06-24 17:08
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @Value("${server.port}")
    private String servicePort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果："+result);
        if (result>0){
            return new CommonResult(200,"插入成功,serverPort:"+servicePort,result);
        }else {
            return new CommonResult(444,"插入失败",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){
        payment payment = paymentService.getPaymentById(id);

        if (payment!=null){
            return new CommonResult(200,"查询成功,serverPort:"+servicePort,payment);
        }else {
            return new CommonResult(404,"查询失败",null);
        }
    }
}
