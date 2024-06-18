package com.alfaris.esb.dto;

import java.io.Serializable;

public class TokenResDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String token_type;

	private String access_token;

	private String scope;

	private String expires_in;

	private String consented_on;

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}

	public String getConsented_on() {
		return consented_on;
	}

	public void setConsented_on(String consented_on) {
		this.consented_on = consented_on;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public TokenResDTO(String token_type, String access_token, String scope, String expires_in, String consented_on) {
		super();
		this.token_type = token_type;
		this.access_token = access_token;
		this.scope = scope;
		this.expires_in = expires_in;
		this.consented_on = consented_on;
	}

	public TokenResDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
