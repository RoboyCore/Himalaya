package mobi.xiaowu.himalaya.ui.fragment.discover.recommend;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindViews;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.model.discovery.recommend.DiscoveryColumns;
import mobi.xiaowu.himalaya.ui.fragment.BaseFragment;
import mobi.xiaowu.himalaya.utils.ImgAsync;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecTopFragment extends BaseFragment {
    public static int type = 0;
    @BindViews({R.id.rec_item_tv,R.id.rec_item_tv2,R.id.rec_item_tv3,R.id.rec_item_tv4})
    public TextView[] tvs;
    @BindViews({R.id.rec_item_iv,R.id.rec_item_iv2,R.id.rec_item_iv3,R.id.rec_item_iv4})
    public ImageView[] ivs;

    public static RecTopFragment getInstance(Bundle bundle){

        RecTopFragment fragment = new RecTopFragment();
        fragment.setArguments(bundle);
        return fragment;
    }


    public RecTopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rec_top, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        DiscoveryColumns data = getArguments().getParcelable("data");
        List<DiscoveryColumns.DiscoverColumn> list = data.getList();
        System.out.println(list.size());
        type++;
        switch (type) {
            case 1:
                for (int i = 0; i < tvs.length; i++) {
                    tvs[i].setText(list.get(i).getTitle());
                    ivs[i].setTag(list.get(i).getCoverPath());
                    new ImgAsync(ivs[i]).execute(list.get(i).getCoverPath());
//                    String url = list.get(i).getUrl();
                    //TODO:执行二级接口
                }

                break;
            case 2:
                for (int i = 0; i < tvs.length; i++) {
                    tvs[i].setText(list.get(i+4).getTitle());
                    ivs[i].setTag(list.get(i+4).getCoverPath());
                    new ImgAsync(ivs[i]).execute(list.get(i+4).getCoverPath());
                }
                break;
        }

    }

    @Override
    public String getFragmentTitle() {
        return "";
    }
}
