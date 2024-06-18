package com.alfaris.esb.dto;

public class AccoutnCreationRsDTO {

	private String iBan;
	
	private String bBan;
	
	private String sysStatusMessage;
	
	private String  descriptionEn;
	
	private String returnCode;

	public String getiBan() {
		return iBan;
	}

	public void setiBan(String iBan) {
		this.iBan = iBan;
	}

	public String getbBan() {
		return bBan;
	}

	public void setbBan(String bBan) {
		this.bBan = bBan;
	}

	public String getSysStatusMessage() {
		return sysStatusMessage;
	}

	public void setSysStatusMessage(String sysStatusMessage) {
		this.sysStatusMessage = sysStatusMessage;
	}

	public String getDescriptionEn() {
		return descriptionEn;
	}

	public void setDescriptionEn(String descriptionEn) {
		this.descriptionEn = descriptionEn;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public AccoutnCreationRsDTO(String iBan, String bBan, String sysStatusMessage, String descriptionEn,
			String returnCode) {
		super();
		this.iBan = iBan;
		this.bBan = bBan;
		this.sysStatusMessage = sysStatusMessage;
		this.descriptionEn = descriptionEn;
		this.returnCode = returnCode;
	}

	public AccoutnCreationRsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
