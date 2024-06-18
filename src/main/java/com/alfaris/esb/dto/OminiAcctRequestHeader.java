package com.alfaris.esb.dto;

public class OminiAcctRequestHeader {
	
   private String channelId;
   
   private String serviceName;
   
   private String cisNumber;
   
   private String language;
   
   private String requesterIpAddress;

public String getChannelId() {
	return channelId;
}

public void setChannelId(String channelId) {
	this.channelId = channelId;
}

public String getServiceName() {
	return serviceName;
}

public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
}

public String getCisNumber() {
	return cisNumber;
}

public void setCisNumber(String cisNumber) {
	this.cisNumber = cisNumber;
}

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}

public String getRequesterIpAddress() {
	return requesterIpAddress;
}

public void setRequesterIpAddress(String requesterIpAddress) {
	this.requesterIpAddress = requesterIpAddress;
}

public OminiAcctRequestHeader(String channelId, String serviceName, String cisNumber, String language,
		String requesterIpAddress) {
	super();
	this.channelId = channelId;
	this.serviceName = serviceName;
	this.cisNumber = cisNumber;
	this.language = language;
	this.requesterIpAddress = requesterIpAddress;
}

public OminiAcctRequestHeader() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "OminiAcctRequestHeader [channelId=" + channelId + ", serviceName=" + serviceName + ", cisNumber="
			+ cisNumber + ", language=" + language + ", requesterIpAddress=" + requesterIpAddress + "]";
}
   
   
	
	

}
