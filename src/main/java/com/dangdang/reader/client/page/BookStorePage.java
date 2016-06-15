package com.dangdang.reader.client.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import com.dangdang.reader.client.core.PageBase;

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
	public void test(){
		MainPage page = new MainPage();
		MainPage.init(page);
		page.书城.click();
	}

	
    public static void test(AndroidDriver driver){   	
        	
        try {
        	BookStorePage page = new BookStorePage();
            PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), page);
            page.购物车.click();
            
           // mainPage.发现.click();
        }catch (Exception e){
 
        }
        finally {
            driver.closeApp();
            driver.quit();
        }   	
    }
    
    public static void main(String[] args){
    	
    }
}
