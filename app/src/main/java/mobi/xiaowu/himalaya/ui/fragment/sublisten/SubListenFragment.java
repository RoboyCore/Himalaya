package mobi.xiaowu.himalaya.ui.fragment.sublisten;


import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.adapter.recommend.FragmentPagerAdapter;
import mobi.xiaowu.himalaya.ui.fragment.BaseFragment;
import mobi.xiaowu.himalaya.ui.fragment.downlisten.DownAlbumFragment;
import mobi.xiaowu.himalaya.ui.fragment.downlisten.DownSoundFragment;
import mobi.xiaowu.himalaya.ui.fragment.downlisten.DowningFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class SubListenFragment extends BaseFragment {
    @BindView(R.id.sub_listen_tab)
    public TabLayout tab;
    @BindView(R.id.sub_listen_vp)
    public ViewPager vp;
    private List<BaseFragment> mFragmentList;
    private FragmentPagerAdapter mAdapter;

    public SubListenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sub_listener, container, false);
        ButterKnife.bind(this,view);
        init();
        return view;
    }

    private void init() {
        mFragmentList = new ArrayList<>();
        mFragmentList.add(new RecFragment());
        mFragmentList.add(new SubFragment());
        mFragmentList.add(new HistoryFragment());
        mAdapter = new FragmentPagerAdapter(getActivity().getSupportFragmentManager(),mFragmentList);
        vp.setAdapter(mAdapter);
        tab.setupWithViewPager(vp);
        tab.setTabTextColors(Color.BLACK,Color.RED);
        tab.setSelectedTabIndicatorColor(Color.RED);

    }

    @Override
    public String getFragmentTitle() {
        return "订阅听";
    }
}
