package com.alfaris.esb.dto;

public class GenericFieldList {
	
	private String custGenerated;
	private String fieldNum;
	private String offInitials;
	private String newData;
	private String action;
	private String afterPost;
	public String getCustGenerated() {
		return custGenerated;
	}
	public void setCustGenerated(String custGenerated) {
		this.custGenerated = custGenerated;
	}
	public String getFieldNum() {
		return fieldNum;
	}
	public void setFieldNum(String fieldNum) {
		this.fieldNum = fieldNum;
	}
	public String getOffInitials() {
		return offInitials;
	}
	public void setOffInitials(String offInitials) {
		this.offInitials = offInitials;
	}
	public String getNewData() {
		return newData;
	}
	public void setNewData(String newData) {
		this.newData = newData;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getAfterPost() {
		return afterPost;
	}
	public void setAfterPost(String afterPost) {
		this.afterPost = afterPost;
	}
	public GenericFieldList(String custGenerated, String fieldNum, String offInitials, String newData, String action,
			String afterPost) {
		super();
		this.custGenerated = custGenerated;
		this.fieldNum = fieldNum;
		this.offInitials = offInitials;
		this.newData = newData;
		this.action = action;
		this.afterPost = afterPost;
	}
	public GenericFieldList() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GenericFieldList [custGenerated=" + custGenerated + ", fieldNum=" + fieldNum + ", offInitials="
				+ offInitials + ", newData=" + newData + ", action=" + action + ", afterPost=" + afterPost + "]";
	}
	
	

}
