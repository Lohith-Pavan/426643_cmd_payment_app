package com.payment_app.actionsInterface;

import com.payment_app.Entities.BankAccounts;
import com.payment_app.Entities.UserDetails;

public interface PmtUserActionsInt {
	public void register(UserDetails user);
	public void login(UserDetails user);
	public void displayUsers();
	public void displayUser(UserDetails currentUser);
	public UserDetails checkUser(String username,String password);
}
