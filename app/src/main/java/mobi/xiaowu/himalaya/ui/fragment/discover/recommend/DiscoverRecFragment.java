package mobi.xiaowu.himalaya.ui.fragment.discover.recommend;


import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.adapter.ListViewMultAdapter;
import mobi.xiaowu.himalaya.adapter.ViewPagerDeadAdapter;
import mobi.xiaowu.himalaya.api.DiscoverUrl;
import mobi.xiaowu.himalaya.model.Recommend;
import mobi.xiaowu.himalaya.model.recommend.FocusImages;
import mobi.xiaowu.himalaya.model.recommend.Type;
import mobi.xiaowu.himalaya.ui.fragment.BaseFragment;
import mobi.xiaowu.himalaya.utils.ImgAsync;
import mobi.xiaowu.himalaya.utils.JsonAsyncTask;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiscoverRecFragment extends BaseFragment implements ViewPager.OnPageChangeListener {

    @BindView(R.id.discover_rec_vp)
    public ViewPager vpHead;
    @BindView(R.id.discover_rec_vp_dot)
    public LinearLayout ll;
    @BindView(R.id.discover_rec_lv)
    public ListView lv;
    private ListViewMultAdapter adapter;
    private List<Type> mList;

    private ViewPagerDeadAdapter mPagerAdapter;
    private List<Integer> imgs;
    private List<ImageView> mImageViewList;
    private Handler mHandler;
    private int VP_INDEX;

    //    public static DiscoverRecFragment getInstance(String title){
//        DiscoverRecFragment fragment = new DiscoverRecFragment();
//        Bundle bundle = new Bundle();
//        bundle.putString("title",title);
//        fragment.setArguments(bundle);
//        return fragment;
//    }
    public DiscoverRecFragment() {
        // Required empty public constructor
    }

    @Override
    public String getFragmentTitle() {
//        String title = getArguments().getString("title");
//        if (title != null) {
//            return title;
//        }
        return "推荐";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_discover_rec, container, false);
        ButterKnife.bind(this,view);
        init();
        return view;
    }

    private void init() {

        initVPList();
        mHandler = new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {
                if (msg.what == 0x110) {
                    int currentItem = vpHead.getCurrentItem();
                    vpHead.setCurrentItem(++currentItem);
                }
                return true;
            }
        });

        mPagerAdapter = new ViewPagerDeadAdapter(mImageViewList);
        for (int i = 0; i < 8; i++) {
            View view = new View(getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(15,15));
            view.setBackgroundResource(R.drawable.icon_dot_selector);
            ll.addView(view);
        }
        vpHead.setAdapter(mPagerAdapter);
        VP_INDEX = mPagerAdapter.getCount() / 2;
        vpHead.setCurrentItem(VP_INDEX);
        new Thread(){
            @Override
            public void run() {
                try {
                    while (true){
                        Thread.sleep(3000);
                        mHandler.sendEmptyMessage(0x110);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        vpHead.addOnPageChangeListener(this);
        mList = new ArrayList<>();
//        adapter = new ListViewMultAdapter(getContext(),mList);
//        lv.setAdapter(adapter);

    }
    private void initVPList(){
        imgs = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            imgs.add(R.mipmap.image_default_606);
        }
        mImageViewList = new ArrayList<>();
        for (Integer img : imgs) {
            ImageView iv = new ImageView(getContext());
            iv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            iv.setImageResource(img);
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            mImageViewList.add(iv);
        }

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        loadData();
    }

    private void loadData() {
        new JsonAsyncTask(new JsonAsyncTask.Callback() {
            @Override
            public void sendData(byte[] json) {
                try {
                    Recommend recommend = new Gson().fromJson(new String(json, "utf-8"), Recommend.class);
                    List<FocusImages.Page> list = recommend.getFocusImages().getList();
                    for (int i = 0; i < list.size(); i++) {
                        ImageView imageView = mImageViewList.get(i);
                        String pic = list.get(i).getPic();
                        System.out.println("pic = " + pic);
                        imageView.setTag(pic);
                        final int finalI = i;
                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getContext(), String.format(Locale.CHINA,"当前%3d页",finalI), Toast.LENGTH_SHORT).show();
                            }
                        });
                        new ImgAsync(imageView).execute(pic);
                    }
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        },getContext()).execute(DiscoverUrl.REC_VP_URL);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        for (int i = 0; i < ll.getChildCount(); i++) {
            ll.getChildAt(i).setSelected(false);
        }
        ll.getChildAt(position%ll.getChildCount()).setSelected(true);
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
