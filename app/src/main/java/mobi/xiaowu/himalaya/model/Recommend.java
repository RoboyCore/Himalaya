package mobi.xiaowu.himalaya.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

import mobi.xiaowu.himalaya.model.recommend.DiscoveryColumns;
import mobi.xiaowu.himalaya.model.recommend.EditorRecommendAlbums;
import mobi.xiaowu.himalaya.model.recommend.FocusImages;
import mobi.xiaowu.himalaya.model.recommend.SpecialColumn;

/**
 * Created by xiaowu on 2016/12/15.
 */

public class Recommend implements Parcelable{


    /**
     * ret : 0
     * discoveryColumns : {"ret":0,"title":"发现新奇","list":[{"id":66,"title":"听资讯","subtitle":"","coverPath":"http://fdfs.xmcdn.com/group6/M0A/9E/08/wKgDg1dedp7CeL1bAABTCuIsHnA668.jpg","contentType":"album_detail","url":"","sharePic":"","enableShare":false,"isExternalUrl":false,"contentUpdatedAt":0,"properties":{"albumId":3985798,"isPaid":false}},{"id":68,"title":"今日最火","subtitle":"","coverPath":"http://fdfs.xmcdn.com/group6/M0B/9E/09/wKgDg1dedqyStSJiAABQ5aLcVZk175.jpg","contentType":"ranking_list","url":"","sharePic":"","enableShare":false,"isExternalUrl":false,"contentUpdatedAt":0,"properties":{"contentType":"track","rankingListId":57,"isPaid":false,"key":"ranking:track:scoreByTime:1:0"}},{"id":64,"title":"经典必听","subtitle":"","coverPath":"http://fdfs.xmcdn.com/group8/M02/9B/CE/wKgDYFdsp2mw0wGrAABXgLz8WRA950.jpg","contentType":"ranking_list","url":"","sharePic":"","enableShare":false,"isExternalUrl":false,"contentUpdatedAt":0,"properties":{"contentType":"album","rankingListId":21,"isPaid":false,"key":"ranking:album:subscribed:30:0"}},{"id":58,"title":"商城","subtitle":"喜马拉雅新春红包免费领","coverPath":"http://fdfs.xmcdn.com/group8/M02/9B/CE/wKgDYFdsp3OTt1mTAABMGZ-IIaY644.jpg","contentType":"html5.mall","url":"https://wap.koudaitong.com/v2/showcase/homepage?alias=nq65b1t2","sharePic":"","enableShare":false,"isExternalUrl":true,"contentUpdatedAt":0},{"id":72,"title":"游戏中心","subtitle":"游戏中心","coverPath":"http://fdfs.xmcdn.com/group8/M01/90/74/wKgDYFdedw7ABuQoAABSTJOC_5s159.jpg","contentType":"html5","url":"http://game.ximalaya.com/games-operation/v1/games/list?ly=fxxq","sharePic":"","enableShare":false,"isExternalUrl":false,"contentUpdatedAt":0},{"id":78,"title":"热门分享","subtitle":"","coverPath":"http://fdfs.xmcdn.com/group14/M01/91/D6/wKgDY1dedvjyaTMfAABQMHjnIT8017.jpg","contentType":"ranking_list","url":"","sharePic":"","enableShare":false,"isExternalUrl":false,"contentUpdatedAt":0,"properties":{"contentType":"track","rankingListId":54,"isPaid":false,"key":"ranking:track:shared:1:0"}},{"id":56,"title":"活动","subtitle":"寻找诵读者 | 叶清邀你读《皮囊》","coverPath":"http://fdfs.xmcdn.com/group12/M04/90/93/wKgDXFdedyTi-iUDAABF-4BfCE4274.jpg","contentType":"activity","url":"","sharePic":"","enableShare":false,"isHot":true,"isExternalUrl":false,"contentUpdatedAt":0},{"id":54,"title":"圈子","subtitle":"喜马拉雅FM外语人气主播大赛","coverPath":"http://fdfs.xmcdn.com/group12/M04/90/46/wKgDW1dedzKzkLnsAABUqx78Hdk223.jpg","contentType":"xzone","url":"","sharePic":"","enableShare":false,"isExternalUrl":false,"contentUpdatedAt":0}],"locationInHotRecommend":0}
     * editorRecommendAlbums : {"ret":0,"title":"小编推荐","hasMore":true,"list":[{"id":236268,"albumId":236268,"uid":1716986,"intro":"除了老歌，还有很多","nickname":"李峙","albumCoverUrl290":"http://fdfs.xmcdn.com/group21/M08/66/B2/wKgJKFg3zXvimTYkAAF_CGkTvi4448_mobile_meduim.jpg","coverSmall":"http://fdfs.xmcdn.com/group21/M08/66/B2/wKgJKFg3zXvimTYkAAF_CGkTvi4448_mobile_small.jpg","coverMiddle":"http://fdfs.xmcdn.com/group21/M08/66/B2/wKgJKFg3zXvimTYkAAF_CGkTvi4448_mobile_meduim.jpg","coverLarge":"http://fdfs.xmcdn.com/group21/M08/66/B2/wKgJKFg3zXvimTYkAAF_CGkTvi4448_mobile_large.jpg","title":"李峙电台","tags":"电台,广播,音乐","tracks":351,"playsCounts":31772613,"isFinished":0,"serialState":0,"trackId":26845989,"trackTitle":"诗谱曲成歌,唱的是岁月和山河","provider":"man","isPaid":false,"commentsCount":0,"priceTypeId":0},{"id":2900377,"albumId":2900377,"uid":2818756,"intro":"穿越成家丁，创风采伟绩","nickname":"猛哥_FK","albumCoverUrl290":"http://fdfs.xmcdn.com/group21/M09/C0/0C/wKgJLVhQ29-xENIgAAIOzz5ZM5M084_mobile_meduim.jpg","coverSmall":"http://fdfs.xmcdn.com/group21/M09/C0/0C/wKgJLVhQ29-xENIgAAIOzz5ZM5M084_mobile_small.jpg","coverMiddle":"http://fdfs.xmcdn.com/group21/M09/C0/0C/wKgJLVhQ29-xENIgAAIOzz5ZM5M084_mobile_meduim.jpg","coverLarge":"http://fdfs.xmcdn.com/group21/M09/C0/0C/wKgJLVhQ29-xENIgAAIOzz5ZM5M084_mobile_large.jpg","title":"极品家丁","tags":"穿越,畅销书,武侠","tracks":549,"playsCounts":7004583,"isFinished":1,"serialState":1,"trackId":20780694,"trackTitle":"微博热搜前三,架空版《鹿鼎记》","provider":"man","isPaid":false,"commentsCount":0,"priceTypeId":0},{"id":4987500,"albumId":4987500,"uid":56364030,"intro":"《亭林听说》第18期《情书》","nickname":"亭林镇工作室","albumCoverUrl290":"http://fdfs.xmcdn.com/group19/M03/96/97/wKgJK1exi-bBDuQbAAJewfLCH5Q509_mobile_meduim.jpg","coverSmall":"http://fdfs.xmcdn.com/group19/M03/96/97/wKgJK1exi-bBDuQbAAJewfLCH5Q509_mobile_small.jpg","coverMiddle":"http://fdfs.xmcdn.com/group19/M03/96/97/wKgJK1exi-bBDuQbAAJewfLCH5Q509_mobile_meduim.jpg","coverLarge":"http://fdfs.xmcdn.com/group19/M03/96/97/wKgJK1exi-bBDuQbAAJewfLCH5Q509_mobile_large.jpg","title":"亭林·听说","tags":"","tracks":18,"playsCounts":208036,"isFinished":0,"serialState":0,"trackId":26879228,"trackTitle":"据说这些声音情书让韩寒都感动了","provider":"man","isPaid":false,"commentsCount":0,"priceTypeId":0}]}
     * focusImages : {"ret":0,"list":[{"id":13099,"shortTitle":"混沌","longTitle":"混沌","pic":"http://fdfs.xmcdn.com/group23/M07/C5/E0/wKgJNFhSAYLi-KeNAALVKk43kAM558_android_large.jpg","type":2,"uid":48632294,"albumId":5593618,"isShare":true,"is_External_url":false,"focusCurrentId":0},{"id":13083,"shortTitle":"【首页】12个甜美系声音女神哄/你/睡/觉/了","longTitle":"【首页】12个甜美系声音女神哄/你/睡/觉/了","pic":"http://fdfs.xmcdn.com/group22/M07/C1/68/wKgJM1hRA7HAtpWeAAHgJFT8tsg274_android_large.jpg","type":9,"specialId":842,"subType":1,"isShare":true,"is_External_url":false,"focusCurrentId":0},{"id":13091,"shortTitle":"广告 1215 3","longTitle":"广告 1215 3","pic":"http://fdfs.xmcdn.com/group21/M04/C0/F1/wKgJKFhRDCDjS2YFAAF8-lH1doo926_android_large.jpg","type":10,"url":"http://stats.annalect.com.cn/dmp/click?e=HgL7V0n9Pw283ZbZegcAOJkpXvb.wNGcp&rd=http%3A%2F%2Fe.cn.miaozhen.com%2Fr%2Fk%3D2034550%26p%3D74B4j%26dx%3D__IPDX__%26rt%3D2%26ns%3D__IP__%26ni%3D__IESID__%26v%3D__LOC__%26xa%3D__ADPLATFORM__%26ro%3Dsm%26mo%3D__OS__%26m0%3D__OPENUDID__%26m0a%3D__DUID__%26m1%3D__ANDROIDID1__%26m1a%3D__ANDROIDID__%26m2%3D__IMEI__%26m4%3D__AAID__%26m5%3D__IDFA__%26m6%3D__MAC1__%26m6a%3D__MAC__%26vo%3D354b3e63e%26vr%3D2%26o%3Dhttp%253A%252F%252Fpeugeot.com.cn%252Fshowroom%252F308%252Fhome.html%253Futm_source%253Dximalaya%2526utm_medium%253D61%2526utm_campaign%253D201612_308","third_url":"http://stats.annalect.com.cn/dmp/t.gif?e=HgL7V0n9Pw283ZbZegcAOJkpXvb.wNGcp&rd=http%3A%2F%2Fg.cn.miaozhen.com%2Fx%2Fk%3D2034550%26p%3D74B4j%26dx%3D__IPDX__%26rt%3D2%26ns%3D__IP__%26ni%3D__IESID__%26v%3D__LOC__%26xa%3D__ADPLATFORM__%26mo%3D__OS__%26m0%3D__OPENUDID__%26m0a%3D__DUID__%26m1%3D__ANDROIDID1__%26m1a%3D__ANDROIDID__%26m2%3D__IMEI__%26m4%3D__AAID__%26m5%3D__IDFA__%26m6%3D__MAC1__%26m6a%3D__MAC__%26o%3D","isShare":true,"is_External_url":true,"focusCurrentId":0},{"id":13089,"shortTitle":"【首页】又双叒叕要抢票了！","longTitle":"【首页】又双叒叕要抢票了！","pic":"http://fdfs.xmcdn.com/group22/M05/C1/DE/wKgJLlhRCkPxjjxlAAde3i6HHjY763_android_large.jpg","type":2,"uid":30495264,"albumId":6161748,"isShare":true,"is_External_url":false,"focusCurrentId":0},{"id":13084,"shortTitle":"【首页】《西部世界》那些无序的混乱，我选择看到美好","longTitle":"【首页】《西部世界》那些无序的混乱，我选择看到美好","pic":"http://fdfs.xmcdn.com/group21/M09/C0/C0/wKgJKFhRA82wV4MsAAFSZ3HE680776_android_large.jpg","type":3,"uid":40763963,"trackId":26820159,"isShare":true,"is_External_url":false,"focusCurrentId":0},{"id":13092,"shortTitle":"硬件 1215","longTitle":"硬件 1215","pic":"http://fdfs.xmcdn.com/group22/M09/C1/BB/wKgJM1hREmqTYAxoAAFxzcvUuk4893_android_large.jpg","type":4,"url":"https://h5.koudaitong.com/v2/showcase/component?alias=1achp035i","isShare":true,"is_External_url":true,"focusCurrentId":0},{"id":13087,"shortTitle":"【首页】濮哥读美文","longTitle":"【首页】濮哥读美文","pic":"http://fdfs.xmcdn.com/group23/M07/C1/B1/wKgJL1hRBM7jIyLsAAGvw-j-y1I608_android_large.jpg","type":3,"uid":39623651,"trackId":26769274,"isShare":true,"is_External_url":false,"focusCurrentId":0},{"id":13085,"shortTitle":"【首页】和真正有才气的女人在一起","longTitle":"【首页】和真正有才气的女人在一起","pic":"http://fdfs.xmcdn.com/group24/M09/C1/4B/wKgJNVhRBIuhKJWKAAEm5rU0Kic945_android_large.jpg","type":3,"uid":20251158,"trackId":26830804,"isShare":true,"is_External_url":false,"focusCurrentId":0},{"id":13086,"shortTitle":"【首页】狼牙棒青年戚泽明：把爱好变成生意","longTitle":"【首页】狼牙棒青年戚泽明：把爱好变成生意","pic":"http://fdfs.xmcdn.com/group22/M00/C1/6F/wKgJM1hRBKbz8mLBAAG8sAGRqp4499_android_large.jpg","type":3,"uid":35413718,"trackId":25593043,"isShare":true,"is_External_url":false,"focusCurrentId":0}],"title":"焦点图"}
     * msg : 成功
     * specialColumn : {"ret":0,"title":"精品听单","hasMore":true,"list":[{"columnType":1,"specialId":843,"title":"你的心情颜色知道！想趣就去！","subtitle":"你的心情颜色知道，可当心情琢磨不透，怎么办？\r\n\r\n现在一次过满足你所有选择，看见什么听什么！东风风神AX5陪你寻找乐趣，想趣就去！","footnote":"3首声音","coverPath":"http://fdfs.xmcdn.com/group24/M0A/C1/76/wKgJNVhRDH6jmKPaAABJiwtV6n0744_mobile_small.jpg","contentType":"2"}]}
     */

