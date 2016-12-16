package mobi.xiaowu.himalaya.model.main;

import java.util.List;

/**
 * Created by xiaowu on 2016/12/14.
 */

public class Ads {

    /**
     * ret : 0
     * responseId : 71100440680
     * data : [{"shareData":null,"isShareFlag":false,"thirdStatUrl":"","thirdShowStatUrls":null,"thirdClickStatUrls":null,"link":"http://ad.ximalaya.com/adrecord?sdn=H4sIAAAAAAAAAKtWykhNTEktUrLKK83J0VFKzs_PzkyF8QoSixJzU0tSi4qVrKqVElM8S1JzPVOUrJQMzU0MDZVqawGqbpBHPwAAAA&ad=17411&jt2=aHR0cDovL21hcmtldC53dWtvbmdsaWNhaS5jb20vbWFya2V0aW5nL3NwcmVhZFJlZ2lzdGVyT25lLzY2NjE5OC5odG1s&jt=http%3A%2F%2Fmarket.wukonglicai.com%2Fmarketing%2FspreadRegisterOne%2F666198.html","cover":"http://fdfs.xmcdn.com/group22/M08/BB/00/wKgJM1hPwOzwrfUYAAHotaPtBcE439.png","showstyle":4,"name":"","description":"","scheme":"","linkType":1,"displayType":1,"clickType":1,"openlinkType":0,"loadingShowTime":3000,"apkUrl":null,"adtype":0,"auto":false,"startAt":1481644800000,"endAt":1481731199000,"dynamicCover":"","adid":17411},{"shareData":null,"isShareFlag":false,"thirdStatUrl":"http://v.admaster.com.cn/i/a79305,b1443572,c2946,i0,m202,8a2,8b2,h","thirdShowStatUrls":null,"thirdClickStatUrls":null,"link":"http://ad.ximalaya.com/adrecord?sdn=H4sIAAAAAAAAAKtWykhNTEktUrLKK83J0VFKzs_PzkyF8QoSixJzU0tSi4qVrKqVElM8S1JzPVOUrJQMzU0MjJRqawH06EVoPwAAAA&ad=17402&jt2=aHR0cDovL2NsaWNrYy5hZG1hc3Rlci5jb20uY24vYy9hNzkzMDUsYjE0NDM1NzIsYzI5NDYsaTAsbTEwMSw4YTIsOGIyLGg&jt=http%3A%2F%2Fclickc.admaster.com.cn%2Fc%2Fa79305%2Cb1443572%2Cc2946%2Ci0%2Cm101%2C8a2%2C8b2%2Ch","cover":"http://fdfs.xmcdn.com/group23/M01/BA/D1/wKgJL1hPrviAs892AAHAemuAMDQ363.jpg","showstyle":4,"name":"","description":"","scheme":"","linkType":1,"displayType":1,"clickType":1,"openlinkType":0,"loadingShowTime":3000,"apkUrl":null,"adtype":0,"auto":false,"startAt":1481644800000,"endAt":1481731199000,"dynamicCover":"","adid":17402}]
     * adTypes : [0,0]
     */

    private int ret;
    private long responseId;
    private List<Ad> data;
    private List<Integer> adTypes;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public long getResponseId() {
        return responseId;
    }

    public void setResponseId(long responseId) {
        this.responseId = responseId;
    }

    public List<Ad> getData() {
        return data;
    }

    public void setData(List<Ad> data) {
        this.data = data;
    }

    public List<Integer> getAdTypes() {
        return adTypes;
    }

    public void setAdTypes(List<Integer> adTypes) {
        this.adTypes = adTypes;
    }

