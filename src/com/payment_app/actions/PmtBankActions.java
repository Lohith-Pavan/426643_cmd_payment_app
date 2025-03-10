package com.payment_app.actions;

import com.payment_app.Entities.BankAccounts;
import com.payment_app.Entities.UserDetails;
import com.payment_app.actionsInterface.PmtBankActionsInt;
import com.payment_app.database.PmtAppData;

public class PmtBankActions implements PmtBankActionsInt{

	@Override
	public void addBankAcc(BankAccounts userBank) {
		PmtAppData.getBankAccList().add(userBank);
	}

	@Override
	public void removeBankAcc(BankAccounts userBank) {
		PmtAppData.getBankAccList().remove(userBank);
	}
    public BankAccounts checkBankAcc(String bankname) {
    	if(null != PmtAppData.getBankAccList()) {
    		for(BankAccounts bank : PmtAppData.getBankAccList()) {
    			if(bank.getBankName().equals(bankname)) {
    				return bank;
    			}
    		}
    	}
    	return null;
    }
}
