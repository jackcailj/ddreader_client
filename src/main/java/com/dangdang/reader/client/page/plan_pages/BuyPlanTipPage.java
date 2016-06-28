package com.dangdang.reader.client.page.plan_pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by cailianjie on 2016-6-23.
 */
public class BuyPlanTipPage {

    @AndroidFindBy(id="com.dangdang.reader:id/price_tv")
    MobileElement 需支付铃铛;

    @AndroidFindBy(id="com.dangdang.reader:id/account_tv")
    MobileElement 铃铛余额;

    @AndroidFindBy(id="com.dangdang.reader:id/buy_cancel")
    MobileElement 不买了;

    @AndroidFindBy(id="com.dangdang.reader:id/buy_submit")
    MobileElement 确定购买;


    public void 取消购买(){
        不买了.click();
    }

    public void 购买计划(){
        确定购买.click();
    }


    public Double get计划购买价格(){
        return Double.parseDouble(需支付铃铛.getText());
    }
}
