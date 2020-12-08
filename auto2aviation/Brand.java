package auto2aviation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Brand {
	
	
	@Column(name="brandid")
	@Id
	 private int brandid;
     private int categoryid;
	 private String name;
	 private String branddescription;
	 private String image;
	public int getBrandid() {
		return brandid;
	}
	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getbranddescription() {
		return branddescription;
	}
	public void setbranddescription(String branddescription) {
		this.branddescription = branddescription;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Brand(int brandid, int categoryid, String name, String branddescription, String image) {
		
		this.brandid = brandid;
		this.categoryid = categoryid;
		this.name = name;
		this.branddescription = branddescription;
		this.image = image;
	}
	public Brand() {
		
		// TODO Auto-generated constructor stub
	}
	 
	 
	 


}