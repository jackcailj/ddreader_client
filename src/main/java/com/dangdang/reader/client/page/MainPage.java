package com.dangdang.reader.client.page;
 
import com.dangdang.reader.client.core.PageBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
 
/**
 * Created by cailianjie on 2016-6-2.
 */
public class MainPage extends PageBase {
 
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'关注')]")
    public static AndroidElement bookStoreBtn;       
    
    @AndroidFindBy(id = "com.dangdang.reader:id/tab_store")
    public AndroidElement 书城;
    
    @AndroidFindBy(id = "com.dangdang.reader:id/tab_find")
    public static AndroidElement 发现;
       
    @Test
    public void test() {  
//    	MainPage  page = new MainPage();
//    	PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), page);
    
        this.书城.click();           
        this.发现.click();
    }
    
    
    public static void main(String[] args){
    
    	
    }
 

}