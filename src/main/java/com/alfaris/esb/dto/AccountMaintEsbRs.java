package com.alfaris.esb.dto;

public class AccountMaintEsbRs {
	
	private String status;
	private String statusDecr;
	private String msgCode;
	private String msgSeverity;
	private String msgText;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusDecr() {
		return statusDecr;
	}
	public void setStatusDecr(String statusDecr) {
		this.statusDecr = statusDecr;
	}
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public String getMsgSeverity() {
		return msgSeverity;
	}
	public void setMsgSeverity(String msgSeverity) {
		this.msgSeverity = msgSeverity;
	}
	public String getMsgText() {
		return msgText;
	}
	public void setMsgText(String msgText) {
		this.msgText = msgText;
	}
	@Override
	public String toString() {
		return "AccountMaintEsbRs [status=" + status + ", statusDecr=" + statusDecr + ", msgCode=" + msgCode
				+ ", msgSeverity=" + msgSeverity + ", msgText=" + msgText + "]";
	}
	
	

}
