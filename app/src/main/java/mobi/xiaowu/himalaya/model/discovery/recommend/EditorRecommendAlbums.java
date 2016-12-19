package mobi.xiaowu.himalaya.model.discovery.recommend;

import java.util.List;

/**
 * Created by xiaowu on 2016/12/16.
 */

public class EditorRecommendAlbums {
    /**
     * ret : 0
     * title : 小编推荐
     * hasMore : true
     * list : [{"id":236268,"albumId":236268,"uid":1716986,"intro":"除了老歌，还有很多","nickname":"李峙","albumCoverUrl290":"http://fdfs.xmcdn.com/group21/M08/66/B2/wKgJKFg3zXvimTYkAAF_CGkTvi4448_mobile_meduim.jpg","coverSmall":"http://fdfs.xmcdn.com/group21/M08/66/B2/wKgJKFg3zXvimTYkAAF_CGkTvi4448_mobile_small.jpg","coverMiddle":"http://fdfs.xmcdn.com/group21/M08/66/B2/wKgJKFg3zXvimTYkAAF_CGkTvi4448_mobile_meduim.jpg","coverLarge":"http://fdfs.xmcdn.com/group21/M08/66/B2/wKgJKFg3zXvimTYkAAF_CGkTvi4448_mobile_large.jpg","title":"李峙电台","tags":"电台,广播,音乐","tracks":351,"playsCounts":31772613,"isFinished":0,"serialState":0,"trackId":26845989,"trackTitle":"诗谱曲成歌,唱的是岁月和山河","provider":"man","isPaid":false,"commentsCount":0,"priceTypeId":0},{"id":2900377,"albumId":2900377,"uid":2818756,"intro":"穿越成家丁，创风采伟绩","nickname":"猛哥_FK","albumCoverUrl290":"http://fdfs.xmcdn.com/group21/M09/C0/0C/wKgJLVhQ29-xENIgAAIOzz5ZM5M084_mobile_meduim.jpg","coverSmall":"http://fdfs.xmcdn.com/group21/M09/C0/0C/wKgJLVhQ29-xENIgAAIOzz5ZM5M084_mobile_small.jpg","coverMiddle":"http://fdfs.xmcdn.com/group21/M09/C0/0C/wKgJLVhQ29-xENIgAAIOzz5ZM5M084_mobile_meduim.jpg","coverLarge":"http://fdfs.xmcdn.com/group21/M09/C0/0C/wKgJLVhQ29-xENIgAAIOzz5ZM5M084_mobile_large.jpg","title":"极品家丁","tags":"穿越,畅销书,武侠","tracks":549,"playsCounts":7004583,"isFinished":1,"serialState":1,"trackId":20780694,"trackTitle":"微博热搜前三,架空版《鹿鼎记》","provider":"man","isPaid":false,"commentsCount":0,"priceTypeId":0},{"id":4987500,"albumId":4987500,"uid":56364030,"intro":"《亭林听说》第18期《情书》","nickname":"亭林镇工作室","albumCoverUrl290":"http://fdfs.xmcdn.com/group19/M03/96/97/wKgJK1exi-bBDuQbAAJewfLCH5Q509_mobile_meduim.jpg","coverSmall":"http://fdfs.xmcdn.com/group19/M03/96/97/wKgJK1exi-bBDuQbAAJewfLCH5Q509_mobile_small.jpg","coverMiddle":"http://fdfs.xmcdn.com/group19/M03/96/97/wKgJK1exi-bBDuQbAAJewfLCH5Q509_mobile_meduim.jpg","coverLarge":"http://fdfs.xmcdn.com/group19/M03/96/97/wKgJK1exi-bBDuQbAAJewfLCH5Q509_mobile_large.jpg","title":"亭林·听说","tags":"","tracks":18,"playsCounts":208036,"isFinished":0,"serialState":0,"trackId":26879228,"trackTitle":"据说这些声音情书让韩寒都感动了","provider":"man","isPaid":false,"commentsCount":0,"priceTypeId":0}]
     */

    private int ret;
    private String title;
    private boolean hasMore;
    private List<EditorRec> list;

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

    public List<EditorRec> getList() {
        return list;
    }

    public void setList(List<EditorRec> list) {
        this.list = list;
    }

