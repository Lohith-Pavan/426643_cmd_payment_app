package com.payment_app.actions;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.payment_app.Entities.*;
import com.payment_app.Services.PmtAdminService;
import com.payment_app.Services.PmtUserService;
import com.payment_app.actionsInterface.PmtUserActionsInt;
import com.payment_app.database.PmtAppData;

public class PmtUserActions implements PmtUserActionsInt {
	@Override
	public void register(User_Details user) {
		PmtAppData.getUserDetList().add(user);
	}

	@Override
	public void displayUser(User_Details currentUser) {
		User_Details loggedUser = currentUser;
		if(PmtAppData.getUserDetList().contains(loggedUser)) {
			    System.out.println(loggedUser);;
		}
		else {
		        System.out.println("no user is logged in");
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
	public User_Details checkUser(String username, String password) {
		if (PmtAppData.getUserDetList() != null) {
			for (User_Details user : PmtAppData.getUserDetList()) {
				if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
					return user;
				}
			}
		}
		return null;
	}
}