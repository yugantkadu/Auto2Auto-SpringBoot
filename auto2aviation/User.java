package auto2aviation;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


enum userType
{
  retailer,
  manufacturer,
  admin;
  
}

@Entity
public class User
{
	@Id
	private int userid;
	
	private String firstname;

	private String lastname;
	
	private String email;
	
	private String password;
	
	private long mobileno;
	
	private String address;
	
	private String pincode;
	
	private int categoryid;
	
	private int brandid;
	
	@OneToMany(mappedBy = "retailerid", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Orderdetails> orderitems;
	
	@Column(
		    columnDefinition = "Enum('retailer','manufacturer','admin')"
			)
	@Enumerated(EnumType.STRING)
	private userType usertype;

	public User() {
		super();
		
	}

	public User(int userid, String firstname, String lastname, String email, String password, long mobileno,
			String address, String pincode, int categoryid, int brandid, userType usertype) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.mobileno = mobileno;
		this.address = address;
		this.pincode = pincode;
		this.categoryid = categoryid;
		this.brandid = brandid;
		this.usertype = usertype;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public userType getUsertype() {
		return usertype;
	}

	public void setUsertype(userType usertype) {
		this.usertype = usertype;
	}	

}
