package com.payment_app.database;

import java.util.ArrayList;
import java.util.List;
import com.payment_app.Entities.BankAccounts;
import com.payment_app.Entities.SourceTypes;
import com.payment_app.Entities.TxnDetails;
import com.payment_app.Entities.UserAccountDetails;
import com.payment_app.Entities.UserDetails;
public class PmtAppData {
	private static List<UserDetails> userDetList = new ArrayList<>();
	private static List<UserAccountDetails> accDetList = new ArrayList<>();
    private static List<BankAccounts> bankAccList = new ArrayList<>();
    private static List<TxnDetails> txnsList = new ArrayList<>();
    private static UserDetails loggedInUser;
     
	public static UserDetails getLoggedInUser() {
		return loggedInUser;
	}
	public static void setLoggedInUser(UserDetails loggedInUser) {
		PmtAppData.loggedInUser = loggedInUser;
	}
	public static List<UserDetails> getUserDetList() {
		return userDetList;
	}
	public static void setUserDetList(List<UserDetails> userDetList) {
		PmtAppData.userDetList = userDetList;
	}
	public static List<UserAccountDetails> getAccDetList() {
		return accDetList;
	}
	public static void setAccDetList(List<UserAccountDetails> accDetList) {
		PmtAppData.accDetList = accDetList;
	}
	public static List<BankAccounts> getBankAccList() {
		return bankAccList;
	}
	public static void setBankAccList(List<BankAccounts> bankAccList) {
		PmtAppData.bankAccList = bankAccList;
	}
	public static List<TxnDetails> getTxnsList() {
		return txnsList;
	}
	public static void setTxnsList(List<TxnDetails> txnsList) {
		PmtAppData.txnsList = txnsList;
	}
}