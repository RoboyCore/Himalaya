package mobi.xiaowu.himalaya.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by lx on 2016/12/9.
 * 尺寸转换工具类
 */

public class DimUtils {
    private static float get(Context context, int type, float c) {
        //将对应的值根据当前的屏幕信息转换为指定单位的值
        return TypedValue.applyDimension(type, c,
                context.getResources().getDisplayMetrics());
    }
    //dp-px
    public static float dpToPx(Context context, float c) {
        return get(context, TypedValue.COMPLEX_UNIT_PX, c);
    }

    //px-dp
    public static float pxToDp(Context context, float c) {
        return get(context, TypedValue.COMPLEX_UNIT_DIP, c);
    }
//px-->sp
    public static float pxToSp(Context context, float c) {
        return get(context, TypedValue.COMPLEX_UNIT_SP, c);
    }
//sp-->px
    public static float spToPx(Context context, float c) {
        return get(context, TypedValue.COMPLEX_UNIT_PX, c);
    }
//sp-->dp
    public static float spToDp(Context context, float c) {
        return get(context, TypedValue.COMPLEX_UNIT_DIP, c);
    }
//dp-->sp
    public static float dpToSp(Context context, float c) {
        return get(context, TypedValue.COMPLEX_UNIT_SP, c);
    }
}
