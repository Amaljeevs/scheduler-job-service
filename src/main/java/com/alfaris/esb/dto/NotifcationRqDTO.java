package com.alfaris.esb.dto;

public class NotifcationRqDTO {


	private String project;

	private String iBan;

	private String smsDestination;

	private String emailDestination;

	private String notifyFlag;

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getiBan() {
		return iBan;
	}

	public void setiBan(String iBan) {
		this.iBan = iBan;
	}

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

	public String getNotifyFlag() {
		return notifyFlag;
	}

	public void setNotifyFlag(String notifyFlag) {
		this.notifyFlag = notifyFlag;
	}

	public NotifcationRqDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NotifcationRqDTO(String project, String iBan, String smsDestination, String emailDestination,
			String notifyFlag) {
		super();
		this.project = project;
		this.iBan = iBan;
		this.smsDestination = smsDestination;
		this.emailDestination = emailDestination;
		this.notifyFlag = notifyFlag;
	}

	@Override
	public String toString() {
		return "NotifcationRqDTO [project=" + project + ", iBan=" + iBan + ", smsDestination=" + smsDestination
				+ ", emailDestination=" + emailDestination + ", notifyFlag=" + notifyFlag + "]";
	}

}
