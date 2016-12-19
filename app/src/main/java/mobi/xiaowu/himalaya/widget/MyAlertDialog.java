package mobi.xiaowu.himalaya.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mobi.xiaowu.himalaya.MainActivity;
import mobi.xiaowu.himalaya.R;

/**
 * Created by xiaowu on 2016/12/18.
 */

public class MyAlertDialog extends Dialog {
    @BindView(R.id.dialog_title)
    public TextView title;
    @BindView(R.id.dialog_confirm)
    public TextView confirm;

    private Context mContext;
    public MyAlertDialog(Context context) {
        super(context);
        mContext = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        View view = LayoutInflater.from(mContext).inflate(R.layout.dialog_back, null);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
         setContentView(view);
        ButterKnife.bind(this,view);
        title.setText("确定要退出吗？");
        confirm.setText("分手吧");
        Window dialogWindow = getWindow();
        WindowManager.LayoutParams params = dialogWindow.getAttributes();
//        DisplayMetrics displayMetrics = mContext.getResources().getDisplayMetrics();
//        params.width = (int) (displayMetrics.widthPixels * 0.8);
        dialogWindow.setAttributes(params);

    }

    @OnClick({R.id.dialog_cancel,R.id.dialog_home,R.id.dialog_confirm})
    public void click(View view){
        switch (view.getId()) {
            case R.id.dialog_cancel://取消
               dismiss();
                break;
            case R.id.dialog_home:
                dismiss();
                ((MainActivity) mContext).moveTaskToBack(false);
                break;
            case R.id.dialog_confirm:
                dismiss();
                ((MainActivity) mContext).finish();
                break;
        }
    }
}
