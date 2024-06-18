package com.alfaris.esb.dto;

import java.util.LinkedHashMap;

public class AccountBalanceRsDto {
	private AccountBalanceHeaderRs riyadBankHeader;
	private String acctNumber;
	private String acctType;
	private String acctProductType;
	private String acctCurrency;
	private String acctLedgerBal;
	private String acctLedgerBalSi;
	private String availBal;
	private String acctAvailBalSi;
	private String acctEffBal;
	private String acctEffBalSi;
	private String acctStmtCode;
	private String acctLastStmtDateG;
	private String acctLastTranDateG;
	private String acctStmtMailInd;
	private String acctCardInd;
	private String acctPassBal;
	private String acctMatdateG;
	private String acctIntUpTodate;
	private String acctIntrate;
	private String acctStartdateG;
	private String acctOdLimit;
	private String acctTerm;
	private String acctIntAtMaturity;
	private String acctIntCrMtd;
	private String acctIntCrMtdSi;
	private String acctIntCrYtd;
	private String acctIntCrLastYrSi;
	private String acctIntDbMtd;
	private String acctIntDbMtdSi;
	private String acctIntDbYtd;
	private String acctIntDbYtdSi;
	private String acctIntDbLastYr;
	private String acctIntDbLastYrSi;
	private String acctAccrTdy;
	private String acctAccrTdySi;
	private String acctAccrTdt;
	private String acctIntAccrTdySi;
	private String acctIntAccrTdt;
	private String acctIntAccrTdtSi;
	private String acctCollectedBal;
	private String acctCollectedBalSi;
	private String acctClosingBal;
	private String acctClosingBalSi;
	private String acctYtdMinBal;
	private String acctYtdMinBalSi;
	private String acctYtdAvgBal;
	private String acctYtdAvgBalSi;
	private String acctIntPaidMtd;
	private String acctIntPaidMtdSi;
	private String acctIntPaidYtd;
	private String acctIntPaidYtdSi;
	private String acctIntPaidLastYr;
	private String acctIntPaidLastYrSi;
	private String acctLastCrAmt;
	private String acctLastCrAmtSi;
	private String acctLastCrDate;
	private String acctSrvcChrgMtd;
	private String acctSrvcChrgMtdSi;
	private String acctSrvcChrgYtd;
	private String acctSrvcChrgYtdSi;
	private String acctAccrIntMtd;
	private String acctAccrIntMtdSi;
	private String acctPrinAmt;
	private String acctPrinAmtSi;
	private String acctRenewTimes;
	private String acctGraceEndDate;
	private String acctLastRenewDate;
	private String acctSamaStatus;
	private String acct60DayMinBalSi;
	private String acct60DayMinBal;
	private String acctNumberOfOdLimits;
	private String acctOdLimitSeq;
	private String acctOdStatus;
	private String acctOdLimitAmt;
	private String acctOdLimitUsedAmt;
	private String acctOdLimitRemainAmt;
	private String acctOdLimitEffDate;
	private String acctOdLimitExpiryDate;
	private String acctNumberOfOdIntLimits;
	private String acctOdIntSeq;
	private String acctOdIntRate;
	private String acctOdIntPtr;
	private String acctOdIntLimitAmt;
	private String acctCashAmt;
	private String acctCashAmtSi;
	private String acctAvailCashAmt;
	private String acctAvailCashAmtSi;
	private String acctDdaBalance;
	private String acctDdaBalanceSi;
	private String acctLoanBalance;
	private String acctLoanBalanceSi;
	private String acctSavingsAvailBal;
	private String acctSavingsAvailBalSi;
	private String acctBankUnavailBal;
	private String acctBankUnavailBalSi;
	private String acctMinDdaBal;
	private String acctMinDdaBalSi;
	private String acctAveCollBal;
	private String acctAveCollBalSi;
	private String acctPayCycle;
	private String acctIntIncr;
	private String acctStmtPull;
	private String acctStmtField;
	private String acctSrvceChrgeType;
	private String acctSrvceChrgeCode;
	private String acctMessage;
	private String acctPlusIntAccrued;
	private String acctPlusIntAccruedSi;
	private String acctTaxCalcAmt;
	private String acctTaxCalcAmtSi;
	private String acctOdAccrual;
	private String acctOdAccrualSi;
	private String acctIodPendingTax;
	private String acctIodPendingTaxSi;
	private String acctDdaTotal;
	private String acctDdaTotalSi;
	private String acctSavingsBal;
	private String acctSavingsBalSi;
	private String acctSavingsPlusIntAccrued;
	private String acctSavingsPlusIntAccruedSi;
	private String acctSavingsTotal;
	private String acctSavingsTotalSi;
	private String acctLoanPrin;
	private String acctLoanPrinSi;
	private String acctLoanPrinPlusInt;
	private String acctLoanPrinPlusIntSi;
	private String acctLoanPrinPlusIns1;
	private String acctLoanPrinPlusIns1Si;
	private String acctLoanPrinPlusIns2;
	private String acctLoanPrinPlusIns2Si;
	private String acctLoanPrinPlusOthrFee;
	private String acctLoanPrinPlusOthrFeeSi;
	private String acctLoanPayoffAmt;
	private String acctLoanPayoffAmtSi;
	private String acctStopPays;
	private String acctStopPaysSi;
	private String acctBackupWithhldFlag;
	private String acctLoanDailyAccrual;
	private String acctLoanDailyAccrualSi;
	private String acctCombinedStmts;
	private String acctTodayNoDebit;
	private String acctTodayAmountDebit;
	private String acctTodayAmountDebitSi;
	private String acctTodayNoCredit;
	private String acctTodayAmountCredit;
	private String acctTodayAmountCreditSi;
	private String acctNoSavingsDebit;
	private String acctNoSavingsCredit;
	private String acctNoLoansDebit;
	private String acctNoLoansCredit;
	private String acctTrailerFlags;
	private String acctClosingChrgeAmt;
	private String acctClosingChrgeAmtSi;
	private String acctTotalPenalty;
	private String acctTotalPenaltySi;
	private String acctFeesDue;
	private String acctFeesDueSi;
	private String acctProjectedAccrual;
	private String acctProjectedAccrualSi;
	private String acctLastTranTdyTeller;
	private String acctlastTranTdyTranid;
	private String acctlastTranTdyAmt;
	private String acctLastTranTdyAmtSi;
	private String acctPledgeAmt;
	private String acctPledgeAmtSi;
	private String acctRenewalBal;
	private String acctRenewalBalSi;
	private String acctGraceAccrualCode;
	private String acctProjAccrualInt;
	private String acctProjAccrualIntSi;
	private String acctIntAccrued;
	private String acctIntAccruedSi;
	private String acctRedepositInt;
	private String acctRedepositIntSi;
	private String acctCdRollCode;
	private String acctCdRollType;
	private String acctCdRollRate;
	private String acctCdRollPeriod;
	private String acctCdRollIncr;
	private String acctIntDistCode;
	private String acctIntDistSchedCode;
	private String acctIntDistCycle;
	private String acctIntDistIncr;
	private String acctIntDistDayOfMonth;
	private String acctIntDistNextPayDate;
	private String acctMaturityAnnivDay;
	private String acctMaturityUnredmdAccr;
	private String acctMaturityPrinDist;
	private String acctMaturityAutoRenew;
	private String acctCdRollMntPeriod;
	private String acctIntRatePointer;
	private String acctIntRate;
	private String acctTieredRatePointer;
	private String acctAccrualType;
	private String acctSplitTierRate;
	private String acctExempt;
	private String acctBulkFile;
	private String acctCheckTruncation;
	private String acctFundingFlag;
	private String acctMarketSector;
	private String acctMmdaInd;
	private String acctNoAmtTran;
	private String acctCheckItems;
	private String acctBalHist;
	private String acctBalHistRetention;
	private String acctMtdKiteDays;
	private String acctContinuousKiteDays;
	private String acctChargeCard;
	private String acctSpecInstr;
	private String acctNsfToday;
	private String acctNsfCalculation;
	private String acctOdToday;
	private String acctRelatedAcctCode;
	private String acctGlCode;
	private String acctZeroBalGraceDays;
	private String acctHoldMailFeeFlag;
	private String acctLastActivityDate;
	private String acctSystemType;
	private String acctSvcChrgLstStmt;
	private String acctSvcChrgLstStmtSi;
	private String acctMtdServiceCharge;
	private String acctMtdServiceChargeSi;
	private String acctLastDepositDate;
	private String acctLastDepositAmount;
	private String acctLastDepositAmountSi;
	private String acctSavLessCtdTax;
	private String acctSavLessCtdTaxSi;
	private String acctSavPendTax;
	private String acctSavPendTaxSi;
	private LinkedHashMap custFreezeReason;
	private String ibanAcctNumber;
	private String facilityId;
	private String odType;
	private String btaFlag;
	private String hafizFlag;
	private String escheatFlag;
	private String acctFutureStatus;
	private String daysLeft;
	private String abandoned;
	private String acctStatus;
	private String acctTotHoldAmt;
	private String acctTotHoldAmtSi;
	private String acctFloatAmt;
	private String acctFloatAmtSi;
	private String acctMtdAvgBal;
	private String acctMtdAvgBalSi;
	private String acctLastDbAmt;
	private String acctLastDbAmtSi;
	private String acctLastDbDate;
	private String acctLastMainten;
	private String acctIntCrYtdSi;
	private String acctIntCrLastYr;
	private String acctAccrTdtSi;
	private String acctIntAccrTdy;
	private AcctNoOfInterest acctNoOfInterest;



