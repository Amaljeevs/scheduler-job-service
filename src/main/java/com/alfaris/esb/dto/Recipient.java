package com.alfaris.esb.dto;

public class Recipient {

	private String smsDestination;
	private String emailDestination;
	private String language;
	private String notificationMethod;
	
	public String getSmsDestination() {
		return smsDestination;
	}
	public void setSmsDestination(String smsDestination) {
		this.smsDestination = smsDestination;
	}
	public String getEmailDestination() {
		return emailDestination;
	}
	public void setEmailDestination(String emailDestination) {
		this.emailDestination = emailDestination;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getNotificationMethod() {
		return notificationMethod;
	}
	public void setNotificationMethod(String notificationMethod) {
		this.notificationMethod = notificationMethod;
	}
	@Override
	public String toString() {
		return "Recipient [smsDestination=" + smsDestination + ", emailDestination=" + emailDestination + ", language="
				+ language + ", notificationMethod=" + notificationMethod + "]";
	}
	public Recipient(String smsDestination, String emailDestination, String language, String notificationMethod) {
		super();
		this.smsDestination = smsDestination;
		this.emailDestination = emailDestination;
		this.language = language;
		this.notificationMethod = notificationMethod;
	}
	public Recipient() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
