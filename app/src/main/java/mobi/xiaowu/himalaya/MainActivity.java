package mobi.xiaowu.himalaya;

import android.content.Intent;
import android.provider.Settings;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mobi.xiaowu.himalaya.ui.activity.WebViewActivity;
import mobi.xiaowu.himalaya.ui.fragment.discover.DiscoverFragment;
import mobi.xiaowu.himalaya.ui.fragment.downlisten.DownListenFragment;
import mobi.xiaowu.himalaya.ui.fragment.my.MyFragment;
import mobi.xiaowu.himalaya.ui.fragment.sublisten.SubListenFragment;
import mobi.xiaowu.himalaya.widget.MyAlertDialog;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    @BindView(R.id.main_rg)
    public RadioGroup rg;
    private FragmentManager fm;
    private long time;
    private MyAlertDialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        fm = getSupportFragmentManager();
        FragmentTransaction tx = fm.beginTransaction();
        tx.add(R.id.main_fragment_container, new DiscoverFragment());
        tx.commit();
        rg.setOnCheckedChangeListener(this);

        rg.check(R.id.main_rb_01);
        boolean loadAds = getIntent().getBooleanExtra("loadAds", false);
        if (loadAds) {
            Intent intent = new Intent(this, WebViewActivity.class);
            intent.putExtra("link",getIntent().getStringExtra("link"));
            startActivity(intent);
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        FragmentTransaction tx = fm.beginTransaction();
        switch (checkedId) {
            case R.id.main_rb_01:
                tx.replace(R.id.main_fragment_container,new DiscoverFragment());
                break;
            case R.id.main_rb_02:
                tx.replace(R.id.main_fragment_container,new SubListenFragment());
                break;
            case R.id.main_rb_03:
                Toast.makeText(this, "等待开发", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_rb_04:
                tx.replace(R.id.main_fragment_container,new DownListenFragment());
                break;
            case R.id.main_rb_05:
                tx.replace(R.id.main_fragment_container,new MyFragment());
                break;
        }
        tx.commit();
    }

    @Override
    public void onBackPressed() {
//        long curr = System.currentTimeMillis();
//        if (curr - time < 3000) {
//            super.onBackPressed();
//        }
//        Toast.makeText(this, "再按一下退出", Toast.LENGTH_SHORT).show();
//        time = curr;
        mDialog = new MyAlertDialog(this);
        mDialog.setCanceledOnTouchOutside(true);
        mDialog.show();
    }


}
