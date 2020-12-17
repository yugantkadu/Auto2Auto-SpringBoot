package auto2auto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository 
 public interface ProductsRepository extends JpaRepository<Products, Integer>
{

	@Transactional
	@Modifying
	@Query("Update Products p set p.brandid= :#{#products.brandid}, p.manufacturerid= :#{#products.manufacturerid}, p.productname= :#{#products.productname}, p.productdescription= :#{#products.productdescription}, p.productimage= :#{#products.productimage}, p.quantityinstock= :#{#products.quantityinstock}, p.buyprice= :#{#products.buyprice} where p.productid= :#{#products.productid}")
	int modifyProductDetails(@Param("products") Products products);
	
	@Transactional
	@Modifying
	@Query(value = "insert into Products (brandid, manufacturerid, productname, productdescription, productimage, quantityinstock, buyprice) values (:#{#product.brandid.brandid}, :#{#product.manufacturerid.userid}, :#{#product.productname}, :#{#product.productdescription}, :#{#product.productimage}, :#{#product.quantityinstock}, :#{#product.buyprice})", nativeQuery = true)
	void saveProduct(@Param("product") Products product);
	
}