package com.dangdang.reader.client.page.third_pages.qq;

import com.dangdang.reader.client.core.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

/**
 * Created by cailianjie on 2016-7-7.
 */
public class SentResultPage extends PageBase{

    @AndroidFindBys({
            @AndroidFindBy(id ="com.tencent.mobileqq:id/name"),
            @AndroidFindBy(className = "android.widget.TextView")
    })

    public MobileElement 发送结果;


    @AndroidFindBy(id ="com.tencent.mobileqq:id/dialogRightBtn")
    public MobileElement 留在QQ;


    @AndroidFindBy(id ="com.tencent.mobileqq:id/dialogLeftBtn")
    public MobileElement 返回当当读书;

    public boolean is发送成功(){
        return 发送结果.getText().equals("发送成功");
    }

    public void 返回当当读书(){
        返回当当读书.click();
    }

    public void 留在QQ(){
        留在QQ.click();
    }

}
