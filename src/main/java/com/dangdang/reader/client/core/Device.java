package com.dangdang.reader.client.core;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

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
	
	public static void pressHomeBtn(){
        //Driver.instance().pressKeyCode(AndroidKeyCode.KEYCODE_HOME);
    }
 
    public static void StartApp(String appPacketName){}
}
