package com.alfaris.esb.dto;

import java.math.BigDecimal;
import java.util.ArrayList;

public class DepAcctTrn {
	
	private String tranCd;
	
	private String trnName;
	
	private String trnType;
	
	private int postedDt;
	
	private int effectiveDt;
	
	private int batch;
	
	private int seqNbr;
	
	private BigDecimal tranAmt;
	
	private BigDecimal bal;
	
	private int nbrItems;
	
	private int nbrChecks;
	
	private String tranFormat;
	
	private String passBookAcctInd;
	
	private String passBookUpdInd;
	
	private int processSeq;
	
	private int tranSeq;
	
	private String tranDesc;
	
	private String reversalCd1;
	
	private String reversalCd2;
	
	private String reversalCd3;
	
	private String stmtSymbol;

	private BigDecimal tranAccum1;
	
	private String increaseDecreaseInd;
	
	private BigDecimal tranAccum2;

	private String increaseDecreaseInd2;

	private String stmtPullCd;
	
	private String stmtCycle;
	
	private String bulkFile;
	
	private String chkTruncationCd;
	
	private String pendingDecisionCd;
	
	private String expandCompressCd;
	
	private String sourceCd;
	
	private String universalDescInd;
	
	private String currencyXchgInd;
	
	private int retentionDays;
	
	private String baiCd;
	
	private int traceNum;
	
	private int sourceTrace;
	
	private int referenceNum;

	private String taxTypeCd;

	private String termTypeCd;
	
	private String termId;
	
	private String branch;
	
	private String operatorId;
	
	private String employeeId;
	
	private int sourceDt;
	
	private int sourceTime;
	
	private String timeUseCd;
	
	private int sortTime;
	
	private int sortDt;

	private ArrayList<MiscInfo> miscInfo;

	private ArrayList<AchInfo> achInfo;
	
	private ArrayList<AddendaInfo> addendaInfo;
	
	private ArrayList<AtmInfo> atmInfo;
	
	private ArrayList<LoanInfo> loanInfo;

	private ArrayList<ServiceChargeInfo> serviceChargeInfo;

	private ArrayList<PlanInfo> planInfo;
 
	private ArrayList<CurrencyInfo> currencyInfo;

	private ArrayList<UniversalDesc> universalDesc;

	public String getTranCd() {
		return tranCd;
	}

	public void setTranCd(String tranCd) {
		this.tranCd = tranCd;
	}

	public String getTrnName() {
		return trnName;
	}

	public void setTrnName(String trnName) {
		this.trnName = trnName;
	}

	public String getTrnType() {
		return trnType;
	}

	public void setTrnType(String trnType) {
		this.trnType = trnType;
	}

	public int getPostedDt() {
		return postedDt;
	}

	public void setPostedDt(int postedDt) {
		this.postedDt = postedDt;
	}

	public int getEffectiveDt() {
		return effectiveDt;
	}

	public void setEffectiveDt(int effectiveDt) {
		this.effectiveDt = effectiveDt;
	}

	public int getBatch() {
		return batch;
	}

	public void setBatch(int batch) {
		this.batch = batch;
	}

	public int getSeqNbr() {
		return seqNbr;
	}

	public void setSeqNbr(int seqNbr) {
		this.seqNbr = seqNbr;
	}

	public BigDecimal getTranAmt() {
		return tranAmt;
	}

	public void setTranAmt(BigDecimal tranAmt) {
		this.tranAmt = tranAmt;
	}

	public BigDecimal getBal() {
		return bal;
	}

	public void setBal(BigDecimal bal) {
		this.bal = bal;
	}

	public int getNbrItems() {
		return nbrItems;
	}

	public void setNbrItems(int nbrItems) {
		this.nbrItems = nbrItems;
	}

	public int getNbrChecks() {
		return nbrChecks;
	}

	public void setNbrChecks(int nbrChecks) {
		this.nbrChecks = nbrChecks;
	}

	public String getTranFormat() {
		return tranFormat;
	}

	public void setTranFormat(String tranFormat) {
		this.tranFormat = tranFormat;
	}

	public String getPassBookAcctInd() {
		return passBookAcctInd;
	}

	public void setPassBookAcctInd(String passBookAcctInd) {
		this.passBookAcctInd = passBookAcctInd;
	}

	public String getPassBookUpdInd() {
		return passBookUpdInd;
	}

	public void setPassBookUpdInd(String passBookUpdInd) {
		this.passBookUpdInd = passBookUpdInd;
	}

	public int getProcessSeq() {
		return processSeq;
	}

	public void setProcessSeq(int processSeq) {
		this.processSeq = processSeq;
	}

	public int getTranSeq() {
		return tranSeq;
	}

	public void setTranSeq(int tranSeq) {
		this.tranSeq = tranSeq;
	}

