package com.payment_app.Entities;

import java.util.ArrayList;
import java.util.Scanner;

public class User_Details {
	Scanner sc = new Scanner(System.in);
	private static int counter = 1;
	private int userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;
    private User_Account_Details userAccDet;
	public User_Account_Details getUserAccDet() {
		return userAccDet;
	}
	public void setUserAccDet(User_Account_Details userAccDet) {
		this.userAccDet = userAccDet;
	}
	public User_Details() {
		super();
	}
	public User_Details(String userName, String password, String firstName, String lastName,
			String phoneNumber, String email, String address) {
		super();
		this.userId = counter++;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}
	public int getUserId() {
		return userId;
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
	@Override
	public String toString() {
		return "User_Details [userId=" + userId + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", address=" + address + "]";
	}
}