    public static class EditorRec {
        /**
         * id : 236268
         * albumId : 236268
         * uid : 1716986
         * intro : 除了老歌，还有很多
         * nickname : 李峙
         * albumCoverUrl290 : http://fdfs.xmcdn.com/group21/M08/66/B2/wKgJKFg3zXvimTYkAAF_CGkTvi4448_mobile_meduim.jpg
         * coverSmall : http://fdfs.xmcdn.com/group21/M08/66/B2/wKgJKFg3zXvimTYkAAF_CGkTvi4448_mobile_small.jpg
         * coverMiddle : http://fdfs.xmcdn.com/group21/M08/66/B2/wKgJKFg3zXvimTYkAAF_CGkTvi4448_mobile_meduim.jpg
         * coverLarge : http://fdfs.xmcdn.com/group21/M08/66/B2/wKgJKFg3zXvimTYkAAF_CGkTvi4448_mobile_large.jpg
         * title : 李峙电台
         * tags : 电台,广播,音乐
         * tracks : 351
         * playsCounts : 31772613
         * isFinished : 0
         * serialState : 0
         * trackId : 26845989
         * trackTitle : 诗谱曲成歌,唱的是岁月和山河
         * provider : man
         * isPaid : false
         * commentsCount : 0
         * priceTypeId : 0
         */
        private int id;
        private int albumId;
        private int uid;
        private String intro;
        private String nickname;
        private String albumCoverUrl290;
        private String coverSmall;
        private String coverMiddle;
        private String coverLarge;
        private String title;
        private String tags;
        private int tracks;
        private int playsCounts;
        private int isFinished;
        private int serialState;
        private int trackId;
        private String trackTitle;
        private String provider;
        private boolean isPaid;
        private int commentsCount;
        private int priceTypeId;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAlbumId() {
            return albumId;
        }

        public void setAlbumId(int albumId) {
            this.albumId = albumId;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public String getIntro() {
            return intro;
        }

        public void setIntro(String intro) {
            this.intro = intro;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getAlbumCoverUrl290() {
            return albumCoverUrl290;
        }

        public void setAlbumCoverUrl290(String albumCoverUrl290) {
            this.albumCoverUrl290 = albumCoverUrl290;
        }

        public String getCoverSmall() {
            return coverSmall;
        }

        public void setCoverSmall(String coverSmall) {
            this.coverSmall = coverSmall;
        }

        public String getCoverMiddle() {
            return coverMiddle;
        }

        public void setCoverMiddle(String coverMiddle) {
            this.coverMiddle = coverMiddle;
        }

        public String getCoverLarge() {
            return coverLarge;
        }

        public void setCoverLarge(String coverLarge) {
            this.coverLarge = coverLarge;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public int getTracks() {
            return tracks;
        }

        public void setTracks(int tracks) {
            this.tracks = tracks;
        }

        public int getPlaysCounts() {
            return playsCounts;
        }

        public void setPlaysCounts(int playsCounts) {
            this.playsCounts = playsCounts;
        }

        public int getIsFinished() {
            return isFinished;
        }

        public void setIsFinished(int isFinished) {
            this.isFinished = isFinished;
        }

        public int getSerialState() {
            return serialState;
        }

        public void setSerialState(int serialState) {
            this.serialState = serialState;
        }

        public int getTrackId() {
            return trackId;
        }

        public void setTrackId(int trackId) {
            this.trackId = trackId;
        }

        public String getTrackTitle() {
            return trackTitle;
        }

        public void setTrackTitle(String trackTitle) {
            this.trackTitle = trackTitle;
        }

        public String getProvider() {
            return provider;
        }

        public void setProvider(String provider) {
            this.provider = provider;
        }

        public boolean isIsPaid() {
            return isPaid;
        }

        public void setIsPaid(boolean isPaid) {
            this.isPaid = isPaid;
        }

        public int getCommentsCount() {
            return commentsCount;
        }

        public void setCommentsCount(int commentsCount) {
            this.commentsCount = commentsCount;
        }

        public int getPriceTypeId() {
            return priceTypeId;
        }

        public void setPriceTypeId(int priceTypeId) {
            this.priceTypeId = priceTypeId;
        }
    }
}