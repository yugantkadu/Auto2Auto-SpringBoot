package auto2auto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository 
public interface PaymentRepository extends JpaRepository<Payment, Integer>{
	@Transactional
	@Modifying
	@Query(value = "insert into Payment (orderid, razorpaypaymentid, razorpayorderid, amount, paymentmode, paymentdate) values (:#{#payment.orderid.orderid}, :#{#payment.razorpaypaymentid}, :#{#payment.razorpayorderid}, :#{#payment.amount}, :#{#payment.paymentmode}, :#{#payment.paymentdate})", nativeQuery = true)
	void savePayment(@Param("payment") Payment payment);
}
