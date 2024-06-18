package com.alfaris.esb.dto;

import java.math.BigDecimal;

public class LoanInfo {
	
	private String subType;
	
	private BigDecimal insuranceAmt1;
	
	private BigDecimal insuranceAmt2;
	
	private BigDecimal oldMoneyAmt;
	
	private BigDecimal additionalCreditAmt;
	
	private String oldNewInd;
	
	private BigDecimal fee;
	
	private BigDecimal principal;
	
	private BigDecimal interest;
	
	private BigDecimal otherAmt;

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public BigDecimal getInsuranceAmt1() {
		return insuranceAmt1;
	}

	public void setInsuranceAmt1(BigDecimal insuranceAmt1) {
		this.insuranceAmt1 = insuranceAmt1;
	}

	public BigDecimal getInsuranceAmt2() {
		return insuranceAmt2;
	}

	public void setInsuranceAmt2(BigDecimal insuranceAmt2) {
		this.insuranceAmt2 = insuranceAmt2;
	}

	public BigDecimal getOldMoneyAmt() {
		return oldMoneyAmt;
	}

	public void setOldMoneyAmt(BigDecimal oldMoneyAmt) {
		this.oldMoneyAmt = oldMoneyAmt;
	}

	public BigDecimal getAdditionalCreditAmt() {
		return additionalCreditAmt;
	}

	public void setAdditionalCreditAmt(BigDecimal additionalCreditAmt) {
		this.additionalCreditAmt = additionalCreditAmt;
	}

	public String getOldNewInd() {
		return oldNewInd;
	}

	public void setOldNewInd(String oldNewInd) {
		this.oldNewInd = oldNewInd;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public BigDecimal getPrincipal() {
		return principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public BigDecimal getOtherAmt() {
		return otherAmt;
	}

	public void setOtherAmt(BigDecimal otherAmt) {
		this.otherAmt = otherAmt;
	}

	public LoanInfo(String subType, BigDecimal insuranceAmt1, BigDecimal insuranceAmt2, BigDecimal oldMoneyAmt,
			BigDecimal additionalCreditAmt, String oldNewInd, BigDecimal fee, BigDecimal principal, BigDecimal interest,
			BigDecimal otherAmt) {
		super();
		this.subType = subType;
		this.insuranceAmt1 = insuranceAmt1;
		this.insuranceAmt2 = insuranceAmt2;
		this.oldMoneyAmt = oldMoneyAmt;
		this.additionalCreditAmt = additionalCreditAmt;
		this.oldNewInd = oldNewInd;
		this.fee = fee;
		this.principal = principal;
		this.interest = interest;
		this.otherAmt = otherAmt;
	}

	public LoanInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LoanInfo [subType=" + subType + ", insuranceAmt1=" + insuranceAmt1 + ", insuranceAmt2=" + insuranceAmt2
				+ ", oldMoneyAmt=" + oldMoneyAmt + ", additionalCreditAmt=" + additionalCreditAmt + ", oldNewInd="
				+ oldNewInd + ", fee=" + fee + ", principal=" + principal + ", interest=" + interest + ", otherAmt="
				+ otherAmt + "]";
	}
	
	

}

