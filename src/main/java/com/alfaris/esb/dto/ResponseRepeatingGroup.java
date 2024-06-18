package com.alfaris.esb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseRepeatingGroup {

	@JsonProperty("postingDate")
	private String postingDate;

	@JsonProperty("postingDateH")
	private String postingDateH;

	@JsonProperty("balance")
	private String balance;

	@JsonProperty("balanceSi")
	private String balanceSi;

	@JsonProperty("transType")
	private String transType;


	@JsonProperty("transDesc")
	private String transDesc;

	@JsonProperty("transAmount")
	private String transAmount;

	@JsonProperty("universalTransDesc")
	private String universalTransDesc;

	public String getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(String postingDate) {
		this.postingDate = postingDate;
	}

	public String getPostingDateH() {
		return postingDateH;
	}

	public void setPostingDateH(String postingDateH) {
		this.postingDateH = postingDateH;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBalanceSi() {
		return balanceSi;
	}

	public void setBalanceSi(String balanceSi) {
		this.balanceSi = balanceSi;
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
	public String getUniversalTransDesc() {
		return universalTransDesc;
	}

	public void setUniversalTransDesc(String universalTransDesc) {
		this.universalTransDesc = universalTransDesc;
	}

	
	public ResponseRepeatingGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ResponseRepeatingGroup [postingDate=" + postingDate + ", postingDateH=" + postingDateH + ", balance="
				+ balance + ", balanceSi=" + balanceSi + ", transType=" + transType + ", transDesc=" + transDesc
				+ ", transAmount=" + transAmount + ", universalTransDesc=" + universalTransDesc + "]";
	}

	public ResponseRepeatingGroup(String postingDate, String postingDateH, String balance, String balanceSi,
			String transType, String transDesc, String transAmount, String universalTransDesc) {
		super();
		this.postingDate = postingDate;
		this.postingDateH = postingDateH;
		this.balance = balance;
		this.balanceSi = balanceSi;
		this.transType = transType;
		this.transDesc = transDesc;
		this.transAmount = transAmount;
		this.universalTransDesc = universalTransDesc;
	}



}
