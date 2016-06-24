package com.dangdang.reader.client.page.personal_pages;

import com.dangdang.reader.client.core.PageCreator;
import com.dangdang.reader.client.page.plan_pages.InterestTagPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.net.MalformedURLException;
import java.util.List;

/**
 * Created by cailianjie on 2016-6-22.
 */
public class MyPlanListPage {

    //@AndroidFindBy(id = "com.dangdang.reader:id/plan_rl")
    public  List<PlanItemWidget> 计划列表;

    @AndroidFindBy(id="com.dangdang.reader:id/add_tv")
    public MobileElement 添加读书计划;


    public MobileElement get添加读书计划() {
        return 添加读书计划;
    }

    public InterestTagPage 打开兴趣选择页面() throws IllegalAccessException, MalformedURLException, InstantiationException {
        添加读书计划.click();

        return PageCreator.createPage(InterestTagPage.class);

    }


}
