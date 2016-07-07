package com.dangdang.reader.client.page.plan_pages;

import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.PageCreator;
import com.dangdang.reader.client.core.Utils;
import com.dangdang.reader.client.page.common_pages.ShareToTipPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.net.MalformedURLException;

/**
 * Created by cailianjie on 2016-7-7.
 */
public class PlanDetailPage extends PageBase{

    @AndroidFindBy(id = "com.dangdang.reader:id/title_layout_common_menu_btn")
    public MobileElement 分享;


    @AndroidFindBy(id="com.dangdang.reader:id/name_tv")
    MobileElement 计划名称;

    @AndroidFindBy(id="com.dangdang.reader:id/begin_time_tv")
    MobileElement 计划开始时间;


    @AndroidFindBy(id="com.dangdang.reader:id/remaining_days_tv")
    MobileElement 剩余时间;

    @AndroidFindBy(id="com.dangdang.reader:id/percent_tv")
    MobileElement 总体进度;

    @AndroidFindBy(id="com.dangdang.reader:id/desc_tv")
    MobileElement 计划描述;




    public ShareToTipPage 打开分享页面() throws IllegalAccessException, MalformedURLException, InstantiationException {
        分享.click();
        return PageCreator.createPage(ShareToTipPage.class);
    }

    public String get计划名称() {
        return Utils.formatString(计划名称.getText());
    }

    public String get计划开始时间() {
        return 计划开始时间.getText();
    }

    public String get剩余时间() {
        return 剩余时间.getText();
    }

    public String get总体进度() {
        return 总体进度.getText();
    }

    public String get计划描述() {
        return Utils.formatString(计划描述.getText());
    }
}
