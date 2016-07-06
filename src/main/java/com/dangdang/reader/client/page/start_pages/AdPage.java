package com.dangdang.reader.client.page.start_pages;

import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.PageCreator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.net.MalformedURLException;

/**
 * Created by next on 16/7/1.
 */
public class AdPage extends PageBase{

    @iOSFindBy(uiAutomator = ".scrollViews()[1].images()[0]")
    public MobileElement 广告图片;



    public SelectTagPage 滑动广告图片() throws IllegalAccessException, MalformedURLException, InstantiationException {
        广告图片.swipe(SwipeElementDirection.LEFT,1000);
        广告图片.swipe(SwipeElementDirection.LEFT,1000);
        广告图片.swipe(SwipeElementDirection.LEFT,1000);

        return PageCreator.createPage(SelectTagPage.class);

    }
}
