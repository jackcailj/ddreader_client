package com.dangdang.reader.client.page.plan_pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.Widget;
import org.openqa.selenium.WebElement;

/**
 * Created by cailianjie on 2016-6-23.
 */

public class TraingInfoWidget extends Widget{

    @AndroidFindBy(id="com.dangdang.reader:id/book_name_tv")
    MobileElement 书籍名称;

    @AndroidFindBy(id="com.dangdang.reader:id/book_author_tv")
    MobileElement 作者;

    @AndroidFindBy(id="com.dangdang.reader:id/book_price_tv")
    MobileElement 价格;

    @AndroidFindBy(id="com.dangdang.reader:id/days_tv")
    MobileElement 预计阅读时间;

    @AndroidFindBy(id="com.dangdang.reader:id/desc_tv")
    MobileElement 书籍描述;

    @AndroidFindBy(id="com.dangdang.reader:id/book_cover_iv")
    MobileElement 书籍封面;


    protected TraingInfoWidget(WebElement element) {
        super(element);
    }
}
