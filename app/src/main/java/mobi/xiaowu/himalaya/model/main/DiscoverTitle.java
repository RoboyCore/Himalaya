package mobi.xiaowu.himalaya.model.main;

import java.util.List;

/**
 * Created by xiaowu on 2016/12/14.
 */

public class DiscoverTitle {

    /**
     * ret : 0
     * msg : 成功
     * tabs : {"count":5,"first":0,"list":[{"title":"推荐","contentType":"recommend"},{"title":"分类","contentType":"category"},{"title":"广播","contentType":"live"},{"title":"榜单","contentType":"ranking"},{"title":"主播","contentType":"anchor"}]}
     */

    private int ret;
    private String msg;
    private Tabs tabs;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Tabs getTabs() {
        return tabs;
    }

    public void setTabs(Tabs tabs) {
        this.tabs = tabs;
    }

    public static class Tabs {
        /**
         * count : 5
         * first : 0
         * list : [{"title":"推荐","contentType":"recommend"},{"title":"分类","contentType":"category"},{"title":"广播","contentType":"live"},{"title":"榜单","contentType":"ranking"},{"title":"主播","contentType":"anchor"}]
         */

        private int count;
        private int first;
        private List<Title> list;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getFirst() {
            return first;
        }

        public void setFirst(int first) {
            this.first = first;
        }

        public List<Title> getList() {
            return list;
        }

        public void setList(List<Title> list) {
            this.list = list;
        }

        public static class Title {
            /**
             * title : 推荐
             * contentType : recommend
             */

            private String title;
            private String contentType;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContentType() {
                return contentType;
            }

            public void setContentType(String contentType) {
                this.contentType = contentType;
            }
        }
    }
}
