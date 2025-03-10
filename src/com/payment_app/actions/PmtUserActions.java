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
	public void register(UserDetails user) {
		PmtAppData.getUserDetList().add(user);
	}
	public void login(UserDetails user) {
		PmtAppData.setLoggedInUser(user);
	}
    @Override
	public void displayUser(UserDetails currentUser) {
		UserDetails loggedUser = currentUser;
		if(PmtAppData.getUserDetList().contains(loggedUser)) {
			    System.out.println(loggedUser);
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
			for (UserDetails x : PmtAppData.getUserDetList()) {
				System.out.println(x);
			}
		}
	}

	@Override
	public UserDetails checkUser(String username, String password) {
		if (null != PmtAppData.getUserDetList()) {
			for (UserDetails user : PmtAppData.getUserDetList()) {
				if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
					return user;
				}
			}
		}
		return null;
	}
}