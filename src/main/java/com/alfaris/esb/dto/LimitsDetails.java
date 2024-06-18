package com.alfaris.esb.dto;

public class LimitsDetails {

	private String limitType;
	private String limitAmount;
	private String utilizationAmount;

	public String getLimitType() {
		return limitType;
	}

	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

	public String getLimitAmount() {
		return limitAmount;
	}

	public void setLimitAmount(String limitAmount) {
		this.limitAmount = limitAmount;
	}

	public String getUtilizationAmount() {
		return utilizationAmount;
	}

	public void setUtilizationAmount(String utilizationAmount) {
		this.utilizationAmount = utilizationAmount;
	}

	public LimitsDetails(String limitType, String limitAmount, String utilizationAmount) {
		super();
		this.limitType = limitType;
		this.limitAmount = limitAmount;
		this.utilizationAmount = utilizationAmount;
	}

	public LimitsDetails() {
		super();
	}

	@Override
	public String toString() {
		return "LimitsDetails [limitType=" + limitType + ", limitAmount=" + limitAmount + ", utilizationAmount="
				+ utilizationAmount + "]";
	}

}
