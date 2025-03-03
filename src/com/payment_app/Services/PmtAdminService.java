package com.payment_app.Services;

import java.util.Scanner;

import com.payment_app.actions.PmtUserActions;

public class PmtAdminService {
	public static void adminMenu(Scanner sc) {
		PmtUserActions userActions = new PmtUserActions();
		boolean flag;
		do {
			flag = false;
			System.out.println("Enter 1.DisplayUsers 2.DisplayTransactions 3.DisplayBankAccounts 4.Go back");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				userActions.displayUsers();
				flag = true;
				break;
			case 2:
//				displayTransactions();
				break;
			case 3:
//				displayBankAccounts();
				break;
			case 4:
				PmtAppMenu.appMenu(sc);
				flag = false;
				break;
			default:
				System.out.println("Enter correct option");
				flag = true;
			}
		} while (flag);
	}
}
