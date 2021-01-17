package auto2auto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Payment {
	
	@Column(name="paymentid")
	@Id
	 private int paymentid;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="orderid")
	 private Orderdetails orderid;
	 private String razorpaypaymentid;
	 private String razorpayorderid;
	 private long amount;
	 private String paymentmode;
	 private String paymentdate;
	 
	public int getPaymentid() {
		return paymentid;
	}



	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}



	public Orderdetails getOrderid() {
		return orderid;
	}



	public void setOrderid(Orderdetails orderid) {
		this.orderid = orderid;
	}



	public String getRazorpaypaymentid() {
		return razorpaypaymentid;
	}



	public void setRazorpaypaymentid(String razorpaypaymentid) {
		this.razorpaypaymentid = razorpaypaymentid;
	}



	public String getRazorpayorderid() {
		return razorpayorderid;
	}



	public void setRazorpayorderid(String razorpayorderid) {
		this.razorpayorderid = razorpayorderid;
	}



	public long getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public String getPaymentmode() {
		return paymentmode;
	}



	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}



	public String getPaymentdate() {
		return paymentdate;
	}



	public void setPaymentdate(String paymentdate) {
		this.paymentdate = paymentdate;
	}



	public Payment(int paymentid, Orderdetails orderid, String razorpaypaymentid, String razorpayorderid, long amount,
			String paymentmode, String paymentdate) {
		super();
		this.paymentid = paymentid;
		this.orderid = orderid;
		this.razorpaypaymentid = razorpaypaymentid;
		this.razorpayorderid = razorpayorderid;
		this.amount = amount;
		this.paymentmode = paymentmode;
		this.paymentdate = paymentdate;
	}
	
	public Payment() {
		
	}
	 
	 
}
