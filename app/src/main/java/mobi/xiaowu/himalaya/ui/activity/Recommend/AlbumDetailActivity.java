package mobi.xiaowu.himalaya.ui.activity.Recommend;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.adapter.recommend.FragmentPagerAdapter;
import mobi.xiaowu.himalaya.api.DiscoverUrl;
import mobi.xiaowu.himalaya.model.discovery.recommend.DetailAlbum;
import mobi.xiaowu.himalaya.ui.fragment.BaseFragment;
import mobi.xiaowu.himalaya.ui.fragment.discover.recommend.AlbumDetailFragment;
import mobi.xiaowu.himalaya.ui.fragment.discover.recommend.AlbumProgramFragment;
import mobi.xiaowu.himalaya.utils.ImgAsync;
import mobi.xiaowu.himalaya.utils.JsonAsyncTask;

public class AlbumDetailActivity extends AppCompatActivity {
    @BindViews({R.id.detail_title_tv, R.id.detail_subscribe, R.id.detail_more_tv, R.id.detail_tv, R.id.detail_tv2, R.id.detail_tv3, R.id.detail_tv4})
    public TextView[] tvs;
    @BindViews({R.id.detail_more_iv,R.id.detail_iv})
    public ImageView[] ivs;
    @BindView(R.id.layout_no_net)
    public RelativeLayout rl;

    @BindView(R.id.layout_have_net)
    public ScrollView mScrollView;
    @BindView(R.id.detail_tab)
    public TabLayout tab;
    @BindView(R.id.detail_vp)
    public ViewPager vp;
    private FragmentPagerAdapter adapter;
    private List<BaseFragment> list;
    private AlbumProgramFragment AlbumProgramFragment;
    private AlbumDetailFragment mAlbumDetailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);
        ButterKnife.bind(this);
        init();
        loadData();
    }

    private void init() {
//        registerForContextMenu(ivs);
        mScrollView.setVisibility(View.GONE);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
////        new MenuBuilder(this).setOptionalIconsVisible(true);
//        getMenuInflater().inflate(R.menu.album_title_more, menu);
//        return true;
//    }
    //    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//
//        getMenuInflater().inflate(R.menu.album_title_more,menu);
//    }

//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.more_report:
//                Toast.makeText(this, "举报成功", Toast.LENGTH_SHORT).show();
//                break;
//        }
//        return super.onContextItemSelected(item);
//    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.more_report:
                Toast.makeText(this, "举报成功！", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void loadData() {
        final int albumId = getIntent().getIntExtra("albumId", 0);
        System.out.println("albumId = " + albumId);
        String s = DiscoverUrl.REC_LISTEN_DETAIL_URL + "albumId=" + albumId + "&device=android&isAsc=true&pageId=1&pageSize=20";
        System.out.println("s = " + s);
        new JsonAsyncTask(new JsonAsyncTask.Callback() {
            @Override
            public void sendData(byte[] json) {
                try {
                    DetailAlbum detailAlbum = new Gson().fromJson(new String(json, "utf-8"), DetailAlbum.class);
                    System.out.println(new String(json,"utf-8"));
                    DetailAlbum.Data.Album album = detailAlbum.getData().getAlbum();
                    tvs[3].setText(album.getTitle());
                    tvs[4].setText(album.getNickname());
                    tvs[5].setText(album.getPlayTimes() > 10000 ? album.getPlayTimes() / 10000 + "万次" : album.getPlayTimes() + "次");
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd更新", Locale.CHINA);
                    tvs[6].setText(format.format(new Date(album.getLastUptrackAt())));
                    tvs[0].setText("专辑详情");
                    tvs[2].setText("已经加载完毕");
                    ivs[1].setTag(album.getCoverLarge());
                    new ImgAsync(ivs[1]).execute(album.getCoverLarge());
                    initVP(album);
                    AlbumProgramFragment.setFragmentTitle("节目("+album.getTracks()+")");
                    adapter.notifyDataSetChanged();

                    rl.setVisibility(View.GONE);
                    mScrollView.setVisibility(View.VISIBLE);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }, this).execute(s);

    }

    private void initVP(DetailAlbum.Data.Album album) {
        list = new ArrayList<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("data",album);
        mAlbumDetailFragment = AlbumDetailFragment.getInstance(bundle);
        AlbumProgramFragment = new AlbumProgramFragment();
        list.add(mAlbumDetailFragment);
        list.add(AlbumProgramFragment);
        adapter = new FragmentPagerAdapter(getSupportFragmentManager(), list);
        vp.setAdapter(adapter);
        tab.setupWithViewPager(vp);
        tab.setSelectedTabIndicatorColor(Color.RED);
        tab.setTabTextColors(Color.BLACK, Color.RED);
        tab.setSelectedTabIndicatorHeight(3);
    }

    @OnClick({R.id.no_net_tv, R.id.detail_back_iv, R.id.detail_share_iv, R.id.detail_more_iv})
    public void click(View view) {
        switch (view.getId()) {
            case R.id.no_net_tv:
                loadData();
                break;
            case R.id.detail_back_iv:
                finish();
                break;
            case R.id.detail_share_iv:
                Toast.makeText(this, "分享成功", Toast.LENGTH_SHORT).show();
                break;
            case R.id.detail_more_iv:
                final PopupMenu popupMenu = new PopupMenu(this, ivs[0], Gravity.BOTTOM);
                getMenuInflater().inflate(R.menu.album_title_more, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.more_report:
                                Toast.makeText(AlbumDetailActivity.this, "举报成功", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        popupMenu.dismiss();
                        return true;
                    }
                });
                popupMenu.show();
                break;
            case R.id.detail_subscribe:
                if (tvs[1].getText().equals("已订阅")) {
                    tvs[1].setText("订阅专辑");
                } else {
                    tvs[1].setText("已订阅");
                }
                break;
        }
    }
}
