package mobi.xiaowu.himalaya.adapter.anchor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindViews;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.model.discovery.anchor.Anchors;
import mobi.xiaowu.himalaya.utils.ImgAsync;

/**
 * Created by xiaowu on 2016/12/19.
 */

public class ListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Anchors.AnchorList> list;
    private LayoutInflater mInflater;

    public ListAdapter(List<Anchors.AnchorList> list, Context context) {
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
        return list.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_anchor_body, null);
            convertView.setTag(new ViewHolder(convertView));
        }
        ViewHolder holder = (ViewHolder) convertView.getTag();
        holder.bindView(list.get(position), mContext);
        return convertView;
    }

    public static class ViewHolder {
        @BindViews({R.id.rec_item_title_tv, R.id.rec_item_more_tv, R.id.anchor_item_tv1, R.id.anchor_item_tv2, R.id.anchor_item_tv3, R.id.anchor_item_tv4, R.id.anchor_item_tv5, R.id.anchor_item_tv6})
        public TextView[] tvs;
        @BindViews({R.id.anchor_item_iv1, R.id.anchor_item_iv2, R.id.anchor_item_iv3})
        public ImageView[] ivs;

        ViewHolder(View v) {
            ButterKnife.bind(this, v);
        }

        void bindView(Anchors.AnchorList anchorList, final Context context) {
            List<Anchors.AnchorList.Anchor> list = anchorList.getList();
            if (list != null) {
                tvs[0].setText(anchorList.getTitle());
                tvs[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "更多", Toast.LENGTH_SHORT).show();
                    }
                });


                for (int i = 0; i < ivs.length; i++) {
                    tvs[2 + i].setText(list.get(i).getNickname());
                    tvs[2 + ivs.length + 1].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(context, "guanzhu", Toast.LENGTH_SHORT).show();
                        }
                    });
                    ivs[i].setTag(list.get(i).getSmallLogo());
                    new ImgAsync(ivs[i]).execute(list.get(i).getSmallLogo());
                }

            }
        }
    }
}
