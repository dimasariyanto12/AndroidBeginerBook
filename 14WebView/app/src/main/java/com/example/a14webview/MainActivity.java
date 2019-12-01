package com.example.a14webview;

        import android.app.Activity;
        import android.os.Bundle;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;
        import androidx.annotation.NonNull;

public class MainActivity  extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //String url
        WebView web=(WebView)findViewById(R.id.webView);
        web.getSettings().setJavaScriptEnabled(true);

        web.setWebViewClient(new WebViewClient(){

            public boolean shouldOvverideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view,url);
            }
        });
        web.loadUrl("http://dimasjepara.blogspot.com");
    }
}
