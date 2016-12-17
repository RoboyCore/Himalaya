package mobi.xiaowu.himalaya.model.recommend;

import java.util.List;

/**
 * Created by xiaowu on 2016/12/16.
 */

public class SpecialColumn {
    /**
     * ret : 0
     * title : 精品听单
     * hasMore : true
     * list : [{"columnType":1,"specialId":843,"title":"你的心情颜色知道！想趣就去！","subtitle":"你的心情颜色知道，可当心情琢磨不透，怎么办？\r\n\r\n现在一次过满足你所有选择，看见什么听什么！东风风神AX5陪你寻找乐趣，想趣就去！","footnote":"3首声音","coverPath":"http://fdfs.xmcdn.com/group24/M0A/C1/76/wKgJNVhRDH6jmKPaAABJiwtV6n0744_mobile_small.jpg","contentType":"2"}]
     */

    private int ret;
    private String title;
    private boolean hasMore;
    private List<Special> list;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public List<Special> getList() {
        return list;
    }

    public void setList(List<Special> list) {
        this.list = list;
    }

    public static class Special {
        /**
         * columnType : 1
         * specialId : 843
         * title : 你的心情颜色知道！想趣就去！
         * subtitle : 你的心情颜色知道，可当心情琢磨不透，怎么办？

         现在一次过满足你所有选择，看见什么听什么！东风风神AX5陪你寻找乐趣，想趣就去！
         * footnote : 3首声音
         * coverPath : http://fdfs.xmcdn.com/group24/M0A/C1/76/wKgJNVhRDH6jmKPaAABJiwtV6n0744_mobile_small.jpg
         * contentType : 2
         */
        private int columnType;
        private int specialId;
        private String title;
        private String subtitle;
        private String footnote;
        private String coverPath;
        private String contentType;



        public int getColumnType() {
            return columnType;
        }

        public void setColumnType(int columnType) {
            this.columnType = columnType;
        }

        public int getSpecialId() {
            return specialId;
        }

        public void setSpecialId(int specialId) {
            this.specialId = specialId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getFootnote() {
            return footnote;
        }

        public void setFootnote(String footnote) {
            this.footnote = footnote;
        }

        public String getCoverPath() {
            return coverPath;
        }

        public void setCoverPath(String coverPath) {
            this.coverPath = coverPath;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }
    }
}