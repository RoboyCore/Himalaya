package mobi.xiaowu.himalaya.model.discovery.recommend;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by xiaowu on 2016/12/16.
 */

public class DiscoveryColumns implements Parcelable{
    /**
     * ret : 0
     * title : 发现新奇
     * list : [{"id":66,"title":"听资讯","subtitle":"","coverPath":"http://fdfs.xmcdn.com/group6/M0A/9E/08/wKgDg1dedp7CeL1bAABTCuIsHnA668.jpg","contentType":"album_detail","url":"","sharePic":"","enableShare":false,"isExternalUrl":false,"contentUpdatedAt":0,"properties":{"albumId":3985798,"isPaid":false}},{"id":68,"title":"今日最火","subtitle":"","coverPath":"http://fdfs.xmcdn.com/group6/M0B/9E/09/wKgDg1dedqyStSJiAABQ5aLcVZk175.jpg","contentType":"ranking_list","url":"","sharePic":"","enableShare":false,"isExternalUrl":false,"contentUpdatedAt":0,"properties":{"contentType":"track","rankingListId":57,"isPaid":false,"key":"ranking:track:scoreByTime:1:0"}},{"id":64,"title":"经典必听","subtitle":"","coverPath":"http://fdfs.xmcdn.com/group8/M02/9B/CE/wKgDYFdsp2mw0wGrAABXgLz8WRA950.jpg","contentType":"ranking_list","url":"","sharePic":"","enableShare":false,"isExternalUrl":false,"contentUpdatedAt":0,"properties":{"contentType":"album","rankingListId":21,"isPaid":false,"key":"ranking:album:subscribed:30:0"}},{"id":58,"title":"商城","subtitle":"喜马拉雅新春红包免费领","coverPath":"http://fdfs.xmcdn.com/group8/M02/9B/CE/wKgDYFdsp3OTt1mTAABMGZ-IIaY644.jpg","contentType":"html5.mall","url":"https://wap.koudaitong.com/v2/showcase/homepage?alias=nq65b1t2","sharePic":"","enableShare":false,"isExternalUrl":true,"contentUpdatedAt":0},{"id":72,"title":"游戏中心","subtitle":"游戏中心","coverPath":"http://fdfs.xmcdn.com/group8/M01/90/74/wKgDYFdedw7ABuQoAABSTJOC_5s159.jpg","contentType":"html5","url":"http://game.ximalaya.com/games-operation/v1/games/list?ly=fxxq","sharePic":"","enableShare":false,"isExternalUrl":false,"contentUpdatedAt":0},{"id":78,"title":"热门分享","subtitle":"","coverPath":"http://fdfs.xmcdn.com/group14/M01/91/D6/wKgDY1dedvjyaTMfAABQMHjnIT8017.jpg","contentType":"ranking_list","url":"","sharePic":"","enableShare":false,"isExternalUrl":false,"contentUpdatedAt":0,"properties":{"contentType":"track","rankingListId":54,"isPaid":false,"key":"ranking:track:shared:1:0"}},{"id":56,"title":"活动","subtitle":"寻找诵读者 | 叶清邀你读《皮囊》","coverPath":"http://fdfs.xmcdn.com/group12/M04/90/93/wKgDXFdedyTi-iUDAABF-4BfCE4274.jpg","contentType":"activity","url":"","sharePic":"","enableShare":false,"isHot":true,"isExternalUrl":false,"contentUpdatedAt":0},{"id":54,"title":"圈子","subtitle":"喜马拉雅FM外语人气主播大赛","coverPath":"http://fdfs.xmcdn.com/group12/M04/90/46/wKgDW1dedzKzkLnsAABUqx78Hdk223.jpg","contentType":"xzone","url":"","sharePic":"","enableShare":false,"isExternalUrl":false,"contentUpdatedAt":0}]
     * locationInHotRecommend : 0
     */

    private int ret;
    private String title;
    private int locationInHotRecommend;
    private List<DiscoverColumn> list;

