package mobi.xiaowu.himalaya.ui.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.MainActivity;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.api.MainUrl;
import mobi.xiaowu.himalaya.model.main.Ads;
import mobi.xiaowu.himalaya.utils.ImgAsync;
import mobi.xiaowu.himalaya.utils.JsonAsyncTask;

public class WelcomeActivity extends AppCompatActivity implements JsonAsyncTask.Callback {
    @BindView(R.id.activity_welcome)
    public ImageView iv;
    private Handler mHandler;
    private ImgAsync mImgAsync;
    private ScheduledThreadPoolExecutor mExecutor;
    private int AppCount;
    private Ads.Ad mAd;
    private  boolean isAds;//是否开启广告

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
        mHandler = new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {
                if (msg.what == 0x110) {
                    if (!isAds) {
                        Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
                return false;
            }
        });
        SharedPreferences sharedPreferences = getSharedPreferences("appCount", MODE_PRIVATE);
        AppCount = sharedPreferences.getInt("count", 0);
        if (AppCount == 0) {
            Toast.makeText(this, "欢迎使用喜马拉雅FM", Toast.LENGTH_SHORT).show();
        }
        sharedPreferences.edit().putInt("count",AppCount+1).apply();

        loadData();

    }

    private void loadData() {
        mExecutor = new ScheduledThreadPoolExecutor(2);
        new JsonAsyncTask(this,this).executeOnExecutor(mExecutor,MainUrl.Ads);
//        mImgAsync = new ImgAsync(iv);
//        iv.setTag(mImgAsync.getUrl());
//        mImgAsync.execute(MainUrl.Ads);
        loadMainActivity();
    }

    private void loadMainActivity() {
        mHandler.sendEmptyMessageDelayed(0x110,3000);
    }


    @Override
    public void sendData(byte[] json) {
        try {
            Ads ads = new Gson().fromJson(new String(json, "utf-8"), Ads.class);
            List<Ads.Ad> adList =  ads.getData();
            System.out.println("11111111111= " + AppCount + "//" + adList.size());
            mAd = adList.get(AppCount % 2);
            String cover =  mAd.getCover();
            iv.setTag(cover);
            new ImgAsync(iv).executeOnExecutor(mExecutor,cover);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    public void click(View view) {
        isAds = true;
        if (mAd != null) {
            String link = mAd.getLink();
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("link",link);
            intent.putExtra("loadAds",true);
            startActivity(intent);
            finish();
        }
    }
}
