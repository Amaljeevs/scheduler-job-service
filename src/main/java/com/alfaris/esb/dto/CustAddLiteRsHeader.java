package com.alfaris.esb.dto;

public class CustAddLiteRsHeader {
	
	private String serviceName;
    private String channelId;
    private String functionId;
    private String language;
    private String messageVersion;
    private String userId;
    private String cisNumber;
    private String organizationId;
    private String referenceNumber;
    private String transactionKey;
    private String ipAddress;
    private String userLocation;
    private String deviceId;
    private String isReversal;
    private String reversalReferenceNumber;
    private String reqDateTime;
    private String replyDateTime;
    private String statusCode;
    private String statusDescEn;
    private String statusDescAr;
    
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getFunctionId() {
		return functionId;
	}
	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getMessageVersion() {
		return messageVersion;
	}
	public void setMessageVersion(String messageVersion) {
		this.messageVersion = messageVersion;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCisNumber() {
		return cisNumber;
	}
	public void setCisNumber(String cisNumber) {
		this.cisNumber = cisNumber;
	}
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public String getTransactionKey() {
		return transactionKey;
	}
	public void setTransactionKey(String transactionKey) {
		this.transactionKey = transactionKey;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getIsReversal() {
		return isReversal;
	}
	public void setIsReversal(String isReversal) {
		this.isReversal = isReversal;
	}
	public String getReversalReferenceNumber() {
		return reversalReferenceNumber;
	}
	public void setReversalReferenceNumber(String reversalReferenceNumber) {
		this.reversalReferenceNumber = reversalReferenceNumber;
	}
	public String getReqDateTime() {
		return reqDateTime;
	}
	public void setReqDateTime(String reqDateTime) {
		this.reqDateTime = reqDateTime;
	}
	public String getReplyDateTime() {
		return replyDateTime;
	}
	public void setReplyDateTime(String replyDateTime) {
		this.replyDateTime = replyDateTime;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusDescEn() {
		return statusDescEn;
	}
	public void setStatusDescEn(String statusDescEn) {
		this.statusDescEn = statusDescEn;
	}
	public String getStatusDescAr() {
		return statusDescAr;
	}
	public void setStatusDescAr(String statusDescAr) {
		this.statusDescAr = statusDescAr;
	}
	@Override
	public String toString() {
		return "CustAddLiteRsHeader [serviceName=" + serviceName + ", channelId=" + channelId + ", functionId="
				+ functionId + ", language=" + language + ", messageVersion=" + messageVersion + ", userId=" + userId
				+ ", cisNumber=" + cisNumber + ", organizationId=" + organizationId + ", referenceNumber="
				+ referenceNumber + ", transactionKey=" + transactionKey + ", ipAddress=" + ipAddress
				+ ", userLocation=" + userLocation + ", deviceId=" + deviceId + ", isReversal=" + isReversal
				+ ", reversalReferenceNumber=" + reversalReferenceNumber + ", reqDateTime=" + reqDateTime
				+ ", replyDateTime=" + replyDateTime + ", statusCode=" + statusCode + ", statusDescEn=" + statusDescEn
				+ ", statusDescAr=" + statusDescAr + "]";
	}
    
    

}
