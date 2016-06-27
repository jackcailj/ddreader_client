package com.dangdang.reader.client.page;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.PageManager;

/**
 * Created by cailianjie on 2016-6-2.
 */
public class BookStorePage extends PageBase{
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'关注')]")
	public static AndroidElement 出版;	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'关注')]")
	public static AndroidElement 原创;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'关注')]")
	public static AndroidElement 纸书;
	
	@AndroidFindBy(id = "com.dangdang.reader:id/shopping_cart_iv")
	public static AndroidElement 购物车;
	
	@AndroidFindBy(id = "com.dangdang.reader:id/search_iv")
	public static AndroidElement 搜索;

	@Test
	 public void test() throws Exception{ 
		System.out.println(driver.currentActivity());
    	MainPage  mainPage = PageManager.createPage(MainPage.class);
    	
    	mainPage.进入书架.click();
    	mainPage.书城.click();
    		
        BookStorePage page1 = PageManager.createPage(BookStorePage.class);         
        page1.购物车.click();
              	
    }
    
   
}
