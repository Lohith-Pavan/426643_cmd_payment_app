package com.payment_app.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.payment_app.Entities.User_Details;
import com.payment_app.database.PmtAppData;

public class PmtUserActions {
	List<User_Details> userDetList = new ArrayList<>(); 
      public void register(Scanner sc) {   	  
    	  System.out.println("Enter userId : ");
    	  int uid = sc.nextInt();
    	  System.out.println("Enter userName : ");
    	  sc.nextLine();
    	  String uname = sc.nextLine();
    	  System.out.println("Enter password : ");
    	  String pass = sc.nextLine();
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
    	  User_Details user = new User_Details(uid,uname,pass,fname,lname,phno,email,address);
      	  PmtAppData.initusers().add(user);
      	  display();
      }
      public void login(Scanner sc) {
    	  System.out.println("Enter userName");
    	  String uname = sc.nextLine();
    	  System.out.println("Enter password");
    	  String upass = sc.nextLine();
    	  
      }
      public void display() {
    	  for(User_Details x : userDetList) {
    		  System.out.println(x);
    	  }
      }
}