package mobi.xiaowu.himalaya.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by lx on 2016/12/9.
 * 防止BitMap过大出现OOM异常
 * 二次采样
 */

public class BitMapUtils {
    //二次采样
    public static Bitmap samplingBitMap(byte[] data, int width,int height)
    {
        //图片工厂参数对象
        BitmapFactory.Options options=new BitmapFactory.Options();
        //第一次，只采集宽高
        options.inJustDecodeBounds=true;//是否只采集边界，true:采集边界，flase:全采集
        //按照对应的参数信息进行图片的采集
        BitmapFactory.decodeByteArray(data,0,data.length,options);
        //获取图片的宽和高
        int bWidth=options.outWidth;//获取采集到的宽
        int bHeight=options.outHeight;//获取采集到的高
        int wSize=bWidth/width;//计算宽的压缩比例
        int hSize=bHeight/height;//计算高的压缩比例
        //设置压缩比例
        options.inSampleSize=wSize>hSize?wSize:hSize;
//        options.inSampleSize=16;
//        if(data.length>3*1024*1024)
//        {
//            options.inSampleSize=data.length/(3*1024*1024);
//        }
        options.inJustDecodeBounds=false;//采集内容
        //第二次采集
        return BitmapFactory.decodeByteArray(data,0,data.length,options);


    }
}
