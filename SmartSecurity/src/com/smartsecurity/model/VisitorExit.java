package com.smartsecurity.model;

public class VisitorExit {

	private String transactionid;
	private String RFID;
	private String exitdate;
	private String exittime;
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}
	public String getRFID() {
		return RFID;
	}
	public void setRFID(String rFID) {
		RFID = rFID;
	}
	public String getExitdate() {
		return exitdate;
	}
	public void setExitdate(String exitdate) {
		this.exitdate = exitdate;
	}
	public String getExittime() {
		return exittime;
	}
	public void setExittime(String exittime) {
		this.exittime = exittime;
	} 
	
	
}
