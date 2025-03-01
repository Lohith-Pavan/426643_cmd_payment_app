package com.payment_app_main;

import java.util.Scanner;

import com.payment_app.actions.PmtUserActions;

public class PaymentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu(sc);
	}
	public static void menu(Scanner sc) {
		PmtUserActions pua = new PmtUserActions();
		System.out.println("Enter 1 for register,2 for login,3 for Display : ");
		int no = sc.nextInt();
		switch(no) {
		case 1:
			pua.register(sc);
			break;
		case 2:
			pua.login(sc);
			break;
		case 3:
			pua.display();
			break;
		default: 
			System.out.println("Enter correct option");
		}
	}
}