package com.alfaris.esb.dto;

public class VaAddEscRq {

	private String cisNumber;

	private String mode;

	private String currentAccount;

	private String projectId;

	public String getCisNumber() {
		return cisNumber;
	}

	public void setCisNumber(String cisNumber) {
		this.cisNumber = cisNumber;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(String currentAccount) {
		this.currentAccount = currentAccount;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public VaAddEscRq(String cisNumber, String mode, String currentAccount, String projectId) {
		super();
		this.cisNumber = cisNumber;
		this.mode = mode;
		this.currentAccount = currentAccount;
		this.projectId = projectId;
	}

	public VaAddEscRq() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VaAddEscRq [cisNumber=" + cisNumber + ", mode=" + mode + ", currentAccount=" + currentAccount
				+ ", projectId=" + projectId + "]";
	}
	
	

}
