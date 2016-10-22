package com.example.kiran.readysms;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kiran.readysms.sms.SMSContent;
import com.example.kiran.readysms.view.SMSViewEntry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        List<String> messages = getMessages();

        String[] messageArr = new String[messages.size()];
        messages.toArray(messageArr);
        MessagesAdapter adapter = new MessagesAdapter(this,  messageArr);

        setListAdapter(adapter);
    }

    private List<String> getMessages() {
        List<SMSContent> smsContents = getSMSContents();

        List<SMSViewEntry> viewEntries = new ArrayList<>();
        for (SMSContent  content : smsContents) {
            viewEntries.add(new SMSViewEntry(content));
        }

        List<String> messages = new ArrayList<>();
        for (SMSViewEntry entry : viewEntries) {
            messages.add(entry.viewText());
        }

        return messages;
    }

    private List<SMSContent> getSMSContents() {
        return Arrays.asList(new SMSContent("9000434304", "Starting"),
                new SMSContent("9000434304", "At office"),
                new SMSContent("9949555073", "At Khairatabad, 10 minutes late"));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Object itemAtPosition = l.getItemAtPosition(position);
        System.out.println(itemAtPosition);

        String[] values = itemAtPosition.toString().split(";");

        SmsManager smsManager = SmsManager.getDefault();
//        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},1);

        smsManager.sendTextMessage(values[0], null, values[1], null, null);

        Context context = getApplicationContext();
        CharSequence text = "Sent to " + values[0];
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
