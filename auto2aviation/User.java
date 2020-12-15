package auto2aviation;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@Column(name="userid")
	@Id
	private int userid;
	
	private String firstname;

	private String lastname;
	
	private String email;
	
	private String password;
	
	private long mobileno;
	
	private String address;
	
	private String pincode;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "categoryid")
	private Category categoryid;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "brandid")
	private Brand brandid;
	
	@OneToMany(mappedBy = "userid", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<User> userDetails;
	
	@Column(
		    columnDefinition = "Enum('retailer','manufacturer','admin')"
			)
	//@Enumerated(EnumType.STRING)
	private String usertype;

	public User() {
		super();
		
	}

	public User(int userid, String firstname, String lastname, String email, String password, long mobileno,
			String address, String pincode, Category categoryid, Brand brandid, String usertype) {
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

	public Category getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Category categoryid) {
		this.categoryid = categoryid;
	}

	public Brand getBrandid() {
		return brandid;
	}

	public void setBrandid(Brand brandid) {
		this.brandid = brandid;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}	

}