package com.example.kiran.readysms.view.messageitem;

import android.view.View;
import android.widget.TextView;

import com.example.kiran.readysms.R;

public class MessageTextViewInflater {

    public void inflate(View view, String message)
    {
        TextView secondLine = (TextView) view.findViewById(R.id.secondLine);
        secondLine.setText(message);    }
}
