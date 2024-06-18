package com.alfaris.esb.dto;

public class MiscCrDrSamaExceptionList {

	private String samaDisclaimerE;
	private String samaDisclaimerA;
	private String samaClass;
	private String samaConditionFlag;
	private String missingDocumentFlag;
	private String exceptionFlag;
	private String limitFlag;

	public String getSamaDisclaimerE() {
		return samaDisclaimerE;
	}

	public void setSamaDisclaimerE(String samaDisclaimerE) {
		this.samaDisclaimerE = samaDisclaimerE;
	}

	public String getSamaDisclaimerA() {
		return samaDisclaimerA;
	}

	public void setSamaDisclaimerA(String samaDisclaimerA) {
		this.samaDisclaimerA = samaDisclaimerA;
	}

	public String getSamaClass() {
		return samaClass;
	}

	public void setSamaClass(String samaClass) {
		this.samaClass = samaClass;
	}

	public String getSamaConditionFlag() {
		return samaConditionFlag;
	}

	public void setSamaConditionFlag(String samaConditionFlag) {
		this.samaConditionFlag = samaConditionFlag;
	}

	public String getMissingDocumentFlag() {
		return missingDocumentFlag;
	}

	public void setMissingDocumentFlag(String missingDocumentFlag) {
		this.missingDocumentFlag = missingDocumentFlag;
	}

	public String getExceptionFlag() {
		return exceptionFlag;
	}

	public void setExceptionFlag(String exceptionFlag) {
		this.exceptionFlag = exceptionFlag;
	}

	public String getLimitFlag() {
		return limitFlag;
	}

	public void setLimitFlag(String limitFlag) {
		this.limitFlag = limitFlag;
	}

	public MiscCrDrSamaExceptionList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MiscCrDrSamaExceptionList [samaDisclaimerE=" + samaDisclaimerE + ", samaDisclaimerA=" + samaDisclaimerA
				+ ", samaClass=" + samaClass + ", samaConditionFlag=" + samaConditionFlag + ", missingDocumentFlag="
				+ missingDocumentFlag + ", exceptionFlag=" + exceptionFlag + ", limitFlag=" + limitFlag + "]";
	}

}
