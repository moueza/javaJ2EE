package beans;

import java.util.Date;

public class Message {
	
	private String leMessage;
	private Date ladate;
	
	public Message(String leMessage, Date ladate) {
		super();
	
		this.leMessage = leMessage;
		this.ladate = ladate;
	}

	public String getLeMessage() {
		return leMessage;
	}

	public void setLeMessage(String leMessage) {
		this.leMessage = leMessage;
	}

	public Date getLadate() {
		return ladate;
	}

	public void setLadate(Date ladate) {
		this.ladate = ladate;
	}

	@Override
	public String toString() {
		return "Message [leMessage=" + leMessage + ", ladate=" + ladate + "]";
	}

	
	
	
	
}
