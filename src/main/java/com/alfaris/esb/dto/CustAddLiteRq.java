package com.alfaris.esb.dto;

public class CustAddLiteRq {
	
	    private CustLiteCustInfo custInfo;
	    private PersonalInfo personalInfo;
	    private PhoneInfo phoneInfo;
	    private AddrInfo addrInfo;
	    private NameInfo nameInfo;
	    
	    
		public CustLiteCustInfo getCustInfo() {
			return custInfo;
		}
		public void setCustInfo(CustLiteCustInfo custInfo) {
			this.custInfo = custInfo;
		}
		public PersonalInfo getPersonalInfo() {
			return personalInfo;
		}
		public void setPersonalInfo(PersonalInfo personalInfo) {
			this.personalInfo = personalInfo;
		}
		public PhoneInfo getPhoneInfo() {
			return phoneInfo;
		}
		public void setPhoneInfo(PhoneInfo phoneInfo) {
			this.phoneInfo = phoneInfo;
		}
		public AddrInfo getAddrInfo() {
			return addrInfo;
		}
		public void setAddrInfo(AddrInfo addrInfo) {
			this.addrInfo = addrInfo;
		}
		public NameInfo getNameInfo() {
			return nameInfo;
		}
		public void setNameInfo(NameInfo nameInfo) {
			this.nameInfo = nameInfo;
		}
		@Override
		public String toString() {
			return "CustAddLiteRq [custInfo=" + custInfo + ", personalInfo=" + personalInfo + ", phoneInfo=" + phoneInfo
					+ ", addrInfo=" + addrInfo + ", nameInfo=" + nameInfo + "]";
		}
	    
	    
	    
	    

}