	public String getTranDesc() {
		return tranDesc;
	}

	public void setTranDesc(String tranDesc) {
		this.tranDesc = tranDesc;
	}

	public String getReversalCd1() {
		return reversalCd1;
	}

	public void setReversalCd1(String reversalCd1) {
		this.reversalCd1 = reversalCd1;
	}

	public String getReversalCd2() {
		return reversalCd2;
	}

	public void setReversalCd2(String reversalCd2) {
		this.reversalCd2 = reversalCd2;
	}

	public String getReversalCd3() {
		return reversalCd3;
	}

	public void setReversalCd3(String reversalCd3) {
		this.reversalCd3 = reversalCd3;
	}

	public String getStmtSymbol() {
		return stmtSymbol;
	}

	public void setStmtSymbol(String stmtSymbol) {
		this.stmtSymbol = stmtSymbol;
	}

	public BigDecimal getTranAccum1() {
		return tranAccum1;
	}

	public void setTranAccum1(BigDecimal tranAccum1) {
		this.tranAccum1 = tranAccum1;
	}

	public String getIncreaseDecreaseInd() {
		return increaseDecreaseInd;
	}

	public void setIncreaseDecreaseInd(String increaseDecreaseInd) {
		this.increaseDecreaseInd = increaseDecreaseInd;
	}

	public BigDecimal getTranAccum2() {
		return tranAccum2;
	}

	public void setTranAccum2(BigDecimal tranAccum2) {
		this.tranAccum2 = tranAccum2;
	}

	public String getIncreaseDecreaseInd2() {
		return increaseDecreaseInd2;
	}

	public void setIncreaseDecreaseInd2(String increaseDecreaseInd2) {
		this.increaseDecreaseInd2 = increaseDecreaseInd2;
	}

	public String getStmtPullCd() {
		return stmtPullCd;
	}

	public void setStmtPullCd(String stmtPullCd) {
		this.stmtPullCd = stmtPullCd;
	}

	public String getStmtCycle() {
		return stmtCycle;
	}

	public void setStmtCycle(String stmtCycle) {
		this.stmtCycle = stmtCycle;
	}

	public String getBulkFile() {
		return bulkFile;
	}

	public void setBulkFile(String bulkFile) {
		this.bulkFile = bulkFile;
	}

	public String getChkTruncationCd() {
		return chkTruncationCd;
	}

	public void setChkTruncationCd(String chkTruncationCd) {
		this.chkTruncationCd = chkTruncationCd;
	}

	public String getPendingDecisionCd() {
		return pendingDecisionCd;
	}

	public void setPendingDecisionCd(String pendingDecisionCd) {
		this.pendingDecisionCd = pendingDecisionCd;
	}

	public String getExpandCompressCd() {
		return expandCompressCd;
	}

	public void setExpandCompressCd(String expandCompressCd) {
		this.expandCompressCd = expandCompressCd;
	}

	public String getSourceCd() {
		return sourceCd;
	}

	public void setSourceCd(String sourceCd) {
		this.sourceCd = sourceCd;
	}

	public String getUniversalDescInd() {
		return universalDescInd;
	}

	public void setUniversalDescInd(String universalDescInd) {
		this.universalDescInd = universalDescInd;
	}

	public String getCurrencyXchgInd() {
		return currencyXchgInd;
	}

	public void setCurrencyXchgInd(String currencyXchgInd) {
		this.currencyXchgInd = currencyXchgInd;
	}

	public int getRetentionDays() {
		return retentionDays;
	}

	public void setRetentionDays(int retentionDays) {
		this.retentionDays = retentionDays;
	}

	public String getBaiCd() {
		return baiCd;
	}

	public void setBaiCd(String baiCd) {
		this.baiCd = baiCd;
	}

	public int getTraceNum() {
		return traceNum;
	}

	public void setTraceNum(int traceNum) {
		this.traceNum = traceNum;
	}

	public int getSourceTrace() {
		return sourceTrace;
	}

	public void setSourceTrace(int sourceTrace) {
		this.sourceTrace = sourceTrace;
	}

	public int getReferenceNum() {
		return referenceNum;
	}

	public void setReferenceNum(int referenceNum) {
		this.referenceNum = referenceNum;
	}

	public String getTaxTypeCd() {
		return taxTypeCd;
	}

	public void setTaxTypeCd(String taxTypeCd) {
		this.taxTypeCd = taxTypeCd;
	}

	public String getTermTypeCd() {
		return termTypeCd;
	}

	public void setTermTypeCd(String termTypeCd) {
		this.termTypeCd = termTypeCd;
	}

	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public int getSourceDt() {
		return sourceDt;
	}

	public void setSourceDt(int sourceDt) {
		this.sourceDt = sourceDt;
	}

