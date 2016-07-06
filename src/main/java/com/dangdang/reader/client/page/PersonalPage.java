package com.dangdang.reader.client.page;

import com.dangdang.reader.client.core.DriverFactory;
import com.dangdang.reader.client.core.PageCreator;
import com.dangdang.reader.client.page.personal_pages.MyPlanListPage;
import com.dangdang.reader.client.page.personal_pages.PersonalMenu;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

/**
 * Created by cailianjie on 2016-6-22.
 */
public class PersonalPage {

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
    public MobileElement 签到;

    @AndroidFindBy(id="com.dangdang.reader:id/icon_read_plan_tv")
    public MobileElement 读书计划;

    @AndroidFindBy(id="com.dangdang.reader:id/icon_jd_shake_tv")
    //@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'摇一摇')]")
    public MobileElement 摇一摇;

    public Double get金铃铛数量(){
        return Double.parseDouble(金铃铛.getText());
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
        摇一摇.click();
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
