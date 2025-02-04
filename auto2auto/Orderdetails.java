package auto2auto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Orderdetails {
	
	@Column(name="orderid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int orderid;
	
	@ManyToOne()
	@JoinColumn(name="retailerid")
	private User retailerid;
	
	@ManyToOne()
	@JoinColumn(name="productid")
	private Products productid;
	
	private int quantityordered;
	private long price;
	
	@OneToMany(mappedBy = "orderid", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Orderdetails> OrderdetailsList;
 
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	
	public User getRetailerid() {
		return retailerid;
	}
	public void setRetailerid(User retailerid) {
		this.retailerid = retailerid;
	}
	
	public Products getProductid() {
		return productid;
	}
	public void setProductid(Products productid) {
		this.productid = productid;
	}
	public int getQuantityordered() {
		return quantityordered;
	}
	public void setQuantityordered(int quantityordered) {
		this.quantityordered = quantityordered;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	public Orderdetails(int orderid, User retailerid,Products productid, int quantityordered, long price) {
		super();
		this.orderid = orderid;
		this.retailerid = retailerid;
		this.productid = productid;
		this.quantityordered = quantityordered;
		this.price = price;
	}
	
	public Orderdetails() {
		
	}
	
}

