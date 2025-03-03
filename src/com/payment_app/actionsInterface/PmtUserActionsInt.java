package com.payment_app.actionsInterface;

import com.payment_app.Entities.Bank_Accounts;
import com.payment_app.Entities.User_Details;

public interface PmtUserActionsInt {
	public void register(User_Details user);
	public void login(User_Details user);
	public void displayUsers();
	public void displayUser();
	public void addBankAcc(Bank_Accounts bank);
	public User_Details checkUser(String username,String password);
}
