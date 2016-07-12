package com.dangdang.reader.client.page.common_pages;

import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.PageCreator;
import com.dangdang.reader.client.page.third_pages.qq.QQSendToPage;
import com.dangdang.reader.client.page.third_pages.qqzone.QQZonePublishPage;
import com.dangdang.reader.client.page.third_pages.weixin.WXSelectShareObjectPage;
import com.dangdang.reader.client.page.third_pages.weixin_quan.WXQSharePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.net.MalformedURLException;

/**
 * Created by cailianjie on 2016-7-7.
 */
public class ShareToTipPage extends PageBase{

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_im")
    MobileElement 分享到书友;

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_bar")
    MobileElement 分享到书吧;

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_wx_friends")
    MobileElement 分享到微信好友;

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_wx_moments")
    MobileElement 分享到微信朋友圈;

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_qq")
    MobileElement 分享到QQ好友;

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_qzone")
    MobileElement 分享到QQ空间;

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_sina")
    MobileElement 分享到新浪微博;

    @AndroidFindBy(id = "com.dangdang.reader:id/share_to_other")
    MobileElement 分享到其他;


    public QQSendToPage 分享到QQ好友() throws IllegalAccessException, MalformedURLException, InstantiationException {
        分享到QQ好友.click();

        return PageCreator.createPage(QQSendToPage.class);
    }

    public QQZonePublishPage 分享到QQ空间() throws IllegalAccessException, MalformedURLException, InstantiationException {
        分享到QQ空间.click();

        return PageCreator.createPage(QQZonePublishPage.class);
    }


    public WXSelectShareObjectPage 分享到微信好友() throws IllegalAccessException, MalformedURLException, InstantiationException {
        分享到微信好友.click();

        return PageCreator.createPage(WXSelectShareObjectPage.class);
    }

    public WXQSharePage 分享到微信朋友圈() throws IllegalAccessException, MalformedURLException, InstantiationException {
        分享到微信朋友圈.click();

        return PageCreator.createPage(WXQSharePage.class);
    }
}
