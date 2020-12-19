package auto2auto;

public class OrderdetailsResult {
	private boolean status;
	private String message;
	private int orderid;
	private String productname;
	private String firstname;
	private String lastname;
	private int quantityordered;
	private long price;
	
	
	
	
	public int getOrderid() {
		return orderid;
	}



	public void setOrderid(int orderid) {
		this.orderid = orderid;
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



	public String getProductname() {
		return productname;
	}



	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	



	public int getQuantityordered() {
		return quantityordered;
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



	public void setQuantityordered(int quantityordered) {
		this.quantityordered = quantityordered;
	}



	public long getPrice() {
		return price;
	}



	public void setPrice(long price) {
		this.price = price;
	}



	


	public OrderdetailsResult(int orderid, String productname, String firstname, String lastname, int quantityordered,
			long price) {
		super();
		this.orderid = orderid;
		this.productname = productname;
		this.firstname = firstname;
		this.lastname = lastname;
		this.quantityordered = quantityordered;
		this.price = price;
	}



	public OrderdetailsResult() {
		
	}
	
	
}