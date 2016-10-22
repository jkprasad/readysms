package com.example.kiran.readysms.view.messageitem;

import android.view.View;
import android.widget.TextView;

import com.example.kiran.readysms.R;

public class MobileNumberViewInflater {

    public void inflate(View view, String mobileNumber)
    {
        TextView firstLine = (TextView) view.findViewById(R.id.firstLine);
        firstLine.setText(mobileNumber);
    }
}
