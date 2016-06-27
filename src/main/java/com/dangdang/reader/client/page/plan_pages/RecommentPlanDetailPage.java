package com.dangdang.reader.client.page.plan_pages;

import com.dangdang.reader.client.core.PageCreator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.net.MalformedURLException;
import java.util.List;

/**
 * Created by cailianjie on 2016-6-23.
 */
public class RecommentPlanDetailPage {

    @AndroidFindBy(id="com.dangdang.reader:id/recommend_plan_detail_name_tv")
    MobileElement 计划名称;

    @AndroidFindBy(id="com.dangdang.reader:id/recommend_plan_detail_book_count_tv")
    MobileElement 书籍数量;

    @AndroidFindBy(id="com.dangdang.reader:id/recommend_plan_detail_desc_tv")
    MobileElement 计划描述;

    @AndroidFindBy(id="com.dangdang.reader:id/recommend_plan_detail_days_tv")
    MobileElement 预计读完天数;

    @AndroidFindBy(id="com.dangdang.reader:id/recommend_plan_detail_original_price_tv")
    MobileElement 原价;

    @AndroidFindBy(id="com.dangdang.reader:id/recommend_plan_detail_sale_price_tv")
    MobileElement 优惠价格;

    @AndroidFindBy(id="com.dangdang.reader:id/book_item_rl")
    List<TraingInfoWidget> 训练列表;

    @AndroidFindBy(id="com.dangdang.reader:id/buy_plan_tv")
    MobileElement 购买计划;


    public BuyPlanTipPage 购买计划() throws IllegalAccessException, MalformedURLException, InstantiationException {
        购买计划.click();

        return PageCreator.createPage(BuyPlanTipPage.class);
    }
}
