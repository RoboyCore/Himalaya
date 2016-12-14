package mobi.xiaowu.himalaya.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

import mobi.xiaowu.himalaya.ui.fragment.BaseFragment;

/**
 * Created by xiaowu on 2016/12/14.
 */

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {
    private List<BaseFragment> list;

    public FragmentPagerAdapter(FragmentManager fm, List<BaseFragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position).getFragmentTitle();
    }
}
