package com.alfaris.esb.dto;

public class AuthenticationDetails {

	private float authenticationType;

	public float getAuthenticationType() {
		return authenticationType;
	}

	public void setAuthenticationType(float authenticationType) {
		this.authenticationType = authenticationType;
	}

	public AuthenticationDetails() {
		super();
	}

	@Override
	public String toString() {
		return "AuthenticationDetails [authenticationType=" + authenticationType + "]";
	}
	
	

}