	public int getSourceTime() {
		return sourceTime;
	}

	public void setSourceTime(int sourceTime) {
		this.sourceTime = sourceTime;
	}

	public String getTimeUseCd() {
		return timeUseCd;
	}

	public void setTimeUseCd(String timeUseCd) {
		this.timeUseCd = timeUseCd;
	}

	public int getSortTime() {
		return sortTime;
	}

	public void setSortTime(int sortTime) {
		this.sortTime = sortTime;
	}

	public int getSortDt() {
		return sortDt;
	}

	public void setSortDt(int sortDt) {
		this.sortDt = sortDt;
	}

	public ArrayList<MiscInfo> getMiscInfo() {
		return miscInfo;
	}

	public void setMiscInfo(ArrayList<MiscInfo> miscInfo) {
		this.miscInfo = miscInfo;
	}

	public ArrayList<AchInfo> getAchInfo() {
		return achInfo;
	}

	public void setAchInfo(ArrayList<AchInfo> achInfo) {
		this.achInfo = achInfo;
	}

	public ArrayList<AddendaInfo> getAddendaInfo() {
		return addendaInfo;
	}

	public void setAddendaInfo(ArrayList<AddendaInfo> addendaInfo) {
		this.addendaInfo = addendaInfo;
	}

	public ArrayList<AtmInfo> getAtmInfo() {
		return atmInfo;
	}

	public void setAtmInfo(ArrayList<AtmInfo> atmInfo) {
		this.atmInfo = atmInfo;
	}

	public ArrayList<LoanInfo> getLoanInfo() {
		return loanInfo;
	}

	public void setLoanInfo(ArrayList<LoanInfo> loanInfo) {
		this.loanInfo = loanInfo;
	}

	public ArrayList<ServiceChargeInfo> getServiceChargeInfo() {
		return serviceChargeInfo;
	}

	public void setServiceChargeInfo(ArrayList<ServiceChargeInfo> serviceChargeInfo) {
		this.serviceChargeInfo = serviceChargeInfo;
	}

	public ArrayList<PlanInfo> getPlanInfo() {
		return planInfo;
	}

	public void setPlanInfo(ArrayList<PlanInfo> planInfo) {
		this.planInfo = planInfo;
	}

	public ArrayList<CurrencyInfo> getCurrencyInfo() {
		return currencyInfo;
	}

	public void setCurrencyInfo(ArrayList<CurrencyInfo> currencyInfo) {
		this.currencyInfo = currencyInfo;
	}

	public ArrayList<UniversalDesc> getUniversalDesc() {
		return universalDesc;
	}

	public void setUniversalDesc(ArrayList<UniversalDesc> universalDesc) {
		this.universalDesc = universalDesc;
	}

