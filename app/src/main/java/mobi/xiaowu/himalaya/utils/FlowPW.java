package mobi.xiaowu.himalaya.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

import mobi.xiaowu.himalaya.ui.activity.PlayActivity;

/**
 * Created by xiaowu on 2016/12/20.
 */

public class FlowPW implements View.OnClickListener {

    private ImageView iv;
    private WindowManager mWindowManager;
    private static FlowPW sFlowPW;
    private Context mContext;

    private FlowPW(Context context){
        mContext = context;
    }
    public static FlowPW getInstance(Context context){
        synchronized (FlowPW.class){
            if (sFlowPW != null) {
                sFlowPW = new FlowPW(context);
            }
            return sFlowPW;
        }
    }
    public void removeWindow() {
        if (iv != null) {
            WindowManager windowManager = getWindowManager();
            windowManager.removeView(iv);
            iv = null;
        }
    }


    public void createIV(Context context, int imgResId){
        WindowManager windowManager = getWindowManager();
        if (iv == null) {
            iv = new ImageView(context);
            iv.setImageResource(imgResId);
            WindowManager.LayoutParams params = new WindowManager.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, 0, 0, PixelFormat.TRANSLUCENT);
            params.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL|
                    WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
            params.gravity = Gravity.CENTER_HORIZONTAL|Gravity.BOTTOM;
            iv.setClickable(true);
            iv.setOnClickListener(this);
            windowManager.addView(iv,params);
        }
    }
    private WindowManager getWindowManager(){

        if (mWindowManager == null) {
            mWindowManager = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
        }
        return mWindowManager;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(mContext, PlayActivity.class);
        mContext.startActivity(intent);
    }
}
