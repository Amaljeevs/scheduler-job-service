package com.alfaris.esb.dto;

public class ServicesChannelsDetails {

	private String subscriptionStatus;
	private String channelName;
	private String channelDisabled;

	public String getSubscriptionStatus() {
		return subscriptionStatus;
	}

	public void setSubscriptionStatus(String subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getChannelDisabled() {
		return channelDisabled;
	}

	public void setChannelDisabled(String channelDisabled) {
		this.channelDisabled = channelDisabled;
	}

	public ServicesChannelsDetails(String subscriptionStatus, String channelName, String channelDisabled) {
		super();
		this.subscriptionStatus = subscriptionStatus;
		this.channelName = channelName;
		this.channelDisabled = channelDisabled;
	}

	public ServicesChannelsDetails() {
		super();
	}

	@Override
	public String toString() {
		return "ServicesChannelsDetails [subscriptionStatus=" + subscriptionStatus + ", channelName=" + channelName
				+ ", channelDisabled=" + channelDisabled + "]";
	}

}
