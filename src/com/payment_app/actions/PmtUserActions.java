package com.payment_app.actions;

import com.payment_app.Entities.User_Details;
import com.payment_app.database.PmtAppData;

public class PmtUserActions {
      public void addUser(User_Details user) {
    	  PmtAppData.userDetList.add(user);
      }
      public void removeUser(User_Details user) {
    	  PmtAppData.userDetList.remove(user);
      }
}
