package com.payment_app.actionsInterface;

import com.payment_app.Entities.BankAccounts;

public interface PmtBankActionsInt {
    public void addBankAcc(BankAccounts userBank);
    public void removeBankAcc(BankAccounts userBank);
}
