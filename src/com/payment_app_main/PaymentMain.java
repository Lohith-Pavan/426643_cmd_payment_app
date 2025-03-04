package com.payment_app_main;

import java.util.Scanner;

import com.payment_app.Entities.User_Details;
import com.payment_app.Services.PmtAdminService;
import com.payment_app.Services.PmtAppMenu;
import com.payment_app.actions.*;

public class PaymentMain {
	static boolean flag = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PmtAppMenu.appMenu(sc);
		sc.close();
	}
}