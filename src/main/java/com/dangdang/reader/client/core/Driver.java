package com.dangdang.reader.client.core;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Created by cailianjie on 2016-6-2.
 */
public class Driver {

    public static AndroidDriver<AndroidElement> initDriver() throws Exception{
    	/*        AppiumDriverLocalService  service = AppiumDriverLocalService.buildDefaultService();
        service.start();*/
 
        /*File appDir = new File("C:\\Users\\cailianjie\\Downloads");
        File app = new File(appDir, "ddreader_30000 (8).apk");*/
        DesiredCapabilities capabilities = new DesiredCapabilities();
        /*capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());*/
 
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability("appPackage", "com.dangdang.reader");
        capabilities.setCapability("appActivity", ".MainActivity"); //com.dangdang.reader.home.HomeActivity
        return new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
    
    
    public static IOSDriver<IOSElement> initiOSDriver() throws Exception{
		return null;
    	
    }


}
