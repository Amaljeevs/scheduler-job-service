package com.alfaris.esb.dto;

public class PersonalInfo {
	
	private String birthDt;
    private String hijraBirthDt;
    private String citizenCountryCd;
    
    
	public String getBirthDt() {
		return birthDt;
	}
	public void setBirthDt(String birthDt) {
		this.birthDt = birthDt;
	}
	public String getHijraBirthDt() {
		return hijraBirthDt;
	}
	public void setHijraBirthDt(String hijraBirthDt) {
		this.hijraBirthDt = hijraBirthDt;
	}
	public String getCitizenCountryCd() {
		return citizenCountryCd;
	}
	public void setCitizenCountryCd(String citizenCountryCd) {
		this.citizenCountryCd = citizenCountryCd;
	}
	
	
	@Override
	public String toString() {
		return "PersonalInfo [birthDt=" + birthDt + ", hijraBirthDt=" + hijraBirthDt + ", citizenCountryCd="
				+ citizenCountryCd + "]";
	}
	
	
    
    

}
