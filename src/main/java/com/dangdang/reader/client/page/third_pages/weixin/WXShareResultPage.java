package com.dangdang.reader.client.page.third_pages.weixin;

import com.dangdang.reader.client.core.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by cailianjie on 2016-7-12.
 */
public class WXShareResultPage extends PageBase{

    @AndroidFindBy(id = "com.tencent.mm:id/a7b")
    MobileElement 返回当当读书客户端;

    @AndroidFindBy(id = "com.tencent.mm:id/a7o")
    MobileElement 留在微信;

    @AndroidFindBy(id = "com.tencent.mm:id/a7f")
    MobileElement 发送结果;


    public Boolean is分享成功(){
        return "已发送".equals(发送结果.getText());
    }

    public void 返回当当读书客户端(){
        返回当当读书客户端.click();
    }

    public void 留在微信(){
        留在微信.click();
    }
}
