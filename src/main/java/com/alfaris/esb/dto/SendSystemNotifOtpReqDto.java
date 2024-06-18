package com.alfaris.esb.dto;

import org.json.simple.JSONObject;

public class SendSystemNotifOtpReqDto {

	private SendSystemNotifRqHeader riyadBankHeader;
	private String eventType;
	private String iomssEventCd;
	private String templateType;
	private ParameterList parameterList;
	private String deptCd;
	private String adminType;
	private String adminId;
	private RecipientList recipientList;
	public SendSystemNotifRqHeader getRiyadBankHeader() {
		return riyadBankHeader;
	}
	public void setRiyadBankHeader(SendSystemNotifRqHeader riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getIomssEventCd() {
		return iomssEventCd;
	}
	public void setIomssEventCd(String iomssEventCd) {
		this.iomssEventCd = iomssEventCd;
	}
	public String getTemplateType() {
		return templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}
	public ParameterList getParameterList() {
		return parameterList;
	}
	public void setParameterList(ParameterList parameterList) {
		this.parameterList = parameterList;
	}
	public String getDeptCd() {
		return deptCd;
	}
	public void setDeptCd(String deptCd) {
		this.deptCd = deptCd;
	}
	public String getAdminType() {
		return adminType;
	}
	public void setAdminType(String adminType) {
		this.adminType = adminType;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public RecipientList getRecipientList() {
		return recipientList;
	}
	public void setRecipientList(RecipientList recipientList) {
		this.recipientList = recipientList;
	}
	public SendSystemNotifOtpReqDto(SendSystemNotifRqHeader riyadBankHeader, String eventType, String iomssEventCd,
			String templateType, ParameterList parameterList, String deptCd, String adminType, String adminId,
			RecipientList recipientList) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.eventType = eventType;
		this.iomssEventCd = iomssEventCd;
		this.templateType = templateType;
		this.parameterList = parameterList;
		this.deptCd = deptCd;
		this.adminType = adminType;
		this.adminId = adminId;
		this.recipientList = recipientList;
	}
	public SendSystemNotifOtpReqDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SendSystemNotifOtpReqDto [riyadBankHeader=" + riyadBankHeader + ", eventType=" + eventType
				+ ", iomssEventCd=" + iomssEventCd + ", templateType=" + templateType + ", parameterList="
				+ parameterList + ", deptCd=" + deptCd + ", adminType=" + adminType + ", adminId=" + adminId
				+ ", recipientList=" + recipientList + "]";
	}

	
}
