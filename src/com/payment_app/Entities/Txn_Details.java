package com.payment_app.Entities;

import java.time.LocalDateTime;

public class Txn_Details {
	private int txnId;
    private LocalDateTime txnDateTime;
    private int sourceId;  
    private int targetId;  
    private String sourceType; 
    private String destType;   
    private double txnAmount;
    private User_Details user_details; //one to many (bidirectional)
	public Txn_Details(int txnId, LocalDateTime txnDateTime, int sourceId, int targetId, String sourceType,
			String destType, double txnAmount, User_Details user_details) {
		super();
		this.txnId = txnId;
		this.txnDateTime = txnDateTime;
		this.sourceId = sourceId;
		this.targetId = targetId;
		this.sourceType = sourceType;
		this.destType = destType;
		this.txnAmount = txnAmount;
		this.user_details = user_details;
	}
	public int getTxnId() {
		return txnId;
	}
	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}
	public LocalDateTime getTxnDateTime() {
		return txnDateTime;
	}
	public void setTxnDateTime(LocalDateTime txnDateTime) {
		this.txnDateTime = txnDateTime;
	}
	public int getSourceId() {
		return sourceId;
	}
	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}
	public int getTargetId() {
		return targetId;
	}
	public void setTargetId(int targetId) {
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
	public User_Details getUser_details() {
		return user_details;
	}
	public void setUser_details(User_Details user_details) {
		this.user_details = user_details;
	}
	@Override
	public String toString() {
		return "Txn_Details [txnId=" + txnId + ", txnDateTime=" + txnDateTime + ", sourceId=" + sourceId + ", targetId="
				+ targetId + ", sourceType=" + sourceType + ", destType=" + destType + ", txnAmount=" + txnAmount
				+ ", user_details=" + user_details + "]";
	}
    
}
