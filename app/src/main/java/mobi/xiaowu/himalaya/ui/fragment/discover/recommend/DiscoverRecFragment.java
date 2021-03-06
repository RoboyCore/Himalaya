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
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.adapter.recommend.FragmentPagerAdapter;
import mobi.xiaowu.himalaya.adapter.recommend.ListViewMultAdapter;
import mobi.xiaowu.himalaya.adapter.recommend.ViewPagerDeadAdapter;
import mobi.xiaowu.himalaya.api.DiscoverUrl;
import mobi.xiaowu.himalaya.model.discovery.recommend.Recommend;
import mobi.xiaowu.himalaya.model.discovery.recommend.BottomAds;
import mobi.xiaowu.himalaya.model.discovery.recommend.DiscoveryColumns;
import mobi.xiaowu.himalaya.model.discovery.recommend.FocusImages;
import mobi.xiaowu.himalaya.model.discovery.recommend.HotRecommends;
import mobi.xiaowu.himalaya.model.discovery.recommend.Recommend2;
import mobi.xiaowu.himalaya.model.discovery.recommend.Type;
import mobi.xiaowu.himalaya.ui.fragment.BaseFragment;
import mobi.xiaowu.himalaya.utils.ImgAsync;
import mobi.xiaowu.himalaya.utils.JsonAsyncTask;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiscoverRecFragment extends BaseFragment implements ViewPager.OnPageChangeListener {

    @BindView(R.id.discover_rec_scroll)
    public ScrollView mScrollView;
    @BindView(R.id.discover_rec_vp)
    public ViewPager vpHead;
    @BindView(R.id.discover_rec_vp_dot)
    public LinearLayout dotLl;

    //第二个
    @BindView(R.id.discover_rec_vp_2)
    public ViewPager vpDiscover;
    @BindView(R.id.discover_rec_vp_dot_2)
    public LinearLayout dotLl2;

    //底部
//    @BindView(R.id.discover_rec_vp_3)
    public ViewPager vpBottom;
//    @BindView(R.id.discover_rec_vp_dot_3)
    public LinearLayout dotLlBottom;


    @BindView(R.id.discover_rec_lv)
    public ListView lv;
    private ListViewMultAdapter adapter;
    private List<Type> mList;

    private List<ImageView> mImageViewList;
    private List<ImageView> mImageViewListBottom;

    private List<BaseFragment> DiscoverList;
    private Handler mHandler;
    private int VP_INDEX;
    private FragmentPagerAdapter VPmAdapter;
    private ViewPagerDeadAdapter mPagerAdapter;
    private ViewPagerDeadAdapter mPagerAdapterBottom;

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
        ButterKnife.bind(this, view);
        init();
        return view;
    }

    private void init() {

        initVPList();
        initLVList();
        initVPBottomList();

    }


    private void initVPList() {

        mHandler = new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {
                if (msg.what == 0x110) {
                    int currentItem = vpHead.getCurrentItem();
                    vpHead.setCurrentItem(++currentItem);
                }else if (msg.what == 0x111) {
                    int currentItem2 = vpBottom.getCurrentItem();
                    vpBottom.setCurrentItem(++currentItem2);
                }
                return true;
            }
        });


        mImageViewList = new ArrayList<>();
        mPagerAdapter = new ViewPagerDeadAdapter(mImageViewList);

        vpHead.setAdapter(mPagerAdapter);
        VP_INDEX = mPagerAdapter.getCount() / 2;
        vpHead.setCurrentItem(VP_INDEX);
        new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        Thread.sleep(3000);
                        mHandler.sendEmptyMessage(0x110);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        vpHead.addOnPageChangeListener(this);

    }

    private void initVPBottomList() {
            mImageViewListBottom = new ArrayList<>();
            mPagerAdapterBottom = new ViewPagerDeadAdapter(mImageViewListBottom);

            vpBottom.setAdapter(mPagerAdapterBottom);
            VP_INDEX = mPagerAdapterBottom.getCount() / 2;
            vpBottom.setCurrentItem(VP_INDEX);
            new Thread() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            Thread.sleep(3000);
                            mHandler.sendEmptyMessage(0x111);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        vpBottom.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                for (int i = 0; i < dotLlBottom.getChildCount(); i++) {
                    dotLlBottom.getChildAt(i).setSelected(false);
                }
//                dotLlBottom.getChildAt(position % dotLlBottom.getChildCount()).setSelected(true);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void initLVList() {
        mList = new ArrayList<>();
        adapter = new ListViewMultAdapter(getContext(), mList);
        View bottom = View.inflate(getContext(), R.layout.item_rec_bottom, null);
         vpBottom = (ViewPager) bottom.findViewById(R.id.discover_rec_vp_3);
        dotLlBottom = (LinearLayout) bottom.findViewById(R.id.discover_rec_vp_dot_3);
        lv.addFooterView(bottom);
        lv.setAdapter(adapter);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        loadData();
    }
    private void Vpager(Object recommend) {
        if (recommend instanceof Recommend) {

            List<FocusImages.Page> list = ((Recommend) recommend).getFocusImages().getList();
            List<Integer> imgs = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {

                imgs.add(R.mipmap.image_default_606);
                DrawDot();


                //动态生成图片对象
                ImageView iv = new ImageView(getContext());
                iv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                iv.setImageResource(imgs.get(i));
                iv.setScaleType(ImageView.ScaleType.FIT_XY);
                mImageViewList.add(iv);
                mPagerAdapter.notifyDataSetChanged();

                ImageView imageView = mImageViewList.get(i);
                String pic = list.get(i).getPic();
                System.out.println("pic = " + pic);
                imageView.setTag(pic);
                final int finalI = i;
                new ImgAsync(imageView).execute(pic);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getContext(), String.format(Locale.CHINA, "当前%3d页", finalI), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }else {
            List<BottomAds.DataBean> list = ((BottomAds) recommend).getData();
            List<Integer> imgs = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {

                imgs.add(R.mipmap.image_default_606);
                DrawDot();


                //动态生成图片对象
                ImageView iv = new ImageView(getContext());
                iv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                iv.setImageResource(imgs.get(i));
                iv.setScaleType(ImageView.ScaleType.FIT_XY);
                mImageViewListBottom.add(iv);
                mPagerAdapterBottom.notifyDataSetChanged();

                ImageView imageView = mImageViewList.get(i);
                String pic = list.get(i).getCover();
                System.out.println("pic = " + pic);
                imageView.setTag(pic);
                final int finalI = i;
                new ImgAsync(imageView).execute(pic);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getContext(), String.format(Locale.CHINA, "当前%3d页", finalI), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }
    }

    private void DrawDot() {
        //画点
        View view = new View(getActivity());
        view.setLayoutParams(new ViewGroup.LayoutParams(15, 15));
        view.setBackgroundResource(R.drawable.icon_dot_selector);
        dotLl.addView(view);
    }

    private void loadData() {
        //第一部分
        new JsonAsyncTask(new JsonAsyncTask.Callback() {
            @Override
            public void sendData(byte[] json) {
                try {
                    Recommend recommend = new Gson().fromJson(new String(json, "utf-8"), Recommend.class);
                    Vpager(recommend);
                    //top
                    DiscoveryColumns discoveryColumns = recommend.getDiscoveryColumns();

                    DiscoverList = new ArrayList<>();
                    VPmAdapter = new FragmentPagerAdapter(getFragmentManager(), DiscoverList);

                    Bundle bundle = new Bundle();
                    bundle.putParcelable("data", discoveryColumns);

                    DiscoverList.add(RecTopFragment.getInstance(bundle));
                    DiscoverList.add(RecTopFragment.getInstance(bundle));
                    for (int i = 0; i < 2; i++) {
                            //画点
                            View view = new View(getActivity());
                            view.setLayoutParams(new ViewGroup.LayoutParams(15, 15));
                            view.setBackgroundResource(R.drawable.icon_dot_selector);
                            dotLl2.addView(view);
                    }
                    vpDiscover.setAdapter(VPmAdapter);
                    vpDiscover.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                        @Override
                        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                        }

                        @Override
                        public void onPageSelected(int position) {
                            for (int i = 0; i < dotLl2.getChildCount(); i++) {
                                dotLl2.getChildAt(i).setSelected(false);
                            }
                            dotLl2.getChildAt(position % dotLl2.getChildCount()).setSelected(true);
                        }

                        @Override
                        public void onPageScrollStateChanged(int state) {

                        }
                    });

                    //小编推荐1
                    Type type1 = new Type();
                    type1.setType(1);
                    type1.setTitle(recommend.getEditorRecommendAlbums().getTitle());
                    type1.setEditorRecs(recommend.getEditorRecommendAlbums().getList());
                    mList.add(type1);

                    //精品听单0
                    Type type0 = new Type();
                    type0.setType(0);
                    type0.setTitle(recommend.getSpecialColumn().getTitle());
                    type0.setSpecials(recommend.getSpecialColumn().getList());
                    mList.add(type0);

                    adapter.notifyDataSetChanged();
                } catch (UnsupportedEncodingException e)
                {
                    e.printStackTrace();
                }
            }
        }, getContext()).execute(DiscoverUrl.REC_VP_URL);
        //第二部分
        new JsonAsyncTask(new JsonAsyncTask.Callback() {
            @Override
            public void sendData(byte[] json) {
                try {
                    Recommend2 recommend2 = new Gson().fromJson(new String(json, "utf-8"), Recommend2.class);
                    List<HotRecommends.Listen> list = recommend2.getHotRecommends().getList();
                    for (int i = 0; i < list.size(); i++) {
                        Type type = new Type();
                        type.setType(3);
                        type.setTitle(list.get(i).getTitle());
                        type.setListen(list.get(i).getList());
                        mList.add(type);
                    }
                    adapter.notifyDataSetChanged();
                    mScrollView.smoothScrollTo(0,0);

                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        },getContext()).execute(DiscoverUrl.REC_HOTANDGUESS_URL);

        //底下轮播
        new JsonAsyncTask(new JsonAsyncTask.Callback() {
            @Override
            public void sendData(byte[] json) {
                try {
                    BottomAds bottomAds = new Gson().fromJson(new String(json, "utf-8"), BottomAds.class);
                    Vpager(bottomAds);
                    adapter.notifyDataSetChanged();
//                    lv.addFooterView();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        },getContext()).execute(DiscoverUrl.ADS_BOTTOM);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        for (int i = 0; i < dotLl.getChildCount(); i++) {
            dotLl.getChildAt(i).setSelected(false);
        }
        dotLl.getChildAt(position % dotLl.getChildCount()).setSelected(true);
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
