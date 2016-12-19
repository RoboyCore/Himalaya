package mobi.xiaowu.himalaya.ui.fragment.downlisten;


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

/**
 * A simple {@link Fragment} subclass.
 */
public class DownListenFragment extends BaseFragment {

    @BindView(R.id.down_listen_tab)
    public TabLayout tab;
    @BindView(R.id.down_listen_vp)
    public ViewPager vp;
    private List<BaseFragment> mFragmentList;
    private FragmentPagerAdapter mAdapter;

    public DownListenFragment() {
        // Required empty public constructor
    }


    @Override
    public String getFragmentTitle() {
        return "订阅听";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_down_listen, container, false);
        ButterKnife.bind(this,view);
        init();
        return view;
    }

    private void init() {
        mFragmentList = new ArrayList<>();
        mFragmentList.add(new DownAlbumFragment());
        mFragmentList.add(new DownSoundFragment());
        mFragmentList.add(new DowningFragment());
        mAdapter = new FragmentPagerAdapter(getActivity().getSupportFragmentManager(),mFragmentList);
        vp.setAdapter(mAdapter);
        tab.setupWithViewPager(vp);
        tab.setTabTextColors(Color.BLACK,Color.RED);
        tab.setSelectedTabIndicatorColor(Color.RED);

    }
}
