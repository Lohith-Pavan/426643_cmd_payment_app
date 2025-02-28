package com.payment_app.database;

import java.util.ArrayList;
import java.util.List;
import com.payment_app.Entities.Bank_Accounts;
import com.payment_app.Entities.Source_Types;
import com.payment_app.Entities.Txn_Details;
import com.payment_app.Entities.User_Account_Details;
import com.payment_app.Entities.User_Details;
public class PmtAppData {
      public static List<Bank_Accounts> bankAccList = new ArrayList<>();
      public static List<Source_Types> sourseList = new ArrayList<>();
      public static List<Txn_Details> txnsList = new ArrayList<>();
      public static List<User_Account_Details> accDetList = new ArrayList<>();
      public static List<User_Details> userDetList = new ArrayList<>();   
}
