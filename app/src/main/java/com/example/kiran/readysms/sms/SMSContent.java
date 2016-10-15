package com.example.kiran.readysms.sms;

/**
 * Created by kiran on 30/1/16.
 * SMS content holder
 */
public class SMSContent {
    private String mobileNumber;
    private String message;

    public SMSContent(String mobileNumber, String message) {
        this.mobileNumber = mobileNumber;
        this.message = message;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getMessage() {
        return message;
    }
}
