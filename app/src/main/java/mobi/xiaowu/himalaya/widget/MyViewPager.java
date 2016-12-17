package mobi.xiaowu.himalaya.widget;

import android.content.Context;
import android.graphics.PointF;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by xiaowu on 2016/12/15.
 */

public class MyViewPager extends ViewPager {
    private PointF curr, down;

    public MyViewPager(Context context) {
        super(context);
    }

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    //子控件处理滑动冲突
//    @Override
//    public boolean onTouchEvent(MotionEvent ev) {
//        curr.x =  ev.getX();
//        curr.y =  ev.getY();
//        switch (ev.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                down.x=ev.getX();
//                down.y=ev.getY();
//            case MotionEvent.ACTION_MOVE:
//                getParent().requestDisallowInterceptTouchEvent(true);
//                break;
//            case MotionEvent.ACTION_CANCEL:
//            case MotionEvent.ACTION_UP:
//                getParent().requestDisallowInterceptTouchEvent(false);
//                if(curr.x==down.x && curr.y==down.y)
//                {
//                    return  true;
//                }
//                break;
//        }
//        return super.onTouchEvent(ev);
//    }

    //作为父控件，给子控件是否滚动
    @Override
    protected boolean canScroll(View v, boolean checkV, int dx, int x, int y) {
        if (v != this && v instanceof ViewPager) {

            return true;
        }
        return super.canScroll(v, checkV, dx, x, y);
    }
}
