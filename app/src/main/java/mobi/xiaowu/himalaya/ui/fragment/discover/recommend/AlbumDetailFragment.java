package mobi.xiaowu.himalaya.ui.fragment.discover.recommend;


import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.model.discovery.recommend.DetailAlbum;
import mobi.xiaowu.himalaya.ui.fragment.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlbumDetailFragment extends BaseFragment {
    @BindView(R.id.detail_vp_content)
    public TextView content;
    public AlbumDetailFragment() {
        // Required empty public constructor
    }
    public static AlbumDetailFragment getInstance(Bundle bundle){
        AlbumDetailFragment fragment = new AlbumDetailFragment();
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_album_detail, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        DetailAlbum.Data.Album data = getArguments().getParcelable("data");
        if (data != null) {
            content.setText(data.getIntroRich());
        }

    }

    @Override
    public String getFragmentTitle() {
        return "详情";
    }
}
