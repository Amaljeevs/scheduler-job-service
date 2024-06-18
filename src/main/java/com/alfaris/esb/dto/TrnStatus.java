package com.alfaris.esb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrnStatus {
	@JsonProperty("msgCode")
	private String msgCode;
	@JsonProperty("msgSeverity")
	private String msgSeverity;
	@JsonProperty("msgText")
	private String msgText;
	@JsonProperty("msgAcct")
	private String msgAcct;
	@JsonProperty("msgPgm")
	private String msgPgm;
	@JsonProperty("msgDag")
	private String msgDag;
	@JsonProperty("msgField")
	private String msgField;
	@JsonProperty("msgFieldDim1")
	private String msgFieldDim1;
	@JsonProperty("msgFieldDim2")
	private String msgFieldDim2;
	@JsonProperty("msgFieldDim3")
	private String msgFieldDim3;
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
	public String getMsgAcct() {
		return msgAcct;
	}
	public void setMsgAcct(String msgAcct) {
		this.msgAcct = msgAcct;
	}
	public String getMsgPgm() {
		return msgPgm;
	}
	public void setMsgPgm(String msgPgm) {
		this.msgPgm = msgPgm;
	}
	public String getMsgDag() {
		return msgDag;
	}
	public void setMsgDag(String msgDag) {
		this.msgDag = msgDag;
	}
	public String getMsgField() {
		return msgField;
	}
	public void setMsgField(String msgField) {
		this.msgField = msgField;
	}
	public String getMsgFieldDim1() {
		return msgFieldDim1;
	}
	public void setMsgFieldDim1(String msgFieldDim1) {
		this.msgFieldDim1 = msgFieldDim1;
	}
	public String getMsgFieldDim2() {
		return msgFieldDim2;
	}
	public void setMsgFieldDim2(String msgFieldDim2) {
		this.msgFieldDim2 = msgFieldDim2;
	}
	public String getMsgFieldDim3() {
		return msgFieldDim3;
	}
	public void setMsgFieldDim3(String msgFieldDim3) {
		this.msgFieldDim3 = msgFieldDim3;
	}
	public TrnStatus(String msgCode, String msgSeverity, String msgText, String msgAcct, String msgPgm, String msgDag,
			String msgField, String msgFieldDim1, String msgFieldDim2, String msgFieldDim3) {
		super();
		this.msgCode = msgCode;
		this.msgSeverity = msgSeverity;
		this.msgText = msgText;
		this.msgAcct = msgAcct;
		this.msgPgm = msgPgm;
		this.msgDag = msgDag;
		this.msgField = msgField;
		this.msgFieldDim1 = msgFieldDim1;
		this.msgFieldDim2 = msgFieldDim2;
		this.msgFieldDim3 = msgFieldDim3;
	}
	public TrnStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TrnStatus [msgCode=" + msgCode + ", msgSeverity=" + msgSeverity + ", msgText=" + msgText + ", msgAcct="
				+ msgAcct + ", msgPgm=" + msgPgm + ", msgDag=" + msgDag + ", msgField=" + msgField + ", msgFieldDim1="
				+ msgFieldDim1 + ", msgFieldDim2=" + msgFieldDim2 + ", msgFieldDim3=" + msgFieldDim3 + "]";
	}
	
	

}
