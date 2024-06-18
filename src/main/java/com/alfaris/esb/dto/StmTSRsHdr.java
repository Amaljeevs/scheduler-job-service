package com.alfaris.esb.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StmTSRsHdr {
	
	@JsonProperty("maxSeverity")
	private String maxSeverity;	
	@JsonProperty("processMessage")
	private String processMessage;	
	@JsonProperty("nextDay")
	private String nextDay;
	@JsonProperty("trnStatus")
	private List<TrnStatus> trnStatus;
	public String getMaxSeverity() {
		return maxSeverity;
	}
	public void setMaxSeverity(String maxSeverity) {
		this.maxSeverity = maxSeverity;
	}
	public String getProcessMessage() {
		return processMessage;
	}
	public void setProcessMessage(String processMessage) {
		this.processMessage = processMessage;
	}
	public String getNextDay() {
		return nextDay;
	}
	public void setNextDay(String nextDay) {
		this.nextDay = nextDay;
	}
	public List<TrnStatus> getTrnStatus() {
		return trnStatus;
	}
	public void setTrnStatus(List<TrnStatus> trnStatus) {
		this.trnStatus = trnStatus;
	}
	public StmTSRsHdr(String maxSeverity, String processMessage, String nextDay, ArrayList<TrnStatus> trnStatus) {
		super();
		this.maxSeverity = maxSeverity;
		this.processMessage = processMessage;
		this.nextDay = nextDay;
		this.trnStatus = trnStatus;
	}
	public StmTSRsHdr() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StmTSRsHdr [maxSeverity=" + maxSeverity + ", processMessage=" + processMessage + ", nextDay=" + nextDay
				+ ", trnStatus=" + trnStatus + "]";
	}
	
	

}
