package springcloud.service;

import com.zjh.springcloud.pojo.payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther zheng jianghai
 * @create 2021-06-24 14:53
 */
public interface PaymentService {

    int create(payment payment);



    payment getPaymentById(@Param("id") Long id);
}
