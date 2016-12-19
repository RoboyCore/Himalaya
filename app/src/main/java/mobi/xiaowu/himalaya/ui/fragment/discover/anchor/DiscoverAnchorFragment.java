package mobi.xiaowu.himalaya.ui.fragment.discover.anchor;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.adapter.anchor.ListAdapter;
import mobi.xiaowu.himalaya.api.DiscoverUrl;
import mobi.xiaowu.himalaya.model.discovery.anchor.Anchors;
import mobi.xiaowu.himalaya.ui.fragment.BaseFragment;
import mobi.xiaowu.himalaya.utils.JsonAsyncTask;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiscoverAnchorFragment extends BaseFragment implements AbsListView.OnScrollListener {
    private int Page = 1;
    @BindView(R.id.discover_anchor_lv)
    public ListView lv;
    private List<Anchors.AnchorList> list;
    private ListAdapter adapter;
    private boolean isRefresh;

    public DiscoverAnchorFragment() {
        // Required empty public constructor
    }

    @Override
    public String getFragmentTitle() {
        return "主播";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_discover_anchor, container, false);
        ButterKnife.bind(this,view);
        init();
        return view;
    }

    private void init() {
        list = new ArrayList<>();
        adapter = new ListAdapter(list,getContext());
        lv.setAdapter(adapter);

        lv.setOnScrollListener(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        loadData();
    }

    private void loadData() {
        if (Page<=3) {
            isRefresh = false;
            new JsonAsyncTask(new JsonAsyncTask.Callback() {
                @Override
                public void sendData(byte[] json) {
                    try {
                        Anchors anchors = new Gson().fromJson(new String(json, "utf-8"), Anchors.class);
                        list.addAll(anchors.getList());
                        adapter.notifyDataSetChanged();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            },getContext()).execute(DiscoverUrl.ANCHOR_URL_NO_PAGE+Page);
            Page++;
            System.out.println("Page = " + Page);
        }else {
            TextView tv = new TextView(getContext());
            tv.setText("正在加载...");
            tv.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL);
            lv.addFooterView(tv);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        if (isRefresh && scrollState== SCROLL_STATE_IDLE) {
                loadData();
        }
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            isRefresh = (firstVisibleItem + visibleItemCount) == totalItemCount;
    }

    @Override
    public void onPause() {

        super.onPause();
    }

    @Override
    public void onDestroy() {
        Page = 0;
        super.onDestroy();
    }
}
