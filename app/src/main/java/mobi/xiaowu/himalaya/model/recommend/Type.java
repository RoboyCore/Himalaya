package mobi.xiaowu.himalaya.model.recommend;

import java.util.List;

/**
 * Created by xiaowu on 2016/12/16.
 */

public class Type {
    private int type;
    //0精品听单
    //1.小编推荐
    //2.猜你喜欢
    //3.听系列
    private String title;
    private List<SpecialColumn.Special> specials;//精品听单
    private List<EditorRecommendAlbums.EditorRec> editorRecs;//小编推荐




    public List<EditorRecommendAlbums.EditorRec> getEditorRecs() {
        return editorRecs;
    }

    public void setEditorRecs(List<EditorRecommendAlbums.EditorRec> editorRecs) {
        this.editorRecs = editorRecs;
    }

    public List<SpecialColumn.Special> getSpecials() {
        return specials;
    }

    public void setSpecials(List<SpecialColumn.Special> specials) {
        this.specials = specials;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
