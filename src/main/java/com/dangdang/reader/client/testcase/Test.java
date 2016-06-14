package com.dangdang.reader.client.testcase;

import com.dangdang.reader.client.core.Device;
import com.dangdang.reader.client.page.BookStorePage;
import com.dangdang.reader.client.page.MainPage;

/**
 * Created by cailianjie on 2016-6-2.
 */
public class Test {

    public static void gotoBookStore(){
        Device.StartApp("com.dangdang.reader");
        MainPage.bookStoreBtn.click();
        BookStorePage.JinRiReDianColumn.moreBtn.click();

    }
}
