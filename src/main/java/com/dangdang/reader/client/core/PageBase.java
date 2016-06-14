package com.dangdang.reader.client.core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

/**
 * Created by cailianjie on 2016-6-2.
 */
public class PageBase {

    int abc;

    /*
       加载配置文件，并初始化类对象
    */
    public static void loadElement(Class clazz)  {

/*        for(Field field:clazz.getFields()){
            System.out.println(field.getName());
        }*/
        PageFactory.initElements(new AppiumFieldDecorator(null, 5, TimeUnit.SECONDS), clazz);
    }

}
