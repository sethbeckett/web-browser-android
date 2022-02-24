package com.example.webbrowser;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatButton;

public class NavButton extends AppCompatButton {
    public NavButton(String buttonText, Context context) {
        super(context);
        setText(buttonText);
        LinearLayout.LayoutParams navButtonParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        navButtonParams.width = 150;
        setLayoutParams(navButtonParams);
    }
}
