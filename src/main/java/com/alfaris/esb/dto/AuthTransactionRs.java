package com.alfaris.esb.dto;

public class AuthTransactionRs {

	AuthTransactionHeaderRs riyadBankHeaderRs;
	private String expireDate;
	private String expireTime;
	private String enrolmentLevel;
	private String esaFlag;
	private String remainingNumberOfAttempts;
	private String tokenId;
	private String sessionId;

	public AuthTransactionHeaderRs getRiyadBankHeaderRs() {
		return riyadBankHeaderRs;
	}

	public void setRiyadBankHeaderRs(AuthTransactionHeaderRs riyadBankHeaderRs) {
		this.riyadBankHeaderRs = riyadBankHeaderRs;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getEnrolmentLevel() {
		return enrolmentLevel;
	}

	public void setEnrolmentLevel(String enrolmentLevel) {
		this.enrolmentLevel = enrolmentLevel;
	}

	public String getEsaFlag() {
		return esaFlag;
	}

	public void setEsaFlag(String esaFlag) {
		this.esaFlag = esaFlag;
	}

	public String getRemainingNumberOfAttempts() {
		return remainingNumberOfAttempts;
	}

	public void setRemainingNumberOfAttempts(String remainingNumberOfAttempts) {
		this.remainingNumberOfAttempts = remainingNumberOfAttempts;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public AuthTransactionRs() {
		super();
	}

	public AuthTransactionRs(AuthTransactionHeaderRs riyadBankHeaderRs, String expireDate, String expireTime,
			String enrolmentLevel, String esaFlag, String remainingNumberOfAttempts, String tokenId, String sessionId) {
		super();
		this.riyadBankHeaderRs = riyadBankHeaderRs;
		this.expireDate = expireDate;
		this.expireTime = expireTime;
		this.enrolmentLevel = enrolmentLevel;
		this.esaFlag = esaFlag;
		this.remainingNumberOfAttempts = remainingNumberOfAttempts;
		this.tokenId = tokenId;
		this.sessionId = sessionId;
	}

	@Override
	public String toString() {
		return "AuthTransactionRs [riyadBankHeaderRs=" + riyadBankHeaderRs + ", expireDate=" + expireDate
				+ ", expireTime=" + expireTime + ", enrolmentLevel=" + enrolmentLevel + ", esaFlag=" + esaFlag
				+ ", remainingNumberOfAttempts=" + remainingNumberOfAttempts + ", tokenId=" + tokenId + ", sessionId="
				+ sessionId + "]";
	}
	
	
	
	
	

}
