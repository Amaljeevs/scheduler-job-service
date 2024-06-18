package com.alfaris.esb.dto;

public class AcctDemography {
	
	private String uclass2Code;
    private String altOfficer;
    private String userClassCode;
    private String securedCode;
    private String loanRegionCode;
	public String getUclass2Code() {
		return uclass2Code;
	}
	public void setUclass2Code(String uclass2Code) {
		this.uclass2Code = uclass2Code;
	}
	public String getAltOfficer() {
		return altOfficer;
	}
	public void setAltOfficer(String altOfficer) {
		this.altOfficer = altOfficer;
	}
	public String getUserClassCode() {
		return userClassCode;
	}
	public void setUserClassCode(String userClassCode) {
		this.userClassCode = userClassCode;
	}
	public String getSecuredCode() {
		return securedCode;
	}
	public void setSecuredCode(String securedCode) {
		this.securedCode = securedCode;
	}
	public String getLoanRegionCode() {
		return loanRegionCode;
	}
	public void setLoanRegionCode(String loanRegionCode) {
		this.loanRegionCode = loanRegionCode;
	}
	public AcctDemography(String uclass2Code, String altOfficer, String userClassCode, String securedCode,
			String loanRegionCode) {
		super();
		this.uclass2Code = uclass2Code;
		this.altOfficer = altOfficer;
		this.userClassCode = userClassCode;
		this.securedCode = securedCode;
		this.loanRegionCode = loanRegionCode;
	}
	public AcctDemography() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AcctDemography [uclass2Code=" + uclass2Code + ", altOfficer=" + altOfficer + ", userClassCode="
				+ userClassCode + ", securedCode=" + securedCode + ", loanRegionCode=" + loanRegionCode + "]";
	}
    
    
}
