package com.alfaris.esb.dto;

public class UniversalDesc {
	
	private String  universalDescLine;

	public String getUniversalDescLine() {
		return universalDescLine;
	}

	public void setUniversalDescLine(String universalDescLine) {
		this.universalDescLine = universalDescLine;
	}

	public UniversalDesc(String universalDescLine) {
		super();
		this.universalDescLine = universalDescLine;
	}

	public UniversalDesc() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UniversalDesc [universalDescLine=" + universalDescLine + "]";
	}

	
}
