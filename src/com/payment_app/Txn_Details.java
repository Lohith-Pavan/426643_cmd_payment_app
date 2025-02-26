package com.payment_app;

import java.time.LocalDateTime;

public class Txn_Details {
	private long txnId;
	private User_Details user_details;
    private LocalDateTime txnDateTime;
    private User_Details sourceId;
    private User_Details targetId;
    private Source_Types sourceType; 
    private Source_Types destType;   
    private double txnAmount;
}
