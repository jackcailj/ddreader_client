package com.dangdang.reader.client.page.third_pages.qqzone;

import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.Utils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import org.openqa.selenium.OutputType;

/**
 * Created by cailianjie on 2016-7-12.
 */
public class QQZonePublishPage extends PageBase{


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"取消\"]")
    public MobileElement 取消;

    @AndroidFindBy(id = "com.tencent.mobileqq:id/ivTitleBtnRightText")
    public MobileElement 发表;

    @AndroidFindBys({
            @AndroidFindBy(className = "android.widget.EditText"),
            @AndroidFindBy(id = "com.tencent.mobileqq:id/name")
    })
    public MobileElement 转发留言;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"com.tencent.mobileqq:id/name\" and position()=1]")
    public MobileElement 计划名称;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"com.tencent.mobileqq:id/name\" and position()=2]")
    public MobileElement 计划描述;

    @AndroidFindBy(className = "android.widget.ImageView")
    public MobileElement 分享图片;


    public void 发表分享(){
        发表.click();
    }

    public void 取消分享(){
        取消.click();
    }

    public String get计划名称(){
        return Utils.formatString(计划名称.getAttribute("name").toString());
    }

    public String get计划描述(){
        return Utils.formatString(计划描述.getAttribute("name").toString());
    }

    public byte[]  get计划图片(){
        return 分享图片.getScreenshotAs(OutputType.BYTES);
    }



}
