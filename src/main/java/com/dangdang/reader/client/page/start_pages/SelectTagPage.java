package com.dangdang.reader.client.page.start_pages;

import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.PageCreator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.net.MalformedURLException;

/**
 * Created by next on 16/7/1.
 */
public class SelectTagPage extends PageBase{

    @iOSFindBy(uiAutomator = ".scrollViews()[0].collectionViews()[0].cells()[1]")
    public MobileElement 标签;

    @iOSFindBy(uiAutomator = ".scrollViews()[0].buttons()[\"下一步\"]")
    public MobileElement 下一步;


    public SelectPinDao 选择标签() throws IllegalAccessException, MalformedURLException, InstantiationException {
        标签.click();
        下一步.click();

        return  PageCreator.createPage(SelectPinDao.class);
    }


}
