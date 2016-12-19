package mobi.xiaowu.himalaya.adapter.classify;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.model.discovery.classify.Classifys;
import mobi.xiaowu.himalaya.utils.ImgAsync;

/**
 * Created by xiaowu on 2016/12/18.
 */

public class ClassifyListAdapter extends BaseAdapter {
    private Context mContext;
    private List<Classifys.Classify[]> list;
    private LayoutInflater mInflater;

    public ClassifyListAdapter(List<Classifys.Classify[]> list, Context context) {
        this.list = list;
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_dis_classify_grid_layout,null);
            convertView.setTag(new ViewHolder(convertView));
        }
        ViewHolder holder = (ViewHolder)convertView.getTag();
        holder.bindView(list.get(position),mContext,position);
        return convertView;
    }

    public static class ViewHolder{
        @BindViews({R.id.item_classify_tv,R.id.item_classify_tv2,R.id.item_classify_divide})
        public TextView[] tvs;
        @BindViews({R.id.item_classify_iv,R.id.item_classify_iv2})
        public ImageView[] ivs;
        ViewHolder(View v){
            ButterKnife.bind(this,v);
        }
        void bindView(Classifys.Classify[] classify, final Context context, int position){
            for (int i = 0; i < classify.length; i++) {
                tvs[i].setText(classify[i].getTitle());
                ivs[i].setTag(classify[i].getCoverPath());
                new ImgAsync(ivs[i]).execute(classify[i].getCoverPath());
                ivs[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "点击", Toast.LENGTH_SHORT).show();
                    }
                });
//                if (position % 3 != 0) {
                    tvs[2].setVisibility(View.GONE);
//                }
            }
        }
    }
}
