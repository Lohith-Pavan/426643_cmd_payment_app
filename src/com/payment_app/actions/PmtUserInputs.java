package com.payment_app.actions;

import java.util.Scanner;

import com.payment_app.Entities.AccountStatus;
import com.payment_app.Entities.BankAccounts;
import com.payment_app.Entities.UserDetails;
import com.payment_app.actionsInterface.PmtUserActionsInt;
import com.payment_app.database.PmtAppData;

public class PmtUserInputs {
    private Scanner sc;
    public PmtUserInputs() {
    	this.sc = new Scanner(System.in);
    }
    public static UserDetails getUserRegisterInput(Scanner sc) {
      System.out.println("Enter userName : ");
   	  String uname = sc.nextLine();
   	  System.out.println("Enter password : ");
   	  String upass = sc.nextLine();
   	  System.out.println("Enter FirstName : ");
   	  String fname = sc.nextLine();
   	  System.out.println("Enter LastName : ");
   	  String lname = sc.nextLine();
   	  System.out.println("Enter phonenumber : ");
   	  String phno = sc.nextLine();
   	  System.out.println("Enter email : ");
   	  String email = sc.nextLine();
   	  System.out.println("Enter address : ");
   	  String address = sc.nextLine();
   	  UserDetails user = new UserDetails(uname,upass,fname,lname,phno,email,address);
   	  return user;
    }
    public static UserDetails getUserLoginInput(Scanner sc) {
    	System.out.println("Enter username");
    	String uname = sc.nextLine();
    	System.out.println("Enter password");
    	String upass = sc.nextLine();
    	PmtUserActions userActions = new PmtUserActions();
    	UserDetails currentUser = userActions.checkUser(uname, upass);
        return currentUser; 	
    }
    public static BankAccounts getUserBankAccount(Scanner sc) {
    	System.out.println("Enter Account Number : ");
    	int accNum = sc.nextInt();
    	System.out.println("Enter IFSC code : ");
    	sc.nextLine();
    	String ifsc = sc.nextLine();
    	System.out.println("Enter Bank Name : ");
    	String bankName = sc.nextLine();
    	System.out.println("Enter Bank Branch : ");
    	String branch = sc.nextLine();
    	System.out.println("Enter Account Status : ");
    	String accountStatus = sc.next().toUpperCase();
    	AccountStatus accStatus = null;
    	try {
    		accStatus = AccountStatus.valueOf(accountStatus);
    	}catch(IllegalArgumentException e) {
    	}
		BankAccounts bankAcc = new BankAccounts(accNum,ifsc,bankName,branch,accStatus,PmtAppData.getLoggedInUser());
    	return bankAcc;
    }
    public static BankAccounts removeUserBankAccount(Scanner sc) {
    	System.out.println("Enter Bank Name : ");
    	String bankName = sc.nextLine();
    	PmtBankActions bankActions = new PmtBankActions();
    	BankAccounts removedBankAcc = bankActions.checkBankAcc(bankName);
        return removedBankAcc;
    }
}
