package mobi.xiaowu.himalaya.model.discovery.recommend;

import java.util.List;

/**
 * Created by xiaowu on 2016/12/16.
 */

public  class FocusImages {
    /**
     * ret : 0
     * list : [{"id":13099,"shortTitle":"混沌","longTitle":"混沌","pic":"http://fdfs.xmcdn.com/group23/M07/C5/E0/wKgJNFhSAYLi-KeNAALVKk43kAM558_android_large.jpg","type":2,"uid":48632294,"albumId":5593618,"isShare":true,"is_External_url":false,"focusCurrentId":0},{"id":13083,"shortTitle":"【首页】12个甜美系声音女神哄/你/睡/觉/了","longTitle":"【首页】12个甜美系声音女神哄/你/睡/觉/了","pic":"http://fdfs.xmcdn.com/group22/M07/C1/68/wKgJM1hRA7HAtpWeAAHgJFT8tsg274_android_large.jpg","type":9,"specialId":842,"subType":1,"isShare":true,"is_External_url":false,"focusCurrentId":0},{"id":13091,"shortTitle":"广告 1215 3","longTitle":"广告 1215 3","pic":"http://fdfs.xmcdn.com/group21/M04/C0/F1/wKgJKFhRDCDjS2YFAAF8-lH1doo926_android_large.jpg","type":10,"url":"http://stats.annalect.com.cn/dmp/click?e=HgL7V0n9Pw283ZbZegcAOJkpXvb.wNGcp&rd=http%3A%2F%2Fe.cn.miaozhen.com%2Fr%2Fk%3D2034550%26p%3D74B4j%26dx%3D__IPDX__%26rt%3D2%26ns%3D__IP__%26ni%3D__IESID__%26v%3D__LOC__%26xa%3D__ADPLATFORM__%26ro%3Dsm%26mo%3D__OS__%26m0%3D__OPENUDID__%26m0a%3D__DUID__%26m1%3D__ANDROIDID1__%26m1a%3D__ANDROIDID__%26m2%3D__IMEI__%26m4%3D__AAID__%26m5%3D__IDFA__%26m6%3D__MAC1__%26m6a%3D__MAC__%26vo%3D354b3e63e%26vr%3D2%26o%3Dhttp%253A%252F%252Fpeugeot.com.cn%252Fshowroom%252F308%252Fhome.html%253Futm_source%253Dximalaya%2526utm_medium%253D61%2526utm_campaign%253D201612_308","third_url":"http://stats.annalect.com.cn/dmp/t.gif?e=HgL7V0n9Pw283ZbZegcAOJkpXvb.wNGcp&rd=http%3A%2F%2Fg.cn.miaozhen.com%2Fx%2Fk%3D2034550%26p%3D74B4j%26dx%3D__IPDX__%26rt%3D2%26ns%3D__IP__%26ni%3D__IESID__%26v%3D__LOC__%26xa%3D__ADPLATFORM__%26mo%3D__OS__%26m0%3D__OPENUDID__%26m0a%3D__DUID__%26m1%3D__ANDROIDID1__%26m1a%3D__ANDROIDID__%26m2%3D__IMEI__%26m4%3D__AAID__%26m5%3D__IDFA__%26m6%3D__MAC1__%26m6a%3D__MAC__%26o%3D","isShare":true,"is_External_url":true,"focusCurrentId":0},{"id":13089,"shortTitle":"【首页】又双叒叕要抢票了！","longTitle":"【首页】又双叒叕要抢票了！","pic":"http://fdfs.xmcdn.com/group22/M05/C1/DE/wKgJLlhRCkPxjjxlAAde3i6HHjY763_android_large.jpg","type":2,"uid":30495264,"albumId":6161748,"isShare":true,"is_External_url":false,"focusCurrentId":0},{"id":13084,"shortTitle":"【首页】《西部世界》那些无序的混乱，我选择看到美好","longTitle":"【首页】《西部世界》那些无序的混乱，我选择看到美好","pic":"http://fdfs.xmcdn.com/group21/M09/C0/C0/wKgJKFhRA82wV4MsAAFSZ3HE680776_android_large.jpg","type":3,"uid":40763963,"trackId":26820159,"isShare":true,"is_External_url":false,"focusCurrentId":0},{"id":13092,"shortTitle":"硬件 1215","longTitle":"硬件 1215","pic":"http://fdfs.xmcdn.com/group22/M09/C1/BB/wKgJM1hREmqTYAxoAAFxzcvUuk4893_android_large.jpg","type":4,"url":"https://h5.koudaitong.com/v2/showcase/component?alias=1achp035i","isShare":true,"is_External_url":true,"focusCurrentId":0},{"id":13087,"shortTitle":"【首页】濮哥读美文","longTitle":"【首页】濮哥读美文","pic":"http://fdfs.xmcdn.com/group23/M07/C1/B1/wKgJL1hRBM7jIyLsAAGvw-j-y1I608_android_large.jpg","type":3,"uid":39623651,"trackId":26769274,"isShare":true,"is_External_url":false,"focusCurrentId":0},{"id":13085,"shortTitle":"【首页】和真正有才气的女人在一起","longTitle":"【首页】和真正有才气的女人在一起","pic":"http://fdfs.xmcdn.com/group24/M09/C1/4B/wKgJNVhRBIuhKJWKAAEm5rU0Kic945_android_large.jpg","type":3,"uid":20251158,"trackId":26830804,"isShare":true,"is_External_url":false,"focusCurrentId":0},{"id":13086,"shortTitle":"【首页】狼牙棒青年戚泽明：把爱好变成生意","longTitle":"【首页】狼牙棒青年戚泽明：把爱好变成生意","pic":"http://fdfs.xmcdn.com/group22/M00/C1/6F/wKgJM1hRBKbz8mLBAAG8sAGRqp4499_android_large.jpg","type":3,"uid":35413718,"trackId":25593043,"isShare":true,"is_External_url":false,"focusCurrentId":0}]
     * title : 焦点图
     */

