package product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	
	@Column(name="productid")
	@Id
	private int productid;
	private int brandid;
	private int manufacturerid;
	private String productname;
	private String productdescription;
	private String productimage;
	private int quantityinstock;
	private long buyprice;
	
	
	
	public int getProductid() {
		return productid;
	}



	public void setProductid(int productid) {
		this.productid = productid;
	}



	public int getBrandid() {
		return brandid;
	}



	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}



	public int getManufacturerid() {
		return manufacturerid;
	}



	public void setManufacturerid(int manufacturerid) {
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

	

	public Products(int productid, int brandid, int manufacturerid, String productname, String productdescription,
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
