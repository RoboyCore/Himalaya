package mobi.xiaowu.himalaya.ui.fragment.downlisten;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.ui.fragment.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class DownAlbumFragment extends BaseFragment {


    public DownAlbumFragment() {
        // Required empty public constructor
    }

    @Override
    public String getFragmentTitle() {
        return "专辑";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_down_album, container, false);
    }

}
