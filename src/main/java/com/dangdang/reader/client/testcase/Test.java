package com.dangdang.reader.client.testcase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.dangdang.reader.client.core.Device;
import com.dangdang.reader.client.page.BookStorePage;
import com.dangdang.reader.client.page.MainPage;

/**
 * Created by cailianjie on 2016-6-2.
 */
public class Test{
	public static void gotoBookStore(){
        Device.StartApp("com.dangdang.reader");
       // MainPage.bookStoreBtn.click();
        //BookStorePage.JinRiReDianColumn.moreBtn.click();

    }
}
