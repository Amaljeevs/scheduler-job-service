package com.alfaris.esb.dto;

public class Fee {
	    private String loanFeesFreq;
	    private String loanFeesAssess;
	    private String loanFeesDay;
	    private String loanFeesStartDate;
	    private int loanFeesAmount;
	    private String loanFeesCalc;
	    private String loanFeesTerm;
	    private String loanFeesIncr;
		public String getLoanFeesFreq() {
			return loanFeesFreq;
		}
		public void setLoanFeesFreq(String loanFeesFreq) {
			this.loanFeesFreq = loanFeesFreq;
		}
		public String getLoanFeesAssess() {
			return loanFeesAssess;
		}
		public void setLoanFeesAssess(String loanFeesAssess) {
			this.loanFeesAssess = loanFeesAssess;
		}
		public String getLoanFeesDay() {
			return loanFeesDay;
		}
		public void setLoanFeesDay(String loanFeesDay) {
			this.loanFeesDay = loanFeesDay;
		}
		public String getLoanFeesStartDate() {
			return loanFeesStartDate;
		}
		public void setLoanFeesStartDate(String loanFeesStartDate) {
			this.loanFeesStartDate = loanFeesStartDate;
		}
		public int getLoanFeesAmount() {
			return loanFeesAmount;
		}
		public void setLoanFeesAmount(int loanFeesAmount) {
			this.loanFeesAmount = loanFeesAmount;
		}
		public String getLoanFeesCalc() {
			return loanFeesCalc;
		}
		public void setLoanFeesCalc(String loanFeesCalc) {
			this.loanFeesCalc = loanFeesCalc;
		}
		public String getLoanFeesTerm() {
			return loanFeesTerm;
		}
		public void setLoanFeesTerm(String loanFeesTerm) {
			this.loanFeesTerm = loanFeesTerm;
		}
		public String getLoanFeesIncr() {
			return loanFeesIncr;
		}
		public void setLoanFeesIncr(String loanFeesIncr) {
			this.loanFeesIncr = loanFeesIncr;
		}
		public Fee(String loanFeesFreq, String loanFeesAssess, String loanFeesDay, String loanFeesStartDate,
				int loanFeesAmount, String loanFeesCalc, String loanFeesTerm, String loanFeesIncr) {
			super();
			this.loanFeesFreq = loanFeesFreq;
			this.loanFeesAssess = loanFeesAssess;
			this.loanFeesDay = loanFeesDay;
			this.loanFeesStartDate = loanFeesStartDate;
			this.loanFeesAmount = loanFeesAmount;
			this.loanFeesCalc = loanFeesCalc;
			this.loanFeesTerm = loanFeesTerm;
			this.loanFeesIncr = loanFeesIncr;
		}
		public Fee() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Fee [loanFeesFreq=" + loanFeesFreq + ", loanFeesAssess=" + loanFeesAssess + ", loanFeesDay="
					+ loanFeesDay + ", loanFeesStartDate=" + loanFeesStartDate + ", loanFeesAmount=" + loanFeesAmount
					+ ", loanFeesCalc=" + loanFeesCalc + ", loanFeesTerm=" + loanFeesTerm + ", loanFeesIncr="
					+ loanFeesIncr + "]";
		}
	    
	    
}
