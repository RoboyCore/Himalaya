package mobi.xiaowu.himalaya.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import butterknife.BindViews;
import butterknife.OnClick;
import mobi.xiaowu.himalaya.MainActivity;
import mobi.xiaowu.himalaya.R;

public class WebViewActivity extends AppCompatActivity {
    @BindViews({R.id.web_view_tool_bar_back,R.id.web_view_tool_bar_title})
    public TextView  back,title;
    @BindViews(R.id.web_view)
    public WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        String link = getIntent().getStringExtra("link");
        mWebView.setWebViewClient(new WebViewClient());
        if (link != null) {
            mWebView.loadUrl(link);
        }else {
            //TODO:加载本地无网图片
        }
//        loadData();
    }


    public void click(View view) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
