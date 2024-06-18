package com.alfaris.esb.dto;

import java.util.List;

public class ParameterList {

	private List<String> parameter;

	public List<String> getParameter() {
		return parameter;
	}

	public void setParameter(List<String> parameter) {
		this.parameter = parameter;
	}

	public ParameterList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ParameterList [parameter=" + parameter + "]";
	}

	public ParameterList(List<String> parameter) {
		super();
		this.parameter = parameter;
	}
	
	
	
	

}
