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
	
	private ProductsRepository p;
	private BrandRepository b;
	
	@Autowired
	public void f1(ProductsRepository y)
	{ 
		System.out.println("autowired successfully");
		p =y;
		
	}
	
	@Autowired
	public void getbrands(BrandRepository y)
	{ 
		System.out.println("autowired successfully");
		b =y;
		
	}
	
	
	@GetMapping("/vehicle/getAllProducts")
	public List<Products> allProducts()
	{	
		
		return p.findAll();
				
	}
	
	@GetMapping("/vehicle/getAllBrands")
	public List<Brand> allBrand()
	{	
		return b.findAll();		
	}
	
	
}
