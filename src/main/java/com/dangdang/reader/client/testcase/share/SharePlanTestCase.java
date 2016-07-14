package com.dangdang.reader.client.testcase.share;

import com.dangdang.reader.client.core.PageCreator;
import com.dangdang.reader.client.core.TestCaseBase;
import com.dangdang.reader.client.page.MainPage;
import com.dangdang.reader.client.page.common_pages.ShareToTipPage;
import com.dangdang.reader.client.page.plan_pages.PlanDetailPage;
import com.dangdang.reader.client.page.third_pages.qq.SentResultPage;
import com.dangdang.reader.client.page.third_pages.qq.SentToConfirmPage;
import com.dangdang.reader.client.page.third_pages.qqzone.QQZonePublishPage;
import com.dangdang.reader.client.page.third_pages.weixin.WXLiuYanPage;
import com.dangdang.reader.client.page.third_pages.weixin.WXSelectShareObjectPage;
import com.dangdang.reader.client.page.third_pages.weixin.WXShareResultPage;
import com.dangdang.reader.client.page.third_pages.weixin_quan.WXQSharePage;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by cailianjie on 2016-7-7.
 */
public class SharePlanTestCase extends TestCaseBase{

    String planName;
    String planDesc;
    PlanDetailPage planDetailPage;

    @BeforeClass
    public void beforeTestCase() throws IllegalAccessException, MalformedURLException, InstantiationException {
        MainPage mainPage  = PageCreator.createPage(MainPage.class);
        planDetailPage = mainPage.打开我的页面().打开我的计划列表页面().进入计划详情页();
        planName=planDetailPage.get计划名称();
        planDesc=planDetailPage.get计划描述();
    }

    @AfterClass
    public void afterTestCase() throws MalformedURLException {
        返回主页();
    }

    @Test
    public void 分享读书计划详情到QQ() throws Exception {

        try {
            SentToConfirmPage sentToConfirmPage = planDetailPage.打开分享页面().分享到QQ好友().发送到我的电脑();
            assert (sentToConfirmPage.get标题().equals(planName));
            assert (planDesc.contains(sentToConfirmPage.get内容().replace("...", "")));

            SentResultPage sentResultPage = sentToConfirmPage.发送();
            assert (sentResultPage.is发送成功() == true);

            sentResultPage.返回当当读书();
        }catch (Exception e){
            throw e;
        }
        finally {
            返回当当读书();
        }
        //返回主页();
    }


    @Test
    public void 分享读书计划详情到QQ空间() throws Exception {
        try {
            QQZonePublishPage qqZonePublishPage = planDetailPage.打开分享页面().分享到QQ空间();

            assert (planName.equals(qqZonePublishPage.get计划名称()));
            assert (planDesc.contains(qqZonePublishPage.get计划描述().replace("...", "")));

            qqZonePublishPage.发表分享();
        }catch (Exception e){
            throw e;

        }
        finally {
            返回当当读书();
        }
        //返回主页();
    }


    @Test
    public void 分享读书计划详情到微信好友() throws Exception {

        try {
            WXSelectShareObjectPage wxSelectShareObjectPage = planDetailPage.打开分享页面().分享到微信好友();
            WXLiuYanPage wxLiuYanPage = wxSelectShareObjectPage.分享给第一个联系人();


            assert (planName.equals(wxLiuYanPage.get计划名称()));
            assert (planDesc.contains(wxLiuYanPage.get计划描述()));

            WXShareResultPage wxShareResultPage = wxLiuYanPage.留言并分享("当当读书计划，精彩");
            assert (wxShareResultPage.is分享成功());

            wxShareResultPage.返回当当读书客户端();
        }catch (Exception e){
            throw e;
        }
        finally {
            返回当当读书();
        }
        //返回主页();
    }


    @Test
    public void 分享读书计划详情到微信朋友圈() throws Exception {

        try {
            WXQSharePage wxqSharePage = planDetailPage.打开分享页面().分享到微信朋友圈();

            assert (planName.equals(wxqSharePage.get计划名称()));

            wxqSharePage.分享到朋友圈("当当读书计划，很精彩！");
        }catch (Exception e){
            throw e;
        }
        finally {
            返回当当读书();
        }

        //返回主页();
    }

    @Test()
    public void 分享读书计划详情到新浪微博() throws IllegalAccessException, MalformedURLException, InstantiationException {

        throw new SkipException("未完成");

        /*WXQSharePage wxqSharePage = planDetailPage.打开分享页面().分享到微信朋友圈();

        assert (planName.equals(wxqSharePage.get计划名称()));

        wxqSharePage.分享到朋友圈("当当读书计划，很精彩！");

        返回主页();*/
    }

}
