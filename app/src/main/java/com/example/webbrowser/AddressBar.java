package com.example.webbrowser;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatEditText;

public class AddressBar extends AppCompatEditText {

    public AddressBar(Context context) {
        super(context);
        LinearLayout.LayoutParams addressBarParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        addressBarParams.weight = 8;
        setLayoutParams(addressBarParams);
    }
}
