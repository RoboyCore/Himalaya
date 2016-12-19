package mobi.xiaowu.himalaya.adapter.recommend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindViews;
import butterknife.ButterKnife;
import mobi.xiaowu.himalaya.R;
import mobi.xiaowu.himalaya.model.discovery.recommend.EditorRecommendAlbums;
import mobi.xiaowu.himalaya.model.discovery.recommend.HotRecommends;
import mobi.xiaowu.himalaya.model.discovery.recommend.SpecialColumn;
import mobi.xiaowu.himalaya.model.discovery.recommend.Type;
import mobi.xiaowu.himalaya.utils.ImgAsync;

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
        switch (mList.get(position).getType()) {
            case 0://精品听单
                if (convertView == null) {
                    convertView = mInflater.inflate(R.layout.item_discover_rec_special,null);
                    convertView.setTag(new ViewHolderSpec(convertView));
                }
                ViewHolderSpec holderSpec = (ViewHolderSpec)convertView.getTag();
                holderSpec.bindData(mList.get(position),mContext);
                break;
            case 1://小编推荐
                if (convertView == null) {
                    convertView = mInflater.inflate(R.layout.item_discover_rec_editor,null);
                    convertView.setTag(new ViewHolderRec(convertView));
                }
                ViewHolderRec holderRec = (ViewHolderRec)convertView.getTag();
                holderRec.bindData(mList.get(position),mContext);
                break;
            case 2:
                break;
            case 3://听系列
                if (convertView == null) {
                    convertView = mInflater.inflate(R.layout.item_discover_rec_editor,null);
                    convertView.setTag(new ViewHolderListen(convertView));
                }
                ViewHolderListen holderListen = (ViewHolderListen) convertView.getTag();
                holderListen.bindData(mList.get(position),mContext);
                break;
        }
        return convertView;
    }

    //小编推荐
    public static class ViewHolderRec {
        @BindViews({R.id.rec_item_title_tv, R.id.rec_item_more_tv, R.id.rec_item_content_tv, R.id.rec_item_content_tv2, R.id.rec_item_content_tv3, R.id.rec_item_tag_tv, R.id.rec_item_tag_tv2, R.id.rec_item_tag_tv3})
        public TextView[] tvs;
        @BindViews({R.id.rec_item_content_iv, R.id.rec_item_content_iv2, R.id.rec_item_content_iv3})
        public ImageView[] ivs;


        ViewHolderRec(View v) {
            ButterKnife.bind(this, v);
        }
        void bindData(Type type, final Context context){
            List<EditorRecommendAlbums.EditorRec> list = type.getEditorRecs();
            tvs[0].setText(type.getTitle());
            tvs[2].setText(list.get(0).getTrackTitle());
            tvs[3].setText(list.get(1).getTrackTitle());
            tvs[4].setText(list.get(2).getTrackTitle());

            tvs[5].setText(list.get(0).getTitle());
            tvs[6].setText(list.get(1).getTitle());
            tvs[7].setText(list.get(2).getTitle());
            for (int i = 0; i < list.size(); i++) {
                ivs[i].setTag(list.get(i).getCoverMiddle());
                new ImgAsync(ivs[i]).execute(list.get(i).getCoverMiddle());
                ivs[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "当前" , Toast.LENGTH_SHORT).show();
                    }
                });
            }
            tvs[1].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "更多", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
    //精品听单
    public static class ViewHolderSpec {
        @BindViews({R.id.rec_item_title_tv, R.id.rec_item_more_tv, R.id.rec_item_content_tv, R.id.rec_item_content_tv2, R.id.rec_item_content_tv3,R.id.rec_item_content_tv4,R.id.rec_item_content_tv5,R.id.rec_item_content_tv6})
        public TextView[] tvs;
        @BindViews({R.id.rec_item_content_iv, R.id.rec_item_content_iv2})
        public ImageView[] ivs;
        @BindViews({R.id.rec_item_content_rl,R.id.rec_item_content_rl2})
        public RelativeLayout[] rls;

        ViewHolderSpec(View v) {
            ButterKnife.bind(this, v);
        }
        void bindData(Type type, final Context context){
            List<SpecialColumn.Special> list = type.getSpecials();
            tvs[0].setText(type.getTitle());
            if (list.size()==1) {
                rls[1].setVisibility(View.GONE);
            }
            if (list.size() == 2) {
                tvs[5].setText(list.get(1).getTitle());
                tvs[6].setText(list.get(1).getSubtitle());
                tvs[7].setText(list.get(1).getFootnote());
                ivs[1].setTag(list.get(1).getCoverPath());
                new ImgAsync(ivs[1]).execute(list.get(1).getCoverPath());
            }
            tvs[2].setText(list.get(0).getTitle());
            tvs[3].setText(list.get(0).getSubtitle());
            tvs[4].setText(list.get(0).getFootnote());
            ivs[0].setTag(list.get(0).getCoverPath());
            new ImgAsync(ivs[0]).execute(list.get(0).getCoverPath());

            rls[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "内容", Toast.LENGTH_SHORT).show();
                }
            });
            rls[1].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "内容", Toast.LENGTH_SHORT).show();
                }
            });
            tvs[1].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "更多", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
    //听系列
    public static class ViewHolderListen {
        @BindViews({R.id.rec_item_title_tv, R.id.rec_item_more_tv, R.id.rec_item_content_tv, R.id.rec_item_content_tv2, R.id.rec_item_content_tv3, R.id.rec_item_tag_tv, R.id.rec_item_tag_tv2, R.id.rec_item_tag_tv3})
        public TextView[] tvs;
        @BindViews({R.id.rec_item_content_iv, R.id.rec_item_content_iv2, R.id.rec_item_content_iv3})
        public ImageView[] ivs;


        ViewHolderListen(View v) {
            ButterKnife.bind(this, v);
        }
        void bindData(Type type, final Context context){
            List<HotRecommends.Listen.ListenItem> list = type.getListen();
            tvs[0].setText(type.getTitle());
            tvs[2].setText(list.get(0).getTrackTitle());
            tvs[3].setText(list.get(1).getTrackTitle());
            tvs[4].setText(list.get(2).getTrackTitle());

            tvs[5].setText(list.get(0).getTitle());
            tvs[6].setText(list.get(1).getTitle());
            tvs[7].setText(list.get(2).getTitle());
            for (int i = 0; i < list.size(); i++) {
                ivs[i].setTag(list.get(i).getCoverMiddle());
                new ImgAsync(ivs[i]).execute(list.get(i).getCoverMiddle());
                ivs[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "当前" , Toast.LENGTH_SHORT).show();
                    }
                });
            }
            tvs[1].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "更多", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}
