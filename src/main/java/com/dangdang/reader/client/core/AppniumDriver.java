package com.dangdang.reader.client.core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * Created by cailianjie on 2016-6-2.
 */
public class AppniumDriver implements IDriver  {

    AndroidDriver androidDriver ;


    static final IDriver driver = new AppniumDriver();

    public static IDriver instance(){
        AndroidDriver androidDriver;
        return driver;
    }


}
