package com.dangdang.reader.client.page.plan_pages;

import com.alibaba.fastjson.serializer.DoubleArraySerializer;
import com.dangdang.reader.client.core.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by cailianjie on 2016-6-23.
 */
public class BuyPlanTipPage extends PageBase{

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


    public Integer get计划购买价格(){
        return Integer.parseInt(需支付铃铛.getText().replace("铃铛",""));
    }

    public Integer get铃铛余额(){
        return Integer.parseInt(铃铛余额.getText().replace("铃铛",""));
    }

}
