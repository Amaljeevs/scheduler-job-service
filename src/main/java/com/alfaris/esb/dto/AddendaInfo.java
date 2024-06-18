package com.alfaris.esb.dto;

public class AddendaInfo {
	
	private String adaType;
	
	private String adaInfo;

	public String getAdaType() {
		return adaType;
	}

	public void setAdaType(String adaType) {
		this.adaType = adaType;
	}

	public String getAdaInfo() {
		return adaInfo;
	}

	public void setAdaInfo(String adaInfo) {
		this.adaInfo = adaInfo;
	}

	public AddendaInfo(String adaType, String adaInfo) {
		super();
		this.adaType = adaType;
		this.adaInfo = adaInfo;
	}

	public AddendaInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AddendaInfo [adaType=" + adaType + ", adaInfo=" + adaInfo + "]";
	}
	

}
