package auto2auto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Products {
	
	@Column(name="productid")
	@Id
	private int productid;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "brandid")
	private Brand brandid;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "manufacturerid")
	private User manufacturerid;
	
	private String productname;
	private String productdescription;
	private String productimage;
	private int quantityinstock;
	private long buyprice;
	
	@OneToMany(mappedBy = "productid", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Products> productitems;
	
	public int getProductid() {
		return productid;
	}



	public void setProductid(int productid) {
		this.productid = productid;
	}



	public Brand getBrandid() {
		return brandid;
	}



	public void setBrandid(Brand brandid) {
		this.brandid = brandid;
	}



	public User getManufacturerid() {
		return manufacturerid;
	}



	public void setManufacturerid(User manufacturerid) {
		this.manufacturerid = manufacturerid;
	}



	public String getProductname() {
		return productname;
	}



	public void setProductname(String productname) {
		this.productname = productname;
	}



	public String getProductdescription() {
		return productdescription;
	}

	

	public String getProductimage() {
		return productimage;
	}



	public void setProductimage(String productimage) {
		this.productimage = productimage;
	}



	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}



	public int getQuantityinstock() {
		return quantityinstock;
	}



	public void setQuantityinstock(int quantityinStock) {
		this.quantityinstock = quantityinStock;
	}



	public long getBuyprice() {
		return buyprice;
	}



	public void setBuyprice(long buyprice) {
		this.buyprice = buyprice;
	}

	

	public Products(int productid, Brand brandid, User manufacturerid, String productname, String productdescription,
			String productimage,int quantityinstock, long buyprice) {
		super();
		this.productid = productid;
		this.brandid = brandid;
		this.manufacturerid = manufacturerid;
		this.productname = productname;
		this.productdescription = productdescription;
		this.productimage = productimage;
		this.quantityinstock = quantityinstock;
		this.buyprice = buyprice;
	}



	public Products() {
			
	}
	
	
}