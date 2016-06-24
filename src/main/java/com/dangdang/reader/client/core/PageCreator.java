package com.dangdang.reader.client.core;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by cailianjie on 2016-6-15.
 */
public class PageCreator {

    /*
    创建页面。
     */
    public static <T> T createPage(Class<T> pageClass) throws IllegalAccessException, InstantiationException, MalformedURLException {
        Object o = pageClass.newInstance();


        org.openqa.selenium.support.PageFactory.initElements(new AppiumFieldDecorator(DriverFactory.getDriver(), 10, TimeUnit.SECONDS), o);

        return (T) o;
    }
}
