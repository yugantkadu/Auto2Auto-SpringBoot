package auto2auto;

public class UserProfileResult 
{
	private int userid;
	
	private String firstname;
	
	private String name;
	
	private String brandname;
	
	private String usertype;

	public UserProfileResult(int userid, String firstname, String name, String brandname, String usertype) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.name = name;
		this.brandname = brandname;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}


}
