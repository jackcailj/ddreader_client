package com.dangdang.reader.client.page.common_pages;

import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.PageCreator;
import com.dangdang.reader.client.page.third_pages.qq.QQSendToPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.net.MalformedURLException;

/**
 * Created by cailianjie on 2016-7-7.
 */
public class ShareToTipPage extends PageBase{

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_im")
    public MobileElement 分享到书友;

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_bar")
    public MobileElement 分享到书吧;

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_wx_friends")
    public MobileElement 分享到微信好友;

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_wx_moments")
    public MobileElement 分享到微信朋友圈;

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_qq")
    public MobileElement 分享到QQ好友;

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_qzone")
    public MobileElement 分享到QQ空间;

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_sina")
    public MobileElement 分享到新浪微博;

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_other")
    public MobileElement 分享到其他;


    public QQSendToPage 分享到QQ好友() throws IllegalAccessException, MalformedURLException, InstantiationException {
        分享到QQ好友.click();

        return PageCreator.createPage(QQSendToPage.class);
    }
}
