package com.dangdang.reader.client.page;

import com.dangdang.reader.client.core.DDElement;
import com.dangdang.reader.client.core.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by cailianjie on 2016-6-2.
 */
public class MainPage extends PageBase {

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'关注')]")
    public static AndroidElement 按钮;


/*    static {
        loadElement(MainPage.class);
    }*/

    public static void main(String[] args) throws MalformedURLException {

/*        AppiumDriverLocalService  service = AppiumDriverLocalService.buildDefaultService();
        service.start();*/

        /*File appDir = new File("C:\\Users\\cailianjie\\Downloads");
        File app = new File(appDir, "ddreader_30000 (8).apk");*/
        DesiredCapabilities capabilities = new DesiredCapabilities();
        /*capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());*/

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability("appPackage", "com.dangdang.reader");
        capabilities.setCapability("appActivity", "com.dangdang.reader.home.HomeActivity");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);



        try {
            MainPage mainPage = new MainPage();
            PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), mainPage);
            mainPage.按钮.click();
        }catch (Exception e){

        }
        finally {
            driver.closeApp();
            driver.quit();
        }

    }

}
