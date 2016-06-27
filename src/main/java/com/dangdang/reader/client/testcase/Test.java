package com.dangdang.reader.client.testcase;

import com.dangdang.reader.client.core.Device;
import com.dangdang.reader.client.core.PageCreator;
import com.dangdang.reader.client.page.BookStorePage;
import com.dangdang.reader.client.page.MainPage;
import com.dangdang.reader.client.page.personal_pages.MyPlanListPage;
import com.dangdang.reader.client.page.plan_pages.InterestTagPage;
import com.dangdang.reader.client.page.plan_pages.RecommentPlanDetailPage;
import com.dangdang.reader.client.page.plan_pages.RecommentPlanPage;

import java.net.MalformedURLException;

/**
 * Created by cailianjie on 2016-6-2.
 */
public class Test {

    @org.testng.annotations.Test
   public void 购买读书计划() throws IllegalAccessException, MalformedURLException, InstantiationException {
       MainPage mainPage = PageCreator.createPage(MainPage.class);
       MyPlanListPage myPlanListPage = mainPage.打开我的页面().打开我的计划列表页面();
       InterestTagPage interestTagPage = myPlanListPage.打开兴趣选择页面();

       RecommentPlanPage recommentPlanPage = interestTagPage.选择标签(1);
       RecommentPlanDetailPage recommentPlanDetailPage = recommentPlanPage.进入推荐计划详情页面(1);

       recommentPlanDetailPage.购买计划().取消购买();
       recommentPlanDetailPage.购买计划().购买计划();
   }
}
