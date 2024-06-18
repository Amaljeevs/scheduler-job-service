package com.alfaris.esb.dto;

public class PepDetails {

	private String pepRt;
	private String pepName;
	private String pepRel;
	private String pepPosition;

	public String getPepRt() {
		return pepRt;
	}

	public void setPepRt(String pepRt) {
		this.pepRt = pepRt;
	}

	public String getPepName() {
		return pepName;
	}

	public void setPepName(String pepName) {
		this.pepName = pepName;
	}

	public String getPepRel() {
		return pepRel;
	}

	public void setPepRel(String pepRel) {
		this.pepRel = pepRel;
	}

	public String getPepPosition() {
		return pepPosition;
	}

	public void setPepPosition(String pepPosition) {
		this.pepPosition = pepPosition;
	}

	public PepDetails(String pepRt, String pepName, String pepRel, String pepPosition) {
		super();
		this.pepRt = pepRt;
		this.pepName = pepName;
		this.pepRel = pepRel;
		this.pepPosition = pepPosition;
	}

	public PepDetails() {
		super();
	}

	@Override
	public String toString() {
		return "PepDetails [pepRt=" + pepRt + ", pepName=" + pepName + ", pepRel=" + pepRel + ", pepPosition="
				+ pepPosition + "]";
	}

}
