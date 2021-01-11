package auto2auto;

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
	private OrderdetailsRepository ord;
	
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
	
	@Autowired
	public void getorderdetails(OrderdetailsRepository o)
	{ 
		System.out.println("AutoWired of OrderdetailsRepository is Successfully");
		ord =o;
		
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
		user.saveRegistation(us);
      	ur.setStatus(true);
     	ur.setMessage("Registration Successfull");
    	return ur;
		
	}
	
	@GetMapping("/admin/allUsers")
	public List<User> getAllUser()
	{
		return user.retrieve();
	}
	
	@GetMapping("/user/allUsers")
	public List<User> getAllUserDetails()
	{
		return user.retrieve();
	}
	
	@GetMapping("/user/userById/{id}")
	public Optional<User> getUserbyId(@PathVariable(value = "id") int userId)
	{
		return user.findById(userId);
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

		} 
		else{
			 	
			ur = new UserResult(false," not User Present", userDetails);
		}
		return ur;
	}
	
	@PutMapping("/admin/modifyProduct/{id}")
	public ProductResult modifyProduct(@PathVariable(value = "id") int productsId,
			@RequestBody Products productsDetails){
		
		boolean isProductExist = p.existsById(productsId);
		int updateStatus;
		ProductResult pr;
		
		if(isProductExist)
		{
			updateStatus = p.modifyProductDetails(productsDetails);
			pr = new ProductResult(true,"Product Updated Successfully", productsDetails); 	
			
		} 
		else{
			 	
			pr = new ProductResult(false,"Product  is Not Updated Successfully", productsDetails);
		}
		return pr;
	}
	
	@PutMapping("/admin/modifyCategory/{id}")
	public CategoryResult modifyCategory(@PathVariable(value = "id") int categoryId,
			@RequestBody Category categoryDetails){
		
		boolean isCategoryExist = cat.existsById(categoryId);
		int updateStatus;
		CategoryResult cr;
		
		if(isCategoryExist)
		{
			updateStatus = cat.modifyCategoryDetails(categoryDetails);
			cr = new CategoryResult(true,"Category Updated Successfully", categoryDetails); 	
			
		} 
		else{
			 	
			cr = new CategoryResult(false,"Category is Not Updated Successfully", categoryDetails);
		}
		return cr;
	}
	
	@PutMapping("/admin/modifyBrand/{id}")
	public BrandResult modifyBrand(@PathVariable(value = "id") int brandId,
			@RequestBody Brand brandDetails){
		
		boolean isBrandExist = b.existsById(brandId);
		int updateStatus;
		BrandResult br;
		
		if(isBrandExist)
		{
			updateStatus = b.modifyBrandDetails(brandDetails);
			br = new BrandResult(true,"Brand Updated Successfully", brandDetails); 	
			
		} 
		else{
			 	
			br = new BrandResult(false,"Brand is Not Updated Successfully", brandDetails);
		}
		return br;
	}
	
	@GetMapping("/vehicle/getAllBrands")
	public List<Brand> getallBrand()
	{	
		return b.findAll();		
	}
	
	@GetMapping("/vehicle/getCategoryDetails")
	public List<Category> categoryDetails()
	{	
		
		return cat.findAll();
				
	}
	

	@PostMapping("/vehicle/addProduct")
	public ProductResult addProduct(@RequestBody Products products)
	{
		
		ProductResult pr = new ProductResult(false,"Insertion Failed",null);  	
    	p.saveProduct(products);
    	pr.setStatus(true);
    	pr.setMessage("Add Vehicle Successfull");
    	return pr;
		
	}
	
	@PostMapping("/admin/addBrand")
	public BrandResult addBrand(@RequestBody Brand brands)
	{
		
		BrandResult br = new BrandResult(false,"Insertion Failed",null);  	
    	b.saveBrand(brands);
    	br.setStatus(true);
    	br.setMessage("Add Brand Successfull");
    	return br;
		
	}
	

	@GetMapping("/vehicle/getOrderDetails")
	public List<OrderdetailsResult> OrderDetails()
	{	
		return ord.allOrderDetails();
		
				
	}
	
	@GetMapping("/user/getUserProfileDetails")
	public List<UserProfileResult> getUserProfile()
	{	
		return user.getUserProfile();
		
				
	}
	

	@PostMapping("/buy/generateOrder")
	public OrderdetailsResult addOrder(@RequestBody Orderdetails order)
	{
		
		OrderdetailsResult ordered = new OrderdetailsResult();  	
		Orderdetails ordid= ord.save(order);
		ord.flush();
    	ordered.setStatus(true);
    	ordered.setMessage("Add Order Successfull");
    	ordered.setOrderid(ordid.getOrderid());
    	return ordered;
		
	}

}