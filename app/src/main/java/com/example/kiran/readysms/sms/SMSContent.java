package com.example.kiran.readysms.sms;

/**
 * Created by kiran on 30/1/16.
 * SMS content holder
 */
public class SMSContent {
    private String mobileNumber;

    public SMSContent(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
