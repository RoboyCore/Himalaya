package mobi.xiaowu.himalaya.api;

/**
 * Created by xiaowu on 2016/12/14.
 */

public class DiscoverUrl {
    //推荐
    public static final String DIS_TITLE_URL = MainUrl.Base_Url + "/mobile/discovery/v1/tabs?device=android";
    public static final String REC_VP_URL = MainUrl.Base_Url + "/mobile/discovery/v3/recommends?channel=and-a1&device=android&includeActivity=true&includeSpecial=true&scale=2&version=4.3.98";
    public static final String REC_HOTANDGUESS_URL = MainUrl.Base_Url + "/mobile/discovery/v1/recommend/hotAndGuess?device=android";
    public static final String ADS_BOTTOM= "http://adse.ximalaya.com/ting?device=android&name=find_banner&network=wifi&operator=0&version=4.3.98";
    //分类
    public static final String CLASSIFY_URL= MainUrl.Base_Url + "/mobile/discovery/v1/categories?channel=and-a1&device=android&picVersion=13&scale=2";



    //发现
    public static final String ANCHOR_URL_NO_PAGE =MainUrl.Base_Url + "/m/explore_user_index?device=android&page=";
}