    private int ret;
    private String title;
    private List<Page> list;

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

    public List<Page> getList() {
        return list;
    }

    public void setList(List<Page> list) {
        this.list = list;
    }

    public static class Page {
        /**
         * id : 13099
         * shortTitle : 混沌
         * longTitle : 混沌
         * pic : http://fdfs.xmcdn.com/group23/M07/C5/E0/wKgJNFhSAYLi-KeNAALVKk43kAM558_android_large.jpg
         * type : 2
         * uid : 48632294
         * albumId : 5593618
         * isShare : true
         * is_External_url : false
         * focusCurrentId : 0
         * specialId : 842
         * subType : 1
         * url : http://stats.annalect.com.cn/dmp/click?e=HgL7V0n9Pw283ZbZegcAOJkpXvb.wNGcp&rd=http%3A%2F%2Fe.cn.miaozhen.com%2Fr%2Fk%3D2034550%26p%3D74B4j%26dx%3D__IPDX__%26rt%3D2%26ns%3D__IP__%26ni%3D__IESID__%26v%3D__LOC__%26xa%3D__ADPLATFORM__%26ro%3Dsm%26mo%3D__OS__%26m0%3D__OPENUDID__%26m0a%3D__DUID__%26m1%3D__ANDROIDID1__%26m1a%3D__ANDROIDID__%26m2%3D__IMEI__%26m4%3D__AAID__%26m5%3D__IDFA__%26m6%3D__MAC1__%26m6a%3D__MAC__%26vo%3D354b3e63e%26vr%3D2%26o%3Dhttp%253A%252F%252Fpeugeot.com.cn%252Fshowroom%252F308%252Fhome.html%253Futm_source%253Dximalaya%2526utm_medium%253D61%2526utm_campaign%253D201612_308
         * third_url : http://stats.annalect.com.cn/dmp/t.gif?e=HgL7V0n9Pw283ZbZegcAOJkpXvb.wNGcp&rd=http%3A%2F%2Fg.cn.miaozhen.com%2Fx%2Fk%3D2034550%26p%3D74B4j%26dx%3D__IPDX__%26rt%3D2%26ns%3D__IP__%26ni%3D__IESID__%26v%3D__LOC__%26xa%3D__ADPLATFORM__%26mo%3D__OS__%26m0%3D__OPENUDID__%26m0a%3D__DUID__%26m1%3D__ANDROIDID1__%26m1a%3D__ANDROIDID__%26m2%3D__IMEI__%26m4%3D__AAID__%26m5%3D__IDFA__%26m6%3D__MAC1__%26m6a%3D__MAC__%26o%3D
         * trackId : 26820159
         */

        private int id;
        private String shortTitle;
        private String longTitle;
        private String pic;
        private int type;
        private int uid;
        private int albumId;
        private boolean isShare;
        private boolean is_External_url;
        private int focusCurrentId;
        private int specialId;
        private int subType;
        private String url;
        private String third_url;
        private int trackId;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getShortTitle() {
            return shortTitle;
        }

        public void setShortTitle(String shortTitle) {
            this.shortTitle = shortTitle;
        }

        public String getLongTitle() {
            return longTitle;
        }

        public void setLongTitle(String longTitle) {
            this.longTitle = longTitle;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public int getAlbumId() {
            return albumId;
        }

        public void setAlbumId(int albumId) {
            this.albumId = albumId;
        }

        public boolean isIsShare() {
            return isShare;
        }

        public void setIsShare(boolean isShare) {
            this.isShare = isShare;
        }

        public boolean isIs_External_url() {
            return is_External_url;
        }

        public void setIs_External_url(boolean is_External_url) {
            this.is_External_url = is_External_url;
        }

        public int getFocusCurrentId() {
            return focusCurrentId;
        }

        public void setFocusCurrentId(int focusCurrentId) {
            this.focusCurrentId = focusCurrentId;
        }

        public int getSpecialId() {
            return specialId;
        }

        public void setSpecialId(int specialId) {
            this.specialId = specialId;
        }

        public int getSubType() {
            return subType;
        }

        public void setSubType(int subType) {
            this.subType = subType;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getThird_url() {
            return third_url;
        }

        public void setThird_url(String third_url) {
            this.third_url = third_url;
        }

        public int getTrackId() {
            return trackId;
        }

        public void setTrackId(int trackId) {
            this.trackId = trackId;
        }
    }
}