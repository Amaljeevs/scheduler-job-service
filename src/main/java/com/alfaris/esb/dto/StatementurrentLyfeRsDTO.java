package com.alfaris.esb.dto;

public class StatementurrentLyfeRsDTO {

	private String postingDate;

	private String balance;

	private String transType;

	private String tranRef;

	private String transDesc;

	private String vaNumber;

	private String transAmount;

	private String srcAccNum;

	public String getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(String postingDate) {
		this.postingDate = postingDate;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getTransDesc() {
		return transDesc;
	}

	public void setTransDesc(String transDesc) {
		this.transDesc = transDesc;
	}

	public String getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public String getTranRef() {
		return tranRef;
	}

	public void setTranRef(String tranRef) {
		this.tranRef = tranRef;
	}

	public String getVaNumber() {
		return vaNumber;
	}

	public void setVaNumber(String vaNumber) {
		this.vaNumber = vaNumber;
	}

	public String getSrcAccNum() {
		return srcAccNum;
	}

	public void setSrcAccNum(String srcAccNum) {
		this.srcAccNum = srcAccNum;
	}

	public StatementurrentLyfeRsDTO(String postingDate, String balance, String transType, String tranRef,
			String transDesc, String vaNumber, String transAmount, String srcAccNum) {
		super();
		this.postingDate = postingDate;
		this.balance = balance;
		this.transType = transType;
		this.tranRef = tranRef;
		this.transDesc = transDesc;
		this.vaNumber = vaNumber;
		this.transAmount = transAmount;
		this.srcAccNum = srcAccNum;
	}

	@Override
	public String toString() {
		return "StatementurrentLyfeRsDTO [postingDate=" + postingDate + ", balance=" + balance + ", transType="
				+ transType + ", tranRef=" + tranRef + ", transDesc=" + transDesc + ", vaNumber=" + vaNumber
				+ ", transAmount=" + transAmount + ", srcAccNum=" + srcAccNum + "]";
	}

	public StatementurrentLyfeRsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
