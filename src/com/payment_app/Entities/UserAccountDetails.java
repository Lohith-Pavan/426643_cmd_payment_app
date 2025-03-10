package com.payment_app.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAccountDetails {
	private int userAccountId;
    private Date accountOpenDate;
    private double currentWalletBalance;
    private int linkedBankAccountsCount;
    private String walletPin;
    private UserDetails userDetails;
    private List<BankAccounts> banks;
    
	public UserAccountDetails() {
		super();
	}
	public UserAccountDetails(int userAccountId, Date accountOpenDate, double currentWalletBalance,
			int linkedBankAccountsCount, String walletPin, UserDetails userDetails) {
		super();
		this.userAccountId = userAccountId;
		this.accountOpenDate = accountOpenDate;
		this.currentWalletBalance = currentWalletBalance;
		this.linkedBankAccountsCount = linkedBankAccountsCount;
		this.walletPin = walletPin;
		this.userDetails = userDetails;
		banks = new ArrayList<>();
	}
	
	public List<BankAccounts> getBanks() {
		return banks;
	}
	public void setBanks(List<BankAccounts> banks) {
		this.banks = banks;
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
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	@Override
	public String toString() {
		return "User_Account_Details [userAccountId=" + userAccountId + ", accountOpenDate=" + accountOpenDate
				+ ", currentWalletBalance=" + currentWalletBalance + ", linkedBankAccountsCount="
				+ linkedBankAccountsCount + ", walletPin=" + walletPin + ", userDetails=" + userDetails + "]";
	}
    
}