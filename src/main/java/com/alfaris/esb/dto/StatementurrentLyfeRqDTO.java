package com.alfaris.esb.dto;

public class StatementurrentLyfeRqDTO {

	private String cisNumber;

	private String userId;

	private String endDate;

	private String startDate;

	private String acctNumber;

	public String getCisNumber() {
		return cisNumber;
	}

	public void setCisNumber(String cisNumber) {
		this.cisNumber = cisNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}

	public StatementurrentLyfeRqDTO(String cisNumber, String userId, String endDate, String startDate,
			String acctNumber) {
		super();
		this.cisNumber = cisNumber;
		this.userId = userId;
		this.endDate = endDate;
		this.startDate = startDate;

	}

	public StatementurrentLyfeRqDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StatementurrentLyfeRqDTO [cisNumber=" + cisNumber + ", userId=" + userId + ", endDate=" + endDate
				+ ", startDate=" + startDate + ", acctNumber=" + acctNumber + "]";
	}

}
