package com.alfaris.esb.dto;

public class InterestDetails {
	
	    private int loanInterestRate;
	    private int loanAccrStartDate;
	    private int loanAccrDay;
	    private int origUnearnedAmt;
		public int getLoanInterestRate() {
			return loanInterestRate;
		}
		public void setLoanInterestRate(int loanInterestRate) {
			this.loanInterestRate = loanInterestRate;
		}
		public int getLoanAccrStartDate() {
			return loanAccrStartDate;
		}
		public void setLoanAccrStartDate(int loanAccrStartDate) {
			this.loanAccrStartDate = loanAccrStartDate;
		}
		public int getLoanAccrDay() {
			return loanAccrDay;
		}
		public void setLoanAccrDay(int loanAccrDay) {
			this.loanAccrDay = loanAccrDay;
		}
		public int getOrigUnearnedAmt() {
			return origUnearnedAmt;
		}
		public void setOrigUnearnedAmt(int origUnearnedAmt) {
			this.origUnearnedAmt = origUnearnedAmt;
		}
		public InterestDetails(int loanInterestRate, int loanAccrStartDate, int loanAccrDay, int origUnearnedAmt) {
			super();
			this.loanInterestRate = loanInterestRate;
			this.loanAccrStartDate = loanAccrStartDate;
			this.loanAccrDay = loanAccrDay;
			this.origUnearnedAmt = origUnearnedAmt;
		}
		public InterestDetails() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "InterestDetails [loanInterestRate=" + loanInterestRate + ", loanAccrStartDate=" + loanAccrStartDate
					+ ", loanAccrDay=" + loanAccrDay + ", origUnearnedAmt=" + origUnearnedAmt + "]";
		}
	    
	    
}
