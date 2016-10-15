package com.example.kiran.readysms;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

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

        String[] items = new String[messages.size()];
        messages.toArray(items);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, items);

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

        messages.add("Touch here to create a readily available SMS for a contact");
        return messages;
    }

    private List<SMSContent> getSMSContents() {
        return Arrays.asList(new SMSContent("9000434304", "Test message"));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        TextView itemAtPosition = (TextView)l.getItemAtPosition(position);

        itemAtPosition.setText("Modified");

    }
}
