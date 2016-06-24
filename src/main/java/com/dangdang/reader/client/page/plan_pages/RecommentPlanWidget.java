package com.dangdang.reader.client.page.plan_pages;

import com.dangdang.reader.client.core.PageCreator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.Widget;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

/**
 * Created by cailianjie on 2016-6-23.
 */

@AndroidFindBy(id="com.dangdang.reader:id/recommend_plan_item_rl")
public class RecommentPlanWidget extends Widget{


    @AndroidFindBy(id="com.dangdang.reader:id/name_tv")
    MobileElement 计划名称;

    @AndroidFindBy(id="com.dangdang.reader:id/book_count_tv")
    MobileElement 书籍数量;

    @AndroidFindBy(id="com.dangdang.reader:id/desc_tv")
    MobileElement 计划描述;

    @AndroidFindBy(id="com.dangdang.reader:id/days_tv")
    MobileElement 预计读完天数;

    @AndroidFindBy(id="com.dangdang.reader:id/original_price_tv")
    MobileElement 原价;

    @AndroidFindBy(id="com.dangdang.reader:id/sale_price_tv")
    MobileElement 优惠价格;

    protected RecommentPlanWidget(WebElement element) {
        super(element);
    }

    public RecommentPlanDetailPage click() throws IllegalAccessException, MalformedURLException, InstantiationException {
        计划名称.click();
        return PageCreator.createPage(RecommentPlanDetailPage.class);
    }


    public MobileElement get计划名称() {
        return 计划名称;
    }

    public MobileElement get书籍数量() {
        return 书籍数量;
    }

    public MobileElement get计划描述() {
        return 计划描述;
    }

    public MobileElement get预计读完天数() {
        return 预计读完天数;
    }

    public MobileElement get原价() {
        return 原价;
    }

    public MobileElement get优惠价格() {
        return 优惠价格;
    }
}
