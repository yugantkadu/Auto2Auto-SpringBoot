package auto2aviation;

public class CategoryResult
{

    private boolean status;
	
	private String message;
	
	private Category category;

	public CategoryResult(boolean status, String message, Category category) {
		super();
		this.status = status;
		this.message = message;
		this.category = category;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	

	
}
