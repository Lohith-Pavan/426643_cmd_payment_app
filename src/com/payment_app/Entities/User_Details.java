package com.payment_app.Entities;

import java.util.ArrayList;

public class User_Details {
	private int userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;
    private User_Account_Details userAccountDetails; //one to one 
    private ArrayList<Bank_Accounts> bankAccounts; // one to many
    private ArrayList<Txn_Details> transactions;   //one to many
	public User_Details(int userId, String userName, String password, String firstName, String lastName,
			String phoneNumber, String email, String address, User_Account_Details userAccountDetails,
			ArrayList<Bank_Accounts> bankAccounts, ArrayList<Txn_Details> transactions) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.userAccountDetails = userAccountDetails;
		this.bankAccounts = bankAccounts;
		this.transactions = transactions;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User_Account_Details getUserAccountDetails() {
		return userAccountDetails;
	}
	public void setUserAccountDetails(User_Account_Details userAccountDetails) {
		this.userAccountDetails = userAccountDetails;
	}
	public ArrayList<Bank_Accounts> getBankAccounts() {
		return bankAccounts;
	}
	public void setBankAccounts(ArrayList<Bank_Accounts> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	public ArrayList<Txn_Details> getTransactions() {
		return transactions;
	}
	public void setTransactions(ArrayList<Txn_Details> transactions) {
		this.transactions = transactions;
	}
	@Override
	public String toString() {
		return "User_Details [userId=" + userId + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", address=" + address + ", userAccountDetails=" + userAccountDetails + ", bankAccounts="
				+ bankAccounts + ", transactions=" + transactions + "]";
	}
    
}
