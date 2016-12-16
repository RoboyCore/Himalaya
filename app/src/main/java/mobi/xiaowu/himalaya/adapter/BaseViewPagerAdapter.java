package mobi.xiaowu.himalaya.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by xiaowu on 2016/12/15.
 */

public class BaseViewPagerAdapter<T extends View> extends PagerAdapter {
    private List<T> mList;
    private Context mContext;

//    public BaseViewPagerAdapter(Context context, List<T> list) {
//        mContext = context;
//        mList = list;
//    }
//
//    public BaseViewPagerAdapter(List<T> list) {
//        mList = list;
//    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        T t = mList.get(position);
        container.addView(t);
        return t;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((T)object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