    protected DiscoveryColumns(Parcel in) {
        ret = in.readInt();
        title = in.readString();
        locationInHotRecommend = in.readInt();
        list = in.createTypedArrayList(DiscoverColumn.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(ret);
        dest.writeString(title);
        dest.writeInt(locationInHotRecommend);
        dest.writeTypedList(list);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<DiscoveryColumns> CREATOR = new Creator<DiscoveryColumns>() {
        @Override
        public DiscoveryColumns createFromParcel(Parcel in) {
            return new DiscoveryColumns(in);
        }

        @Override
        public DiscoveryColumns[] newArray(int size) {
            return new DiscoveryColumns[size];
        }
    };

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

    public int getLocationInHotRecommend() {
        return locationInHotRecommend;
    }

    public void setLocationInHotRecommend(int locationInHotRecommend) {
        this.locationInHotRecommend = locationInHotRecommend;
    }

    public List<DiscoverColumn> getList() {
        return list;
    }

    public void setList(List<DiscoverColumn> list) {
        this.list = list;
    }

    public static class DiscoverColumn implements Parcelable{
        /**
         * id : 66
         * title : 听资讯
         * subtitle :
         * coverPath : http://fdfs.xmcdn.com/group6/M0A/9E/08/wKgDg1dedp7CeL1bAABTCuIsHnA668.jpg
         * contentType : album_detail
         * url :
         * sharePic :
         * enableShare : false
         * isExternalUrl : false
         * contentUpdatedAt : 0
         * properties : {"albumId":3985798,"isPaid":false}
         * isHot : true
         */
        private int type = 1;
        private int id;
        private String title;
        private String subtitle;
        private String coverPath;
        private String contentType;
        private String url;
        private String sharePic;
        private boolean enableShare;
        private boolean isExternalUrl;
        private int contentUpdatedAt;
        private PropertiesBean properties;
        private boolean isHot;

        protected DiscoverColumn(Parcel in) {
            type = in.readInt();
            id = in.readInt();
            title = in.readString();
            subtitle = in.readString();
            coverPath = in.readString();
            contentType = in.readString();
            url = in.readString();
            sharePic = in.readString();
            enableShare = in.readByte() != 0;
            isExternalUrl = in.readByte() != 0;
            contentUpdatedAt = in.readInt();
            isHot = in.readByte() != 0;
        }

        public static final Creator<DiscoverColumn> CREATOR = new Creator<DiscoverColumn>() {
            @Override
            public DiscoverColumn createFromParcel(Parcel in) {
                return new DiscoverColumn(in);
            }

            @Override
            public DiscoverColumn[] newArray(int size) {
                return new DiscoverColumn[size];
            }
        };

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getSharePic() {
            return sharePic;
        }

        public void setSharePic(String sharePic) {
            this.sharePic = sharePic;
        }

        public boolean isEnableShare() {
            return enableShare;
        }

        public void setEnableShare(boolean enableShare) {
            this.enableShare = enableShare;
        }

        public boolean isIsExternalUrl() {
            return isExternalUrl;
        }

        public void setIsExternalUrl(boolean isExternalUrl) {
            this.isExternalUrl = isExternalUrl;
        }

        public int getContentUpdatedAt() {
            return contentUpdatedAt;
        }

        public void setContentUpdatedAt(int contentUpdatedAt) {
            this.contentUpdatedAt = contentUpdatedAt;
        }

        public PropertiesBean getProperties() {
            return properties;
        }

        public void setProperties(PropertiesBean properties) {
            this.properties = properties;
        }

        public boolean isIsHot() {
            return isHot;
        }

        public void setIsHot(boolean isHot) {
            this.isHot = isHot;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(type);
            dest.writeInt(id);
            dest.writeString(title);
            dest.writeString(subtitle);
            dest.writeString(coverPath);
            dest.writeString(contentType);
            dest.writeString(url);
            dest.writeString(sharePic);
            dest.writeByte((byte) (enableShare ? 1 : 0));
            dest.writeByte((byte) (isExternalUrl ? 1 : 0));
            dest.writeInt(contentUpdatedAt);
            dest.writeByte((byte) (isHot ? 1 : 0));
        }

        public static class PropertiesBean implements Parcelable{
            /**
             * albumId : 3985798
             * isPaid : false
             */

            private int albumId;
            private boolean isPaid;

            protected PropertiesBean(Parcel in) {
                albumId = in.readInt();
                isPaid = in.readByte() != 0;
            }

            public static final Creator<PropertiesBean> CREATOR = new Creator<PropertiesBean>() {
                @Override
                public PropertiesBean createFromParcel(Parcel in) {
                    return new PropertiesBean(in);
                }

                @Override
                public PropertiesBean[] newArray(int size) {
                    return new PropertiesBean[size];
                }
            };

            public int getAlbumId() {
                return albumId;
            }

            public void setAlbumId(int albumId) {
                this.albumId = albumId;
            }

            public boolean isIsPaid() {
                return isPaid;
            }

            public void setIsPaid(boolean isPaid) {
                this.isPaid = isPaid;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(albumId);
                dest.writeByte((byte) (isPaid ? 1 : 0));
            }
        }
    }
}