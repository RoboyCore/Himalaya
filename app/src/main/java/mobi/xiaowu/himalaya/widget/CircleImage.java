package mobi.xiaowu.himalaya.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by lx on 2016/12/8.
 */

public class CircleImage extends ImageView {
    private Paint paint;
    private BitmapShader bitmapShader;//图片的着色器
    private Matrix matrix;//图片缩放器

    public CircleImage(Context context) {
        this(context, null,0);
    }

    public CircleImage(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CircleImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    //初始化
    private void init() {
        paint=new Paint();
        paint.setAntiAlias(true);
//        bitmapShader=new BitmapShader();
        matrix=new Matrix();
    }

//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//        int w=MeasureSpec.getSize(widthMeasureSpec);
//        int h=MeasureSpec.getSize(heightMeasureSpec);
//        int wm=MeasureSpec.getMode(widthMeasureSpec);
//        int hm=MeasureSpec.getMode(heightMeasureSpec);
//
//        if(wm==MeasureSpec.AT_MOST)
//        {
//            w=100;
//        }
//        if(hm==MeasureSpec.AT_MOST)
//        {
//            h=100;
//        }
//        setMeasuredDimension(w,h);
//    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(getDrawable()!=null)
        {
            BitmapDrawable dw= (BitmapDrawable) getDrawable();
            Bitmap oldBitMap=dw.getBitmap();
            //实例化着色器
            bitmapShader=new BitmapShader(oldBitMap,
                    Shader.TileMode.CLAMP,Shader.TileMode.CLAMP);
            int lgh=Math.min(oldBitMap.getWidth(),
                    oldBitMap.getHeight());
            float scale=getWidth()*1.0f/lgh;
            //设置缩放比例，xy
            matrix.setScale(scale,scale);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);//设置画笔的着色器对象
            canvas.drawColor(Color.WHITE);
            //绘制圆形
            canvas.drawCircle(getWidth()/2,getHeight()/2,lgh/2,paint);
        }else {
            super.onDraw(canvas);
        }
    }

}
