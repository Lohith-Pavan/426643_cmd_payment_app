package com.payment_app.database;

import java.util.ArrayList;
import java.util.List;
import com.payment_app.Entities.Bank_Accounts;
import com.payment_app.Entities.Source_Types;
import com.payment_app.Entities.Txn_Details;
import com.payment_app.Entities.User_Account_Details;
import com.payment_app.Entities.User_Details;
public class PmtAppData {
	private static List<User_Details> userDetList;
	private static List<User_Account_Details> accDetList;
    private static List<Bank_Accounts> bankAccList;
    private static List<Txn_Details> txnsList;
    
    private static User_Details loggedUser;

    public static User_Details getLoggedUser() {
		return loggedUser;
	}
	public static void setLoggedUser(User_Details loggedUser) {
		PmtAppData.loggedUser = loggedUser;
	}
	public static List<User_Details> initusers(){
		userDetList = new ArrayList<>();
		return userDetList;
	}
	public static List<User_Account_Details> initUserAccDet(){
		accDetList = new ArrayList<>();
		return accDetList;
	}
	public static List<Bank_Accounts> initBankAccounts(){
		bankAccList = new ArrayList<>();
		return bankAccList;
	}
	public static List<Txn_Details> initTxnDet(){
		txnsList = new ArrayList<>();
		return txnsList;
	}
	
	public static List<User_Details> getUserDetList() {
		return userDetList;
	}
	public static void setUserDetList(List<User_Details> userDetList) {
		PmtAppData.userDetList = userDetList;
	}
	public static List<User_Account_Details> getAccDetList() {
		return accDetList;
	}
	public static void setAccDetList(List<User_Account_Details> accDetList) {
		PmtAppData.accDetList = accDetList;
	}
	public static List<Bank_Accounts> getBankAccList() {
		return bankAccList;
	}
	public static void setBankAccList(List<Bank_Accounts> bankAccList) {
		PmtAppData.bankAccList = bankAccList;
	}
	public static List<Txn_Details> getTxnsList() {
		return txnsList;
	}
	public static void setTxnsList(List<Txn_Details> txnsList) {
		PmtAppData.txnsList = txnsList;
	}
}