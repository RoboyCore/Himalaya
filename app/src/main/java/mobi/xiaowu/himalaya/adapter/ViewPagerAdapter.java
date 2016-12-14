package mobi.xiaowu.himalaya.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

import mobi.xiaowu.himalaya.ui.fragment.BaseFragment;

/**
 * Created by xiaowu on 2016/12/14.
 */

public class ViewPagerAdapter extends PagerAdapter {
    private List<ImageView> mFragmentList;
    private Context mContext;

    public ViewPagerAdapter(List<ImageView> fragmentList, Context context) {
        mFragmentList = fragmentList;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
