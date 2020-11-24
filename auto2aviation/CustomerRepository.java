package auto2aviation;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository 
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	@Query("from Customer where email= :email and password= :password")
	Customer oncat(@Param("email") String email,@Param("password") String password );
}

