package com.alfaris.esb.dto;

public class FalconData {
	
	private String falconIP;
	private String falconDeviceID;
	private String falconCountry;
	private String falconCity;
	private String falconAccessChId;
	public String getFalconIP() {
		return falconIP;
	}
	public void setFalconIP(String falconIP) {
		this.falconIP = falconIP;
	}
	public String getFalconDeviceID() {
		return falconDeviceID;
	}
	public void setFalconDeviceID(String falconDeviceID) {
		this.falconDeviceID = falconDeviceID;
	}
	public String getFalconCountry() {
		return falconCountry;
	}
	public void setFalconCountry(String falconCountry) {
		this.falconCountry = falconCountry;
	}
	public String getFalconCity() {
		return falconCity;
	}
	public void setFalconCity(String falconCity) {
		this.falconCity = falconCity;
	}
	public String getFalconAccessChId() {
		return falconAccessChId;
	}
	public void setFalconAccessChId(String falconAccessChId) {
		this.falconAccessChId = falconAccessChId;
	}
	public FalconData(String falconIP, String falconDeviceID, String falconCountry, String falconCity,
			String falconAccessChId) {
		super();
		this.falconIP = falconIP;
		this.falconDeviceID = falconDeviceID;
		this.falconCountry = falconCountry;
		this.falconCity = falconCity;
		this.falconAccessChId = falconAccessChId;
	}
	public FalconData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FalconData [falconIP=" + falconIP + ", falconDeviceID=" + falconDeviceID + ", falconCountry="
				+ falconCountry + ", falconCity=" + falconCity + ", falconAccessChId=" + falconAccessChId + "]";
	}
	
	

}
