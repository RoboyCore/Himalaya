package mobi.xiaowu.himalaya.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mobi.xiaowu.himalaya.MainActivity;
import mobi.xiaowu.himalaya.R;

public class WebViewActivity extends AppCompatActivity {
    @BindView(R.id.web_view_tool_bar_back)
    public TextView  back;
    @BindView(R.id.web_view_tool_bar_title)
    public TextView title;
    @BindView(R.id.web_view)
    public WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        ButterKnife.bind(this);
        String link = getIntent().getStringExtra("link");
        mWebView.setWebViewClient(new WebViewClient());
        System.out.println("link = " + link);
        if (link != null) {
            mWebView.loadUrl("http://www.baidu.com");
        }else {

        }
//        loadData();
    }

    @OnClick(R.id.web_view_tool_bar_back)
    public void click(View view) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
