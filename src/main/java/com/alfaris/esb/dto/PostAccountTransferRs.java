package com.alfaris.esb.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostAccountTransferRs {
	
	@JsonProperty("xFerFrom")
	private ArrayList<XFerFrom> xFerFrom;
	
	@JsonProperty("xFerTo")
	private ArrayList<XFerTo> xFerTo;
	
	public ArrayList<XFerFrom> getxFerFrom() {
		return xFerFrom;
	}
	public void setxFerFrom(ArrayList<XFerFrom> xFerFrom) {
		this.xFerFrom = xFerFrom;
	}
	public ArrayList<XFerTo> getxFerTo() {
		return xFerTo;
	}
	public void setxFerTo(ArrayList<XFerTo> xFerTo) {
		this.xFerTo = xFerTo;
	}
	public PostAccountTransferRs(ArrayList<XFerFrom> xFerFrom, ArrayList<XFerTo> xFerTo) {
		super();
		this.xFerFrom = xFerFrom;
		this.xFerTo = xFerTo;
	}
	public PostAccountTransferRs() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PostAccountTransferRs [xFerFrom=" + xFerFrom + ", xFerTo=" + xFerTo + "]";
	}
	
	



}
