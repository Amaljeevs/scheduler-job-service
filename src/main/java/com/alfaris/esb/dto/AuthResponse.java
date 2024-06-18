package com.alfaris.esb.dto;

public class AuthResponse {
	
	private String tokenType;
	private String accessToken;
	private String consentedOn;
	private String expiresIn;
	private String scope;
	
	public String getTokenType() {
		return tokenType;
	}
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getConsentedOn() {
		return consentedOn;
	}
	public void setConsentedOn(String consentedOn) {
		this.consentedOn = consentedOn;
	}
	public String getExpiresIn() {
		return expiresIn;
	}
	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	
	
}

