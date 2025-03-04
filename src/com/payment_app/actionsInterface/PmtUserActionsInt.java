package com.payment_app.actionsInterface;

import com.payment_app.Entities.Bank_Accounts;
import com.payment_app.Entities.User_Details;

public interface PmtUserActionsInt {
	public void register(User_Details user);
	public void displayUsers();
	public User_Details displayUser();
	public User_Details checkUser(String username,String password);
}
