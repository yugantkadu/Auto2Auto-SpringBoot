package auto2aviation;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository 
public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("from User where email= :email and password= :password")
	User login(@Param("email") String email,@Param("password") String password );
	
	@Query("from User where usertype NOT IN ('admin')")
	List<User> retrieve();
	
	@Transactional
	@Modifying
	@Query("Update User u set u.firstname= :#{#user.firstname}, u.lastname= :#{#user.lastname}, u.email= :#{#user.email}, u.password= :#{#user.password}, u.mobileno= :#{#user.mobileno}, u.address= :#{#user.address}, u.pincode= :#{#user.pincode}, u.categoryid= :#{#user.categoryid}, u.brandid= :#{#user.brandid}, u.usertype= :#{#user.usertype} where u.userid= :#{#user.userid}")
	int updateEmployee(@Param("user") User user);
	
	@Query("select new auto2aviation.UserProfileResult(u.userid, u.firstname, c.name,b.name ,u.usertype) from User u Join u.categoryid c Join u.brandid b ")
	List<UserProfileResult> getUserProfile();
	
	@Transactional
	@Modifying
	@Query(value = "insert into User (firstname, lastname, email, password, mobileno, address, pincode, categoryid, brandid, usertype) values (:#{#user.firstname}, :#{#user.lastname}, :#{#user.email}, :#{#user.password}, :#{#user.mobileno}, :#{#user.address}, :#{#user.pincode}, :#{#user.categoryid.categoryid}, :#{#user.brandid.brandid}, :#{#user.usertype})", nativeQuery = true)
	void saveRegistation(@Param("user") User user);
	
}
