package com.payment_app.Entities;

enum AccountStatus{
	YES,NO,Frozen,Blocked
}

public class Bank_Accounts {
	private int bankAccountId;
    private int accountNumber;
    private String ifscCode;
    private String bankName;
    private String bankBranch;
    private AccountStatus isActive;
    private User_Details userDetails; 
	public Bank_Accounts() {
		super();
	}
	public Bank_Accounts(int bankAccountId, int accountNumber, String ifscCode, String bankName, String bankBranch,
			AccountStatus isActive, User_Details userDetails) {
		super();
		this.bankAccountId = bankAccountId;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.bankName = bankName;
		this.bankBranch = bankBranch;
		this.isActive = isActive;
		this.userDetails = userDetails;
	}
	public int getBankAccountId() {
		return bankAccountId;
	}
	public void setBankAccountId(int bankAccountId) {
		this.bankAccountId = bankAccountId;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	public AccountStatus getIsActive() {
		return isActive;
	}
	public void setIsActive(AccountStatus isActive) {
		this.isActive = isActive;
	}
	public User_Details getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(User_Details userDetails) {
		this.userDetails = userDetails;
	}
	@Override
	public String toString() {
		return "Bank_Accounts [bankAccountId=" + bankAccountId + ", accountNumber=" + accountNumber + ", ifscCode="
				+ ifscCode + ", bankName=" + bankName + ", bankBranch=" + bankBranch + ", isActive=" + isActive
				+ ", userDetails=" + userDetails + "]";
	}
    
}