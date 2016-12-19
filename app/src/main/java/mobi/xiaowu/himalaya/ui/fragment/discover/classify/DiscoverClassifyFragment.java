package mobi.xiaowu.himalaya.ui.fragment.discover.classify;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.adapter.classify.ClassifyListAdapter;
import mobi.xiaowu.himalaya.api.DiscoverUrl;
import mobi.xiaowu.himalaya.model.discovery.classify.Classifys;
import mobi.xiaowu.himalaya.ui.fragment.BaseFragment;
import mobi.xiaowu.himalaya.utils.JsonAsyncTask;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiscoverClassifyFragment extends BaseFragment {
    @BindView(R.id.classify_lv)
    public ListView lv;

    public DiscoverClassifyFragment() {
        // Required empty public constructor
    }

    @Override
    public String getFragmentTitle() {
        return "分类";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_discover_classify, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        new JsonAsyncTask(new JsonAsyncTask.Callback() {
//            @Override
//            public void sendData(byte[] json) {
//                try {
//                    Classifys classifys = new Gson().fromJson(new String(json, "utf-8"), Classifys.class);
//                    List<Classifys.Classify> list = classifys.getList();
//                    final ClassifyListAdapter adapter = new ClassifyListAdapter(list,getContext());
//                    lv.setAdapter(adapter);
//                    final GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
//                    gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
//                        @Override
//                        public int getSpanSize(int position) {
//                            return adapter.isHeader(position)? gridLayoutManager.getSpanCount():1;
//                        }
//                    });
//                    lv.
//                } catch (UnsupportedEncodingException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, getContext()).execute(DiscoverUrl.CLASSIFY_URL);
    }
}
