package com.alfaris.esb.dto;

public class OverrideMessage {
	private String system;
    private String informationCode;
    private String replyMessage;
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getInformationCode() {
		return informationCode;
	}
	public void setInformationCode(String informationCode) {
		this.informationCode = informationCode;
	}
	public String getReplyMessage() {
		return replyMessage;
	}
	public void setReplyMessage(String replyMessage) {
		this.replyMessage = replyMessage;
	}
	public OverrideMessage(String system, String informationCode, String replyMessage) {
		super();
		this.system = system;
		this.informationCode = informationCode;
		this.replyMessage = replyMessage;
	}
	public OverrideMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OverrideMessage [system=" + system + ", informationCode=" + informationCode + ", replyMessage="
				+ replyMessage + "]";
	}
    
    

}
