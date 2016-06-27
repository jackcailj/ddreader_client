package com.dangdang.reader.client.page.plan_pages;

import com.dangdang.reader.client.core.PageCreator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.net.MalformedURLException;
import java.util.List;

/**
 * Created by cailianjie on 2016-6-23.
 */
public class RecommentPlanPage {

    List<RecommentPlanWidget> 推荐计划列表;

    @AndroidFindBy(tagName = "+自定义计划")
    MobileElement 自定义计划;


    public CustomPlanPage 打开自定义计划页面() throws IllegalAccessException, MalformedURLException, InstantiationException {
        自定义计划.click();

        return PageCreator.createPage(CustomPlanPage.class);
    }

    public RecommentPlanDetailPage 进入推荐计划详情页面(int index) throws IllegalAccessException, MalformedURLException, InstantiationException {
        return 推荐计划列表.get(index).click();
    }
}