	public AccountBalanceHeaderRs getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(AccountBalanceHeaderRs riyadBankHeader) {
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

	public String getAcctProductType() {
		return acctProductType;
	}

	public void setAcctProductType(String acctProductType) {
		this.acctProductType = acctProductType;
	}

	public String getAcctCurrency() {
		return acctCurrency;
	}

	public void setAcctCurrency(String acctCurrency) {
		this.acctCurrency = acctCurrency;
	}

	public String getAcctLedgerBal() {
		return acctLedgerBal;
	}

	public void setAcctLedgerBal(String acctLedgerBal) {
		this.acctLedgerBal = acctLedgerBal;
	}

	public String getAcctLedgerBalSi() {
		return acctLedgerBalSi;
	}

	public void setAcctLedgerBalSi(String acctLedgerBalSi) {
		this.acctLedgerBalSi = acctLedgerBalSi;
	}

	public String getAvailBal() {
		return availBal;
	}

	public void setAvailBal(String availBal) {
		this.availBal = availBal;
	}

	public String getAcctAvailBalSi() {
		return acctAvailBalSi;
	}

	public void setAcctAvailBalSi(String acctAvailBalSi) {
		this.acctAvailBalSi = acctAvailBalSi;
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

	public String getAcctLastStmtDateG() {
		return acctLastStmtDateG;
	}

	public void setAcctLastStmtDateG(String acctLastStmtDateG) {
		this.acctLastStmtDateG = acctLastStmtDateG;
	}

	public String getAcctLastTranDateG() {
		return acctLastTranDateG;
	}

	public void setAcctLastTranDateG(String acctLastTranDateG) {
		this.acctLastTranDateG = acctLastTranDateG;
	}

	public String getAcctStmtMailInd() {
		return acctStmtMailInd;
	}

	public void setAcctStmtMailInd(String acctStmtMailInd) {
		this.acctStmtMailInd = acctStmtMailInd;
	}

	public String getAcctCardInd() {
		return acctCardInd;
	}

	public void setAcctCardInd(String acctCardInd) {
		this.acctCardInd = acctCardInd;
	}

	public String getAcctPassBal() {
		return acctPassBal;
	}

	public void setAcctPassBal(String acctPassBal) {
		this.acctPassBal = acctPassBal;
	}

	public String getAcctMatdateG() {
		return acctMatdateG;
	}

	public void setAcctMatdateG(String acctMatdateG) {
		this.acctMatdateG = acctMatdateG;
	}

	public String getAcctIntUpTodate() {
		return acctIntUpTodate;
	}

	public void setAcctIntUpTodate(String acctIntUpTodate) {
		this.acctIntUpTodate = acctIntUpTodate;
	}

	public String getAcctIntrate() {
		return acctIntrate;
	}

	public void setAcctIntrate(String acctIntrate) {
		this.acctIntrate = acctIntrate;
	}

	public String getAcctStartdateG() {
		return acctStartdateG;
	}

	public void setAcctStartdateG(String acctStartdateG) {
		this.acctStartdateG = acctStartdateG;
	}

	public String getAcctOdLimit() {
		return acctOdLimit;
	}

	public void setAcctOdLimit(String acctOdLimit) {
		this.acctOdLimit = acctOdLimit;
	}

	public String getAcctTerm() {
		return acctTerm;
	}

	public void setAcctTerm(String acctTerm) {
		this.acctTerm = acctTerm;
	}

	public String getAcctIntAtMaturity() {
		return acctIntAtMaturity;
	}

	public void setAcctIntAtMaturity(String acctIntAtMaturity) {
		this.acctIntAtMaturity = acctIntAtMaturity;
	}

	public String getAcctIntCrMtd() {
		return acctIntCrMtd;
	}

	public void setAcctIntCrMtd(String acctIntCrMtd) {
		this.acctIntCrMtd = acctIntCrMtd;
	}

	public String getAcctIntCrMtdSi() {
		return acctIntCrMtdSi;
	}

	public void setAcctIntCrMtdSi(String acctIntCrMtdSi) {
		this.acctIntCrMtdSi = acctIntCrMtdSi;
	}

	public String getAcctIntCrYtd() {
		return acctIntCrYtd;
	}

	public void setAcctIntCrYtd(String acctIntCrYtd) {
		this.acctIntCrYtd = acctIntCrYtd;
	}

	public String getAcctIntCrLastYrSi() {
		return acctIntCrLastYrSi;
	}

	public void setAcctIntCrLastYrSi(String acctIntCrLastYrSi) {
		this.acctIntCrLastYrSi = acctIntCrLastYrSi;
	}

	public String getAcctIntDbMtd() {
		return acctIntDbMtd;
	}

	public void setAcctIntDbMtd(String acctIntDbMtd) {
		this.acctIntDbMtd = acctIntDbMtd;
	}

	public String getAcctIntDbMtdSi() {
		return acctIntDbMtdSi;
	}

	public void setAcctIntDbMtdSi(String acctIntDbMtdSi) {
		this.acctIntDbMtdSi = acctIntDbMtdSi;
	}

	public String getAcctIntDbYtd() {
		return acctIntDbYtd;
	}

	public void setAcctIntDbYtd(String acctIntDbYtd) {
		this.acctIntDbYtd = acctIntDbYtd;
	}

	public String getAcctIntDbYtdSi() {
		return acctIntDbYtdSi;
	}

	public void setAcctIntDbYtdSi(String acctIntDbYtdSi) {
		this.acctIntDbYtdSi = acctIntDbYtdSi;
	}

	public String getAcctIntDbLastYr() {
		return acctIntDbLastYr;
	}

	public void setAcctIntDbLastYr(String acctIntDbLastYr) {
		this.acctIntDbLastYr = acctIntDbLastYr;
	}

	public String getAcctIntDbLastYrSi() {
		return acctIntDbLastYrSi;
	}

	public void setAcctIntDbLastYrSi(String acctIntDbLastYrSi) {
		this.acctIntDbLastYrSi = acctIntDbLastYrSi;
	}

	public String getAcctAccrTdy() {
		return acctAccrTdy;
	}

	public void setAcctAccrTdy(String acctAccrTdy) {
		this.acctAccrTdy = acctAccrTdy;
	}

	public String getAcctAccrTdySi() {
		return acctAccrTdySi;
	}

	public void setAcctAccrTdySi(String acctAccrTdySi) {
		this.acctAccrTdySi = acctAccrTdySi;
	}

	public String getAcctAccrTdt() {
		return acctAccrTdt;
	}

	public void setAcctAccrTdt(String acctAccrTdt) {
		this.acctAccrTdt = acctAccrTdt;
	}

	public String getAcctIntAccrTdySi() {
		return acctIntAccrTdySi;
	}

	public void setAcctIntAccrTdySi(String acctIntAccrTdySi) {
		this.acctIntAccrTdySi = acctIntAccrTdySi;
	}

	public String getAcctIntAccrTdt() {
		return acctIntAccrTdt;
	}

	public void setAcctIntAccrTdt(String acctIntAccrTdt) {
		this.acctIntAccrTdt = acctIntAccrTdt;
	}

	public String getAcctIntAccrTdtSi() {
		return acctIntAccrTdtSi;
	}

	public void setAcctIntAccrTdtSi(String acctIntAccrTdtSi) {
		this.acctIntAccrTdtSi = acctIntAccrTdtSi;
	}

	public String getAcctCollectedBal() {
		return acctCollectedBal;
	}

	public void setAcctCollectedBal(String acctCollectedBal) {
		this.acctCollectedBal = acctCollectedBal;
	}

	public String getAcctCollectedBalSi() {
		return acctCollectedBalSi;
	}

	public void setAcctCollectedBalSi(String acctCollectedBalSi) {
		this.acctCollectedBalSi = acctCollectedBalSi;
	}

	public String getAcctClosingBal() {
		return acctClosingBal;
	}

	public void setAcctClosingBal(String acctClosingBal) {
		this.acctClosingBal = acctClosingBal;
	}

	public String getAcctClosingBalSi() {
		return acctClosingBalSi;
	}

	public void setAcctClosingBalSi(String acctClosingBalSi) {
		this.acctClosingBalSi = acctClosingBalSi;
	}

	public String getAcctYtdMinBal() {
		return acctYtdMinBal;
	}

	public void setAcctYtdMinBal(String acctYtdMinBal) {
		this.acctYtdMinBal = acctYtdMinBal;
	}

	public String getAcctYtdMinBalSi() {
		return acctYtdMinBalSi;
	}

	public void setAcctYtdMinBalSi(String acctYtdMinBalSi) {
		this.acctYtdMinBalSi = acctYtdMinBalSi;
	}

	public String getAcctYtdAvgBal() {
		return acctYtdAvgBal;
	}

	public void setAcctYtdAvgBal(String acctYtdAvgBal) {
		this.acctYtdAvgBal = acctYtdAvgBal;
	}

	public String getAcctYtdAvgBalSi() {
		return acctYtdAvgBalSi;
	}

	public void setAcctYtdAvgBalSi(String acctYtdAvgBalSi) {
		this.acctYtdAvgBalSi = acctYtdAvgBalSi;
	}

	public String getAcctIntPaidMtd() {
		return acctIntPaidMtd;
	}

	public void setAcctIntPaidMtd(String acctIntPaidMtd) {
		this.acctIntPaidMtd = acctIntPaidMtd;
	}

	public String getAcctIntPaidMtdSi() {
		return acctIntPaidMtdSi;
	}

	public void setAcctIntPaidMtdSi(String acctIntPaidMtdSi) {
		this.acctIntPaidMtdSi = acctIntPaidMtdSi;
	}

	public String getAcctIntPaidYtd() {
		return acctIntPaidYtd;
	}

	public void setAcctIntPaidYtd(String acctIntPaidYtd) {
		this.acctIntPaidYtd = acctIntPaidYtd;
	}

	public String getAcctIntPaidYtdSi() {
		return acctIntPaidYtdSi;
	}

	public void setAcctIntPaidYtdSi(String acctIntPaidYtdSi) {
		this.acctIntPaidYtdSi = acctIntPaidYtdSi;
	}

	public String getAcctIntPaidLastYr() {
		return acctIntPaidLastYr;
	}

	public void setAcctIntPaidLastYr(String acctIntPaidLastYr) {
		this.acctIntPaidLastYr = acctIntPaidLastYr;
	}

	public String getAcctIntPaidLastYrSi() {
		return acctIntPaidLastYrSi;
	}

	public void setAcctIntPaidLastYrSi(String acctIntPaidLastYrSi) {
		this.acctIntPaidLastYrSi = acctIntPaidLastYrSi;
	}

	public String getAcctLastCrAmt() {
		return acctLastCrAmt;
	}

	public void setAcctLastCrAmt(String acctLastCrAmt) {
		this.acctLastCrAmt = acctLastCrAmt;
	}

	public String getAcctLastCrAmtSi() {
		return acctLastCrAmtSi;
	}

	public void setAcctLastCrAmtSi(String acctLastCrAmtSi) {
		this.acctLastCrAmtSi = acctLastCrAmtSi;
	}

	public String getAcctLastCrDate() {
		return acctLastCrDate;
	}

	public void setAcctLastCrDate(String acctLastCrDate) {
		this.acctLastCrDate = acctLastCrDate;
	}

	public String getAcctSrvcChrgMtd() {
		return acctSrvcChrgMtd;
	}

	public void setAcctSrvcChrgMtd(String acctSrvcChrgMtd) {
		this.acctSrvcChrgMtd = acctSrvcChrgMtd;
	}

	public String getAcctSrvcChrgMtdSi() {
		return acctSrvcChrgMtdSi;
	}

	public void setAcctSrvcChrgMtdSi(String acctSrvcChrgMtdSi) {
		this.acctSrvcChrgMtdSi = acctSrvcChrgMtdSi;
	}

	public String getAcctSrvcChrgYtd() {
		return acctSrvcChrgYtd;
	}

	public void setAcctSrvcChrgYtd(String acctSrvcChrgYtd) {
		this.acctSrvcChrgYtd = acctSrvcChrgYtd;
	}

	public String getAcctSrvcChrgYtdSi() {
		return acctSrvcChrgYtdSi;
	}

	public void setAcctSrvcChrgYtdSi(String acctSrvcChrgYtdSi) {
		this.acctSrvcChrgYtdSi = acctSrvcChrgYtdSi;
	}

	public String getAcctAccrIntMtd() {
		return acctAccrIntMtd;
	}

	public void setAcctAccrIntMtd(String acctAccrIntMtd) {
		this.acctAccrIntMtd = acctAccrIntMtd;
	}

	public String getAcctAccrIntMtdSi() {
		return acctAccrIntMtdSi;
	}

	public void setAcctAccrIntMtdSi(String acctAccrIntMtdSi) {
		this.acctAccrIntMtdSi = acctAccrIntMtdSi;
	}

	public String getAcctPrinAmt() {
		return acctPrinAmt;
	}

	public void setAcctPrinAmt(String acctPrinAmt) {
		this.acctPrinAmt = acctPrinAmt;
	}

	public String getAcctPrinAmtSi() {
		return acctPrinAmtSi;
	}

	public void setAcctPrinAmtSi(String acctPrinAmtSi) {
		this.acctPrinAmtSi = acctPrinAmtSi;
	}

	public String getAcctRenewTimes() {
		return acctRenewTimes;
	}

	public void setAcctRenewTimes(String acctRenewTimes) {
		this.acctRenewTimes = acctRenewTimes;
	}

	public String getAcctGraceEndDate() {
		return acctGraceEndDate;
	}

	public void setAcctGraceEndDate(String acctGraceEndDate) {
		this.acctGraceEndDate = acctGraceEndDate;
	}

	public String getAcctLastRenewDate() {
		return acctLastRenewDate;
	}

	public void setAcctLastRenewDate(String acctLastRenewDate) {
		this.acctLastRenewDate = acctLastRenewDate;
	}

	public String getAcctSamaStatus() {
		return acctSamaStatus;
	}

	public void setAcctSamaStatus(String acctSamaStatus) {
		this.acctSamaStatus = acctSamaStatus;
	}

	public String getAcct60DayMinBalSi() {
		return acct60DayMinBalSi;
	}

	public void setAcct60DayMinBalSi(String acct60DayMinBalSi) {
		this.acct60DayMinBalSi = acct60DayMinBalSi;
	}

	public String getAcct60DayMinBal() {
		return acct60DayMinBal;
	}

	public void setAcct60DayMinBal(String acct60DayMinBal) {
		this.acct60DayMinBal = acct60DayMinBal;
	}

	public String getAcctNumberOfOdLimits() {
		return acctNumberOfOdLimits;
	}

	public void setAcctNumberOfOdLimits(String acctNumberOfOdLimits) {
		this.acctNumberOfOdLimits = acctNumberOfOdLimits;
	}

	public String getAcctOdLimitSeq() {
		return acctOdLimitSeq;
	}

	public void setAcctOdLimitSeq(String acctOdLimitSeq) {
		this.acctOdLimitSeq = acctOdLimitSeq;
	}

	public String getAcctOdStatus() {
		return acctOdStatus;
	}

	public void setAcctOdStatus(String acctOdStatus) {
		this.acctOdStatus = acctOdStatus;
	}

	public String getAcctOdLimitAmt() {
		return acctOdLimitAmt;
	}

	public void setAcctOdLimitAmt(String acctOdLimitAmt) {
		this.acctOdLimitAmt = acctOdLimitAmt;
	}

	public String getAcctOdLimitUsedAmt() {
		return acctOdLimitUsedAmt;
	}

	public void setAcctOdLimitUsedAmt(String acctOdLimitUsedAmt) {
		this.acctOdLimitUsedAmt = acctOdLimitUsedAmt;
	}

	public String getAcctOdLimitRemainAmt() {
		return acctOdLimitRemainAmt;
	}

	public void setAcctOdLimitRemainAmt(String acctOdLimitRemainAmt) {
		this.acctOdLimitRemainAmt = acctOdLimitRemainAmt;
	}

	public String getAcctOdLimitEffDate() {
		return acctOdLimitEffDate;
	}

	public void setAcctOdLimitEffDate(String acctOdLimitEffDate) {
		this.acctOdLimitEffDate = acctOdLimitEffDate;
	}

	public String getAcctOdLimitExpiryDate() {
		return acctOdLimitExpiryDate;
	}

	public void setAcctOdLimitExpiryDate(String acctOdLimitExpiryDate) {
		this.acctOdLimitExpiryDate = acctOdLimitExpiryDate;
	}

	public String getAcctNumberOfOdIntLimits() {
		return acctNumberOfOdIntLimits;
	}

	public void setAcctNumberOfOdIntLimits(String acctNumberOfOdIntLimits) {
		this.acctNumberOfOdIntLimits = acctNumberOfOdIntLimits;
	}

	public String getAcctOdIntSeq() {
		return acctOdIntSeq;
	}

	public void setAcctOdIntSeq(String acctOdIntSeq) {
		this.acctOdIntSeq = acctOdIntSeq;
	}

	public String getAcctOdIntRate() {
		return acctOdIntRate;
	}

	public void setAcctOdIntRate(String acctOdIntRate) {
		this.acctOdIntRate = acctOdIntRate;
	}

	public String getAcctOdIntPtr() {
		return acctOdIntPtr;
	}

	public void setAcctOdIntPtr(String acctOdIntPtr) {
		this.acctOdIntPtr = acctOdIntPtr;
	}

	public String getAcctOdIntLimitAmt() {
		return acctOdIntLimitAmt;
	}

	public void setAcctOdIntLimitAmt(String acctOdIntLimitAmt) {
		this.acctOdIntLimitAmt = acctOdIntLimitAmt;
	}

	public String getAcctCashAmt() {
		return acctCashAmt;
	}

	public void setAcctCashAmt(String acctCashAmt) {
		this.acctCashAmt = acctCashAmt;
	}

	public String getAcctCashAmtSi() {
		return acctCashAmtSi;
	}

	public void setAcctCashAmtSi(String acctCashAmtSi) {
		this.acctCashAmtSi = acctCashAmtSi;
	}

	public String getAcctAvailCashAmt() {
		return acctAvailCashAmt;
	}

	public void setAcctAvailCashAmt(String acctAvailCashAmt) {
		this.acctAvailCashAmt = acctAvailCashAmt;
	}

	public String getAcctAvailCashAmtSi() {
		return acctAvailCashAmtSi;
	}

	public void setAcctAvailCashAmtSi(String acctAvailCashAmtSi) {
		this.acctAvailCashAmtSi = acctAvailCashAmtSi;
	}

	public String getAcctDdaBalance() {
		return acctDdaBalance;
	}

	public void setAcctDdaBalance(String acctDdaBalance) {
		this.acctDdaBalance = acctDdaBalance;
	}

	public String getAcctDdaBalanceSi() {
		return acctDdaBalanceSi;
	}

	public void setAcctDdaBalanceSi(String acctDdaBalanceSi) {
		this.acctDdaBalanceSi = acctDdaBalanceSi;
	}

	public String getAcctLoanBalance() {
		return acctLoanBalance;
	}

	public void setAcctLoanBalance(String acctLoanBalance) {
		this.acctLoanBalance = acctLoanBalance;
	}

	public String getAcctLoanBalanceSi() {
		return acctLoanBalanceSi;
	}

	public void setAcctLoanBalanceSi(String acctLoanBalanceSi) {
		this.acctLoanBalanceSi = acctLoanBalanceSi;
	}

	public String getAcctSavingsAvailBal() {
		return acctSavingsAvailBal;
	}

	public void setAcctSavingsAvailBal(String acctSavingsAvailBal) {
		this.acctSavingsAvailBal = acctSavingsAvailBal;
	}

	public String getAcctSavingsAvailBalSi() {
		return acctSavingsAvailBalSi;
	}

	public void setAcctSavingsAvailBalSi(String acctSavingsAvailBalSi) {
		this.acctSavingsAvailBalSi = acctSavingsAvailBalSi;
	}

	public String getAcctBankUnavailBal() {
		return acctBankUnavailBal;
	}

	public void setAcctBankUnavailBal(String acctBankUnavailBal) {
		this.acctBankUnavailBal = acctBankUnavailBal;
	}

	public String getAcctBankUnavailBalSi() {
		return acctBankUnavailBalSi;
	}

	public void setAcctBankUnavailBalSi(String acctBankUnavailBalSi) {
		this.acctBankUnavailBalSi = acctBankUnavailBalSi;
	}

	public String getAcctMinDdaBal() {
		return acctMinDdaBal;
	}

	public void setAcctMinDdaBal(String acctMinDdaBal) {
		this.acctMinDdaBal = acctMinDdaBal;
	}

	public String getAcctMinDdaBalSi() {
		return acctMinDdaBalSi;
	}

	public void setAcctMinDdaBalSi(String acctMinDdaBalSi) {
		this.acctMinDdaBalSi = acctMinDdaBalSi;
	}

	public String getAcctAveCollBal() {
		return acctAveCollBal;
	}

	public void setAcctAveCollBal(String acctAveCollBal) {
		this.acctAveCollBal = acctAveCollBal;
	}

	public String getAcctAveCollBalSi() {
		return acctAveCollBalSi;
	}

	public void setAcctAveCollBalSi(String acctAveCollBalSi) {
		this.acctAveCollBalSi = acctAveCollBalSi;
	}

	public String getAcctPayCycle() {
		return acctPayCycle;
	}

	public void setAcctPayCycle(String acctPayCycle) {
		this.acctPayCycle = acctPayCycle;
	}

	public String getAcctIntIncr() {
		return acctIntIncr;
	}

	public void setAcctIntIncr(String acctIntIncr) {
		this.acctIntIncr = acctIntIncr;
	}

	public String getAcctStmtPull() {
		return acctStmtPull;
	}

	public void setAcctStmtPull(String acctStmtPull) {
		this.acctStmtPull = acctStmtPull;
	}

	public String getAcctStmtField() {
		return acctStmtField;
	}

	public void setAcctStmtField(String acctStmtField) {
		this.acctStmtField = acctStmtField;
	}

	public String getAcctSrvceChrgeType() {
		return acctSrvceChrgeType;
	}

	public void setAcctSrvceChrgeType(String acctSrvceChrgeType) {
		this.acctSrvceChrgeType = acctSrvceChrgeType;
	}

	public String getAcctSrvceChrgeCode() {
		return acctSrvceChrgeCode;
	}

	public void setAcctSrvceChrgeCode(String acctSrvceChrgeCode) {
		this.acctSrvceChrgeCode = acctSrvceChrgeCode;
	}

	public String getAcctMessage() {
		return acctMessage;
	}

	public void setAcctMessage(String acctMessage) {
		this.acctMessage = acctMessage;
	}

	public String getAcctPlusIntAccrued() {
		return acctPlusIntAccrued;
	}

	public void setAcctPlusIntAccrued(String acctPlusIntAccrued) {
		this.acctPlusIntAccrued = acctPlusIntAccrued;
	}

	public String getAcctPlusIntAccruedSi() {
		return acctPlusIntAccruedSi;
	}

	public void setAcctPlusIntAccruedSi(String acctPlusIntAccruedSi) {
		this.acctPlusIntAccruedSi = acctPlusIntAccruedSi;
	}

	public String getAcctTaxCalcAmt() {
		return acctTaxCalcAmt;
	}

	public void setAcctTaxCalcAmt(String acctTaxCalcAmt) {
		this.acctTaxCalcAmt = acctTaxCalcAmt;
	}

	public String getAcctTaxCalcAmtSi() {
		return acctTaxCalcAmtSi;
	}

	public void setAcctTaxCalcAmtSi(String acctTaxCalcAmtSi) {
		this.acctTaxCalcAmtSi = acctTaxCalcAmtSi;
	}

	public String getAcctOdAccrual() {
		return acctOdAccrual;
	}

	public void setAcctOdAccrual(String acctOdAccrual) {
		this.acctOdAccrual = acctOdAccrual;
	}

	public String getAcctOdAccrualSi() {
		return acctOdAccrualSi;
	}

	public void setAcctOdAccrualSi(String acctOdAccrualSi) {
		this.acctOdAccrualSi = acctOdAccrualSi;
	}

	public String getAcctIodPendingTax() {
		return acctIodPendingTax;
	}

	public void setAcctIodPendingTax(String acctIodPendingTax) {
		this.acctIodPendingTax = acctIodPendingTax;
	}

	public String getAcctIodPendingTaxSi() {
		return acctIodPendingTaxSi;
	}

	public void setAcctIodPendingTaxSi(String acctIodPendingTaxSi) {
		this.acctIodPendingTaxSi = acctIodPendingTaxSi;
	}

	public String getAcctDdaTotal() {
		return acctDdaTotal;
	}

	public void setAcctDdaTotal(String acctDdaTotal) {
		this.acctDdaTotal = acctDdaTotal;
	}

	public String getAcctDdaTotalSi() {
		return acctDdaTotalSi;
	}

	public void setAcctDdaTotalSi(String acctDdaTotalSi) {
		this.acctDdaTotalSi = acctDdaTotalSi;
	}

	public String getAcctSavingsBal() {
		return acctSavingsBal;
	}

	public void setAcctSavingsBal(String acctSavingsBal) {
		this.acctSavingsBal = acctSavingsBal;
	}

	public String getAcctSavingsBalSi() {
		return acctSavingsBalSi;
	}

	public void setAcctSavingsBalSi(String acctSavingsBalSi) {
		this.acctSavingsBalSi = acctSavingsBalSi;
	}

	public String getAcctSavingsPlusIntAccrued() {
		return acctSavingsPlusIntAccrued;
	}

	public void setAcctSavingsPlusIntAccrued(String acctSavingsPlusIntAccrued) {
		this.acctSavingsPlusIntAccrued = acctSavingsPlusIntAccrued;
	}

	public String getAcctSavingsPlusIntAccruedSi() {
		return acctSavingsPlusIntAccruedSi;
	}

	public void setAcctSavingsPlusIntAccruedSi(String acctSavingsPlusIntAccruedSi) {
		this.acctSavingsPlusIntAccruedSi = acctSavingsPlusIntAccruedSi;
	}

	public String getAcctSavingsTotal() {
		return acctSavingsTotal;
	}

	public void setAcctSavingsTotal(String acctSavingsTotal) {
		this.acctSavingsTotal = acctSavingsTotal;
	}

	public String getAcctSavingsTotalSi() {
		return acctSavingsTotalSi;
	}

	public void setAcctSavingsTotalSi(String acctSavingsTotalSi) {
		this.acctSavingsTotalSi = acctSavingsTotalSi;
	}

	public String getAcctLoanPrin() {
		return acctLoanPrin;
	}

	public void setAcctLoanPrin(String acctLoanPrin) {
		this.acctLoanPrin = acctLoanPrin;
	}

	public String getAcctLoanPrinSi() {
		return acctLoanPrinSi;
	}

	public void setAcctLoanPrinSi(String acctLoanPrinSi) {
		this.acctLoanPrinSi = acctLoanPrinSi;
	}

	public String getAcctLoanPrinPlusInt() {
		return acctLoanPrinPlusInt;
	}

	public void setAcctLoanPrinPlusInt(String acctLoanPrinPlusInt) {
		this.acctLoanPrinPlusInt = acctLoanPrinPlusInt;
	}

	public String getAcctLoanPrinPlusIntSi() {
		return acctLoanPrinPlusIntSi;
	}

	public void setAcctLoanPrinPlusIntSi(String acctLoanPrinPlusIntSi) {
		this.acctLoanPrinPlusIntSi = acctLoanPrinPlusIntSi;
	}

	public String getAcctLoanPrinPlusIns1() {
		return acctLoanPrinPlusIns1;
	}

	public void setAcctLoanPrinPlusIns1(String acctLoanPrinPlusIns1) {
		this.acctLoanPrinPlusIns1 = acctLoanPrinPlusIns1;
	}

	public String getAcctLoanPrinPlusIns1Si() {
		return acctLoanPrinPlusIns1Si;
	}

	public void setAcctLoanPrinPlusIns1Si(String acctLoanPrinPlusIns1Si) {
		this.acctLoanPrinPlusIns1Si = acctLoanPrinPlusIns1Si;
	}

	public String getAcctLoanPrinPlusIns2() {
		return acctLoanPrinPlusIns2;
	}

	public void setAcctLoanPrinPlusIns2(String acctLoanPrinPlusIns2) {
		this.acctLoanPrinPlusIns2 = acctLoanPrinPlusIns2;
	}

	public String getAcctLoanPrinPlusIns2Si() {
		return acctLoanPrinPlusIns2Si;
	}

	public void setAcctLoanPrinPlusIns2Si(String acctLoanPrinPlusIns2Si) {
		this.acctLoanPrinPlusIns2Si = acctLoanPrinPlusIns2Si;
	}

	public String getAcctLoanPrinPlusOthrFee() {
		return acctLoanPrinPlusOthrFee;
	}

	public void setAcctLoanPrinPlusOthrFee(String acctLoanPrinPlusOthrFee) {
		this.acctLoanPrinPlusOthrFee = acctLoanPrinPlusOthrFee;
	}

	public String getAcctLoanPrinPlusOthrFeeSi() {
		return acctLoanPrinPlusOthrFeeSi;
	}

	public void setAcctLoanPrinPlusOthrFeeSi(String acctLoanPrinPlusOthrFeeSi) {
		this.acctLoanPrinPlusOthrFeeSi = acctLoanPrinPlusOthrFeeSi;
	}

	public String getAcctLoanPayoffAmt() {
		return acctLoanPayoffAmt;
	}

	public void setAcctLoanPayoffAmt(String acctLoanPayoffAmt) {
		this.acctLoanPayoffAmt = acctLoanPayoffAmt;
	}

	public String getAcctLoanPayoffAmtSi() {
		return acctLoanPayoffAmtSi;
	}

	public void setAcctLoanPayoffAmtSi(String acctLoanPayoffAmtSi) {
		this.acctLoanPayoffAmtSi = acctLoanPayoffAmtSi;
	}

	public String getAcctStopPays() {
		return acctStopPays;
	}

	public void setAcctStopPays(String acctStopPays) {
		this.acctStopPays = acctStopPays;
	}

	public String getAcctStopPaysSi() {
		return acctStopPaysSi;
	}

	public void setAcctStopPaysSi(String acctStopPaysSi) {
		this.acctStopPaysSi = acctStopPaysSi;
	}

	public String getAcctBackupWithhldFlag() {
		return acctBackupWithhldFlag;
	}

	public void setAcctBackupWithhldFlag(String acctBackupWithhldFlag) {
		this.acctBackupWithhldFlag = acctBackupWithhldFlag;
	}

	public String getAcctLoanDailyAccrual() {
		return acctLoanDailyAccrual;
	}

	public void setAcctLoanDailyAccrual(String acctLoanDailyAccrual) {
		this.acctLoanDailyAccrual = acctLoanDailyAccrual;
	}

	public String getAcctLoanDailyAccrualSi() {
		return acctLoanDailyAccrualSi;
	}

	public void setAcctLoanDailyAccrualSi(String acctLoanDailyAccrualSi) {
		this.acctLoanDailyAccrualSi = acctLoanDailyAccrualSi;
	}

	public String getAcctCombinedStmts() {
		return acctCombinedStmts;
	}

	public void setAcctCombinedStmts(String acctCombinedStmts) {
		this.acctCombinedStmts = acctCombinedStmts;
	}

	public String getAcctTodayNoDebit() {
		return acctTodayNoDebit;
	}

	public void setAcctTodayNoDebit(String acctTodayNoDebit) {
		this.acctTodayNoDebit = acctTodayNoDebit;
	}

	public String getAcctTodayAmountDebit() {
		return acctTodayAmountDebit;
	}

	public void setAcctTodayAmountDebit(String acctTodayAmountDebit) {
		this.acctTodayAmountDebit = acctTodayAmountDebit;
	}

	public String getAcctTodayAmountDebitSi() {
		return acctTodayAmountDebitSi;
	}

	public void setAcctTodayAmountDebitSi(String acctTodayAmountDebitSi) {
		this.acctTodayAmountDebitSi = acctTodayAmountDebitSi;
	}

	public String getAcctTodayNoCredit() {
		return acctTodayNoCredit;
	}

	public void setAcctTodayNoCredit(String acctTodayNoCredit) {
		this.acctTodayNoCredit = acctTodayNoCredit;
	}

	public String getAcctTodayAmountCredit() {
		return acctTodayAmountCredit;
	}

	public void setAcctTodayAmountCredit(String acctTodayAmountCredit) {
		this.acctTodayAmountCredit = acctTodayAmountCredit;
	}

	public String getAcctTodayAmountCreditSi() {
		return acctTodayAmountCreditSi;
	}

	public void setAcctTodayAmountCreditSi(String acctTodayAmountCreditSi) {
		this.acctTodayAmountCreditSi = acctTodayAmountCreditSi;
	}

	public String getAcctNoSavingsDebit() {
		return acctNoSavingsDebit;
	}

	public void setAcctNoSavingsDebit(String acctNoSavingsDebit) {
		this.acctNoSavingsDebit = acctNoSavingsDebit;
	}

	public String getAcctNoSavingsCredit() {
		return acctNoSavingsCredit;
	}

	public void setAcctNoSavingsCredit(String acctNoSavingsCredit) {
		this.acctNoSavingsCredit = acctNoSavingsCredit;
	}

	public String getAcctNoLoansDebit() {
		return acctNoLoansDebit;
	}

	public void setAcctNoLoansDebit(String acctNoLoansDebit) {
		this.acctNoLoansDebit = acctNoLoansDebit;
	}

	public String getAcctNoLoansCredit() {
		return acctNoLoansCredit;
	}

	public void setAcctNoLoansCredit(String acctNoLoansCredit) {
		this.acctNoLoansCredit = acctNoLoansCredit;
	}

	public String getAcctTrailerFlags() {
		return acctTrailerFlags;
	}

	public void setAcctTrailerFlags(String acctTrailerFlags) {
		this.acctTrailerFlags = acctTrailerFlags;
	}

	public String getAcctClosingChrgeAmt() {
		return acctClosingChrgeAmt;
	}

	public void setAcctClosingChrgeAmt(String acctClosingChrgeAmt) {
		this.acctClosingChrgeAmt = acctClosingChrgeAmt;
	}

	public String getAcctClosingChrgeAmtSi() {
		return acctClosingChrgeAmtSi;
	}

	public void setAcctClosingChrgeAmtSi(String acctClosingChrgeAmtSi) {
		this.acctClosingChrgeAmtSi = acctClosingChrgeAmtSi;
	}

	public String getAcctTotalPenalty() {
		return acctTotalPenalty;
	}

	public void setAcctTotalPenalty(String acctTotalPenalty) {
		this.acctTotalPenalty = acctTotalPenalty;
	}

	public String getAcctTotalPenaltySi() {
		return acctTotalPenaltySi;
	}

	public void setAcctTotalPenaltySi(String acctTotalPenaltySi) {
		this.acctTotalPenaltySi = acctTotalPenaltySi;
	}

	public String getAcctFeesDue() {
		return acctFeesDue;
	}

	public void setAcctFeesDue(String acctFeesDue) {
		this.acctFeesDue = acctFeesDue;
	}

	public String getAcctFeesDueSi() {
		return acctFeesDueSi;
	}

	public void setAcctFeesDueSi(String acctFeesDueSi) {
		this.acctFeesDueSi = acctFeesDueSi;
	}

	public String getAcctProjectedAccrual() {
		return acctProjectedAccrual;
	}

	public void setAcctProjectedAccrual(String acctProjectedAccrual) {
		this.acctProjectedAccrual = acctProjectedAccrual;
	}

	public String getAcctProjectedAccrualSi() {
		return acctProjectedAccrualSi;
	}

	public void setAcctProjectedAccrualSi(String acctProjectedAccrualSi) {
		this.acctProjectedAccrualSi = acctProjectedAccrualSi;
	}

	public String getAcctLastTranTdyTeller() {
		return acctLastTranTdyTeller;
	}

	public void setAcctLastTranTdyTeller(String acctLastTranTdyTeller) {
		this.acctLastTranTdyTeller = acctLastTranTdyTeller;
	}

	public String getAcctlastTranTdyTranid() {
		return acctlastTranTdyTranid;
	}

	public void setAcctlastTranTdyTranid(String acctlastTranTdyTranid) {
		this.acctlastTranTdyTranid = acctlastTranTdyTranid;
	}

	public String getAcctlastTranTdyAmt() {
		return acctlastTranTdyAmt;
	}

	public void setAcctlastTranTdyAmt(String acctlastTranTdyAmt) {
		this.acctlastTranTdyAmt = acctlastTranTdyAmt;
	}

	public String getAcctLastTranTdyAmtSi() {
		return acctLastTranTdyAmtSi;
	}

	public void setAcctLastTranTdyAmtSi(String acctLastTranTdyAmtSi) {
		this.acctLastTranTdyAmtSi = acctLastTranTdyAmtSi;
	}

	public String getAcctPledgeAmt() {
		return acctPledgeAmt;
	}

	public void setAcctPledgeAmt(String acctPledgeAmt) {
		this.acctPledgeAmt = acctPledgeAmt;
	}

	public String getAcctPledgeAmtSi() {
		return acctPledgeAmtSi;
	}

	public void setAcctPledgeAmtSi(String acctPledgeAmtSi) {
		this.acctPledgeAmtSi = acctPledgeAmtSi;
	}

	public String getAcctRenewalBal() {
		return acctRenewalBal;
	}

	public void setAcctRenewalBal(String acctRenewalBal) {
		this.acctRenewalBal = acctRenewalBal;
	}

	public String getAcctRenewalBalSi() {
		return acctRenewalBalSi;
	}

	public void setAcctRenewalBalSi(String acctRenewalBalSi) {
		this.acctRenewalBalSi = acctRenewalBalSi;
	}

	public String getAcctGraceAccrualCode() {
		return acctGraceAccrualCode;
	}

	public void setAcctGraceAccrualCode(String acctGraceAccrualCode) {
		this.acctGraceAccrualCode = acctGraceAccrualCode;
	}

	public String getAcctProjAccrualInt() {
		return acctProjAccrualInt;
	}

	public void setAcctProjAccrualInt(String acctProjAccrualInt) {
		this.acctProjAccrualInt = acctProjAccrualInt;
	}

	public String getAcctProjAccrualIntSi() {
		return acctProjAccrualIntSi;
	}

	public void setAcctProjAccrualIntSi(String acctProjAccrualIntSi) {
		this.acctProjAccrualIntSi = acctProjAccrualIntSi;
	}

	public String getAcctIntAccrued() {
		return acctIntAccrued;
	}

	public void setAcctIntAccrued(String acctIntAccrued) {
		this.acctIntAccrued = acctIntAccrued;
	}

	public String getAcctIntAccruedSi() {
		return acctIntAccruedSi;
	}

	public void setAcctIntAccruedSi(String acctIntAccruedSi) {
		this.acctIntAccruedSi = acctIntAccruedSi;
	}

	public String getAcctRedepositInt() {
		return acctRedepositInt;
	}

	public void setAcctRedepositInt(String acctRedepositInt) {
		this.acctRedepositInt = acctRedepositInt;
	}

	public String getAcctRedepositIntSi() {
		return acctRedepositIntSi;
	}

	public void setAcctRedepositIntSi(String acctRedepositIntSi) {
		this.acctRedepositIntSi = acctRedepositIntSi;
	}

	public String getAcctCdRollCode() {
		return acctCdRollCode;
	}

	public void setAcctCdRollCode(String acctCdRollCode) {
		this.acctCdRollCode = acctCdRollCode;
	}

	public String getAcctCdRollType() {
		return acctCdRollType;
	}

	public void setAcctCdRollType(String acctCdRollType) {
		this.acctCdRollType = acctCdRollType;
	}

	public String getAcctCdRollRate() {
		return acctCdRollRate;
	}

	public void setAcctCdRollRate(String acctCdRollRate) {
		this.acctCdRollRate = acctCdRollRate;
	}

	public String getAcctCdRollPeriod() {
		return acctCdRollPeriod;
	}

	public void setAcctCdRollPeriod(String acctCdRollPeriod) {
		this.acctCdRollPeriod = acctCdRollPeriod;
	}

	public String getAcctCdRollIncr() {
		return acctCdRollIncr;
	}

	public void setAcctCdRollIncr(String acctCdRollIncr) {
		this.acctCdRollIncr = acctCdRollIncr;
	}

	public String getAcctIntDistCode() {
		return acctIntDistCode;
	}

	public void setAcctIntDistCode(String acctIntDistCode) {
		this.acctIntDistCode = acctIntDistCode;
	}

	public String getAcctIntDistSchedCode() {
		return acctIntDistSchedCode;
	}

	public void setAcctIntDistSchedCode(String acctIntDistSchedCode) {
		this.acctIntDistSchedCode = acctIntDistSchedCode;
	}

	public String getAcctIntDistCycle() {
		return acctIntDistCycle;
	}

	public void setAcctIntDistCycle(String acctIntDistCycle) {
		this.acctIntDistCycle = acctIntDistCycle;
	}

	public String getAcctIntDistIncr() {
		return acctIntDistIncr;
	}

	public void setAcctIntDistIncr(String acctIntDistIncr) {
		this.acctIntDistIncr = acctIntDistIncr;
	}

	public String getAcctIntDistDayOfMonth() {
		return acctIntDistDayOfMonth;
	}

	public void setAcctIntDistDayOfMonth(String acctIntDistDayOfMonth) {
		this.acctIntDistDayOfMonth = acctIntDistDayOfMonth;
	}

	public String getAcctIntDistNextPayDate() {
		return acctIntDistNextPayDate;
	}

	public void setAcctIntDistNextPayDate(String acctIntDistNextPayDate) {
		this.acctIntDistNextPayDate = acctIntDistNextPayDate;
	}

	public String getAcctMaturityAnnivDay() {
		return acctMaturityAnnivDay;
	}

	public void setAcctMaturityAnnivDay(String acctMaturityAnnivDay) {
		this.acctMaturityAnnivDay = acctMaturityAnnivDay;
	}

	public String getAcctMaturityUnredmdAccr() {
		return acctMaturityUnredmdAccr;
	}

	public void setAcctMaturityUnredmdAccr(String acctMaturityUnredmdAccr) {
		this.acctMaturityUnredmdAccr = acctMaturityUnredmdAccr;
	}

	public String getAcctMaturityPrinDist() {
		return acctMaturityPrinDist;
	}

	public void setAcctMaturityPrinDist(String acctMaturityPrinDist) {
		this.acctMaturityPrinDist = acctMaturityPrinDist;
	}

	public String getAcctMaturityAutoRenew() {
		return acctMaturityAutoRenew;
	}

	public void setAcctMaturityAutoRenew(String acctMaturityAutoRenew) {
		this.acctMaturityAutoRenew = acctMaturityAutoRenew;
	}

	public String getAcctCdRollMntPeriod() {
		return acctCdRollMntPeriod;
	}

	public void setAcctCdRollMntPeriod(String acctCdRollMntPeriod) {
		this.acctCdRollMntPeriod = acctCdRollMntPeriod;
	}

	public String getAcctIntRatePointer() {
		return acctIntRatePointer;
	}

	public void setAcctIntRatePointer(String acctIntRatePointer) {
		this.acctIntRatePointer = acctIntRatePointer;
	}

	public String getAcctIntRate() {
		return acctIntRate;
	}

	public void setAcctIntRate(String acctIntRate) {
		this.acctIntRate = acctIntRate;
	}

	public String getAcctTieredRatePointer() {
		return acctTieredRatePointer;
	}

	public void setAcctTieredRatePointer(String acctTieredRatePointer) {
		this.acctTieredRatePointer = acctTieredRatePointer;
	}

	public String getAcctAccrualType() {
		return acctAccrualType;
	}

	public void setAcctAccrualType(String acctAccrualType) {
		this.acctAccrualType = acctAccrualType;
	}

	public String getAcctSplitTierRate() {
		return acctSplitTierRate;
	}

	public void setAcctSplitTierRate(String acctSplitTierRate) {
		this.acctSplitTierRate = acctSplitTierRate;
	}

	public String getAcctExempt() {
		return acctExempt;
	}

	public void setAcctExempt(String acctExempt) {
		this.acctExempt = acctExempt;
	}

	public String getAcctBulkFile() {
		return acctBulkFile;
	}

	public void setAcctBulkFile(String acctBulkFile) {
		this.acctBulkFile = acctBulkFile;
	}

	public String getAcctCheckTruncation() {
		return acctCheckTruncation;
	}

	public void setAcctCheckTruncation(String acctCheckTruncation) {
		this.acctCheckTruncation = acctCheckTruncation;
	}

	public String getAcctFundingFlag() {
		return acctFundingFlag;
	}

	public void setAcctFundingFlag(String acctFundingFlag) {
		this.acctFundingFlag = acctFundingFlag;
	}

	public String getAcctMarketSector() {
		return acctMarketSector;
	}

	public void setAcctMarketSector(String acctMarketSector) {
		this.acctMarketSector = acctMarketSector;
	}

	public String getAcctMmdaInd() {
		return acctMmdaInd;
	}

	public void setAcctMmdaInd(String acctMmdaInd) {
		this.acctMmdaInd = acctMmdaInd;
	}

	public String getAcctNoAmtTran() {
		return acctNoAmtTran;
	}

	public void setAcctNoAmtTran(String acctNoAmtTran) {
		this.acctNoAmtTran = acctNoAmtTran;
	}

	public String getAcctCheckItems() {
		return acctCheckItems;
	}

	public void setAcctCheckItems(String acctCheckItems) {
		this.acctCheckItems = acctCheckItems;
	}

	public String getAcctBalHist() {
		return acctBalHist;
	}

	public void setAcctBalHist(String acctBalHist) {
		this.acctBalHist = acctBalHist;
	}

	public String getAcctBalHistRetention() {
		return acctBalHistRetention;
	}

	public void setAcctBalHistRetention(String acctBalHistRetention) {
		this.acctBalHistRetention = acctBalHistRetention;
	}

	public String getAcctMtdKiteDays() {
		return acctMtdKiteDays;
	}

	public void setAcctMtdKiteDays(String acctMtdKiteDays) {
		this.acctMtdKiteDays = acctMtdKiteDays;
	}

	public String getAcctContinuousKiteDays() {
		return acctContinuousKiteDays;
	}

	public void setAcctContinuousKiteDays(String acctContinuousKiteDays) {
		this.acctContinuousKiteDays = acctContinuousKiteDays;
	}

	public String getAcctChargeCard() {
		return acctChargeCard;
	}

	public void setAcctChargeCard(String acctChargeCard) {
		this.acctChargeCard = acctChargeCard;
	}

	public String getAcctSpecInstr() {
		return acctSpecInstr;
	}

	public void setAcctSpecInstr(String acctSpecInstr) {
		this.acctSpecInstr = acctSpecInstr;
	}

	public String getAcctNsfToday() {
		return acctNsfToday;
	}

	public void setAcctNsfToday(String acctNsfToday) {
		this.acctNsfToday = acctNsfToday;
	}

	public String getAcctNsfCalculation() {
		return acctNsfCalculation;
	}

	public void setAcctNsfCalculation(String acctNsfCalculation) {
		this.acctNsfCalculation = acctNsfCalculation;
	}

	public String getAcctOdToday() {
		return acctOdToday;
	}

	public void setAcctOdToday(String acctOdToday) {
		this.acctOdToday = acctOdToday;
	}

	public String getAcctRelatedAcctCode() {
		return acctRelatedAcctCode;
	}

	public void setAcctRelatedAcctCode(String acctRelatedAcctCode) {
		this.acctRelatedAcctCode = acctRelatedAcctCode;
	}

	public String getAcctGlCode() {
		return acctGlCode;
	}

	public void setAcctGlCode(String acctGlCode) {
		this.acctGlCode = acctGlCode;
	}

	public String getAcctZeroBalGraceDays() {
		return acctZeroBalGraceDays;
	}

	public void setAcctZeroBalGraceDays(String acctZeroBalGraceDays) {
		this.acctZeroBalGraceDays = acctZeroBalGraceDays;
	}

	public String getAcctHoldMailFeeFlag() {
		return acctHoldMailFeeFlag;
	}

	public void setAcctHoldMailFeeFlag(String acctHoldMailFeeFlag) {
		this.acctHoldMailFeeFlag = acctHoldMailFeeFlag;
	}

	public String getAcctLastActivityDate() {
		return acctLastActivityDate;
	}

	public void setAcctLastActivityDate(String acctLastActivityDate) {
		this.acctLastActivityDate = acctLastActivityDate;
	}

	public String getAcctSystemType() {
		return acctSystemType;
	}

	public void setAcctSystemType(String acctSystemType) {
		this.acctSystemType = acctSystemType;
	}

	public String getAcctSvcChrgLstStmt() {
		return acctSvcChrgLstStmt;
	}

	public void setAcctSvcChrgLstStmt(String acctSvcChrgLstStmt) {
		this.acctSvcChrgLstStmt = acctSvcChrgLstStmt;
	}

	public String getAcctSvcChrgLstStmtSi() {
		return acctSvcChrgLstStmtSi;
	}

	public void setAcctSvcChrgLstStmtSi(String acctSvcChrgLstStmtSi) {
		this.acctSvcChrgLstStmtSi = acctSvcChrgLstStmtSi;
	}

	public String getAcctMtdServiceCharge() {
		return acctMtdServiceCharge;
	}

	public void setAcctMtdServiceCharge(String acctMtdServiceCharge) {
		this.acctMtdServiceCharge = acctMtdServiceCharge;
	}

	public String getAcctMtdServiceChargeSi() {
		return acctMtdServiceChargeSi;
	}

	public void setAcctMtdServiceChargeSi(String acctMtdServiceChargeSi) {
		this.acctMtdServiceChargeSi = acctMtdServiceChargeSi;
	}

	public String getAcctLastDepositDate() {
		return acctLastDepositDate;
	}

	public void setAcctLastDepositDate(String acctLastDepositDate) {
		this.acctLastDepositDate = acctLastDepositDate;
	}

	public String getAcctLastDepositAmount() {
		return acctLastDepositAmount;
	}

	public void setAcctLastDepositAmount(String acctLastDepositAmount) {
		this.acctLastDepositAmount = acctLastDepositAmount;
	}

	public String getAcctLastDepositAmountSi() {
		return acctLastDepositAmountSi;
	}

	public void setAcctLastDepositAmountSi(String acctLastDepositAmountSi) {
		this.acctLastDepositAmountSi = acctLastDepositAmountSi;
	}

	public String getAcctSavLessCtdTax() {
		return acctSavLessCtdTax;
	}

	public void setAcctSavLessCtdTax(String acctSavLessCtdTax) {
		this.acctSavLessCtdTax = acctSavLessCtdTax;
	}

	public String getAcctSavLessCtdTaxSi() {
		return acctSavLessCtdTaxSi;
	}

	public void setAcctSavLessCtdTaxSi(String acctSavLessCtdTaxSi) {
		this.acctSavLessCtdTaxSi = acctSavLessCtdTaxSi;
	}

	public String getAcctSavPendTax() {
		return acctSavPendTax;
	}

	public void setAcctSavPendTax(String acctSavPendTax) {
		this.acctSavPendTax = acctSavPendTax;
	}

	public String getAcctSavPendTaxSi() {
		return acctSavPendTaxSi;
	}

	public void setAcctSavPendTaxSi(String acctSavPendTaxSi) {
		this.acctSavPendTaxSi = acctSavPendTaxSi;
	}

	public LinkedHashMap getCustFreezeReason() {
		return custFreezeReason;
	}

	public void setCustFreezeReason(LinkedHashMap custFreezeReason) {
		this.custFreezeReason = custFreezeReason;
	}

	public String getIbanAcctNumber() {
		return ibanAcctNumber;
	}

	public void setIbanAcctNumber(String ibanAcctNumber) {
		this.ibanAcctNumber = ibanAcctNumber;
	}

	public String getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}

	public String getOdType() {
		return odType;
	}

	public void setOdType(String odType) {
		this.odType = odType;
	}

	public String getBtaFlag() {
		return btaFlag;
	}

	public void setBtaFlag(String btaFlag) {
		this.btaFlag = btaFlag;
	}

	public String getHafizFlag() {
		return hafizFlag;
	}

	public void setHafizFlag(String hafizFlag) {
		this.hafizFlag = hafizFlag;
	}

	public String getEscheatFlag() {
		return escheatFlag;
	}

	public void setEscheatFlag(String escheatFlag) {
		this.escheatFlag = escheatFlag;
	}

	public String getAcctFutureStatus() {
		return acctFutureStatus;
	}

	public void setAcctFutureStatus(String acctFutureStatus) {
		this.acctFutureStatus = acctFutureStatus;
	}

	public String getDaysLeft() {
		return daysLeft;
	}

	public void setDaysLeft(String daysLeft) {
		this.daysLeft = daysLeft;
	}

	public String getAbandoned() {
		return abandoned;
	}

	public void setAbandoned(String abandoned) {
		this.abandoned = abandoned;
	}

	public String getAcctStatus() {
		return acctStatus;
	}

	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus;
	}

