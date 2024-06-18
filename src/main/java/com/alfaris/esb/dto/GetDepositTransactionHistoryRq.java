package com.alfaris.esb.dto;

import java.math.BigDecimal;

public class GetDepositTransactionHistoryRq {
	
	private String ctl1;
	
	private String ctl2;
	
    private String ctl3;
	
	private String ctl4;
	
	private String acctId;
	
	private int recsRequested;
	
	private BigDecimal lowAmt;
  
	private BigDecimal highAmt;

	private int startDt;

	private int endDt;
	
    private String startCheckNum;
	
    private String endCheckNum;
	
	private String startTranCd;
	
	private String endTranCd;
	
	private int startBatch;
	
	private int endBatch;
  
	private int startSeq;

	private int endSeq;
	
    private String newToOld;
	
	private String archiveInd;
	
	private String moreInd;
	
	private int tranDt;

	private int tranSeq;

	public String getCtl1() {
		return ctl1;
	}

	public void setCtl1(String ctl1) {
		this.ctl1 = ctl1;
	}

	public String getCtl2() {
		return ctl2;
	}

	public void setCtl2(String ctl2) {
		this.ctl2 = ctl2;
	}

	public String getCtl3() {
		return ctl3;
	}

	public void setCtl3(String ctl3) {
		this.ctl3 = ctl3;
	}

	public String getCtl4() {
		return ctl4;
	}

	public void setCtl4(String ctl4) {
		this.ctl4 = ctl4;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public int getRecsRequested() {
		return recsRequested;
	}

	public void setRecsRequested(int recsRequested) {
		this.recsRequested = recsRequested;
	}

	public BigDecimal getLowAmt() {
		return lowAmt;
	}

	public void setLowAmt(BigDecimal lowAmt) {
		this.lowAmt = lowAmt;
	}

	public BigDecimal getHighAmt() {
		return highAmt;
	}

	public void setHighAmt(BigDecimal highAmt) {
		this.highAmt = highAmt;
	}

	public int getStartDt() {
		return startDt;
	}

	public void setStartDt(int startDt) {
		this.startDt = startDt;
	}

	public int getEndDt() {
		return endDt;
	}

	public void setEndDt(int endDt) {
		this.endDt = endDt;
	}

	public String getStartCheckNum() {
		return startCheckNum;
	}

	public void setStartCheckNum(String startCheckNum) {
		this.startCheckNum = startCheckNum;
	}

	public String getEndCheckNum() {
		return endCheckNum;
	}

	public void setEndCheckNum(String endCheckNum) {
		this.endCheckNum = endCheckNum;
	}

	public String getStartTranCd() {
		return startTranCd;
	}

	public void setStartTranCd(String startTranCd) {
		this.startTranCd = startTranCd;
	}

	public String getEndTranCd() {
		return endTranCd;
	}

	public void setEndTranCd(String endTranCd) {
		this.endTranCd = endTranCd;
	}

	public int getStartBatch() {
		return startBatch;
	}

	public void setStartBatch(int startBatch) {
		this.startBatch = startBatch;
	}

	public int getEndBatch() {
		return endBatch;
	}

	public void setEndBatch(int endBatch) {
		this.endBatch = endBatch;
	}

	public int getStartSeq() {
		return startSeq;
	}

	public void setStartSeq(int startSeq) {
		this.startSeq = startSeq;
	}

	public int getEndSeq() {
		return endSeq;
	}

	public void setEndSeq(int endSeq) {
		this.endSeq = endSeq;
	}

	public String getNewToOld() {
		return newToOld;
	}

	public void setNewToOld(String newToOld) {
		this.newToOld = newToOld;
	}

	public String getArchiveInd() {
		return archiveInd;
	}

	public void setArchiveInd(String archiveInd) {
		this.archiveInd = archiveInd;
	}

	public String getMoreInd() {
		return moreInd;
	}

	public void setMoreInd(String moreInd) {
		this.moreInd = moreInd;
	}

	public int getTranDt() {
		return tranDt;
	}

	public void setTranDt(int tranDt) {
		this.tranDt = tranDt;
	}

	public int getTranSeq() {
		return tranSeq;
	}

	public void setTranSeq(int tranSeq) {
		this.tranSeq = tranSeq;
	}

	public GetDepositTransactionHistoryRq(String ctl1, String ctl2, String ctl3, String ctl4, String acctId,
			int recsRequested, BigDecimal lowAmt, BigDecimal highAmt, int startDt, int endDt, String startCheckNum,
			String endCheckNum, String startTranCd, String endTranCd, int startBatch, int endBatch, int startSeq,
			int endSeq, String newToOld, String archiveInd, String moreInd, int tranDt, int tranSeq) {
		super();
		this.ctl1 = ctl1;
		this.ctl2 = ctl2;
		this.ctl3 = ctl3;
		this.ctl4 = ctl4;
		this.acctId = acctId;
		this.recsRequested = recsRequested;
		this.lowAmt = lowAmt;
		this.highAmt = highAmt;
		this.startDt = startDt;
		this.endDt = endDt;
		this.startCheckNum = startCheckNum;
		this.endCheckNum = endCheckNum;
		this.startTranCd = startTranCd;
		this.endTranCd = endTranCd;
		this.startBatch = startBatch;
		this.endBatch = endBatch;
		this.startSeq = startSeq;
		this.endSeq = endSeq;
		this.newToOld = newToOld;
		this.archiveInd = archiveInd;
		this.moreInd = moreInd;
		this.tranDt = tranDt;
		this.tranSeq = tranSeq;
	}

	public GetDepositTransactionHistoryRq() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GetDepositTransactionHistoryRq [ctl1=" + ctl1 + ", ctl2=" + ctl2 + ", ctl3=" + ctl3 + ", ctl4=" + ctl4
				+ ", acctId=" + acctId + ", recsRequested=" + recsRequested + ", lowAmt=" + lowAmt + ", highAmt="
				+ highAmt + ", startDt=" + startDt + ", endDt=" + endDt + ", startCheckNum=" + startCheckNum
				+ ", endCheckNum=" + endCheckNum + ", startTranCd=" + startTranCd + ", endTranCd=" + endTranCd
				+ ", startBatch=" + startBatch + ", endBatch=" + endBatch + ", startSeq=" + startSeq + ", endSeq="
				+ endSeq + ", newToOld=" + newToOld + ", archiveInd=" + archiveInd + ", moreInd=" + moreInd
				+ ", tranDt=" + tranDt + ", tranSeq=" + tranSeq + "]";
	}

	


}





