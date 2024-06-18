package com.alfaris.esb.dto;

public class NotifcationRsDTO {
	
	private String asiReturnCode;
	
	private String descriptionEn;
	
	private String descriptionAr;

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

	public NotifcationRsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NotifcationRsDTO(String asiReturnCode, String descriptionEn, String descriptionAr) {
		super();
		this.asiReturnCode = asiReturnCode;
		this.descriptionEn = descriptionEn;
		this.descriptionAr = descriptionAr;
	}

	@Override
	public String toString() {
		return "NotifcationRsDTO [asiReturnCode=" + asiReturnCode + ", descriptionEn=" + descriptionEn
				+ ", descriptionAr=" + descriptionAr + "]";
	}	
	
	
	

}
