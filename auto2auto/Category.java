package auto2aviation;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.lang.Nullable;
@Entity
public class Category {

	@Column(name="categoryid")
	@Id
	  private int categoryid;
	@Nullable
	  private String name ;
	@Nullable
	  private String categorydescription; 
	@Nullable
	  private String image ;
	  
		
	  @OneToMany(mappedBy = "categoryid", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		private List<Category> categoryDetails;
	  
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
		
	public String getCategorydescription() {
		return categorydescription;
	}
	public void setCategorydescription(String categorydescription) {
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