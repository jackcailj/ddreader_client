package com.dangdang.reader.client.page.third_pages.weixin;

import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.PageCreator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.net.MalformedURLException;

/**
 * Created by cailianjie on 2016-7-12.
 */
public class WXSelectShareObjectPage extends PageBase{

    @AndroidFindBy(id = "com.tencent.mm:id/bl_")
    MobileElement 分享对象;

    @AndroidFindBy(id = "com.tencent.mm:id/f1")
    MobileElement 返回;


    public WXLiuYanPage 分享给第一个联系人() throws IllegalAccessException, MalformedURLException, InstantiationException {
        分享对象.click();

        return PageCreator.createPage(WXLiuYanPage.class);
    }

    public void 返回当当读书(){返回.click();}

}
