package springCloud.chengda.main;

import org.apache.ibatis.annotations.Param;

import springCloud.chengda.main.entities.Payment;

public interface PaymentService  {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
