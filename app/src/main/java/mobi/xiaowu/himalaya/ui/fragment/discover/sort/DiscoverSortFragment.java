package mobi.xiaowu.himalaya.ui.fragment.discover.sort;


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
public class DiscoverSortFragment extends BaseFragment {


    public DiscoverSortFragment() {
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
        return inflater.inflate(R.layout.fragment_discover_sort, container, false);
    }

}
