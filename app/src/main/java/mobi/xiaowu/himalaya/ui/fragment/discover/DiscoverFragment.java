package mobi.xiaowu.himalaya.ui.fragment.discover;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.adapter.FragmentPagerAdapter;
import mobi.xiaowu.himalaya.model.main.DiscoverTitle;
import mobi.xiaowu.himalaya.ui.activity.SearchActivity;
import mobi.xiaowu.himalaya.ui.fragment.BaseFragment;
import mobi.xiaowu.himalaya.ui.fragment.discover.anchor.DiscoverAnchorFragment;
import mobi.xiaowu.himalaya.ui.fragment.discover.broadcast.DiscoverBroadFragment;
import mobi.xiaowu.himalaya.ui.fragment.discover.hotlist.DiscoverListFragment;
import mobi.xiaowu.himalaya.ui.fragment.discover.recommend.DiscoverRecFragment;
import mobi.xiaowu.himalaya.ui.fragment.discover.sort.DiscoverSortFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiscoverFragment extends BaseFragment implements View.OnClickListener {
    @BindView(R.id.discover_search)
    public ImageView searchIV;
    @BindView(R.id.discover_tool_bar)
    public Toolbar mToolbar;
    @BindView(R.id.discover_vp)
    public ViewPager vp;
    @BindView(R.id.discover_tab)
    public TabLayout tab;
    private List<BaseFragment> mFragmentList;
    private FragmentPagerAdapter mPagerAdapter;
    private List<DiscoverTitle.Tabs.Title> mTitles;
    private ScheduledThreadPoolExecutor mExecutor;

    public DiscoverFragment() {
        // Required empty public constructor
    }



    @Override
    public String getFragmentTitle() {
        return "发现";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_discover, container, false);
        ButterKnife.bind(this,view);
        init();
        return view;
    }

    private void init() {
        mTitles = new ArrayList<>();
        mExecutor = new ScheduledThreadPoolExecutor(3);
//        new JsonAsyncTask(new JsonAsyncTask.Callback() {
//            @Override
//            public void sendData(byte[] json) {
//                DiscoverTitle discoverTitle = new DiscoverTitle();
//                if (discoverTitle.getMsg().equals("成功")) {
//                    List<DiscoverTitle.Tabs.Title> titles = discoverTitle.getTabs().getList();
//                    mTitles.addAll(titles);
//                    DiscoverRecFragment recFragment = DiscoverRecFragment.getInstance(mTitles.get(0).getTitle());
//                    mFragmentList.add(recFragment);
//                }
//            }
//        },getContext()).executeOnExecutor(mExecutor, DiscoverUrl.DIS_TITLE_URL);
        searchIV.setOnClickListener(this);
        mFragmentList = new ArrayList<>();

        mFragmentList.add(new DiscoverRecFragment());
        mFragmentList.add(new DiscoverSortFragment());
        mFragmentList.add(new DiscoverBroadFragment());
        mFragmentList.add(new DiscoverListFragment());
        mFragmentList.add(new DiscoverAnchorFragment());
        mPagerAdapter = new FragmentPagerAdapter(getActivity().getSupportFragmentManager(),mFragmentList);
        vp.setAdapter(mPagerAdapter);
        vp.setOffscreenPageLimit(1);
        tab.setupWithViewPager(vp);
        tab.setSelectedTabIndicatorColor(Color.RED);
        tab.setTabTextColors(Color.BLACK,Color.RED);
        tab.setSelectedTabIndicatorHeight(3);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }


    @Override
    public void onClick(View v) {
       startActivity(new Intent(getActivity(), SearchActivity.class));
    }
}
