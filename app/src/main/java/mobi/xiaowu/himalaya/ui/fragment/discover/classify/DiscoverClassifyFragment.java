package mobi.xiaowu.himalaya.ui.fragment.discover.classify;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.adapter.classify.ClassifyListAdapter;
import mobi.xiaowu.himalaya.api.DiscoverUrl;
import mobi.xiaowu.himalaya.model.discovery.classify.Classifys;
import mobi.xiaowu.himalaya.ui.fragment.BaseFragment;
import mobi.xiaowu.himalaya.utils.ImgAsync;
import mobi.xiaowu.himalaya.utils.JsonAsyncTask;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiscoverClassifyFragment extends BaseFragment {
    @BindView(R.id.classify_lv)
    public ListView lv;
    private List<Classifys.Classify[]> mList;
    private ClassifyListAdapter adapter;

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
        init();
        return view;
    }

    private void init() {
        mList = new ArrayList<>();
        adapter = new ClassifyListAdapter(mList,getContext());
        lv.setAdapter(adapter);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        new JsonAsyncTask(new JsonAsyncTask.Callback() {
            @Override
            public void sendData(byte[] json) {
                try {
                    Classifys classifys = new Gson().fromJson(new String(json, "utf-8"), Classifys.class);
                    List<Classifys.Classify> list = classifys.getList();
                    ImageView imageView = initHeadView(list);
                    lv.addHeaderView(imageView);
                    list.remove(0);
                    int i = list.size() / 2;
                    for (int j = 0; j < i; j++) {
                        Classifys.Classify[] classifies = {list.get(2 * j), list.get(2 * j + 1)};
                        mList.add(classifies);
                    }
                    adapter.notifyDataSetChanged();

                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }, getContext()).execute(DiscoverUrl.CLASSIFY_URL);
    }

    @NonNull
    private ImageView initHeadView(List<Classifys.Classify> list) {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        imageView.setTag(list.get(0).getCoverPath());
        new ImgAsync(imageView).execute(list.get(0).getCoverPath());
        return imageView;
    }
}
