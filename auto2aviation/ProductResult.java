package auto2auto;

public class ProductResult 
{
	
    private boolean status;
	
	private String message;
	
	private Products products;

	public ProductResult(boolean status, String message, Products products) {
		super();
		this.status = status;
		this.message = message;
		this.products = products;
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

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	
}