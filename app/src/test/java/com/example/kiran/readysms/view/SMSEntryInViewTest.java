package com.example.kiran.readysms.view;

import com.example.kiran.readysms.sms.SMSContent;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by kiran on 30/1/16.
 * Tests SMS entry view API
 */
public class SMSEntryInViewTest {
    @Test
    public void messageContentEntryInView()
    {
        SMSContent content = new SMSContent("9000434304", "Test message");

        String expectedViewEntry= "9000434304\nTest message";

        SMSViewEntry entry = new SMSViewEntry(content);

        Assert.assertEquals("Unexpected SMS viewing text in the list of messages that mobile shows", expectedViewEntry, entry.viewText());

    }
}
