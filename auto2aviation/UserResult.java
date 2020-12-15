package auto2aviation;

import java.util.Optional;

public class UserResult 
{
	
	private boolean status;
	private String message;
	private User user;

	public UserResult(boolean status, String message, User user) {
		super();
		this.status = status;
		this.message = message;
		this.user = user;
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
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}