package auto2aviation;

public class BrandResult
{

    private boolean status;
	
	private String message;
	
	private Brand brand;

	public BrandResult(boolean status, String message, Brand brand) {
		super();
		this.status = status;
		this.message = message;
		this.brand = brand;
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
	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
}
