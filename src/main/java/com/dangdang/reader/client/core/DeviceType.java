package com.dangdang.reader.client.core;

/**
 * Created by cailianjie on 2016-6-15.
 */
public enum DeviceType {
    ANDROID("android"),
    IOS("ios");


    String content="";

    DeviceType (String type) {
        content=type;
    }
}
