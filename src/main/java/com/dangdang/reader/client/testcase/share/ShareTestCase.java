package com.dangdang.reader.client.testcase.share;

import com.dangdang.reader.client.core.PageCreator;
import com.dangdang.reader.client.core.TestCaseBase;
import com.dangdang.reader.client.page.MainPage;
import com.dangdang.reader.client.page.common_pages.ShareToTipPage;
import com.dangdang.reader.client.page.plan_pages.PlanDetailPage;
import com.dangdang.reader.client.page.third_pages.qq.SentResultPage;
import com.dangdang.reader.client.page.third_pages.qq.SentToConfirmPage;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by cailianjie on 2016-7-7.
 */
public class ShareTestCase extends TestCaseBase{

    @Test
    public void 分享读书计划详情到QQ() throws IllegalAccessException, MalformedURLException, InstantiationException {

        MainPage mainPage  = PageCreator.createPage(MainPage.class);
        PlanDetailPage planDetailPage = mainPage.打开我的页面().打开我的计划列表页面().进入计划详情页();
        String planName=planDetailPage.get计划名称();
        String planDesc=planDetailPage.get计划描述();

        SentToConfirmPage sentToConfirmPage = planDetailPage.打开分享页面().分享到QQ好友().发送到我的电脑();
        assert (sentToConfirmPage.get标题().equals(planName));
        assert (planDesc.contains(sentToConfirmPage.get内容().replace("...","")));

        SentResultPage sentResultPage= sentToConfirmPage.发送();
        assert (sentResultPage.is发送成功()==true);

        sentResultPage.返回当当读书();

        返回主页();
    }
}
