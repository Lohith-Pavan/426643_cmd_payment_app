package com.payment_app.Entities;

public class BankAccounts {
	private static int counter = 1;
	private int bankAccountId;
    private int accountNumber;
    private String ifscCode;
    private String bankName;
    private String bankBranch;
    private AccountStatus accountStatus;
    private UserDetails userDetails;
	public BankAccounts() {
		super();
	}
	public BankAccounts(int accountNumber, String ifscCode, String bankName, String bankBranch,
			AccountStatus accountStatus, UserDetails userDetails) {
		super();
		this.bankAccountId = counter++;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.bankName = bankName;
		this.bankBranch = bankBranch;
		this.accountStatus = accountStatus;
		this.userDetails = userDetails;
	}
	public int getBankAccountId() {
		return bankAccountId;
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
	public AccountStatus getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	@Override
	public String toString() {
		return "Bank_Accounts [bankAccountId=" + bankAccountId + ", accountNumber=" + accountNumber + ", ifscCode="
				+ ifscCode + ", bankName=" + bankName + ", bankBranch=" + bankBranch + ", accountStatus=" + accountStatus
				+ ", userDetails=" + userDetails + "]";
	}
    
}