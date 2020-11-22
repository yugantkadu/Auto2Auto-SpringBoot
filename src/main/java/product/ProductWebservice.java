package product;

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
public class ProductWebservice {
	
	private XRepository r;
	
	
	@Autowired
	public void f1(XRepository y)
	{ 
		System.out.println("autowired successfully");
		r =y;
		
	}
	
	
	
	
	//http://localhost:7070/hw
	@GetMapping("/hw")
	public String f1()
	{
		return "hey web servcie is working";
		
	}
	
	@GetMapping("/product/getAllProducts")
	public List<Products> ss()
	{	
		
		return r.findAll();
				
	}
}
