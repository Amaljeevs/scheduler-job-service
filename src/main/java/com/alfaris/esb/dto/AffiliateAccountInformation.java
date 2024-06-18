package com.alfaris.esb.dto;

public class AffiliateAccountInformation {
	    private String autoDbInd;
	    private String maturityBillingInd;
	    private Object accountNumber;
	    private String u1Flag;
	    private String autoCrInd;
		public String getAutoDbInd() {
			return autoDbInd;
		}
		public void setAutoDbInd(String autoDbInd) {
			this.autoDbInd = autoDbInd;
		}
		public String getMaturityBillingInd() {
			return maturityBillingInd;
		}
		public void setMaturityBillingInd(String maturityBillingInd) {
			this.maturityBillingInd = maturityBillingInd;
		}
		public Object getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(Object accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getU1Flag() {
			return u1Flag;
		}
		public void setU1Flag(String u1Flag) {
			this.u1Flag = u1Flag;
		}
		public String getAutoCrInd() {
			return autoCrInd;
		}
		public void setAutoCrInd(String autoCrInd) {
			this.autoCrInd = autoCrInd;
		}
		public AffiliateAccountInformation(String autoDbInd, String maturityBillingInd, Object accountNumber,
				String u1Flag, String autoCrInd) {
			super();
			this.autoDbInd = autoDbInd;
			this.maturityBillingInd = maturityBillingInd;
			this.accountNumber = accountNumber;
			this.u1Flag = u1Flag;
			this.autoCrInd = autoCrInd;
		}
		public AffiliateAccountInformation() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "AffiliateAccountInformation [autoDbInd=" + autoDbInd + ", maturityBillingInd=" + maturityBillingInd
					+ ", accountNumber=" + accountNumber + ", u1Flag=" + u1Flag + ", autoCrInd=" + autoCrInd + "]";
		}
	    
	    

}