	public DepAcctTrn(String tranCd, String trnName, String trnType, int postedDt, int effectiveDt, int batch,
			int seqNbr, BigDecimal tranAmt, BigDecimal bal, int nbrItems, int nbrChecks, String tranFormat,
			String passBookAcctInd, String passBookUpdInd, int processSeq, int tranSeq, String tranDesc,
			String reversalCd1, String reversalCd2, String reversalCd3, String stmtSymbol, BigDecimal tranAccum1,
			String increaseDecreaseInd, BigDecimal tranAccum2, String increaseDecreaseInd2, String stmtPullCd,
			String stmtCycle, String bulkFile, String chkTruncationCd, String pendingDecisionCd,
			String expandCompressCd, String sourceCd, String universalDescInd, String currencyXchgInd,
			int retentionDays, String baiCd, int traceNum, int sourceTrace, int referenceNum, String taxTypeCd,
			String termTypeCd, String termId, String branch, String operatorId, String employeeId, int sourceDt,
			int sourceTime, String timeUseCd, int sortTime, int sortDt, ArrayList<MiscInfo> miscInfo,
			ArrayList<AchInfo> achInfo, ArrayList<AddendaInfo> addendaInfo, ArrayList<AtmInfo> atmInfo,
			ArrayList<LoanInfo> loanInfo, ArrayList<ServiceChargeInfo> serviceChargeInfo, ArrayList<PlanInfo> planInfo,
			ArrayList<CurrencyInfo> currencyInfo, ArrayList<UniversalDesc> universalDesc) {
		super();
		this.tranCd = tranCd;
		this.trnName = trnName;
		this.trnType = trnType;
		this.postedDt = postedDt;
		this.effectiveDt = effectiveDt;
		this.batch = batch;
		this.seqNbr = seqNbr;
		this.tranAmt = tranAmt;
		this.bal = bal;
		this.nbrItems = nbrItems;
		this.nbrChecks = nbrChecks;
		this.tranFormat = tranFormat;
		this.passBookAcctInd = passBookAcctInd;
		this.passBookUpdInd = passBookUpdInd;
		this.processSeq = processSeq;
		this.tranSeq = tranSeq;
		this.tranDesc = tranDesc;
		this.reversalCd1 = reversalCd1;
		this.reversalCd2 = reversalCd2;
		this.reversalCd3 = reversalCd3;
		this.stmtSymbol = stmtSymbol;
		this.tranAccum1 = tranAccum1;
		this.increaseDecreaseInd = increaseDecreaseInd;
		this.tranAccum2 = tranAccum2;
		this.increaseDecreaseInd2 = increaseDecreaseInd2;
		this.stmtPullCd = stmtPullCd;
		this.stmtCycle = stmtCycle;
		this.bulkFile = bulkFile;
		this.chkTruncationCd = chkTruncationCd;
		this.pendingDecisionCd = pendingDecisionCd;
		this.expandCompressCd = expandCompressCd;
		this.sourceCd = sourceCd;
		this.universalDescInd = universalDescInd;
		this.currencyXchgInd = currencyXchgInd;
		this.retentionDays = retentionDays;
		this.baiCd = baiCd;
		this.traceNum = traceNum;
		this.sourceTrace = sourceTrace;
		this.referenceNum = referenceNum;
		this.taxTypeCd = taxTypeCd;
		this.termTypeCd = termTypeCd;
		this.termId = termId;
		this.branch = branch;
		this.operatorId = operatorId;
		this.employeeId = employeeId;
		this.sourceDt = sourceDt;
		this.sourceTime = sourceTime;
		this.timeUseCd = timeUseCd;
		this.sortTime = sortTime;
		this.sortDt = sortDt;
		this.miscInfo = miscInfo;
		this.achInfo = achInfo;
		this.addendaInfo = addendaInfo;
		this.atmInfo = atmInfo;
		this.loanInfo = loanInfo;
		this.serviceChargeInfo = serviceChargeInfo;
		this.planInfo = planInfo;
		this.currencyInfo = currencyInfo;
		this.universalDesc = universalDesc;
	}

	public DepAcctTrn() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DepAcctTrn [tranCd=" + tranCd + ", trnName=" + trnName + ", trnType=" + trnType + ", postedDt="
				+ postedDt + ", effectiveDt=" + effectiveDt + ", batch=" + batch + ", seqNbr=" + seqNbr + ", tranAmt="
				+ tranAmt + ", bal=" + bal + ", nbrItems=" + nbrItems + ", nbrChecks=" + nbrChecks + ", tranFormat="
				+ tranFormat + ", passBookAcctInd=" + passBookAcctInd + ", passBookUpdInd=" + passBookUpdInd
				+ ", processSeq=" + processSeq + ", tranSeq=" + tranSeq + ", tranDesc=" + tranDesc + ", reversalCd1="
				+ reversalCd1 + ", reversalCd2=" + reversalCd2 + ", reversalCd3=" + reversalCd3 + ", stmtSymbol="
				+ stmtSymbol + ", tranAccum1=" + tranAccum1 + ", increaseDecreaseInd=" + increaseDecreaseInd
				+ ", tranAccum2=" + tranAccum2 + ", increaseDecreaseInd2=" + increaseDecreaseInd2 + ", stmtPullCd="
				+ stmtPullCd + ", stmtCycle=" + stmtCycle + ", bulkFile=" + bulkFile + ", chkTruncationCd="
				+ chkTruncationCd + ", pendingDecisionCd=" + pendingDecisionCd + ", expandCompressCd="
				+ expandCompressCd + ", sourceCd=" + sourceCd + ", universalDescInd=" + universalDescInd
				+ ", currencyXchgInd=" + currencyXchgInd + ", retentionDays=" + retentionDays + ", baiCd=" + baiCd
				+ ", traceNum=" + traceNum + ", sourceTrace=" + sourceTrace + ", referenceNum=" + referenceNum
				+ ", taxTypeCd=" + taxTypeCd + ", termTypeCd=" + termTypeCd + ", termId=" + termId + ", branch="
				+ branch + ", operatorId=" + operatorId + ", employeeId=" + employeeId + ", sourceDt=" + sourceDt
				+ ", sourceTime=" + sourceTime + ", timeUseCd=" + timeUseCd + ", sortTime=" + sortTime + ", sortDt="
				+ sortDt + ", miscInfo=" + miscInfo + ", achInfo=" + achInfo + ", addendaInfo=" + addendaInfo
				+ ", atmInfo=" + atmInfo + ", loanInfo=" + loanInfo + ", serviceChargeInfo=" + serviceChargeInfo
				+ ", planInfo=" + planInfo + ", currencyInfo=" + currencyInfo + ", universalDesc=" + universalDesc
				+ "]";
	}





}




