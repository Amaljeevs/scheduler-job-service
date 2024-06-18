package com.alfaris.esb.dto;

public class AccountCreationHeaderRq {
	    private String msgFormat;
	    private int msgVersion;
	    private String requestorChannelId;
	    private int requestorChannelFunction;
	    private String requestorUserId;
	    private String cisNumber;
	    private String requestorLanguage;
	    private String requestorSecurityInfo;
	    private String branchNumber;
	    private String tellerId;
	    private String terminalId;
	    private String transactionOrigin;
	    private String journalSeqNumber;
	    private String transactionReference;
	    
		public String getMsgFormat() {
			return msgFormat;
		}
		public void setMsgFormat(String msgFormat) {
			this.msgFormat = msgFormat;
		}
		public int getMsgVersion() {
			return msgVersion;
		}
		public void setMsgVersion(int msgVersion) {
			this.msgVersion = msgVersion;
		}
		public String getRequestorChannelId() {
			return requestorChannelId;
		}
		public void setRequestorChannelId(String requestorChannelId) {
			this.requestorChannelId = requestorChannelId;
		}
		public int getRequestorChannelFunction() {
			return requestorChannelFunction;
		}
		public void setRequestorChannelFunction(int requestorChannelFunction) {
			this.requestorChannelFunction = requestorChannelFunction;
		}
		public String getRequestorUserId() {
			return requestorUserId;
		}
		public void setRequestorUserId(String requestorUserId) {
			this.requestorUserId = requestorUserId;
		}
		public String getCisNumber() {
			return cisNumber;
		}
		public void setCisNumber(String cisNumber) {
			this.cisNumber = cisNumber;
		}
		public String getRequestorLanguage() {
			return requestorLanguage;
		}
		public void setRequestorLanguage(String requestorLanguage) {
			this.requestorLanguage = requestorLanguage;
		}
		public String getRequestorSecurityInfo() {
			return requestorSecurityInfo;
		}
		public void setRequestorSecurityInfo(String requestorSecurityInfo) {
			this.requestorSecurityInfo = requestorSecurityInfo;
		}
		public String getBranchNumber() {
			return branchNumber;
		}
		public void setBranchNumber(String branchNumber) {
			this.branchNumber = branchNumber;
		}
		public String getTellerId() {
			return tellerId;
		}
		public void setTellerId(String tellerId) {
			this.tellerId = tellerId;
		}
		public String getTerminalId() {
			return terminalId;
		}
		public void setTerminalId(String terminalId) {
			this.terminalId = terminalId;
		}
		
		public String getTransactionOrigin() {
			return transactionOrigin;
		}
		public void setTransactionOrigin(String transactionOrigin) {
			this.transactionOrigin = transactionOrigin;
		}
		public String getJournalSeqNumber() {
			return journalSeqNumber;
		}
		public void setJournalSeqNumber(String journalSeqNumber) {
			this.journalSeqNumber = journalSeqNumber;
		}
		public String getTransactionReference() {
			return transactionReference;
		}
		public void setTransactionReference(String transactionReference) {
			this.transactionReference = transactionReference;
		}
		public AccountCreationHeaderRq(String msgFormat, int msgVersion, String requestorChannelId,
				int requestorChannelFunction, String requestorUserId, String cisNumber, String requestorLanguage,
				String requestorSecurityInfo, String branchNumber, String tellerId, String terminalId, String overrideFlag,
				int overrideTellerId, String transactionOrigin, String journalSeqNumber, String transactionReference) {
			super();
			this.msgFormat = msgFormat;
			this.msgVersion = msgVersion;
			this.requestorChannelId = requestorChannelId;
			this.requestorChannelFunction = requestorChannelFunction;
			this.requestorUserId = requestorUserId;
			this.cisNumber = cisNumber;
			this.requestorLanguage = requestorLanguage;
			this.requestorSecurityInfo = requestorSecurityInfo;
			this.branchNumber = branchNumber;
			this.tellerId = tellerId;
			this.terminalId = terminalId;
			this.transactionOrigin = transactionOrigin;
			this.journalSeqNumber = journalSeqNumber;
			this.transactionReference = transactionReference;
		}
		public AccountCreationHeaderRq() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			return "AccountCreationHeaderRq [msgFormat=" + msgFormat + ", msgVersion=" + msgVersion
					+ ", requestorChannelId=" + requestorChannelId + ", requestorChannelFunction="
					+ requestorChannelFunction + ", requestorUserId=" + requestorUserId + ", cisNumber=" + cisNumber
					+ ", requestorLanguage=" + requestorLanguage + ", requestorSecurityInfo=" + requestorSecurityInfo
					+ ", branchNumber=" + branchNumber + ", tellerId=" + tellerId + ", terminalId=" + terminalId
					+ ", transactionOrigin=" + transactionOrigin + ", journalSeqNumber=" + journalSeqNumber
					+ ", transactionReference=" + transactionReference + "]";
		}
	    
	    
	    
}
