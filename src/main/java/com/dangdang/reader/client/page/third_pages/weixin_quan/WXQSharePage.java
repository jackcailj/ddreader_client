package com.dangdang.reader.client.page.third_pages.weixin_quan;

import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.Utils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by cailianjie on 2016-7-12.
 */
public class WXQSharePage extends PageBase{

    @AndroidFindBy(id = "com.tencent.mm:id/eg")
    MobileElement 发送按钮;

    @AndroidFindBy(id = "com.tencent.mm:id/b5e")
    MobileElement 想法编辑框;

    @AndroidFindBy(id = "com.tencent.mm:id/bb0")
    MobileElement 计划名称;


    public String get计划名称(){
        return Utils.formatString(计划名称.getText());
    }

    public void 分享到朋友圈(String 想法){
        if(StringUtils.isNotBlank(想法)){
            想法编辑框.setValue(想法);
        }

        发送按钮.click();

    }
}
