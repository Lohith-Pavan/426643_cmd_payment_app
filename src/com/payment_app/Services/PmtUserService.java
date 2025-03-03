package com.payment_app.Services;

import java.util.Scanner;

import com.payment_app.Entities.User_Details;
import com.payment_app.actions.PmtUserActions;
import com.payment_app.actions.PmtUserInputs;
import com.payment_app.database.PmtAppData;

public class PmtUserService {
	public static void userMenu(Scanner sc) {
		PmtUserActions userActions = new PmtUserActions();
		PmtUserInputs pui = new PmtUserInputs();
		boolean flag;
		do {
			flag = false;
			System.out.println("Enter 1.Register 2.Login ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				User_Details user = pui.getUserRegisterInput();
				userActions.register(user);
				flag = true;
				break;
			case 2:
                User_Details currentUser = pui.getUserLoginInput();
                if(currentUser == null) {
                }  
                else {	 
                	PmtUserService.userMenu(sc);
                }
				break;
			case 3:
				userActions.displayUsers();
				break;
			default:
				System.out.println("Enter correct option");
				flag = true;
			}
		} while (flag);
	}
}
