package com.example.webbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        //navigation bar
        LinearLayout navBar = new LinearLayout(this);
        NavButton backButton = new NavButton("B", this);
        NavButton forwardButton = new NavButton("F", this);
        final AddressBar addressInput = new AddressBar(this);
        NavButton goButton = new NavButton("Go", this);

        navBar.addView(backButton);
        navBar.addView(forwardButton);
        navBar.addView(addressInput);
        navBar.addView(goButton);

        //web page setup
        WebView webView = new WebView(this);
        webView.setWebViewClient(new WebViewClient());
        BrowserHistory history = new BrowserHistory();

        //go to page on click
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String webAddress = addressInput.getText().toString();
                webView.loadUrl(webAddress);
                history.addPage(webAddress);
            }
        });

        //go back in history
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (history.hasPrev()) {
                    webView.loadUrl(history.getPrev());
                }
            }
        });

        forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (history.hasNext()) {
                    webView.loadUrl(history.getNext());
                }
            }
        });


        mainLayout.addView(navBar);
        mainLayout.addView(webView);

        setContentView(mainLayout);
    }
}
