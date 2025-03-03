package com.payment_app.actions;

import java.util.Scanner;

import com.payment_app.Entities.User_Details;
import com.payment_app.actionsInterface.PmtUserActionsInt;

public class PmtUserInputs {
    private Scanner sc;
    public PmtUserInputs() {
    	this.sc = new Scanner(System.in);
    }
    public User_Details getUserRegisterInput() {
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
   	  User_Details user = new User_Details(uname,upass,fname,lname,phno,email,address);
   	  return user;
    }
    public User_Details getUserLoginInput() {
    	System.out.println("Enter username");
    	String uname = sc.nextLine();
    	System.out.println("Enter password");
    	String upass = sc.nextLine();
    	PmtUserActions userActions = new PmtUserActions();
    	User_Details currentUser = userActions.checkUser(uname, upass);
        return currentUser;
    }
}
