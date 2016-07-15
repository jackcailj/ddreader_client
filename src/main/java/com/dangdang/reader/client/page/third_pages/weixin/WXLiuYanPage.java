package com.dangdang.reader.client.page.third_pages.weixin;

import com.dangdang.reader.client.core.DriverFactory;
import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.PageCreator;
import com.dangdang.reader.client.core.Utils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.net.MalformedURLException;

/**
 * Created by cailianjie on 2016-7-12.
 */
public class WXLiuYanPage extends PageBase{

    @AndroidFindBy(id = "com.tencent.mm:id/bh_")
    MobileElement 计划名称;

    @AndroidFindBy(id = "com.tencent.mm:id/a7f")
    MobileElement 计划描述;

    @AndroidFindBy(id = "com.tencent.mm:id/a7e")
    MobileElement 计划图片;

    @AndroidFindBy(id = "com.tencent.mm:id/a7d")
    MobileElement 留言;

    @AndroidFindBy(id = "com.tencent.mm:id/a7g")
    MobileElement 分享来自;

    @AndroidFindBy(id = "com.tencent.mm:id/bhd")
    MobileElement 取消分享;

    @AndroidFindBy(id = "com.tencent.mm:id/bhe")
    MobileElement 确认分享;

    public WXShareResultPage 留言并分享(String 留言内容) throws IllegalAccessException, MalformedURLException, InstantiationException {
        /*留言.clear();
        留言.sendKeys(留言内容);*/
        留言.setValue(留言内容);
        确认分享.click();


        return PageCreator.createPage(WXShareResultPage.class);

    }

    public String get计划名称(){
        return Utils.formatString(计划名称.getText());
    }


    public String get计划描述(){
        return Utils.formatString(计划描述.getText());
    }

    public void 取消分享(){
        取消分享.click();
    }

}
