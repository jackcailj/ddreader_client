package com.dangdang.reader.client.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.dangdang.reader.client.page.MainPage;

/**
 * Created by cailianjie on 2016-6-2.
 */
public class PageBase {
	@SuppressWarnings("rawtypes")
	public static AndroidDriver driver;
	
	static{
		try {
			driver = (AndroidDriver) DriverFactory.getDriver();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	
	@AfterSuite(alwaysRun=true)
	public void tearDown() throws Exception {
		DriverFactory.getDriver().quit();
	}


}
