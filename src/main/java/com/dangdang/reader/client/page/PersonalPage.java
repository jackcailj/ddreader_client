package com.dangdang.reader.client.page;

import com.dangdang.reader.client.core.*;
import com.dangdang.reader.client.page.personal_pages.MyPlanListPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSFindBys;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by cailianjie on 2016-6-22.
 */
public class PersonalPage extends PageBase{

    @AndroidFindBy(id="com.dangdang.reader:id/honor")
    public MobileElement 头衔;

    @AndroidFindBy(id="com.dangdang.reader:id/gold")
    public MobileElement 金铃铛;

    @AndroidFindBy(id="com.dangdang.reader:id/silver")
    public MobileElement 银铃铛;

    @AndroidFindBy(id="com.dangdang.reader:id/invite_friend")
    public MobileElement 邀请赚钱;

    @AndroidFindBy(id="com.dangdang.reader:id/common_menu_btn")
    public MobileElement 设置;

    @AndroidFindBy(id="com.dangdang.reader:id/common_menu_left_btn")
    public MobileElement 阅历;

    @AndroidFindBy(id="com.dangdang.reader:id/icon_jd_checkin_tv")
    @iOSFindBy(uiAutomator = ".tableViews()[\"tableView\"].cells()[\"摇一摇\"].staticTexts()[\"签到\"]")
    public MobileElement 签到;

    @AndroidFindBy(id="com.dangdang.reader:id/icon_read_plan_tv")
    @iOSFindBy(uiAutomator = ".tableViews()[\"tableView\"].cells()[\"读书计划\"].staticTexts()[\"读书计划\"]")
    public MobileElement 读书计划;

    @AndroidFindBy(id="com.dangdang.reader:id/icon_jd_shake_tv")
    //@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'摇一摇')]")
    //
    @iOSFindBy(uiAutomator = ".tableViews()[\"tableView\"].cells()[\"摇一摇\"].staticTexts()[\"摇一摇\"]")
    //@iOSFindBy(xpath = "//UIATableView/UIATableCell/UIAStaticText[@name=\"摇一摇\"]")
    public MobileElement 摇一摇;


    @iOSFindBy(uiAutomator = ".images()[\"UserCenter_PullNew\"]")
    @WithTimeout(time=5,unit= TimeUnit.SECONDS)
    public MobileElement 引导;

    public Double get金铃铛数量(){
        return Double.parseDouble(金铃铛.getText());
    }




    @Override
    public void setUp() {
        try{
            引导.click();
        }catch (Exception e){
            System.out.println(LoggerUtils.getStrackTrace(e));
        }
    }

    public MyPlanListPage 打开我的计划列表页面() throws MalformedURLException, InstantiationException, IllegalAccessException {
        //DriverFactory.getDriver().findElement(By.name(PersonalMenu.读书计划.toString())).click();

        读书计划.click();
        return PageCreator.createPage(MyPlanListPage.class);
    }

    public MyPlanListPage 打开我的活动列表页面() throws MalformedURLException, InstantiationException, IllegalAccessException {
        DriverFactory.getDriver().findElement(By.name(PersonalMenu.读书活动.toString())).click();
        return PageCreator.createPage(MyPlanListPage.class);
    }


    public MyPlanListPage 打开收藏图书页面() throws MalformedURLException, InstantiationException, IllegalAccessException {
        DriverFactory.getDriver().findElement(By.name(PersonalMenu.收藏图书.toString())).click();
        return PageCreator.createPage(MyPlanListPage.class);
    }

    public MyPlanListPage 打开收藏文章页面() throws MalformedURLException, InstantiationException, IllegalAccessException {
        DriverFactory.getDriver().findElement(By.name(PersonalMenu.收藏文章.toString())).click();
        return PageCreator.createPage(MyPlanListPage.class);
    }

    public MyPlanListPage 打开收藏帖子页面() throws MalformedURLException, InstantiationException, IllegalAccessException {
        DriverFactory.getDriver().findElement(By.name(PersonalMenu.收藏帖子.toString())).click();
        return PageCreator.createPage(MyPlanListPage.class);
    }


    public MyPlanListPage 打开我的笔记页面() throws MalformedURLException, InstantiationException, IllegalAccessException {
        DriverFactory.getDriver().findElement(By.name(PersonalMenu.笔记.toString())).click();
        return PageCreator.createPage(MyPlanListPage.class);
    }

    public MyPlanListPage 打开摇一摇页面() throws MalformedURLException, InstantiationException, IllegalAccessException {
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("UIATarget.localTarget().frontMostApp().mainWindow().tableViews()[\"tableView\"].cells()[\"摇一摇\"].staticTexts()[\"摇一摇\"].scrollToVisible()");

        //DeviceUtils.swip(DriverFactory.getDriver(),DeviceOrientation.UP);
        摇一摇.click();
        //摇一摇.click();
       // 摇一摇.click();ß
        return PageCreator.createPage(MyPlanListPage.class);
    }

    public MyPlanListPage 打开签到页面() throws MalformedURLException, InstantiationException, IllegalAccessException {
        //MobileElement mobileElement = (MobileElement) DriverFactory.getDriver().findElement(By.name(PersonalMenu.签到.toString()));
        //mobileElement.click();
        签到.click();
        return PageCreator.createPage(MyPlanListPage.class);
    }

    public MyPlanListPage 打开我的订单页面() throws MalformedURLException, InstantiationException, IllegalAccessException {
        DriverFactory.getDriver().findElement(By.name(PersonalMenu.我的订单.toString())).click();
        return PageCreator.createPage(MyPlanListPage.class);
    }
}
