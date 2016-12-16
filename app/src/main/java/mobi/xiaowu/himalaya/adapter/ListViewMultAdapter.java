package mobi.xiaowu.himalaya.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.model.Recommend;
import mobi.xiaowu.himalaya.model.recommend.Type;

/**
 * Created by xiaowu on 2016/12/15.
 */

public class ListViewMultAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mInflater;
    private List<Type> mList;

    public ListViewMultAdapter(Context context, List<Type> list) {
        mContext = context;
        mList = list;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getType();
    }

    @Override
    public int getViewTypeCount() {
        return 4;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Object o = mList.get(position);
//        if (o instanceof Recommend.EditorRecommendAlbums) {
//            if (convertView == null) {
//                convertView = mInflater.inflate(R.layout.fragment_discover_rec_editor,null);
//                convertView.setTag(new ViewHolderRec(convertView));
//            }
//            ViewHolderRec holderRec = (ViewHolderRec)convertView.getTag();
//            holderRec.bindData(rf,mContext,position);
//        }

        return convertView;
    }

    //小编推荐
    public static class ViewHolderRec {
        @BindViews({R.id.rec_item_title_tv, R.id.rec_item_more_tv, R.id.rec_item_content_tv, R.id.rec_item_content_tv2, R.id.rec_item_content_tv3, R.id.rec_item_tag_tv, R.id.rec_item_tag_tv2, R.id.rec_item_tag_tv3})
        public TextView[] tvs;
        @BindViews({R.id.rec_item_content_iv, R.id.rec_item_content_iv2, R.id.rec_item_content_iv3})
        public ImageView[] ivs;
        @BindView(R.id.rec_item_title_ll)
        public LinearLayout ll;

        ViewHolderRec(View v) {
            ButterKnife.bind(this, v);
        }
//        void bindData(Recommend rf, final Context context, int position){
//
//            Recommend.EditorRecommendAlbums recommendAlbums = rf.getEditorRecommendAlbums();
//            tvs[0].setText(recommendAlbums.getTitle());
//            List<RecommendItem> list = recommendAlbums.getList();
//            tvs[2].setText(list.get(position).getTitle());
//            tvs[3].setText(list.get(position+1).getTitle());
//            tvs[4].setText(list.get(position+2).getTitle());
//            tvs[2].setText(list.get(position).getTitle());
//
//
//            ll.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(context, "二级页面", Toast.LENGTH_SHORT).show();
//                }
//            });
//        }
    }
}
