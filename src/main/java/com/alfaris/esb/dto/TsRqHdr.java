package com.alfaris.esb.dto;

public class TsRqHdr {

	private String employeeId;
	private String transDate;
	private String transTime;
	private String transSeq;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getTransDate() {
		return transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public String getTransTime() {
		return transTime;
	}

	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}

	public String getTransSeq() {
		return transSeq;
	}

	public void setTransSeq(String transSeq) {
		this.transSeq = transSeq;
	}

	@Override
	public String toString() {
		return "TsRqHdr [employeeId=" + employeeId + ", transDate=" + transDate + ", transTime=" + transTime
				+ ", transSeq=" + transSeq + "]";
	}

	public TsRqHdr() {
		super();
	}

	public TsRqHdr(String employeeId, String transDate, String transTime, String transSeq) {
		super();
		this.employeeId = employeeId;
		this.transDate = transDate;
		this.transTime = transTime;
		this.transSeq = transSeq;
	}

}
