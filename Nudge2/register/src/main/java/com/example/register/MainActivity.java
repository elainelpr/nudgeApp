package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;
import org.w3c.dom.Document;

import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button logIn = (Button) findViewById(R.id.log_in);
//        OAuthService service = createOAuthScribeService();
//        Token requestToken = service.getRequestToken();
//        String authUrl = service.getAuthorizationUrl(requestToken);
//        WebView webView = new WebView(this);
//        webView.requestFocus(View.FOCUS_DOWN);
//        webView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN:
//                    case MotionEvent.ACTION_UP:
//                        if (!v.hasFocus()) {
//                            v.requestFocus();
//                        }
//                        break;
//                }
//                return false;
//            }
//        });
//        webView.loadUrl(mReqToken.getAuthenticationURL());
//        mainLayout.removeAllViews();
//        mainLayout.addView(webView);
    }
}