	public String getAcctTotHoldAmt() {
		return acctTotHoldAmt;
	}

	public void setAcctTotHoldAmt(String acctTotHoldAmt) {
		this.acctTotHoldAmt = acctTotHoldAmt;
	}

	public String getAcctTotHoldAmtSi() {
		return acctTotHoldAmtSi;
	}

	public void setAcctTotHoldAmtSi(String acctTotHoldAmtSi) {
		this.acctTotHoldAmtSi = acctTotHoldAmtSi;
	}

	public String getAcctFloatAmt() {
		return acctFloatAmt;
	}

	public void setAcctFloatAmt(String acctFloatAmt) {
		this.acctFloatAmt = acctFloatAmt;
	}

	public String getAcctFloatAmtSi() {
		return acctFloatAmtSi;
	}

	public void setAcctFloatAmtSi(String acctFloatAmtSi) {
		this.acctFloatAmtSi = acctFloatAmtSi;
	}

	public String getAcctMtdAvgBal() {
		return acctMtdAvgBal;
	}

	public void setAcctMtdAvgBal(String acctMtdAvgBal) {
		this.acctMtdAvgBal = acctMtdAvgBal;
	}

	public String getAcctMtdAvgBalSi() {
		return acctMtdAvgBalSi;
	}

	public void setAcctMtdAvgBalSi(String acctMtdAvgBalSi) {
		this.acctMtdAvgBalSi = acctMtdAvgBalSi;
	}

