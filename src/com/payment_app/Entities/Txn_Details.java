package com.payment_app.Entities;

import java.util.Date;

public class Txn_Details {
	private int txnId;
    private Date txnDateTime;
    private User_Details sourceId;  
    private User_Details targetId;  
    private String sourceType; 
    private String destType;   
    private double txnAmount;
	public Txn_Details() {
		super();
	}
	public Txn_Details(int txnId, Date txnDateTime, User_Details sourceId, User_Details targetId, String sourceType,
			String destType, double txnAmount) {
		super();
		this.txnId = txnId;
		this.txnDateTime = txnDateTime;
		this.sourceId = sourceId;
		this.targetId = targetId;
		this.sourceType = sourceType;
		this.destType = destType;
		this.txnAmount = txnAmount;
	}
	public int getTxnId() {
		return txnId;
	}
	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}
	public Date getTxnDateTime() {
		return txnDateTime;
	}
	public void setTxnDateTime(Date txnDateTime) {
		this.txnDateTime = txnDateTime;
	}
	public User_Details getSourceId() {
		return sourceId;
	}
	public void setSourceId(User_Details sourceId) {
		this.sourceId = sourceId;
	}
	public User_Details getTargetId() {
		return targetId;
	}
	public void setTargetId(User_Details targetId) {
		this.targetId = targetId;
	}
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public String getDestType() {
		return destType;
	}
	public void setDestType(String destType) {
		this.destType = destType;
	}
	public double getTxnAmount() {
		return txnAmount;
	}
	public void setTxnAmount(double txnAmount) {
		this.txnAmount = txnAmount;
	}
	@Override
	public String toString() {
		return "Txn_Details [txnId=" + txnId + ", txnDateTime=" + txnDateTime + ", sourceId=" + sourceId + ", targetId="
				+ targetId + ", sourceType=" + sourceType + ", destType=" + destType + ", txnAmount=" + txnAmount
				+ "]";
	}
    
}