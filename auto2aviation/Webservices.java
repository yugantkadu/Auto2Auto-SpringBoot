package auto2aviation;

import java.util.ArrayList;
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
	
	private CustomerRepository cr;
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
	public void f1(CustomerRepository cr1)
	{ 
		System.out.println("AutoWired of CustomerRepository is Successfully");
		cr = cr1;
		
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
	public Customer allCustomers(@RequestBody Customer customer)
	{	
		Customer isCustomer = cr.oncat(customer.getEmail(), customer.getPassword());
		if(isCustomer!= null) {
			return isCustomer;
		}else
			customer.setCategoryid(0);
		return customer;	
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
