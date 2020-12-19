package auto2auto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrderdetailsRepository extends JpaRepository<Orderdetails, Integer>{
	@Query("select new auto2auto.OrderdetailsResult(o.orderid, p.productname, u.firstname,u.lastname,o.quantityordered,o.price) from Orderdetails o Join o.retailerid u Join o.productid p ")
	List<OrderdetailsResult> allOrderDetails();

	@Transactional
	@Modifying
	@Query(value = "insert into Orderdetails (retailerid, productid, quantityordered, price) values (:#{#orderdetails.retailerid.userid}, :#{#orderdetails.productid.productid}, :#{#orderdetails.quantityordered}, :#{#orderdetails.price}) select :id from Orderdetails", nativeQuery = true)
	int saveOrder(@Param("orderdetails")Orderdetails orderdetails);
	
//	@Transactional
//	@Modifying
//	@Query(value = "insert into Products (brandid, manufacturerid, productname, productdescription, productimage, quantityinstock, buyprice) values (:#{#product.brandid.brandid}, :#{#product.manufacturerid.userid}, :#{#product.productname}, :#{#product.productdescription}, :#{#product.productimage}, :#{#product.quantityinstock}, :#{#product.buyprice})", nativeQuery = true)
//	void saveProduct(@Param("product") Products product);
	//@Query("SELECT LAST_INSERT_ID()")
	//int getOrderId();
}

