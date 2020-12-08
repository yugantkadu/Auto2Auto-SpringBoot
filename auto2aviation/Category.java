package auto2aviation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Category {

	@Column(name="categoryid")
	@Id
	  private int categoryid;
	  private String name ;
	  private String categorydescription; 
	  private String image ;
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
	public String getcategorydescription() {
		return categorydescription;
	}
	public void setcategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Category(int categoryid, String name, String categorydescription, String image) {
		
		this.categoryid = categoryid;
		this.name = name;
		this.categorydescription = categorydescription;
		this.image = image;
	}
	public Category() {
	
		
	}
	  
	

}