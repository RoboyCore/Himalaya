package mobi.xiaowu.himalaya;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.ui.fragment.discover.DiscoverFragment;
import mobi.xiaowu.himalaya.ui.fragment.downlisten.DownListenFragment;
import mobi.xiaowu.himalaya.ui.fragment.my.MyFragment;
import mobi.xiaowu.himalaya.ui.fragment.sublisten.SubListenFragment;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    @BindView(R.id.main_rg)
    public RadioGroup rg;
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        rg.check(0);
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
}
