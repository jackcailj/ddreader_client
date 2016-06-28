package com.dangdang.reader.client.core;

/**
 * Created by cailianjie on 2016-6-24.
 */


import com.dangdang.reader.client.core.DriverFactory;
import com.dangdang.reader.client.core.LoggerUtils;
import org.apache.log4j.*;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestCaseBase {

    @BeforeMethod
    /*
    * 构造日志文件，将一个测试用例的日志保存到一个文件中
    * */
    public void methodSetUp(Method method) throws IOException {

        LoggerUtils.addFileAppender(method.getName());
    }

    @AfterMethod
    public void methodTearDown(){
        LoggerUtils.removeAppender();
    }


    @AfterSuite
    public void suitTearDown() throws MalformedURLException {
        DriverFactory.getDriver().quit();
    }
}
