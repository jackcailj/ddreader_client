package com.dangdang.reader.client.page;

import com.dangdang.reader.client.core.DriverFactory;
import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.PageCreator;
import com.dangdang.reader.client.page.personal_pages.MyPlanListPage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

/**
 * Created by cailianjie on 2016-6-22.
 */
public class PersonalPage {

    @AndroidFindBy(id="com.dangdang.reader:id/honor")
    public WebElement 头衔;

    @AndroidFindBy(id="com.dangdang.reader:id/gold")
    public WebElement 金铃铛;

    @AndroidFindBy(id="com.dangdang.reader:id/silver")
    public WebElement 银铃铛;

    @AndroidFindBy(id="com.dangdang.reader:id/invite_friend")
    public WebElement 邀请赚钱;

    @AndroidFindBy(id="com.dangdang.reader:id/common_menu_btn")
    public WebElement 设置;

    @AndroidFindBy(id="com.dangdang.reader:id/common_menu_left_btn")
    public WebElement 阅历;


    public MyPlanListPage 打开我的计划列表页面() throws MalformedURLException, InstantiationException, IllegalAccessException {
        DriverFactory.getDriver().findElement(By.name(PersonalMenu.读书计划.toString())).click();
        return PageCreator.createPage(MyPlanListPage.class);
    }
}
