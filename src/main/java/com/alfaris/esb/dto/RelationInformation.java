package com.alfaris.esb.dto;

public class RelationInformation {
	    private String cisNumber;
	    private String frozenFlag;
	    private String legalTitlePosition;
		public String getCisNumber() {
			return cisNumber;
		}
		public void setCisNumber(String cisNumber) {
			this.cisNumber = cisNumber;
		}
		public String getFrozenFlag() {
			return frozenFlag;
		}
		public void setFrozenFlag(String frozenFlag) {
			this.frozenFlag = frozenFlag;
		}
		public String getLegalTitlePosition() {
			return legalTitlePosition;
		}
		public void setLegalTitlePosition(String legalTitlePosition) {
			this.legalTitlePosition = legalTitlePosition;
		}
		public RelationInformation(String cisNumber, String frozenFlag, String legalTitlePosition) {
			super();
			this.cisNumber = cisNumber;
			this.frozenFlag = frozenFlag;
			this.legalTitlePosition = legalTitlePosition;
		}
		public RelationInformation() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "RelationInformation [cisNumber=" + cisNumber + ", frozenFlag=" + frozenFlag
					+ ", legalTitlePosition=" + legalTitlePosition + "]";
		}
		
	    

}
