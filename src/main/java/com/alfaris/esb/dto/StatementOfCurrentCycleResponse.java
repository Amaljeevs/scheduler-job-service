package com.alfaris.esb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatementOfCurrentCycleResponse {

	@JsonProperty("riyadBankHeader")
	private ResponseRiyadBankHeader riyadBankHeader;

	@JsonProperty("acctNumber")
	private String acctNumber;

	@JsonProperty("acctType")
	private String acctType;

	@JsonProperty("noDebitTrans")
	private String noDebitTrans;

	@JsonProperty("amtDebitTrans")
	private String amtDebitTrans;

	@JsonProperty("noCreditTrans")
	private String noCreditTrans;

	@JsonProperty("amtCreditTrans")
	private String amtCreditTrans;

	@JsonProperty("numberOfElements")
	private String numberOfElements;

	@JsonProperty("repeatingGroupSection")
	private ResponseRepeatingGroupSection repeatingGroupSection;

	public ResponseRiyadBankHeader getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(ResponseRiyadBankHeader riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public String getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getNoDebitTrans() {
		return noDebitTrans;
	}

	public void setNoDebitTrans(String noDebitTrans) {
		this.noDebitTrans = noDebitTrans;
	}

	public String getAmtDebitTrans() {
		return amtDebitTrans;
	}

	public void setAmtDebitTrans(String amtDebitTrans) {
		this.amtDebitTrans = amtDebitTrans;
	}

	public String getNoCreditTrans() {
		return noCreditTrans;
	}

	public void setNoCreditTrans(String noCreditTrans) {
		this.noCreditTrans = noCreditTrans;
	}

	public String getAmtCreditTrans() {
		return amtCreditTrans;
	}

	public void setAmtCreditTrans(String amtCreditTrans) {
		this.amtCreditTrans = amtCreditTrans;
	}

	public String getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(String numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	public ResponseRepeatingGroupSection getRepeatingGroupSection() {
		return repeatingGroupSection;
	}

	public void setRepeatingGroupSection(ResponseRepeatingGroupSection repeatingGroupSection) {
		this.repeatingGroupSection = repeatingGroupSection;
	}

	public StatementOfCurrentCycleResponse(ResponseRiyadBankHeader riyadBankHeader, String acctNumber, String acctType,
			String noDebitTrans, String amtDebitTrans, String noCreditTrans, String amtCreditTrans,
			String numberOfElements, ResponseRepeatingGroupSection repeatingGroupSection) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.acctNumber = acctNumber;
		this.acctType = acctType;
		this.noDebitTrans = noDebitTrans;
		this.amtDebitTrans = amtDebitTrans;
		this.noCreditTrans = noCreditTrans;
		this.amtCreditTrans = amtCreditTrans;
		this.numberOfElements = numberOfElements;
		this.repeatingGroupSection = repeatingGroupSection;
	}

	public StatementOfCurrentCycleResponse() {
		super();
	}

	@Override
	public String toString() {
		return "StatementOfCurrentCycleResponse [riyadBankHeader=" + riyadBankHeader + ", acctNumber=" + acctNumber
				+ ", acctType=" + acctType + ", noDebitTrans=" + noDebitTrans + ", amtDebitTrans=" + amtDebitTrans
				+ ", noCreditTrans=" + noCreditTrans + ", amtCreditTrans=" + amtCreditTrans + ", numberOfElements="
				+ numberOfElements + ", repeatingGroupSection=" + repeatingGroupSection + "]";
	}

	
}
