package com.example.kiran.readysms;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.kiran.readysms.view.MessageItemViewInflater;

class MessagesAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    MessagesAdapter(Context context, String[] values) {
        super(context, R.layout.content_main, values);
        this.context = context;
        this.values = values;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        String[] entries = values[position].split(";");

        return new MessageItemViewInflater().getView(context, parent, entries[0], entries[1]);
    }
}