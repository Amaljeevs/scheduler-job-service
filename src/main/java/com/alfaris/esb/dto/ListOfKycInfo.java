package com.alfaris.esb.dto;

public class ListOfKycInfo {

	private KycInfo kycInfo;

	public KycInfo getKycInfo() {
		return kycInfo;
	}

	public void setKycInfo(KycInfo kycInfo) {
		this.kycInfo = kycInfo;
	}

	public ListOfKycInfo(KycInfo kycInfo) {
		super();
		this.kycInfo = kycInfo;
	}

	public ListOfKycInfo() {
		super();
	}

	@Override
	public String toString() {
		return "ListOfKycInfo [kycInfo=" + kycInfo + "]";
	}

}
