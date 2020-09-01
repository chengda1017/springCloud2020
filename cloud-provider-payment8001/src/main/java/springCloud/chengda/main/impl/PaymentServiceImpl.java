package springCloud.chengda.main.impl;

import org.springframework.stereotype.Service;
import springCloud.chengda.main.PaymentService;
import springCloud.chengda.main.dao.PaymentDao;
import springCloud.chengda.main.entities.Payment;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int  create(Payment payment){
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
