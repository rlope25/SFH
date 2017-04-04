package com.example.romiz_2.sfh;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class FacebookFragment extends Fragment {


    private WebView mWebView;
    View myView;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.facebook_layout, container, false);
        mWebView = (WebView) myView.findViewById(R.id.facebook_webview);
        mWebView.loadUrl("https://es-la.facebook.com/San-Francisco-Higos-Oaxaca-162567650437819/");

        //Enable JavaString
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Force Links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());
        //mWebView.setWebChromeClient(new WebChromeClient());


        return myView;
    }

}
