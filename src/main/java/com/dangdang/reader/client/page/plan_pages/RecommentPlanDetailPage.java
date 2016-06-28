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
    public MobileElement 计划名称;

    @AndroidFindBy(id="com.dangdang.reader:id/recommend_plan_detail_book_count_tv")
    public MobileElement 书籍数量;

    @AndroidFindBy(id="com.dangdang.reader:id/recommend_plan_detail_desc_tv")
    public MobileElement 计划描述;

    @AndroidFindBy(id="com.dangdang.reader:id/recommend_plan_detail_days_tv")
    public MobileElement 预计读完天数;

    @AndroidFindBy(id="com.dangdang.reader:id/recommend_plan_detail_original_price_tv")
    public MobileElement 原价;

    @AndroidFindBy(id="com.dangdang.reader:id/recommend_plan_detail_sale_price_tv")
    public MobileElement 优惠价格;

    @AndroidFindBy(id="com.dangdang.reader:id/book_item_rl")
    public List<TraingInfoWidget> 训练列表;

    @AndroidFindBy(id="com.dangdang.reader:id/buy_plan_tv")
    public MobileElement 购买计划;


    public BuyPlanTipPage 购买计划() throws IllegalAccessException, MalformedURLException, InstantiationException {
        购买计划.click();

        return PageCreator.createPage(BuyPlanTipPage.class);
    }

    public Double get计划价格(){

        if(优惠价格.getText().equals("免费")){
            return 0d;
        }

        Double planPrice = Double.parseDouble(优惠价格.getText());

        return planPrice;
    }

    public String get计划原价(){
        return 原价.getText();
    }
}
