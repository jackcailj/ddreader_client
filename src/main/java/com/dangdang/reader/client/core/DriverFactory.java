package com.dangdang.reader.client.core;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;



/**
 * Created by cailianjie on 2016-6-2.
 */
public class DriverFactory {
	
	 public static  WebDriver driver =null;
	    /*
	    读取配置文件,创建Driver
	     */
	    public static WebDriver getDriver() throws MalformedURLException {
	 
	        if(driver==null) {
	            DesiredCapabilities desiredCapabilities = Config.getAppniumDesiredCapabilities();
	 
	 
	            if (Config.getDeviceType() == DeviceType.ANDROID) {
	                driver = new AndroidDriver(new URL(Config.getAppniumUrl()), desiredCapabilities);
	            } else if (Config.getDeviceType() == DeviceType.IOS) {
	                driver = new IOSDriver(new URL(Config.getAppniumUrl()), desiredCapabilities);
	            }
	 
	        }
	        return driver;
	    }
}
