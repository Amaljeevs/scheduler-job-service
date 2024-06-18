package com.alfaris.esb.dto;

public class OutgoingTransferInquiryResDTO {

	private OutgoingTransferInquiryHeaderRes riyadBankHeader;
	private String mode;
	private String otmsGroupStatus;
	private String referenceNo;
	private String toReferenceNo;
	private String custId;
	private String valueDateFrom;
	private String valueDateTo;
	private String createDateFrom;
	private String createDateTo;
	private String paymentAmount;
	private String paymentCurrency;
	private String branch;
	private String acctNumber;
	private String pageMarker;
	private String endOfData;
	private String numOfRows;
	private OTIRepeatingGroupSection repeatingGroupSection;

	public OutgoingTransferInquiryHeaderRes getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(OutgoingTransferInquiryHeaderRes riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getOtmsGroupStatus() {
		return otmsGroupStatus;
	}

	public void setOtmsGroupStatus(String otmsGroupStatus) {
		this.otmsGroupStatus = otmsGroupStatus;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getToReferenceNo() {
		return toReferenceNo;
	}

	public void setToReferenceNo(String toReferenceNo) {
		this.toReferenceNo = toReferenceNo;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getValueDateFrom() {
		return valueDateFrom;
	}

	public void setValueDateFrom(String valueDateFrom) {
		this.valueDateFrom = valueDateFrom;
	}

	public String getValueDateTo() {
		return valueDateTo;
	}

	public void setValueDateTo(String valueDateTo) {
		this.valueDateTo = valueDateTo;
	}

	public String getCreateDateFrom() {
		return createDateFrom;
	}

	public void setCreateDateFrom(String createDateFrom) {
		this.createDateFrom = createDateFrom;
	}

	public String getCreateDateTo() {
		return createDateTo;
	}

	public void setCreateDateTo(String createDateTo) {
		this.createDateTo = createDateTo;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}

	public String getPageMarker() {
		return pageMarker;
	}

	public void setPageMarker(String pageMarker) {
		this.pageMarker = pageMarker;
	}

	public String getEndOfData() {
		return endOfData;
	}

	public void setEndOfData(String endOfData) {
		this.endOfData = endOfData;
	}

	public String getNumOfRows() {
		return numOfRows;
	}

	public void setNumOfRows(String numOfRows) {
		this.numOfRows = numOfRows;
	}

	public OTIRepeatingGroupSection getRepeatingGroupSection() {
		return repeatingGroupSection;
	}

	public void setRepeatingGroupSection(OTIRepeatingGroupSection repeatingGroupSection) {
		this.repeatingGroupSection = repeatingGroupSection;
	}

	public OutgoingTransferInquiryResDTO(OutgoingTransferInquiryHeaderRes riyadBankHeader, String mode,
			String otmsGroupStatus, String referenceNo, String toReferenceNo, String custId, String valueDateFrom,
			String valueDateTo, String createDateFrom, String createDateTo, String paymentAmount,
			String paymentCurrency, String branch, String acctNumber, String pageMarker, String endOfData,
			String numOfRows, OTIRepeatingGroupSection repeatingGroupSection) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.mode = mode;
		this.otmsGroupStatus = otmsGroupStatus;
		this.referenceNo = referenceNo;
		this.toReferenceNo = toReferenceNo;
		this.custId = custId;
		this.valueDateFrom = valueDateFrom;
		this.valueDateTo = valueDateTo;
		this.createDateFrom = createDateFrom;
		this.createDateTo = createDateTo;
		this.paymentAmount = paymentAmount;
		this.paymentCurrency = paymentCurrency;
		this.branch = branch;
		this.acctNumber = acctNumber;
		this.pageMarker = pageMarker;
		this.endOfData = endOfData;
		this.numOfRows = numOfRows;
		this.repeatingGroupSection = repeatingGroupSection;
	}

	public OutgoingTransferInquiryResDTO() {
		super();
	}

	@Override
	public String toString() {
		return "OutgoingTransferInquiryResDTO [riyadBankHeader=" + riyadBankHeader + ", mode=" + mode
				+ ", otmsGroupStatus=" + otmsGroupStatus + ", referenceNo=" + referenceNo + ", toReferenceNo="
				+ toReferenceNo + ", custId=" + custId + ", valueDateFrom=" + valueDateFrom + ", valueDateTo="
				+ valueDateTo + ", createDateFrom=" + createDateFrom + ", createDateTo=" + createDateTo
				+ ", paymentAmount=" + paymentAmount + ", paymentCurrency=" + paymentCurrency + ", branch=" + branch
				+ ", acctNumber=" + acctNumber + ", pageMarker=" + pageMarker + ", endOfData=" + endOfData
				+ ", numOfRows=" + numOfRows + ", repeatingGroupSection=" + repeatingGroupSection + "]";
	}

}
