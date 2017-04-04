package com.example.romiz_2.sfh;


import android.os.Bundle;
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
public class YoutubeFragment extends Fragment {


    public YoutubeFragment() {
        // Required empty public constructor
    }

    private WebView mWebView;
    View myView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.youtube_layout, container, false);

        myView = inflater.inflate(R.layout.facebook_layout, container, false);
        mWebView = (WebView) myView.findViewById(R.id.facebook_webview);
        mWebView.loadUrl("https://www.youtube.com/results?search_query=san+francisco+higos");

        //Enable JavaString
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Force Links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());
        //mWebView.setWebChromeClient(new WebChromeClient());


        return myView;




    }

}
