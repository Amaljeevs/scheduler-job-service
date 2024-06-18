package com.alfaris.esb.dto;

public class StatementOfCurrentCycleRequest {

	private RequestRiyadBankHeader riyadBankHeader;

	private String summaryFlag;

	private String endDate;

	private String lastItemRetrievedIndicatorBalSi;

	private String pageMrkr;

	private String strtDate;

	private String forwardBackwardInd;

	private String lastItemRetrievedIndicatorSeq;

	private String acctNumber;

	private String dateType;

	private String mode;

	private String acctType;

	private String lastItemRetrievedIndicatorBal;

	private String lastItemRetrievedIndicatorDate;

	private String pageSize;

	public RequestRiyadBankHeader getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(RequestRiyadBankHeader riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public String getSummaryFlag() {
		return summaryFlag;
	}

	public void setSummaryFlag(String summaryFlag) {
		this.summaryFlag = summaryFlag;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getLastItemRetrievedIndicatorBalSi() {
		return lastItemRetrievedIndicatorBalSi;
	}

	public void setLastItemRetrievedIndicatorBalSi(String lastItemRetrievedIndicatorBalSi) {
		this.lastItemRetrievedIndicatorBalSi = lastItemRetrievedIndicatorBalSi;
	}

	public String getPageMrkr() {
		return pageMrkr;
	}

	public void setPageMrkr(String pageMrkr) {
		this.pageMrkr = pageMrkr;
	}

	public String getStrtDate() {
		return strtDate;
	}

	public void setStrtDate(String strtDate) {
		this.strtDate = strtDate;
	}

	public String getForwardBackwardInd() {
		return forwardBackwardInd;
	}

	public void setForwardBackwardInd(String forwardBackwardInd) {
		this.forwardBackwardInd = forwardBackwardInd;
	}

	public String getLastItemRetrievedIndicatorSeq() {
		return lastItemRetrievedIndicatorSeq;
	}

	public void setLastItemRetrievedIndicatorSeq(String lastItemRetrievedIndicatorSeq) {
		this.lastItemRetrievedIndicatorSeq = lastItemRetrievedIndicatorSeq;
	}

	public String getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}

	public String getDateType() {
		return dateType;
	}

	public void setDateType(String dateType) {
		this.dateType = dateType;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getLastItemRetrievedIndicatorBal() {
		return lastItemRetrievedIndicatorBal;
	}

	public void setLastItemRetrievedIndicatorBal(String lastItemRetrievedIndicatorBal) {
		this.lastItemRetrievedIndicatorBal = lastItemRetrievedIndicatorBal;
	}

	public String getLastItemRetrievedIndicatorDate() {
		return lastItemRetrievedIndicatorDate;
	}

	public void setLastItemRetrievedIndicatorDate(String lastItemRetrievedIndicatorDate) {
		this.lastItemRetrievedIndicatorDate = lastItemRetrievedIndicatorDate;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public StatementOfCurrentCycleRequest(RequestRiyadBankHeader riyadBankHeader, String summaryFlag, String endDate,
			String lastItemRetrievedIndicatorBalSi, String pageMrkr, String strtDate, String forwardBackwardInd,
			String lastItemRetrievedIndicatorSeq, String acctNumber, String dateType, String mode, String acctType,
			String lastItemRetrievedIndicatorBal, String lastItemRetrievedIndicatorDate, String pageSize) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.summaryFlag = summaryFlag;
		this.endDate = endDate;
		this.lastItemRetrievedIndicatorBalSi = lastItemRetrievedIndicatorBalSi;
		this.pageMrkr = pageMrkr;
		this.strtDate = strtDate;
		this.forwardBackwardInd = forwardBackwardInd;
		this.lastItemRetrievedIndicatorSeq = lastItemRetrievedIndicatorSeq;
		this.acctNumber = acctNumber;
		this.dateType = dateType;
		this.mode = mode;
		this.acctType = acctType;
		this.lastItemRetrievedIndicatorBal = lastItemRetrievedIndicatorBal;
		this.lastItemRetrievedIndicatorDate = lastItemRetrievedIndicatorDate;
		this.pageSize = pageSize;
	}

	public StatementOfCurrentCycleRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StatementOfCurrentCycleRequest [riyadBankHeader=" + riyadBankHeader + ", summaryFlag=" + summaryFlag
				+ ", endDate=" + endDate + ", lastItemRetrievedIndicatorBalSi=" + lastItemRetrievedIndicatorBalSi
				+ ", pageMrkr=" + pageMrkr + ", strtDate=" + strtDate + ", forwardBackwardInd=" + forwardBackwardInd
				+ ", lastItemRetrievedIndicatorSeq=" + lastItemRetrievedIndicatorSeq + ", acctNumber=" + acctNumber
				+ ", dateType=" + dateType + ", mode=" + mode + ", acctType=" + acctType
				+ ", lastItemRetrievedIndicatorBal=" + lastItemRetrievedIndicatorBal
				+ ", lastItemRetrievedIndicatorDate=" + lastItemRetrievedIndicatorDate + ", pageSize=" + pageSize + "]";
	}

}