    private int ret;
    private DiscoveryColumns discoveryColumns;
    private EditorRecommendAlbums editorRecommendAlbums;
    private FocusImages focusImages;
    private String msg;
    private SpecialColumn specialColumn;

    protected Recommend(Parcel in) {
        ret = in.readInt();
        discoveryColumns = in.readParcelable(DiscoveryColumns.class.getClassLoader());
        msg = in.readString();
    }

    public static final Creator<Recommend> CREATOR = new Creator<Recommend>() {
        @Override
        public Recommend createFromParcel(Parcel in) {
            return new Recommend(in);
        }

        @Override
        public Recommend[] newArray(int size) {
            return new Recommend[size];
        }
    };

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public DiscoveryColumns getDiscoveryColumns() {
        return discoveryColumns;
    }

    public void setDiscoveryColumns(DiscoveryColumns discoveryColumns) {
        this.discoveryColumns = discoveryColumns;
    }

    public EditorRecommendAlbums getEditorRecommendAlbums() {
        return editorRecommendAlbums;
    }

    public void setEditorRecommendAlbums(EditorRecommendAlbums editorRecommendAlbums) {
        this.editorRecommendAlbums = editorRecommendAlbums;
    }

    public FocusImages getFocusImages() {
        return focusImages;
    }

    public void setFocusImages(FocusImages focusImages) {
        this.focusImages = focusImages;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public SpecialColumn getSpecialColumn() {
        return specialColumn;
    }

    public void setSpecialColumn(SpecialColumn specialColumn) {
        this.specialColumn = specialColumn;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(ret);
        dest.writeParcelable(discoveryColumns, flags);
        dest.writeString(msg);
    }
}
