package com.alfaris.esb.dto;

public class RiyadBankHeader {

	private String msgFormat;
    private String msgVersion;
    private String requestorChannelId;
    private String requestorChannelFunction;
    private String requestorUserId;
    private String severityLevel;
    private String requestorLanguage;
    private String requestorSecurityInfo;
    private String asiReturnCode;
    private String descriptionEn;
    private String descriptionAr;
	public String getMsgFormat() {
		return msgFormat;
	}
	public void setMsgFormat(String msgFormat) {
		this.msgFormat = msgFormat;
	}
	public String getMsgVersion() {
		return msgVersion;
	}
	public void setMsgVersion(String msgVersion) {
		this.msgVersion = msgVersion;
	}
	public String getRequestorChannelId() {
		return requestorChannelId;
	}
	public void setRequestorChannelId(String requestorChannelId) {
		this.requestorChannelId = requestorChannelId;
	}
	public String getRequestorChannelFunction() {
		return requestorChannelFunction;
	}
	public void setRequestorChannelFunction(String requestorChannelFunction) {
		this.requestorChannelFunction = requestorChannelFunction;
	}
	public String getRequestorUserId() {
		return requestorUserId;
	}
	public void setRequestorUserId(String requestorUserId) {
		this.requestorUserId = requestorUserId;
	}
	public String getSeverityLevel() {
		return severityLevel;
	}
	public void setSeverityLevel(String severityLevel) {
		this.severityLevel = severityLevel;
	}
	public String getRequestorLanguage() {
		return requestorLanguage;
	}
	public void setRequestorLanguage(String requestorLanguage) {
		this.requestorLanguage = requestorLanguage;
	}
	public String getRequestorSecurityInfo() {
		return requestorSecurityInfo;
	}
	public void setRequestorSecurityInfo(String requestorSecurityInfo) {
		this.requestorSecurityInfo = requestorSecurityInfo;
	}
	public String getAsiReturnCode() {
		return asiReturnCode;
	}
	public void setAsiReturnCode(String asiReturnCode) {
		this.asiReturnCode = asiReturnCode;
	}
	public String getDescriptionEn() {
		return descriptionEn;
	}
	public void setDescriptionEn(String descriptionEn) {
		this.descriptionEn = descriptionEn;
	}
	public String getDescriptionAr() {
		return descriptionAr;
	}
	public void setDescriptionAr(String descriptionAr) {
		this.descriptionAr = descriptionAr;
	}
	
	@Override
	public String toString() {
		return "RiyadBankHeader [msgFormat=" + msgFormat + ", msgVersion=" + msgVersion + ", requestorChannelId="
				+ requestorChannelId + ", requestorChannelFunction=" + requestorChannelFunction + ", requestorUserId="
				+ requestorUserId + ", severityLevel=" + severityLevel + ", requestorLanguage=" + requestorLanguage
				+ ", requestorSecurityInfo=" + requestorSecurityInfo + ", asiReturnCode=" + asiReturnCode
				+ ", descriptionEn=" + descriptionEn + ", descriptionAr=" + descriptionAr + "]";
	}
	public RiyadBankHeader(String msgFormat, String msgVersion, String requestorChannelId,
			String requestorChannelFunction, String requestorUserId, String severityLevel, String requestorLanguage,
			String requestorSecurityInfo, String asiReturnCode, String descriptionEn, String descriptionAr) {
		super();
		this.msgFormat = msgFormat;
		this.msgVersion = msgVersion;
		this.requestorChannelId = requestorChannelId;
		this.requestorChannelFunction = requestorChannelFunction;
		this.requestorUserId = requestorUserId;
		this.severityLevel = severityLevel;
		this.requestorLanguage = requestorLanguage;
		this.requestorSecurityInfo = requestorSecurityInfo;
		this.asiReturnCode = asiReturnCode;
		this.descriptionEn = descriptionEn;
		this.descriptionAr = descriptionAr;
	}
	
	public RiyadBankHeader() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
