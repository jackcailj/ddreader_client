package com.dangdang.reader.client.page.third_pages.qq;

import com.dangdang.reader.client.core.DriverFactory;
import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.PageCreator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import java.net.MalformedURLException;
import java.sql.Driver;

/**
 * Created by cailianjie on 2016-7-7.
 */
public class QQSendToPage extends PageBase{

    @AndroidFindBy(xpath = "//android.widget.AbsListView/android.widget.RelativeLayout[2]")
    public MobileElement 我的电脑;


    public SentToConfirmPage 发送到我的电脑() throws IllegalAccessException, MalformedURLException, InstantiationException {
        我的电脑.click();

        return PageCreator.createPage(SentToConfirmPage.class);
    }

}
