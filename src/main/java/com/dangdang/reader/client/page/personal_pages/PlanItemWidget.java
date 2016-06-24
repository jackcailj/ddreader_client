package com.dangdang.reader.client.page.personal_pages;

import com.dangdang.reader.client.core.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.Widget;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

/**
 * Created by cailianjie on 2016-6-22.
 */

@AndroidFindBy(id = "com.dangdang.reader:id/plan_rl")
public class PlanItemWidget extends Widget{

    @AndroidFindBy(id="com.dangdang.reader:id/name_tv")
    MobileElement 计划名称;

    @AndroidFindBy(id="com.dangdang.reader:id/plan_time_tv")
    MobileElement 预计读完时间;

    @AndroidFindBy(id="com.dangdang.reader:id/price_tv")
    MobileElement 计划价格;

    @AndroidFindBy(id="com.dangdang.reader:id/remaining_days_tv")
    MobileElement 剩余时间;

    @AndroidFindBy(id="com.dangdang.reader:id/percent_tv")
    MobileElement 总体进度;

    @AndroidFindBy(id="com.dangdang.reader:id/book_name_tv")
    MobileElement 书籍名称;




    protected PlanItemWidget(WebElement element) {
        super(element);
    }

    public String get书籍名称() {
        return 书籍名称.getText();
    }

    public String get预计读完时间() {
        return 预计读完时间.getText();
    }

    public String get计划价格() {
        return 计划价格.getText();
    }

    public String get剩余时间() {
        return 剩余时间.getText();
    }

    public String get总体进度() throws MalformedURLException {
        return 总体进度.getText();
    }

    public String get计划名称() {
        return 计划名称.getText();
    }


}
