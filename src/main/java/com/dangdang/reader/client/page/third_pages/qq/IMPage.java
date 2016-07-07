package com.dangdang.reader.client.page.third_pages.qq;

import com.dangdang.reader.client.core.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by cailianjie on 2016-7-7.
 */
public class IMPage extends PageBase{

    @AndroidFindBy(id = "com.tencent.mobileqq:id/ivTitleBtnLeft")
    public MobileElement 返回当当读书;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"http\" and position()=last()]")
    public MobileElement 分享URL;

    public void 返回当当读书(){
        返回当当读书.click();
    }

    public String get分享URL(){
        return 分享URL.getText();
    }

}
