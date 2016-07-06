package com.dangdang.reader.client.page.start_pages;

import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.PageCreator;
import com.dangdang.reader.client.page.MainPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.net.MalformedURLException;

/**
 * Created by next on 16/7/1.
 */
public class SelectPinDao extends PageBase{

    @iOSFindBy(uiAutomator = ".scrollViews()[0].collectionViews()[0].cells()[0]")
    public MobileElement 频道;

    @iOSFindBy(uiAutomator = ".scrollViews()[0].buttons()[\"完成\"]")
    public MobileElement 完成;


    public MainPage 订阅频道() throws IllegalAccessException, MalformedURLException, InstantiationException {
        频道.click();

        完成.click();

        return  PageCreator.createPage(MainPage.class);
    }
}
