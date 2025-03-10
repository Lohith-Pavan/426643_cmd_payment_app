package com.payment_app.Services;

import java.util.Scanner;

import com.payment_app.Entities.BankAccounts;
import com.payment_app.Entities.UserDetails;
import com.payment_app.actions.PmtBankActions;
import com.payment_app.actions.PmtUserActions;
import com.payment_app.actions.PmtUserInputs;
import com.payment_app.database.PmtAppData;

public class PmtUserService {
	static boolean flag = true;

	public static void userMenu(Scanner sc) {
		PmtUserActions userActions = new PmtUserActions();
		do {
			flag = false;
			System.out.println("Enter 1.Register 2.Login ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				UserDetails user = PmtUserInputs.getUserRegisterInput(sc);
				userActions.register(user);
				flag = true;
				while (flag) {
					UserDetails currentUser = PmtUserInputs.getUserLoginInput(sc);
					if (currentUser != null) {
						flag = false;
						PmtAppData.setLoggedInUser(currentUser);
						PmtUserService.loginMenu(sc);
					} else {
						System.out.println("Invalid credentials");
					}
				}
				break;
			case 2:
				flag = true;
				while (flag) {
					UserDetails currentUser = PmtUserInputs.getUserLoginInput(sc);
					if (currentUser != null) {
						flag = false;
						PmtAppData.setLoggedInUser(currentUser);
						PmtUserService.loginMenu(sc);
					} else {
						System.out.println("Invalid credentials");
						PmtUserService.userMenu(sc);
					}
				}
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
			PmtBankActions bankActions = new PmtBankActions();
			System.out.println("Enter 1.AddBankAccount 2.RemoveBankAccount 3.DisplayUserDetails 4.logout");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				BankAccounts bankAcc = PmtUserInputs.getUserBankAccount(sc);
				bankActions.addBankAcc(bankAcc);
				break;
			case 2:
				BankAccounts removedBank = PmtUserInputs.removeUserBankAccount(sc);
				bankActions.removeBankAcc(removedBank);
			    break;
			case 3:
				System.out.println("user details");
		        UserDetails currentUser = PmtAppData.getLoggedInUser();
		        System.out.println(currentUser);
				break;
			case 4:
				PmtAppData.setLoggedInUser(null);
				PmtUserService.userMenu(sc);
			default:
				System.out.println("Enter correct option");
				flag = true;
			}
		} while (flag);
	}
}
