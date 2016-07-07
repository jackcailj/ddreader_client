package com.dangdang.reader.client.page.plan_pages;

import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.PageCreator;
import com.dangdang.reader.client.page.plan_pages.RecommentPlanPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.net.MalformedURLException;
import java.util.List;

/**
 * Created by cailianjie on 2016-6-23.
 *
 * 兴趣选择页面
 */
public class InterestTagPage extends PageBase{

    @AndroidFindBy(id = "com.dangdang.reader:id/next_tv")
    public MobileElement 挑选读书计划按钮;

    @AndroidFindBy(id = "com.dangdang.reader:id/item_label_tv")
    public List<MobileElement> 标签列表;

    /*
    根据索引获取某个标签
     */
    public RecommentPlanPage 选择标签(int index) throws IllegalAccessException, MalformedURLException, InstantiationException {
        标签列表.get(index).click();
        挑选读书计划按钮.click();
        return PageCreator.createPage(RecommentPlanPage.class);
    }


    /*
    根据标签名称获取某个标签
     */
    public MobileElement 选择标签(String tagName) {
        for (MobileElement mobileElement : 标签列表) {
            if (mobileElement.getText().equals(tagName)) {
                return mobileElement;
            }
        }
        return null;
    }

}
