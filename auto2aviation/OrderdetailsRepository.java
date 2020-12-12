package auto2aviation;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderdetailsRepository extends JpaRepository<Orderdetails, Integer>{
	@Query("select new auto2aviation.OrderdetailsResult(o.orderid, p.productname, u.firstname,u.lastname,o.quantityordered,o.price) from Orderdetails o Join o.retailerid u Join o.productid p ")
	List<OrderdetailsResult> allOrderDetails();
}