package auto2aviation;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.lang.Nullable;

@Entity
public class Brand {
	
	
	@Column(name="brandid")
	@Id
	 private int brandid;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "categoryid")
	private Category categoryid;
	
     @Nullable
	 private String name;
     @Nullable
	 private String branddescription;
     @Nullable
	 private String image;
	 
     
	 
	 @OneToMany(mappedBy = "brandid", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		private List<Brand> brandDetails;
	 
	public int getBrandid() {
		return brandid;
	}
	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}
	public Category getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Category categoryid) {
		this.categoryid = categoryid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranddescription() {
		return branddescription;
	}
	public void setBranddescription(String branddescription) {
		this.branddescription = branddescription;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Brand(int brandid, Category categoryid, String name, String branddescription, String image) {
		
		this.brandid = brandid;
		this.categoryid = categoryid;
		this.name = name;
		this.branddescription = branddescription;
		this.image = image;
	}
	public Brand() {
		
		// TODO Auto-generated constructor stub
	}
	 
	 
	 //branch is not merging...pritam


}