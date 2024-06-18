package com.alfaris.esb.dto;

public class OutgoingTransferInquiryReqDTO {
	
	private OutgoingTransferInquiryHeaderRq riyadBankHeader;
	private String mode;
    private String groupStatus;
    private String referenceNo;
    private String toReferenceNo;
    private String custId;
    private String fromValueDate;
    private String toValueDate;
    private String fromCreateDate;
    private String toCreateDate;
    private String paymentAmount;
    private String paymentCurrency;
    private String branch;
    private String paymentStatus;
    private String acctNumber;
    private String pageSize;
    private String forwardBackwardInd;
    private String pageMarker;
    private String sortOrder;
    private String toPaymentAmount;
    private String totalNoTransaction;
    private String beneficiaryName;
    private String remittanceType;
    private String beneficiaryAccount;
	public OutgoingTransferInquiryHeaderRq getRiyadBankHeader() {
		return riyadBankHeader;
	}
	public void setRiyadBankHeader(OutgoingTransferInquiryHeaderRq riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getGroupStatus() {
		return groupStatus;
	}
	public void setGroupStatus(String groupStatus) {
		this.groupStatus = groupStatus;
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
	public String getFromValueDate() {
		return fromValueDate;
	}
	public void setFromValueDate(String fromValueDate) {
		this.fromValueDate = fromValueDate;
	}
	public String getToValueDate() {
		return toValueDate;
	}
	public void setToValueDate(String toValueDate) {
		this.toValueDate = toValueDate;
	}
	public String getFromCreateDate() {
		return fromCreateDate;
	}
	public void setFromCreateDate(String fromCreateDate) {
		this.fromCreateDate = fromCreateDate;
	}
	public String getToCreateDate() {
		return toCreateDate;
	}
	public void setToCreateDate(String toCreateDate) {
		this.toCreateDate = toCreateDate;
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
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getAcctNumber() {
		return acctNumber;
	}
	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getForwardBackwardInd() {
		return forwardBackwardInd;
	}
	public void setForwardBackwardInd(String forwardBackwardInd) {
		this.forwardBackwardInd = forwardBackwardInd;
	}
	public String getPageMarker() {
		return pageMarker;
	}
	public void setPageMarker(String pageMarker) {
		this.pageMarker = pageMarker;
	}
	public String getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getToPaymentAmount() {
		return toPaymentAmount;
	}
	public void setToPaymentAmount(String toPaymentAmount) {
		this.toPaymentAmount = toPaymentAmount;
	}
	public String getTotalNoTransaction() {
		return totalNoTransaction;
	}
	public void setTotalNoTransaction(String totalNoTransaction) {
		this.totalNoTransaction = totalNoTransaction;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public String getRemittanceType() {
		return remittanceType;
	}
	public void setRemittanceType(String remittanceType) {
		this.remittanceType = remittanceType;
	}
	public String getBeneficiaryAccount() {
		return beneficiaryAccount;
	}
	public void setBeneficiaryAccount(String beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
	}
	public OutgoingTransferInquiryReqDTO(OutgoingTransferInquiryHeaderRq riyadBankHeader, String mode,
			String groupStatus, String referenceNo, String toReferenceNo, String custId, String fromValueDate,
			String toValueDate, String fromCreateDate, String toCreateDate, String paymentAmount,
			String paymentCurrency, String branch, String paymentStatus, String acctNumber, String pageSize,
			String forwardBackwardInd, String pageMarker, String sortOrder, String toPaymentAmount,
			String totalNoTransaction, String beneficiaryName, String remittanceType, String beneficiaryAccount) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.mode = mode;
		this.groupStatus = groupStatus;
		this.referenceNo = referenceNo;
		this.toReferenceNo = toReferenceNo;
		this.custId = custId;
		this.fromValueDate = fromValueDate;
		this.toValueDate = toValueDate;
		this.fromCreateDate = fromCreateDate;
		this.toCreateDate = toCreateDate;
		this.paymentAmount = paymentAmount;
		this.paymentCurrency = paymentCurrency;
		this.branch = branch;
		this.paymentStatus = paymentStatus;
		this.acctNumber = acctNumber;
		this.pageSize = pageSize;
		this.forwardBackwardInd = forwardBackwardInd;
		this.pageMarker = pageMarker;
		this.sortOrder = sortOrder;
		this.toPaymentAmount = toPaymentAmount;
		this.totalNoTransaction = totalNoTransaction;
		this.beneficiaryName = beneficiaryName;
		this.remittanceType = remittanceType;
		this.beneficiaryAccount = beneficiaryAccount;
	}
	public OutgoingTransferInquiryReqDTO() {
		super();
	}
	@Override
	public String toString() {
		return "OutgoingTransferInquiryReqDTO [riyadBankHeader=" + riyadBankHeader + ", mode=" + mode + ", groupStatus="
				+ groupStatus + ", referenceNo=" + referenceNo + ", toReferenceNo=" + toReferenceNo + ", custId="
				+ custId + ", fromValueDate=" + fromValueDate + ", toValueDate=" + toValueDate + ", fromCreateDate="
				+ fromCreateDate + ", toCreateDate=" + toCreateDate + ", paymentAmount=" + paymentAmount
				+ ", paymentCurrency=" + paymentCurrency + ", branch=" + branch + ", paymentStatus=" + paymentStatus
				+ ", acctNumber=" + acctNumber + ", pageSize=" + pageSize + ", forwardBackwardInd=" + forwardBackwardInd
				+ ", pageMarker=" + pageMarker + ", sortOrder=" + sortOrder + ", toPaymentAmount=" + toPaymentAmount
				+ ", totalNoTransaction=" + totalNoTransaction + ", beneficiaryName=" + beneficiaryName
				+ ", remittanceType=" + remittanceType + ", beneficiaryAccount=" + beneficiaryAccount + "]";
	}
    
    

}
