package com.dangdang.reader.client.core;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.dangdang.reader.client.page.MainPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

/**
 * Created by cailianjie on 2016-6-2.
 */
public class Device {

    static Logger logger = Logger.getLogger(Device.class);

    /*
    按android主键
     */
	public static void android_按主键() throws MalformedURLException {
        AndroidDriver driver = (AndroidDriver) DriverFactory.getDriver();
        driver.pressKeyCode(AndroidKeyCode.KEYCODE_HOME);

    }

    /*
    按android返回键
  */
    public static void android_按返回键() throws MalformedURLException {
        AndroidDriver driver = (AndroidDriver) DriverFactory.getDriver();
        driver.pressKeyCode(AndroidKeyCode.BACK);

    }

    /*
    按android菜单键
     */
    public static void android_按菜单键() throws MalformedURLException {
        AndroidDriver driver = (AndroidDriver) DriverFactory.getDriver();
        driver.pressKeyCode(AndroidKeyCode.MENU);
    }


    /*
    隐藏键盘
     */
    public static void 隐藏键盘() throws MalformedURLException {
        AppiumDriver driver =  DriverFactory.getDriver();
        driver.hideKeyboard();
    }

    /*
    滑动屏幕
     */
    public static void 滑动(DeviceOrientation orientation) throws MalformedURLException {
        AppiumDriver driver =  DriverFactory.getDriver();
        Dimension screenSize = driver.manage().window().getSize();

        Double startX=0d;
        Double startY=0d;
        Double endX=0d;
        Double endY=0d;

        if(orientation == DeviceOrientation.UP){
            endX=startX = Double.valueOf(screenSize.getWidth()/2);
            startY = screenSize.getHeight()*(3.0/4.0);
            endY = screenSize.getHeight()*(1.0/4.0);
        }
        else if(orientation == DeviceOrientation.DOWN){
            endX=startX = Double.valueOf(screenSize.getWidth()/2);
            startY = screenSize.getHeight()*(1.0/4.0);
            endY = screenSize.getHeight()*(3.0/4.0);
        }
        else if(orientation == DeviceOrientation.LEFT){
            endY=startY = Double.valueOf(screenSize.getHeight()/2);
            startX =  screenSize.getWidth()*(1.0/4.0);
            endX =  screenSize.getWidth()*(3.0/4.0);
        }

        else if(orientation == DeviceOrientation.RIGHT){
            endY=startY = Double.valueOf(screenSize.getHeight()/2);
            startX =  screenSize.getWidth()*(3.0/4.0);
            endX =  screenSize.getWidth()*(1.0/4.0);
        }

        driver.swipe(startX.intValue(),startY.intValue(),endX.intValue(),endY.intValue(),1000);

    }

    /*
    点按屏幕一个位置，可以按上下左右和中间
     */
    public static void touch(DeviceOrientation orientation) throws MalformedURLException {
        TouchAction touchAction = new TouchAction(DriverFactory.getDriver());
        Dimension screenSize = DriverFactory.getDriver().manage().window().getSize();

        Double X=0d;
        Double Y=0d;

        if(orientation == DeviceOrientation.UP){
            X= Double.valueOf(screenSize.getWidth()/2);
            Y=screenSize.getHeight()*(1.0/4.0);
        }
        else if(orientation == DeviceOrientation.DOWN){
            X= Double.valueOf(screenSize.getWidth()/2);
            Y=screenSize.getHeight()*(3.0/4.0);
        }
        else if(orientation == DeviceOrientation.LEFT){
            X=screenSize.getWidth()*(1.0/4.0);
            Y= Double.valueOf(screenSize.getHeight()/2);
        }

        else if(orientation == DeviceOrientation.RIGHT){
            X=screenSize.getWidth()*(3.0/4.0);
            Y= Double.valueOf(screenSize.getHeight()/2);
        }
        else if(orientation == DeviceOrientation.CENTER){
            X= Double.valueOf(screenSize.getWidth()/2);
            Y= Double.valueOf(screenSize.getHeight()/2);
        }


        touchAction.tap(X.intValue(),Y.intValue()).release();

    }

    /*
    截屏，图片保存在logs目录下，文件名为：用例名称+时间+时间戳
     */
    public static void 截屏() {
        try {
            //截图并保存
            TakesScreenshot takesScreenshot = (TakesScreenshot) DriverFactory.getDriver();
            File screenShot = takesScreenshot.getScreenshotAs(OutputType.FILE);
            String screenShotFullName = LoggerUtils.getLogsFile() + "_" + System.currentTimeMillis() + ".jpg";
            FileUtils.copyFile(screenShot, new File(screenShotFullName));
        }catch (Exception e){
            logger.error(LoggerUtils.getStrackTrace(e));
        }
    }


    public static void main(String[] args) throws MalformedURLException {

        try {


        }catch (Exception e) {
            DriverFactory.getDriver().quit();
        }

    }
}
