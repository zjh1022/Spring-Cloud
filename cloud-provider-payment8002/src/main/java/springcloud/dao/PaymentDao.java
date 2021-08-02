package springcloud.dao;

import com.zjh.springcloud.pojo.payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther zheng jianghai
 * @create 2021-06-24 14:40
 */

@Mapper
public interface PaymentDao {

    int create(payment payment);



    payment getPaymentById(@Param("id") Long id);
}
