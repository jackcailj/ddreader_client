package com.dangdang.reader.client.core;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by cailianjie on 2016-6-2.
 */
public class PageBase {
	public static WebDriver driver;
    
	@BeforeMethod(alwaysRun=true)
	public void setUp() throws Exception {
		//if("Android".equals(deviceType)){
			driver = Driver.initDriver();
		//}else{
			
		//}
			//PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}
	
	public static Object init(Object o){
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), o);
		return o;
	}
    
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() throws Exception {
		driver.quit();
	}
    
    /*
       加载配置文件，并初始化类对象
    */
    public static void loadElement(Class clazz)  {
//        for(Field field:clazz.getFields()){
//            System.out.println(field.getName());
//        }
        PageFactory.initElements(new AppiumFieldDecorator(driver, 60, TimeUnit.SECONDS), clazz);
    }

}
