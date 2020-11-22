package product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;




@Repository 
 public interface XRepository extends JpaRepository<Products, Integer>{

	@Query("from Products where City = :x")
	List<Products> oncat(@Param("x") String y);
}


