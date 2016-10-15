package com.example.kiran.readysms.sms;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by kiran on 30/1/16.
 * Tests SMSContent API
 */
public class SMSContentTest {
    @Test
    public void testMobileNumber()
    {
        String mobileNumber = "9000434304";
        SMSContent content = new SMSContent("9000434304", mobileNumber);

        Assert.assertEquals("Unexpected mobile number", mobileNumber, content.getMobileNumber());
    }

    @Test
    public void testMessage()
    {
        String message = "Test Message";
        SMSContent content = new SMSContent("9000434304", message);

        Assert.assertEquals("Unexpected mobile number", message, content.getMessage());
    }

}
