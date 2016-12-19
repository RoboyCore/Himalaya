package mobi.xiaowu.himalaya.adapter.classify;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import mobi.xiaowu.himalaya.model.discovery.classify.Classifys;

/**
 * Created by xiaowu on 2016/12/18.
 */

public class ClassifyListAdapter extends BaseAdapter {
    private Context mContext;
    private List<Classifys.Classify> list;

    public ClassifyListAdapter(List<Classifys.Classify> list, Context context) {
        this.list = list;
        mContext = context;
    }
    public boolean isHeader(int position){
        return  position == 0;
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

        return convertView;
    }
}
