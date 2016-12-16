package mobi.xiaowu.himalaya.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by xiaowu on 2016/12/14.
 */

public class ViewPagerDeadAdapter extends BaseViewPagerAdapter<ImageView> {
    public static final int MAX_SCROLL_VALUE = Integer.MAX_VALUE;
    private List<ImageView> mItems;

    public ViewPagerDeadAdapter(List<ImageView> items) {
        mItems = items;
    }

    @Override
    public int getCount() {
        if (mItems.size()>0) {
            return MAX_SCROLL_VALUE;
        }
        return 0;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        position %=mItems.size();
        Log.d("TAG", "instantiateItem: " + position);
        ImageView view = mItems.get(position);
//        ViewParent parent = view.getParent();
//        if (parent != null) {
//            ViewGroup parent1 = (ViewGroup) parent;
//            parent1.removeView(view);
//        }
        container.addView(view);
        return view;
    }

//    @Override
//    public void destroyItem(ViewGroup container, int position, Object object) {
//        container.removeView((ImageView)object);
//    }

//    @Override
//    public boolean isViewFromObject(View view, Object object) {
//
//        return view == object;
//    }

}
