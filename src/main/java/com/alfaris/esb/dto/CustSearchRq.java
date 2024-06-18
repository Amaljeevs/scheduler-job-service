package com.alfaris.esb.dto;

public class CustSearchRq {

	private CustSearchHeaderRq riyadBankHeader;
	private String pageMarker;
	private String forwardBackwardInd;
	private String custId;
	private int pageSize;

	public CustSearchHeaderRq getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(CustSearchHeaderRq riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public String getPageMarker() {
		return pageMarker;
	}

	public void setPageMarker(String pageMarker) {
		this.pageMarker = pageMarker;
	}

	public String getForwardBackwardInd() {
		return forwardBackwardInd;
	}

	public void setForwardBackwardInd(String forwardBackwardInd) {
		this.forwardBackwardInd = forwardBackwardInd;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public CustSearchRq() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustSearchRq [riyadBankHeader=" + riyadBankHeader + ", pageMarker=" + pageMarker
				+ ", forwardBackwardInd=" + forwardBackwardInd + ", custId=" + custId + ", pageSize=" + pageSize + "]";
	}

}
