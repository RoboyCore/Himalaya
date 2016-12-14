package mobi.xiaowu.himalaya.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by xiaowu on 2016/11/8.
 */

public class ImgAsync extends AsyncTask<String, Integer, Bitmap> {
    private ImageView iv;
    private String url;
    // private ProgressBar progressBar;

    public ImgAsync(ImageView imageView) {
        this.iv = imageView;


    }

    public String getUrl() {
        return url;
    }

    @Override
    protected Bitmap doInBackground(String... strings) {
        url = strings[0];
        byte[] bytes = HttpUtils.UrlConnection(strings[0]);
        if (bytes != null) {
            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        }
        return null;
    }

    @Override
    protected void onPostExecute(Bitmap bitmaps) {
        super.onPostExecute(bitmaps);
        if (bitmaps != null  && url.equals(iv.getTag())) {

            iv.setImageBitmap(bitmaps);
        } else {
            Log.d("TAG", "图片加载失败");
        }
    }


}