    public static class Ad {
        /**
         * shareData : null
         * isShareFlag : false
         * thirdStatUrl :
         * thirdShowStatUrls : null
         * thirdClickStatUrls : null
         * link : http://ad.ximalaya.com/adrecord?sdn=H4sIAAAAAAAAAKtWykhNTEktUrLKK83J0VFKzs_PzkyF8QoSixJzU0tSi4qVrKqVElM8S1JzPVOUrJQMzU0MDZVqawGqbpBHPwAAAA&ad=17411&jt2=aHR0cDovL21hcmtldC53dWtvbmdsaWNhaS5jb20vbWFya2V0aW5nL3NwcmVhZFJlZ2lzdGVyT25lLzY2NjE5OC5odG1s&jt=http%3A%2F%2Fmarket.wukonglicai.com%2Fmarketing%2FspreadRegisterOne%2F666198.html
         * cover : http://fdfs.xmcdn.com/group22/M08/BB/00/wKgJM1hPwOzwrfUYAAHotaPtBcE439.png
         * showstyle : 4
         * name :
         * description :
         * scheme :
         * linkType : 1
         * displayType : 1
         * clickType : 1
         * openlinkType : 0
         * loadingShowTime : 3000
         * apkUrl : null
         * adtype : 0
         * auto : false
         * startAt : 1481644800000
         * endAt : 1481731199000
         * dynamicCover :
         * adid : 17411
         */

        private Object shareData;
        private boolean isShareFlag;
        private String thirdStatUrl;
        private Object thirdShowStatUrls;
        private Object thirdClickStatUrls;
        private String link;
        private String cover;
        private int showstyle;
        private String name;
        private String description;
        private String scheme;
        private int linkType;
        private int displayType;
        private int clickType;
        private int openlinkType;
        private int loadingShowTime;
        private Object apkUrl;
        private int adtype;
        private boolean auto;
        private long startAt;
        private long endAt;
        private String dynamicCover;
        private int adid;

        public Object getShareData() {
            return shareData;
        }

        public void setShareData(Object shareData) {
            this.shareData = shareData;
        }

        public boolean isIsShareFlag() {
            return isShareFlag;
        }

        public void setIsShareFlag(boolean isShareFlag) {
            this.isShareFlag = isShareFlag;
        }

        public String getThirdStatUrl() {
            return thirdStatUrl;
        }

        public void setThirdStatUrl(String thirdStatUrl) {
            this.thirdStatUrl = thirdStatUrl;
        }

        public Object getThirdShowStatUrls() {
            return thirdShowStatUrls;
        }

        public void setThirdShowStatUrls(Object thirdShowStatUrls) {
            this.thirdShowStatUrls = thirdShowStatUrls;
        }

        public Object getThirdClickStatUrls() {
            return thirdClickStatUrls;
        }

        public void setThirdClickStatUrls(Object thirdClickStatUrls) {
            this.thirdClickStatUrls = thirdClickStatUrls;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public int getShowstyle() {
            return showstyle;
        }

        public void setShowstyle(int showstyle) {
            this.showstyle = showstyle;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getScheme() {
            return scheme;
        }

        public void setScheme(String scheme) {
            this.scheme = scheme;
        }

        public int getLinkType() {
            return linkType;
        }

        public void setLinkType(int linkType) {
            this.linkType = linkType;
        }

        public int getDisplayType() {
            return displayType;
        }

        public void setDisplayType(int displayType) {
            this.displayType = displayType;
        }

        public int getClickType() {
            return clickType;
        }

        public void setClickType(int clickType) {
            this.clickType = clickType;
        }

        public int getOpenlinkType() {
            return openlinkType;
        }

        public void setOpenlinkType(int openlinkType) {
            this.openlinkType = openlinkType;
        }

        public int getLoadingShowTime() {
            return loadingShowTime;
        }

        public void setLoadingShowTime(int loadingShowTime) {
            this.loadingShowTime = loadingShowTime;
        }

        public Object getApkUrl() {
            return apkUrl;
        }

        public void setApkUrl(Object apkUrl) {
            this.apkUrl = apkUrl;
        }

        public int getAdtype() {
            return adtype;
        }

        public void setAdtype(int adtype) {
            this.adtype = adtype;
        }

        public boolean isAuto() {
            return auto;
        }

        public void setAuto(boolean auto) {
            this.auto = auto;
        }

        public long getStartAt() {
            return startAt;
        }

        public void setStartAt(long startAt) {
            this.startAt = startAt;
        }

        public long getEndAt() {
            return endAt;
        }

        public void setEndAt(long endAt) {
            this.endAt = endAt;
        }

        public String getDynamicCover() {
            return dynamicCover;
        }

        public void setDynamicCover(String dynamicCover) {
            this.dynamicCover = dynamicCover;
        }

        public int getAdid() {
            return adid;
        }

        public void setAdid(int adid) {
            this.adid = adid;
        }
    }
}
