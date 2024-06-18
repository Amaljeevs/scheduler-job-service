package com.alfaris.esb.dto;

public class Phone {

	private String commType;
    private String commPhone;
    
    
	public String getCommType() {
		return commType;
	}
	public void setCommType(String commType) {
		this.commType = commType;
	}
	public String getCommPhone() {
		return commPhone;
	}
	public void setCommPhone(String commPhone) {
		this.commPhone = commPhone;
	}
	
	
	@Override
	public String toString() {
		return "Phone [commType=" + commType + ", commPhone=" + commPhone + "]";
	}
    
    
    
}
