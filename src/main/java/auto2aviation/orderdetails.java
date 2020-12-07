package auto2aviation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class orderdetails {
	
	@Column(name="orderid")
	@Id
	private int orderid;
	private int retailerid;
	private int productid;
	private int quantityordered;
	private long price;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getRetailerid() {
		return retailerid;
	}
	public void setRetailerid(int retailerid) {
		this.retailerid = retailerid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getquantityordered() {
		return quantityordered;
	}
	public void setquantityordered(int quantityordered) {
		this.quantityordered = quantityordered;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public orderdetails(int orderid, int retailerid, int productid, int quantityordered, long price) {
		
		this.orderid = orderid;
		this.retailerid = retailerid;
		this.productid = productid;
		this.quantityordered = quantityordered;
		this.price = price;
	}
	public orderdetails() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
