package com.example.admin.webview;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.KeyEvent;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Objects.requireNonNull(getActionBar()).hide();

        webView = findViewById(R.id.webView);
        loadWebViewLoad(webView);

        webView.setOnKeyListener(new View.OnKeyListener() {
        @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {

            if (event.getAction() == KeyEvent.ACTION_DOWN) {
                   switch (keyCode) {
                       case KeyEvent.KEYCODE_BACK:
                           if (webView.canGoBack()) {
                               webView.goBack();
                               return true;
                               }
                               break;
                           }
                           }
                           return false;
            }
      });
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void loadWebViewLoad(WebView webview) {
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webview.getSettings().setSupportMultipleWindows(true);
        webview.setWebViewClient(new WebViewClient());
        webview.setWebChromeClient(new WebChromeClient());

        webview.loadUrl("https://raokarthik2.wixsite.com/aquatatva");
    }

}




