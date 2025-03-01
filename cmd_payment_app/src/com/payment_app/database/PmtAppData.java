package com.payment_app.database;

import java.util.ArrayList;
import java.util.List;
import com.payment_app.Entities.Bank_Accounts;
import com.payment_app.Entities.Source_Types;
import com.payment_app.Entities.Txn_Details;
import com.payment_app.Entities.User_Account_Details;
import com.payment_app.Entities.User_Details;
public class PmtAppData {
      private static List<Bank_Accounts> bankAccList;
      private static List<Source_Types> sourseList;
      private static List<Txn_Details> txnsList;
      private static List<User_Account_Details> accDetList;
      private static List<User_Details> userDetList;
	public static List<Bank_Accounts> getBankAccList() {
		return bankAccList;
	}
	public static void setBankAccList(List<Bank_Accounts> bankAccList) {
		PmtAppData.bankAccList = bankAccList;
	}
	public static List<Source_Types> getSourseList() {
		return sourseList;
	}
	public static void setSourseList(List<Source_Types> sourseList) {
		PmtAppData.sourseList = sourseList;
	}
	public static List<Txn_Details> getTxnsList() {
		return txnsList;
	}
	public static void setTxnsList(List<Txn_Details> txnsList) {
		PmtAppData.txnsList = txnsList;
	}
	public static List<User_Account_Details> getAccDetList() {
		return accDetList;
	}
	public static void setAccDetList(List<User_Account_Details> accDetList) {
		PmtAppData.accDetList = accDetList;
	}
	public static List<User_Details> getUserDetList() {
		return userDetList;
	}
	public static void setUserDetList(List<User_Details> userDetList) {
		PmtAppData.userDetList = userDetList;
	}  
	public static List<User_Details> initusers(){
		userDetList = new ArrayList<>();
		return userDetList;
	}
}