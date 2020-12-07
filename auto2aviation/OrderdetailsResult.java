package auto2aviation;

public class OrderdetailsResult {
	private int orderid;
	private String firstname;
	private String productname;
	
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
	
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public OrderdetailsResult(int orderid, String firstname,String productname) {
		super();
		this.orderid = orderid;
		this.firstname = firstname;
		this.productname = productname;
	}
	
	public OrderdetailsResult() {
		
	}
	
	
}
