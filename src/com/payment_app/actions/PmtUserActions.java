package com.payment_app.actions;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.payment_app.Entities.*;
import com.payment_app.Services.PmtAdminService;
import com.payment_app.actionsInterface.PmtUserActionsInt;
import com.payment_app.database.PmtAppData;

public class PmtUserActions implements PmtUserActionsInt {
	@Override
	public void register(User_Details user) {
		PmtAppData.initusers().add(user);
		
	}

	@Override
	public void login(User_Details user) {
		PmtAppData.setLoggedUser(user);
	}

	@Override
	public void displayUser() {
		User_Details loggedUser = PmtAppData.getLoggedUser();
		if (loggedUser != null) {
			System.out.println(loggedUser);
		} else {
			System.out.println("No user is logged in.");
		}
	}

	@Override
	public void displayUsers() {
		if (PmtAppData.getUserDetList() == null) {
			System.out.println("no users are added");
		} else {
			for (User_Details x : PmtAppData.getUserDetList()) {
				System.out.println(x);
			}
		}
	}

	@Override
	public void addBankAcc(Bank_Accounts bank) {
		PmtAppData.initBankAccounts().add(bank);
	}

	@Override
	public  User_Details checkUser(String username, String password) {
		for (User_Details user : PmtAppData.getUserDetList()) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
		return null;
	}
}