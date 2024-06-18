package com.alfaris.esb.dto;

public class Schedule {
	    private int pymtIncr;
	    private String skipPayment;
	    private String pymtMethod;
	    private int numberOfPymts;
	    private String pymtFreq;
	    private int flatAmt;
	    private int pymtDay;
	    private int firstDueDate;
		public int getPymtIncr() {
			return pymtIncr;
		}
		public void setPymtIncr(int pymtIncr) {
			this.pymtIncr = pymtIncr;
		}
		public String getSkipPayment() {
			return skipPayment;
		}
		public void setSkipPayment(String skipPayment) {
			this.skipPayment = skipPayment;
		}
		public String getPymtMethod() {
			return pymtMethod;
		}
		public void setPymtMethod(String pymtMethod) {
			this.pymtMethod = pymtMethod;
		}
		public int getNumberOfPymts() {
			return numberOfPymts;
		}
		public void setNumberOfPymts(int numberOfPymts) {
			this.numberOfPymts = numberOfPymts;
		}
		public String getPymtFreq() {
			return pymtFreq;
		}
		public void setPymtFreq(String pymtFreq) {
			this.pymtFreq = pymtFreq;
		}
		public int getFlatAmt() {
			return flatAmt;
		}
		public void setFlatAmt(int flatAmt) {
			this.flatAmt = flatAmt;
		}
		public int getPymtDay() {
			return pymtDay;
		}
		public void setPymtDay(int pymtDay) {
			this.pymtDay = pymtDay;
		}
		public int getFirstDueDate() {
			return firstDueDate;
		}
		public void setFirstDueDate(int firstDueDate) {
			this.firstDueDate = firstDueDate;
		}
		public Schedule(int pymtIncr, String skipPayment, String pymtMethod, int numberOfPymts, String pymtFreq,
				int flatAmt, int pymtDay, int firstDueDate) {
			super();
			this.pymtIncr = pymtIncr;
			this.skipPayment = skipPayment;
			this.pymtMethod = pymtMethod;
			this.numberOfPymts = numberOfPymts;
			this.pymtFreq = pymtFreq;
			this.flatAmt = flatAmt;
			this.pymtDay = pymtDay;
			this.firstDueDate = firstDueDate;
		}
		public Schedule() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Schedule [pymtIncr=" + pymtIncr + ", skipPayment=" + skipPayment + ", pymtMethod=" + pymtMethod
					+ ", numberOfPymts=" + numberOfPymts + ", pymtFreq=" + pymtFreq + ", flatAmt=" + flatAmt
					+ ", pymtDay=" + pymtDay + ", firstDueDate=" + firstDueDate + "]";
		}
	    
	    
}
