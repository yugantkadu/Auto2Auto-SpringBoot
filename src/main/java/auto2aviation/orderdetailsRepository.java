package auto2aviation;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface orderdetailsRepository extends JpaRepository<orderdetails, Integer> {
	@Query("select o from orderdetails")
	List<orderdetails> getdetails(); 

}