	public String getAcctLastDbAmt() {
		return acctLastDbAmt;
	}

	public void setAcctLastDbAmt(String acctLastDbAmt) {
		this.acctLastDbAmt = acctLastDbAmt;
	}

	public String getAcctLastDbAmtSi() {
		return acctLastDbAmtSi;
	}

	public void setAcctLastDbAmtSi(String acctLastDbAmtSi) {
		this.acctLastDbAmtSi = acctLastDbAmtSi;
	}

	public String getAcctLastDbDate() {
		return acctLastDbDate;
	}

	public void setAcctLastDbDate(String acctLastDbDate) {
		this.acctLastDbDate = acctLastDbDate;
	}

	public String getAcctLastMainten() {
		return acctLastMainten;
	}

	public void setAcctLastMainten(String acctLastMainten) {
		this.acctLastMainten = acctLastMainten;
	}

	public String getAcctIntCrYtdSi() {
		return acctIntCrYtdSi;
	}

	public void setAcctIntCrYtdSi(String acctIntCrYtdSi) {
		this.acctIntCrYtdSi = acctIntCrYtdSi;
	}

	public String getAcctIntCrLastYr() {
		return acctIntCrLastYr;
	}

	public void setAcctIntCrLastYr(String acctIntCrLastYr) {
		this.acctIntCrLastYr = acctIntCrLastYr;
	}

