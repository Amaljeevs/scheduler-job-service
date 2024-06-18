package com.alfaris.esb.dto;

public class AccntBalRsDTO {


	
	private String acctNumber;
	
	private String returnCode;
	
	private String descripeion;
	

	private String acctCurrency;
	
	private String availBal;
	
	private String acctEffBal;
	
	private String acctEffBalSi;
	
	private String acctStmtCode;
	
	private String acctCashAmt;
	
	private String acctAvailCashAmt;
	
	private String acctSavingsBal;
	
	
	private String ibanAcctNumber;

	
	
	
	public AccntBalRsDTO(String acctNumber, String returnCode, String descripeion, String acctCurrency, String availBal,
			String acctEffBal, String acctEffBalSi, String acctStmtCode, String acctCashAmt, String acctAvailCashAmt,
			String acctSavingsBal, String ibanAcctNumber) {
		super();
		this.acctNumber = acctNumber;
		this.returnCode = returnCode;
		this.descripeion = descripeion;
		this.acctCurrency = acctCurrency;
		this.availBal = availBal;
		this.acctEffBal = acctEffBal;
		this.acctEffBalSi = acctEffBalSi;
		this.acctStmtCode = acctStmtCode;
		this.acctCashAmt = acctCashAmt;
		this.acctAvailCashAmt = acctAvailCashAmt;
		this.acctSavingsBal = acctSavingsBal;
		this.ibanAcctNumber = ibanAcctNumber;
	}




	@Override
	public String toString() {
		return "AccntBalRsDTO [acctNumber=" + acctNumber + ", returnCode=" + returnCode + ", descripeion=" + descripeion
				+ ", acctCurrency=" + acctCurrency + ", availBal=" + availBal + ", acctEffBal=" + acctEffBal
				+ ", acctEffBalSi=" + acctEffBalSi + ", acctStmtCode=" + acctStmtCode + ", acctCashAmt=" + acctCashAmt
				+ ", acctAvailCashAmt=" + acctAvailCashAmt + ", acctSavingsBal=" + acctSavingsBal + ", ibanAcctNumber="
				+ ibanAcctNumber + "]";
	}




	public String getAcctNumber() {
		return acctNumber;
	}




	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}




	public String getReturnCode() {
		return returnCode;
	}




	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}




	public String getDescripeion() {
		return descripeion;
	}




	public void setDescripeion(String descripeion) {
		this.descripeion = descripeion;
	}




	public String getAcctCurrency() {
		return acctCurrency;
	}




	public void setAcctCurrency(String acctCurrency) {
		this.acctCurrency = acctCurrency;
	}




	public String getAvailBal() {
		return availBal;
	}




	public void setAvailBal(String availBal) {
		this.availBal = availBal;
	}




	public String getAcctEffBal() {
		return acctEffBal;
	}




	public void setAcctEffBal(String acctEffBal) {
		this.acctEffBal = acctEffBal;
	}




	public String getAcctEffBalSi() {
		return acctEffBalSi;
	}




	public void setAcctEffBalSi(String acctEffBalSi) {
		this.acctEffBalSi = acctEffBalSi;
	}




	public String getAcctStmtCode() {
		return acctStmtCode;
	}




	public void setAcctStmtCode(String acctStmtCode) {
		this.acctStmtCode = acctStmtCode;
	}




	public String getAcctCashAmt() {
		return acctCashAmt;
	}




	public void setAcctCashAmt(String acctCashAmt) {
		this.acctCashAmt = acctCashAmt;
	}




	public String getAcctAvailCashAmt() {
		return acctAvailCashAmt;
	}




	public void setAcctAvailCashAmt(String acctAvailCashAmt) {
		this.acctAvailCashAmt = acctAvailCashAmt;
	}




	public String getAcctSavingsBal() {
		return acctSavingsBal;
	}




	public void setAcctSavingsBal(String acctSavingsBal) {
		this.acctSavingsBal = acctSavingsBal;
	}




	public String getIbanAcctNumber() {
		return ibanAcctNumber;
	}




	public void setIbanAcctNumber(String ibanAcctNumber) {
		this.ibanAcctNumber = ibanAcctNumber;
	}




	public AccntBalRsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
	
}
