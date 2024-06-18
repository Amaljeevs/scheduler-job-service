package com.alfaris.esb.dto;

public class StmTsRqHdr {
	
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
	public StmTsRqHdr(String employeeId, String transDate, String transTime, String transSeq) {
		super();
		this.employeeId = employeeId;
		this.transDate = transDate;
		this.transTime = transTime;
		this.transSeq = transSeq;
	}
	public StmTsRqHdr() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "stmtsRqHdr [employeeId=" + employeeId + ", transDate=" + transDate + ", transTime=" + transTime
				+ ", transSeq=" + transSeq + "]";
	}
	
	

}
