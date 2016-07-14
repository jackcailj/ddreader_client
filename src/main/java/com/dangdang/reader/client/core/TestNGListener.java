package com.dangdang.reader.client.core;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * Created by cailianjie on 2016-6-28.
 */
public class TestNGListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult tr) {
        Device.截屏();
        super.onTestFailure(tr);
        try {
            ((TestCaseBase) tr.getInstance()).用例结束返回();
        }catch (Exception e){

        }
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);

        try {
            ((TestCaseBase) tr.getInstance()).用例结束返回();
        }catch (Exception e){

        }
    }
}
