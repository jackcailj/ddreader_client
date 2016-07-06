package com.dangdang.reader.client.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import org.testng.annotations.AfterSuite;

/**
 * Created by cailianjie on 2016-6-2.
 */
public class PageBase {
	@SuppressWarnings("rawtypes")
	//public static AppiumDriver driver;
	public static AppiumDriver driver;
	
	static{
		try {
			driver = DriverFactory.getDriver();
			//driver = DriverFactory.getDriver();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	@AfterSuite(alwaysRun=true)
	public void tearDown() throws Exception {
		DriverFactory.getDriver().quit();
	}

	public  void setUp() throws IllegalAccessException, InstantiationException, MalformedURLException {
	}
}

