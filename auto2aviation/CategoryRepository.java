package auto2aviation;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;




@Repository 
 public interface CategoryRepository extends JpaRepository<Category, Integer>
{


	@Transactional
	@Modifying
	@Query("Update Category c set c.name= :#{#category.name}, c.categorydescription= :#{#category.categorydescription}, c.image= :#{#category.image} where c.categoryid= :#{#category.categoryid}")
	int modifyCategoryDetails(@Param("category") Category category);
}


