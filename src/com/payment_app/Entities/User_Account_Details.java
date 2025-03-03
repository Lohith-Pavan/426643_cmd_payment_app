package com.payment_app.Entities;

import java.util.Date;

public class User_Account_Details {
	private int userAccountId;
    private Date accountOpenDate;
    private double currentWalletBalance;
    private int linkedBankAccountsCount;
    private String walletPin;
    private User_Details userDetails;
	public User_Account_Details() {
		super();
	}
	public User_Account_Details(int userAccountId, Date accountOpenDate, double currentWalletBalance,
			int linkedBankAccountsCount, String walletPin, User_Details userDetails) {
		super();
		this.userAccountId = userAccountId;
		this.accountOpenDate = accountOpenDate;
		this.currentWalletBalance = currentWalletBalance;
		this.linkedBankAccountsCount = linkedBankAccountsCount;
		this.walletPin = walletPin;
		this.userDetails = userDetails;
	}
	public int getUserAccountId() {
		return userAccountId;
	}
	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}
	public Date getAccountOpenDate() {
		return accountOpenDate;
	}
	public void setAccountOpenDate(Date accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}
	public double getCurrentWalletBalance() {
		return currentWalletBalance;
	}
	public void setCurrentWalletBalance(double currentWalletBalance) {
		this.currentWalletBalance = currentWalletBalance;
	}
	public int getLinkedBankAccountsCount() {
		return linkedBankAccountsCount;
	}
	public void setLinkedBankAccountsCount(int linkedBankAccountsCount) {
		this.linkedBankAccountsCount = linkedBankAccountsCount;
	}
	public String getWalletPin() {
		return walletPin;
	}
	public void setWalletPin(String walletPin) {
		this.walletPin = walletPin;
	}
	public User_Details getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(User_Details userDetails) {
		this.userDetails = userDetails;
	}
	@Override
	public String toString() {
		return "User_Account_Details [userAccountId=" + userAccountId + ", accountOpenDate=" + accountOpenDate
				+ ", currentWalletBalance=" + currentWalletBalance + ", linkedBankAccountsCount="
				+ linkedBankAccountsCount + ", walletPin=" + walletPin + ", userDetails=" + userDetails + "]";
	}
    
}