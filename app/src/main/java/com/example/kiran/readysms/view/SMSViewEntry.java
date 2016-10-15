package com.example.kiran.readysms.view;

import com.example.kiran.readysms.sms.SMSContent;

/**
 * Created by kiran on 30/1/16.
 * The way SMS should be viewed in list as an entry
 */
public class SMSViewEntry {
    private SMSContent sms;

    public SMSViewEntry(SMSContent content) {

        this.sms = content;
    }

    public String viewText()
    {
        return sms.getMobileNumber() + '\n' + sms.getMessage();
    }
}
