package com.payment_app.Services;

import java.util.Scanner;

import com.payment_app.Entities.User_Details;
import com.payment_app.actions.PmtUserActions;
import com.payment_app.actions.PmtUserInputs;
import com.payment_app.database.PmtAppData;

public class PmtUserService {
	static boolean flag = true;

	public static void userMenu(Scanner sc) {
		PmtUserActions userActions = new PmtUserActions();
		PmtUserInputs pui = new PmtUserInputs();
		do {
			flag = false;
			System.out.println("Enter 1.Register 2.Login ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				User_Details user = pui.getUserRegisterInput();
				userActions.register(user);
				flag = true;
				while (flag) {
					User_Details currentUser = pui.getUserLoginInput();
					if (currentUser == null) {
						System.out.println("Invalid credentials");
					} else {
						flag = false;
						PmtUserService.loginMenu(sc);
					}
				}
				break;
			case 2:
				flag = true;
				while (flag) {
					User_Details currentUser = pui.getUserLoginInput();
					if (currentUser == null) {
						System.out.println("Invalid credentials");
						PmtUserService.userMenu(sc);
					} else {
						flag = false;
						PmtUserService.loginMenu(sc);
					}
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

	public static void loginMenu(Scanner sc) {
		do {
			flag = false;
			PmtUserActions userActions = new PmtUserActions();
			System.out.println("Enter 1.Display userdetails 2.logout");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("user details");
				userActions.displayUser();
				flag = true;
				break;
			case 2:
				PmtUserService.userMenu(sc);
			default:
				System.out.println("Enter correct option");
				flag = true;
			}
		} while (flag);
	}
}
