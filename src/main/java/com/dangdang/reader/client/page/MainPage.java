package com.dangdang.reader.client.page;

import com.dangdang.reader.client.core.*;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by cailianjie on 2016-6-2.
 */
public class MainPage extends PageBase {

	@AndroidFindBy(id = "com.dangdang.reader:id/dialog_right_button")
	public AndroidElement 进入书架;
	   
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'关注')]")
    public AndroidElement 按钮;

    @AndroidFindBy(id = "com.dangdang.reader:id/tab_home")
    public AndroidElement 导读;
    
    @AndroidFindBy(id = "com.dangdang.reader:id/tab_store")
    public AndroidElement 书城;
    
    @AndroidFindBy(id = "com.dangdang.reader:id/tab_shelf")
    public AndroidElement 书架;
    
    @AndroidFindBy(id = "com.dangdang.reader:id/tab_find")
    public AndroidElement 发现;
    
    @AndroidFindBy(id = "com.dangdang.reader:id/tab_personal")
    public AndroidElement 我的;
    
    public static void 进入我的页面() throws Exception{
    	MainPage  mainPage = PageManager.createPage(MainPage.class);   	
    	mainPage.进入书架.click();
    	mainPage.我的.click();
    	Assert.assertEquals(driver.getPageSource().contains("我的"), true, "");
    }

    public static void main(String[] args) throws MalformedURLException {

        try {

            MainPage mainPage = PageManager.createPage(MainPage.class);
            //MainPage mainPage = PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS),));
            mainPage.按钮.click();
        }catch (Exception e){
            System.out.print(e.getStackTrace());
        }
        finally {
            DriverFactory.getDriver().quit();

        }

    }

}
