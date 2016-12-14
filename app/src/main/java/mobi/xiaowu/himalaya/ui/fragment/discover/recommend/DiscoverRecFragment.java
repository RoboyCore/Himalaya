package mobi.xiaowu.himalaya.ui.fragment.discover.recommend;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.adapter.ViewPagerAdapter;
import mobi.xiaowu.himalaya.api.DiscoverUrl;
import mobi.xiaowu.himalaya.model.DiscoverTitle;
import mobi.xiaowu.himalaya.ui.fragment.BaseFragment;
import mobi.xiaowu.himalaya.utils.JsonAsyncTask;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiscoverRecFragment extends BaseFragment {

    @BindView(R.id.discover_rec_vp)
    public ViewPager vp;
    @BindView(R.id.discover_rec_vp_dot)
    public LinearLayout ll;
    private ViewPagerAdapter mPagerAdapter;
    private ImageView[] iv;

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

//        mPagerAdapter = new ViewPagerAdapter(,getContext());
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(10,10));
        view.setBackgroundResource(R.drawable.icon_dot_selector);
        ll.addView(view);
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

            }
        },getContext()).execute(DiscoverUrl.REC_VP_URL);
    }
}
