package auto2auto;

public class PaymentResult {
	
	private boolean status;
	
	private String message;
	
	private Payment payment;

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

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public PaymentResult(boolean status, String message, Payment payment) {
		super();
		this.status = status;
		this.message = message;
		this.payment = payment;
	}
	
	public PaymentResult() {

	}
}