	public String getAcctAccrTdtSi() {
		return acctAccrTdtSi;
	}

	public void setAcctAccrTdtSi(String acctAccrTdtSi) {
		this.acctAccrTdtSi = acctAccrTdtSi;
	}

	public String getAcctIntAccrTdy() {
		return acctIntAccrTdy;
	}

	public void setAcctIntAccrTdy(String acctIntAccrTdy) {
		this.acctIntAccrTdy = acctIntAccrTdy;
	}

	public AcctNoOfInterest getAcctNoOfInterest() {
		return acctNoOfInterest;
	}

	public void setAcctNoOfInterest(AcctNoOfInterest acctNoOfInterest) {
		this.acctNoOfInterest = acctNoOfInterest;
	}

	public AccountBalanceRsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AccountBalanceRsDto [riyadBankHeader=" + riyadBankHeader + ", acctNumber=" + acctNumber + ", acctType="
				+ acctType + ", acctProductType=" + acctProductType + ", acctCurrency=" + acctCurrency
				+ ", acctLedgerBal=" + acctLedgerBal + ", acctLedgerBalSi=" + acctLedgerBalSi + ", availBal=" + availBal
				+ ", acctAvailBalSi=" + acctAvailBalSi + ", acctEffBal=" + acctEffBal + ", acctEffBalSi=" + acctEffBalSi
				+ ", acctStmtCode=" + acctStmtCode + ", acctLastStmtDateG=" + acctLastStmtDateG + ", acctLastTranDateG="
				+ acctLastTranDateG + ", acctStmtMailInd=" + acctStmtMailInd + ", acctCardInd=" + acctCardInd
				+ ", acctPassBal=" + acctPassBal + ", acctMatdateG=" + acctMatdateG + ", acctIntUpTodate="
				+ acctIntUpTodate + ", acctIntrate=" + acctIntrate + ", acctStartdateG=" + acctStartdateG
				+ ", acctOdLimit=" + acctOdLimit + ", acctTerm=" + acctTerm + ", acctIntAtMaturity=" + acctIntAtMaturity
				+ ", acctIntCrMtd=" + acctIntCrMtd + ", acctIntCrMtdSi=" + acctIntCrMtdSi + ", acctIntCrYtd="
				+ acctIntCrYtd + ", acctIntCrLastYrSi=" + acctIntCrLastYrSi + ", acctIntDbMtd=" + acctIntDbMtd
				+ ", acctIntDbMtdSi=" + acctIntDbMtdSi + ", acctIntDbYtd=" + acctIntDbYtd + ", acctIntDbYtdSi="
				+ acctIntDbYtdSi + ", acctIntDbLastYr=" + acctIntDbLastYr + ", acctIntDbLastYrSi=" + acctIntDbLastYrSi
				+ ", acctAccrTdy=" + acctAccrTdy + ", acctAccrTdySi=" + acctAccrTdySi + ", acctAccrTdt=" + acctAccrTdt
				+ ", acctIntAccrTdySi=" + acctIntAccrTdySi + ", acctIntAccrTdt=" + acctIntAccrTdt
				+ ", acctIntAccrTdtSi=" + acctIntAccrTdtSi + ", acctCollectedBal=" + acctCollectedBal
				+ ", acctCollectedBalSi=" + acctCollectedBalSi + ", acctClosingBal=" + acctClosingBal
				+ ", acctClosingBalSi=" + acctClosingBalSi + ", acctYtdMinBal=" + acctYtdMinBal + ", acctYtdMinBalSi="
				+ acctYtdMinBalSi + ", acctYtdAvgBal=" + acctYtdAvgBal + ", acctYtdAvgBalSi=" + acctYtdAvgBalSi
				+ ", acctIntPaidMtd=" + acctIntPaidMtd + ", acctIntPaidMtdSi=" + acctIntPaidMtdSi + ", acctIntPaidYtd="
				+ acctIntPaidYtd + ", acctIntPaidYtdSi=" + acctIntPaidYtdSi + ", acctIntPaidLastYr=" + acctIntPaidLastYr
				+ ", acctIntPaidLastYrSi=" + acctIntPaidLastYrSi + ", acctLastCrAmt=" + acctLastCrAmt
				+ ", acctLastCrAmtSi=" + acctLastCrAmtSi + ", acctLastCrDate=" + acctLastCrDate + ", acctSrvcChrgMtd="
				+ acctSrvcChrgMtd + ", acctSrvcChrgMtdSi=" + acctSrvcChrgMtdSi + ", acctSrvcChrgYtd=" + acctSrvcChrgYtd
				+ ", acctSrvcChrgYtdSi=" + acctSrvcChrgYtdSi + ", acctAccrIntMtd=" + acctAccrIntMtd
				+ ", acctAccrIntMtdSi=" + acctAccrIntMtdSi + ", acctPrinAmt=" + acctPrinAmt + ", acctPrinAmtSi="
				+ acctPrinAmtSi + ", acctRenewTimes=" + acctRenewTimes + ", acctGraceEndDate=" + acctGraceEndDate
				+ ", acctLastRenewDate=" + acctLastRenewDate + ", acctSamaStatus=" + acctSamaStatus
				+ ", acct60DayMinBalSi=" + acct60DayMinBalSi + ", acct60DayMinBal=" + acct60DayMinBal
				+ ", acctNumberOfOdLimits=" + acctNumberOfOdLimits + ", acctOdLimitSeq=" + acctOdLimitSeq
				+ ", acctOdStatus=" + acctOdStatus + ", acctOdLimitAmt=" + acctOdLimitAmt + ", acctOdLimitUsedAmt="
				+ acctOdLimitUsedAmt + ", acctOdLimitRemainAmt=" + acctOdLimitRemainAmt + ", acctOdLimitEffDate="
				+ acctOdLimitEffDate + ", acctOdLimitExpiryDate=" + acctOdLimitExpiryDate + ", acctNumberOfOdIntLimits="
				+ acctNumberOfOdIntLimits + ", acctOdIntSeq=" + acctOdIntSeq + ", acctOdIntRate=" + acctOdIntRate
				+ ", acctOdIntPtr=" + acctOdIntPtr + ", acctOdIntLimitAmt=" + acctOdIntLimitAmt + ", acctCashAmt="
				+ acctCashAmt + ", acctCashAmtSi=" + acctCashAmtSi + ", acctAvailCashAmt=" + acctAvailCashAmt
				+ ", acctAvailCashAmtSi=" + acctAvailCashAmtSi + ", acctDdaBalance=" + acctDdaBalance
				+ ", acctDdaBalanceSi=" + acctDdaBalanceSi + ", acctLoanBalance=" + acctLoanBalance
				+ ", acctLoanBalanceSi=" + acctLoanBalanceSi + ", acctSavingsAvailBal=" + acctSavingsAvailBal
				+ ", acctSavingsAvailBalSi=" + acctSavingsAvailBalSi + ", acctBankUnavailBal=" + acctBankUnavailBal
				+ ", acctBankUnavailBalSi=" + acctBankUnavailBalSi + ", acctMinDdaBal=" + acctMinDdaBal
				+ ", acctMinDdaBalSi=" + acctMinDdaBalSi + ", acctAveCollBal=" + acctAveCollBal + ", acctAveCollBalSi="
				+ acctAveCollBalSi + ", acctPayCycle=" + acctPayCycle + ", acctIntIncr=" + acctIntIncr
				+ ", acctStmtPull=" + acctStmtPull + ", acctStmtField=" + acctStmtField + ", acctSrvceChrgeType="
				+ acctSrvceChrgeType + ", acctSrvceChrgeCode=" + acctSrvceChrgeCode + ", acctMessage=" + acctMessage
				+ ", acctPlusIntAccrued=" + acctPlusIntAccrued + ", acctPlusIntAccruedSi=" + acctPlusIntAccruedSi
				+ ", acctTaxCalcAmt=" + acctTaxCalcAmt + ", acctTaxCalcAmtSi=" + acctTaxCalcAmtSi + ", acctOdAccrual="
				+ acctOdAccrual + ", acctOdAccrualSi=" + acctOdAccrualSi + ", acctIodPendingTax=" + acctIodPendingTax
				+ ", acctIodPendingTaxSi=" + acctIodPendingTaxSi + ", acctDdaTotal=" + acctDdaTotal
				+ ", acctDdaTotalSi=" + acctDdaTotalSi + ", acctSavingsBal=" + acctSavingsBal + ", acctSavingsBalSi="
				+ acctSavingsBalSi + ", acctSavingsPlusIntAccrued=" + acctSavingsPlusIntAccrued
				+ ", acctSavingsPlusIntAccruedSi=" + acctSavingsPlusIntAccruedSi + ", acctSavingsTotal="
				+ acctSavingsTotal + ", acctSavingsTotalSi=" + acctSavingsTotalSi + ", acctLoanPrin=" + acctLoanPrin
				+ ", acctLoanPrinSi=" + acctLoanPrinSi + ", acctLoanPrinPlusInt=" + acctLoanPrinPlusInt
				+ ", acctLoanPrinPlusIntSi=" + acctLoanPrinPlusIntSi + ", acctLoanPrinPlusIns1=" + acctLoanPrinPlusIns1
				+ ", acctLoanPrinPlusIns1Si=" + acctLoanPrinPlusIns1Si + ", acctLoanPrinPlusIns2="
				+ acctLoanPrinPlusIns2 + ", acctLoanPrinPlusIns2Si=" + acctLoanPrinPlusIns2Si
				+ ", acctLoanPrinPlusOthrFee=" + acctLoanPrinPlusOthrFee + ", acctLoanPrinPlusOthrFeeSi="
				+ acctLoanPrinPlusOthrFeeSi + ", acctLoanPayoffAmt=" + acctLoanPayoffAmt + ", acctLoanPayoffAmtSi="
				+ acctLoanPayoffAmtSi + ", acctStopPays=" + acctStopPays + ", acctStopPaysSi=" + acctStopPaysSi
				+ ", acctBackupWithhldFlag=" + acctBackupWithhldFlag + ", acctLoanDailyAccrual=" + acctLoanDailyAccrual
				+ ", acctLoanDailyAccrualSi=" + acctLoanDailyAccrualSi + ", acctCombinedStmts=" + acctCombinedStmts
				+ ", acctTodayNoDebit=" + acctTodayNoDebit + ", acctTodayAmountDebit=" + acctTodayAmountDebit
				+ ", acctTodayAmountDebitSi=" + acctTodayAmountDebitSi + ", acctTodayNoCredit=" + acctTodayNoCredit
				+ ", acctTodayAmountCredit=" + acctTodayAmountCredit + ", acctTodayAmountCreditSi="
				+ acctTodayAmountCreditSi + ", acctNoSavingsDebit=" + acctNoSavingsDebit + ", acctNoSavingsCredit="
				+ acctNoSavingsCredit + ", acctNoLoansDebit=" + acctNoLoansDebit + ", acctNoLoansCredit="
				+ acctNoLoansCredit + ", acctTrailerFlags=" + acctTrailerFlags + ", acctClosingChrgeAmt="
				+ acctClosingChrgeAmt + ", acctClosingChrgeAmtSi=" + acctClosingChrgeAmtSi + ", acctTotalPenalty="
				+ acctTotalPenalty + ", acctTotalPenaltySi=" + acctTotalPenaltySi + ", acctFeesDue=" + acctFeesDue
				+ ", acctFeesDueSi=" + acctFeesDueSi + ", acctProjectedAccrual=" + acctProjectedAccrual
				+ ", acctProjectedAccrualSi=" + acctProjectedAccrualSi + ", acctLastTranTdyTeller="
				+ acctLastTranTdyTeller + ", acctlastTranTdyTranid=" + acctlastTranTdyTranid + ", acctlastTranTdyAmt="
				+ acctlastTranTdyAmt + ", acctLastTranTdyAmtSi=" + acctLastTranTdyAmtSi + ", acctPledgeAmt="
				+ acctPledgeAmt + ", acctPledgeAmtSi=" + acctPledgeAmtSi + ", acctRenewalBal=" + acctRenewalBal
				+ ", acctRenewalBalSi=" + acctRenewalBalSi + ", acctGraceAccrualCode=" + acctGraceAccrualCode
				+ ", acctProjAccrualInt=" + acctProjAccrualInt + ", acctProjAccrualIntSi=" + acctProjAccrualIntSi
				+ ", acctIntAccrued=" + acctIntAccrued + ", acctIntAccruedSi=" + acctIntAccruedSi
				+ ", acctRedepositInt=" + acctRedepositInt + ", acctRedepositIntSi=" + acctRedepositIntSi
				+ ", acctCdRollCode=" + acctCdRollCode + ", acctCdRollType=" + acctCdRollType + ", acctCdRollRate="
				+ acctCdRollRate + ", acctCdRollPeriod=" + acctCdRollPeriod + ", acctCdRollIncr=" + acctCdRollIncr
				+ ", acctIntDistCode=" + acctIntDistCode + ", acctIntDistSchedCode=" + acctIntDistSchedCode
				+ ", acctIntDistCycle=" + acctIntDistCycle + ", acctIntDistIncr=" + acctIntDistIncr
				+ ", acctIntDistDayOfMonth=" + acctIntDistDayOfMonth + ", acctIntDistNextPayDate="
				+ acctIntDistNextPayDate + ", acctMaturityAnnivDay=" + acctMaturityAnnivDay
				+ ", acctMaturityUnredmdAccr=" + acctMaturityUnredmdAccr + ", acctMaturityPrinDist="
				+ acctMaturityPrinDist + ", acctMaturityAutoRenew=" + acctMaturityAutoRenew + ", acctCdRollMntPeriod="
				+ acctCdRollMntPeriod + ", acctIntRatePointer=" + acctIntRatePointer + ", acctIntRate=" + acctIntRate
				+ ", acctTieredRatePointer=" + acctTieredRatePointer + ", acctAccrualType=" + acctAccrualType
				+ ", acctSplitTierRate=" + acctSplitTierRate + ", acctExempt=" + acctExempt + ", acctBulkFile="
				+ acctBulkFile + ", acctCheckTruncation=" + acctCheckTruncation + ", acctFundingFlag=" + acctFundingFlag
				+ ", acctMarketSector=" + acctMarketSector + ", acctMmdaInd=" + acctMmdaInd + ", acctNoAmtTran="
				+ acctNoAmtTran + ", acctCheckItems=" + acctCheckItems + ", acctBalHist=" + acctBalHist
				+ ", acctBalHistRetention=" + acctBalHistRetention + ", acctMtdKiteDays=" + acctMtdKiteDays
				+ ", acctContinuousKiteDays=" + acctContinuousKiteDays + ", acctChargeCard=" + acctChargeCard
				+ ", acctSpecInstr=" + acctSpecInstr + ", acctNsfToday=" + acctNsfToday + ", acctNsfCalculation="
				+ acctNsfCalculation + ", acctOdToday=" + acctOdToday + ", acctRelatedAcctCode=" + acctRelatedAcctCode
				+ ", acctGlCode=" + acctGlCode + ", acctZeroBalGraceDays=" + acctZeroBalGraceDays
				+ ", acctHoldMailFeeFlag=" + acctHoldMailFeeFlag + ", acctLastActivityDate=" + acctLastActivityDate
				+ ", acctSystemType=" + acctSystemType + ", acctSvcChrgLstStmt=" + acctSvcChrgLstStmt
				+ ", acctSvcChrgLstStmtSi=" + acctSvcChrgLstStmtSi + ", acctMtdServiceCharge=" + acctMtdServiceCharge
				+ ", acctMtdServiceChargeSi=" + acctMtdServiceChargeSi + ", acctLastDepositDate=" + acctLastDepositDate
				+ ", acctLastDepositAmount=" + acctLastDepositAmount + ", acctLastDepositAmountSi="
				+ acctLastDepositAmountSi + ", acctSavLessCtdTax=" + acctSavLessCtdTax + ", acctSavLessCtdTaxSi="
				+ acctSavLessCtdTaxSi + ", acctSavPendTax=" + acctSavPendTax + ", acctSavPendTaxSi=" + acctSavPendTaxSi
				+ ", custFreezeReason=" + custFreezeReason + ", ibanAcctNumber=" + ibanAcctNumber + ", facilityId="
				+ facilityId + ", odType=" + odType + ", btaFlag=" + btaFlag + ", hafizFlag=" + hafizFlag
				+ ", escheatFlag=" + escheatFlag + ", acctFutureStatus=" + acctFutureStatus + ", daysLeft=" + daysLeft
				+ ", abandoned=" + abandoned + ", acctStatus=" + acctStatus + ", acctTotHoldAmt=" + acctTotHoldAmt
				+ ", acctTotHoldAmtSi=" + acctTotHoldAmtSi + ", acctFloatAmt=" + acctFloatAmt + ", acctFloatAmtSi="
				+ acctFloatAmtSi + ", acctMtdAvgBal=" + acctMtdAvgBal + ", acctMtdAvgBalSi=" + acctMtdAvgBalSi
				+ ", acctLastDbAmt=" + acctLastDbAmt + ", acctLastDbAmtSi=" + acctLastDbAmtSi + ", acctLastDbDate="
				+ acctLastDbDate + ", acctLastMainten=" + acctLastMainten + ", acctIntCrYtdSi=" + acctIntCrYtdSi
				+ ", acctIntCrLastYr=" + acctIntCrLastYr + ", acctAccrTdtSi=" + acctAccrTdtSi + ", acctIntAccrTdy="
				+ acctIntAccrTdy + ", acctNoOfInterest=" + acctNoOfInterest + "]";
	}
	
	
	
	

}
