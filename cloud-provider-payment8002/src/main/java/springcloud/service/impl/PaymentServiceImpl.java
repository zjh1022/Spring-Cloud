package springcloud.service.impl;


import com.zjh.springcloud.pojo.payment;
import org.springframework.stereotype.Service;
import springcloud.dao.PaymentDao;
import springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @auther zheng jianghai
 * @create 2021-06-24 14:54
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
