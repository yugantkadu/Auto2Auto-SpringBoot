package auto2aviation;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository 
 public interface BrandRepository extends JpaRepository<Brand, Integer>{
	

	@Transactional
	@Modifying
	@Query("Update Brand b set b.name= :#{#brand.name},b.categoryid= :#{#brand.categoryid}, b.branddescription= :#{#brand.branddescription}, b.image= :#{#brand.image} where b.brandid= :#{#brand.brandid}")
	int modifyBrandDetails(@Param("brand") Brand brand);

	
}


