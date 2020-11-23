package auto2aviation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class Webservices {
	
	private ProductsRepository p;
	private CustomerRepository customer;
	
	private CustomerRepository cr;
	
	
	@Autowired
	public void f1(ProductsRepository y)
	{ 
		System.out.println("autowired successfully");
		p =y;
		
	}
	
	
	@Autowired
	public void f1(CustomerRepository cr1)
	{ 
		System.out.println("AutoWired of CustomerRepository is Successfull");
		cr = cr1;
		
	}
	
	
	@GetMapping("/vehicle/getAllProducts")
	public List<Products> allProducts()
	{	
		
		return p.findAll();
				
	}
	
	
	@PostMapping("/user/registration")
	public CustomerResult ins(@RequestBody Customer customer)
	{
		CustomerResult ur = new CustomerResult(false,"Registration Failed");  	
    	cr.save(customer);
      	ur.setStatus(true);
     	ur.setMessage("Registration Successfull");
    	return ur;
		
	}
	
	
}
