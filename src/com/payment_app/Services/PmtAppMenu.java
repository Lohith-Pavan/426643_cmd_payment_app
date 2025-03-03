package com.payment_app.Services;

import java.util.Scanner;

public class PmtAppMenu {
	public static void appMenu(Scanner sc) {
		boolean flag;
		do {
			flag = false;
			System.out.println("Enter 1.Admin 2.User");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				PmtAdminService.adminMenu(sc);
				break;
			case 2:
				PmtUserService.userMenu(sc);
				break;
			default:
				System.out.println("Enter correct option");
				flag = true;
			}
		} while (flag);
	}
}
