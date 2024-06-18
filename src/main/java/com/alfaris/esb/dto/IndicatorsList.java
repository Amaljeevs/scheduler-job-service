package com.alfaris.esb.dto;

public class IndicatorsList {

	private String blackListType;
	private String matchValue;
	private String indicatorType;
	private String indicatorValue;

	public String getBlackListType() {
		return blackListType;
	}

	public void setBlackListType(String blackListType) {
		this.blackListType = blackListType;
	}

	public String getMatchValue() {
		return matchValue;
	}

	public void setMatchValue(String matchValue) {
		this.matchValue = matchValue;
	}

	public String getIndicatorType() {
		return indicatorType;
	}

	public void setIndicatorType(String indicatorType) {
		this.indicatorType = indicatorType;
	}

	public String getIndicatorValue() {
		return indicatorValue;
	}

	public void setIndicatorValue(String indicatorValue) {
		this.indicatorValue = indicatorValue;
	}

	public IndicatorsList(String blackListType, String matchValue, String indicatorType, String indicatorValue) {
		super();
		this.blackListType = blackListType;
		this.matchValue = matchValue;
		this.indicatorType = indicatorType;
		this.indicatorValue = indicatorValue;
	}

	public IndicatorsList() {
		super();
	}

	@Override
	public String toString() {
		return "IndicatorsList [blackListType=" + blackListType + ", matchValue=" + matchValue + ", indicatorType="
				+ indicatorType + ", indicatorValue=" + indicatorValue + "]";
	}

}
