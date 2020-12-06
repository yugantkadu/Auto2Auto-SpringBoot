package auto2aviation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class Webservices {
	
	private UserRepository user;
	private ProductsRepository p;
	private CategoryRepository cat;
	private BrandRepository b;
	
	@Autowired
	public void f1(ProductsRepository y)
	{ 
		System.out.println("autowired successfully");
		p =y;
		
	}
	
	@Autowired
	public void f1(UserRepository cr1)
	{ 
		System.out.println("AutoWired of CustomerRepository is Successfully");
		user = cr1;
		
	}
	
	@Autowired
	public void f1(CategoryRepository z)
	{ 
		System.out.println("AutoWired of CategoryRepository is Successfully");
		cat =z;
	}
	
	@Autowired
	public void getbrands(BrandRepository y)
	{ 
		System.out.println("AutoWired of BrandRepository is Successfully");
		b =y;
		
	}
	
	@GetMapping("/vehicle/getAllProducts")
	public List<Products> allProducts()
	{	
		
		return p.findAll();
				
	}
	
	@PostMapping("/user/verifyCustomer")
	public UserResult allCustomers(@RequestBody User us)
	{	
		UserResult ur;
		User isCustomer = user.login(us.getEmail(), us.getPassword());
		if(isCustomer!= null) {
			ur = new UserResult(true,"User Present", isCustomer);
		}else
			ur = new UserResult(false,"User is not Present", isCustomer);
		return ur;	
	}
	
	@PostMapping("/user/registration")
	public UserResult ins(@RequestBody User us)
	{
		
		UserResult ur = new UserResult(false,"Registration Failed", us);  	
		user.save(us);
      	ur.setStatus(true);
     	ur.setMessage("Registration Successfull");
    	return ur;
		
	}
	
	@GetMapping("/admin/allUsers")
	public List<User> getAllUser()
	{
		return user.retrieve();
	}
	
	@PutMapping("/admin/modifyUser/{id}")
	public UserResult updateEmployee(@PathVariable(value = "id") int userId,
			@RequestBody User userDetails){
		
		boolean isUser = user.existsById(userId);
		int updateStatus;
		UserResult ur;
		
		if(isUser)
		{
			updateStatus = user.updateEmployee(userDetails);
			ur = new UserResult(true,"User Present", userDetails); 	

		} else {
			//ur = new UserResult(false,"User not present " + userId, userdetails);  	
			ur = new UserResult(false," not User Present", userDetails);
		}
		return ur;
	}
	
	@GetMapping("/vehicle/getAllBrands")
	public List<Brand> allBrand()
	{	
		return b.findAll();		
	}
	
	@GetMapping("/vehicle/getCategoryDetails")
	public List<Category> categoryDetails()
	{	
		
		return cat.findAll();
				
	}

}
