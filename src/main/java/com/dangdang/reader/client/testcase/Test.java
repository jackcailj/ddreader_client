package com.dangdang.reader.client.testcase;

import com.dangdang.reader.client.core.*;
import com.dangdang.reader.client.page.MainPage;
import com.dangdang.reader.client.page.PersonalPage;
import com.dangdang.reader.client.page.personal_pages.MyPlanListPage;
import com.dangdang.reader.client.page.personal_pages.PlanItemWidget;
import com.dangdang.reader.client.page.plan_pages.BuyPlanTipPage;
import com.dangdang.reader.client.page.plan_pages.InterestTagPage;
import com.dangdang.reader.client.page.plan_pages.RecommentPlanDetailPage;
import com.dangdang.reader.client.page.plan_pages.RecommentPlanPage;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

/**
 * Created by cailianjie on 2016-6-2.
 */
public class Test extends TestCaseBase {

    @org.testng.annotations.Test
   public void 购买读书计划() throws IllegalAccessException, MalformedURLException, InstantiationException {

        //打开我的页面
        MainPage mainPage = PageCreator.createPage(MainPage.class);
        PersonalPage personalPage = mainPage.打开我的页面();
        Double goldLingDangNum = personalPage.get金铃铛数量();

        //进入计划兴趣选择页面
        MyPlanListPage myPlanListPage = personalPage.打开我的计划列表页面();
        InterestTagPage interestTagPage = myPlanListPage.打开兴趣选择页面();

        RecommentPlanPage recommentPlanPage = interestTagPage.选择标签(1);
        RecommentPlanDetailPage recommentPlanDetailPage = recommentPlanPage.进入推荐计划详情页面(1);
        String planName = recommentPlanDetailPage.get计划名称();

        //分为免费计划和付费计划。
        Double planPrice = recommentPlanDetailPage.get计划价格();

        if(planPrice==0d){
            //assert (recommentPlanDetailPage.购买计划.getText().equals("免费参与"));
            recommentPlanDetailPage.购买计划();
        }
        else{
            //assert (recommentPlanDetailPage.购买计划.getText().equals("购买计划"));
            recommentPlanDetailPage.购买计划();

            BuyPlanTipPage buyPlanTipPage = recommentPlanDetailPage.购买计划();

            Double buyPlanPrice = buyPlanTipPage.get计划购买价格();
            assert (planPrice==buyPlanPrice);
            buyPlanTipPage.购买计划();
        }


        返回主页();

        //验证铃铛正确
        personalPage = mainPage.打开我的页面();
        assert (personalPage.get金铃铛数量()==goldLingDangNum-planPrice);

        //验证我的计划中的一个为新加入的计划
        myPlanListPage = personalPage.打开我的计划列表页面();

        PlanItemWidget planItem = myPlanListPage.计划列表.get(0);
        assert (planItem.get计划名称().equals(planName));

        返回主页();

   }


   public static void main(String[] args) throws IllegalAccessException, MalformedURLException, InstantiationException {
       try {
           AndroidDriver androidDriver = (AndroidDriver) DriverFactory.getDriver();
           System.out.println(androidDriver.currentActivity());

           MainPage mainPage = PageCreator.createPage(MainPage.class);
           MyPlanListPage myPlanListPage = mainPage.打开我的页面().打开摇一摇页面();
           返回主页();
       }catch (Exception e){

       }
       finally {
           DriverFactory.getDriver().quit();
       }
   }
}
