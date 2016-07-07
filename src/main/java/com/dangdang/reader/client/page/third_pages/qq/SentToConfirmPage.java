package com.dangdang.reader.client.page.third_pages.qq;

import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.PageCreator;
import com.dangdang.reader.client.core.Utils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import org.openqa.selenium.OutputType;

import java.net.MalformedURLException;

/**
 * Created by cailianjie on 2016-7-7.
 */
public class SentToConfirmPage extends PageBase{


    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.tencent.mobileqq:id/name\"]")
    public MobileElement 标题;

    @AndroidFindBy(id = "com.tencent.mobileqq:id/tv_summary")
    public MobileElement 内容;

    @AndroidFindBys({
            @AndroidFindBy(id = "com.tencent.mobileqq:id/name"),
            @AndroidFindBy(className = "android.widget.ImageView")})
    public MobileElement 图片;

    @AndroidFindBy(id = "com.tencent.mobileqq:id/dialogRightBtn")
    public MobileElement 发送;

    @AndroidFindBy(id = "com.tencent.mobileqq:id/dialogLeftBtn")
    public MobileElement 取消发送;


    public SentResultPage 发送() throws IllegalAccessException, MalformedURLException, InstantiationException {
        发送.click();

        return PageCreator.createPage(SentResultPage.class);
    }

    public String get标题(){
        return Utils.formatString(标题.getText());
    }

    public String get内容(){
        return Utils.formatString(内容.getText());
    }

    public byte[] get图片(){
        return 图片.getScreenshotAs(OutputType.BYTES);
    }

}
