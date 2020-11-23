package auto2aviation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;


enum customerType
{
  retailer,
  manufacturer;
  
}

@Entity
public class Customer
{
	@Id
	private int customerid;
	
	private String firstname;

	private String lastname;
	
	private String email;
	
	private String password;
	
	private long mobileno;
	
	private String address;
	
	private String pincode;
	
	private int categoryid;
	
	private int brandid;
	
	@Column(
		    columnDefinition = "Enum('retailer','manufacturer')"
			)
	@Enumerated(EnumType.STRING)
	private customerType customertype;

	public Customer() {
		super();
		
	}

	public Customer(int customerid, String firstname, String lastname, String email, String password, long mobileno,
			String address, String pincode, int categoryid, int brandid, customerType customertype) {
		super();
		this.customerid = customerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.mobileno = mobileno;
		this.address = address;
		this.pincode = pincode;
		this.categoryid = categoryid;
		this.brandid = brandid;
		this.customertype = customertype;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public int getBrandid() {
		return brandid;
	}

	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}

	public customerType getCustomertype() {
		return customertype;
	}

	public void setCustomertype(customerType customertype) {
		this.customertype = customertype;
	}

	
	
	
	
	

}
