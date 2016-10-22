package com.example.kiran.readysms.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kiran.readysms.R;
import com.example.kiran.readysms.view.messageitem.MessageTextViewInflater;
import com.example.kiran.readysms.view.messageitem.MobileNumberViewInflater;

public class MessageItemViewInflater {
    public View getView(Context context, ViewGroup parent, String mobileNumber, String message) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.content_main, parent, false);

        new MobileNumberViewInflater().inflate(view, mobileNumber);

        new MessageTextViewInflater().inflate(view, message);

        return view;
    }
}