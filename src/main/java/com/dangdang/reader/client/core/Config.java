package com.dangdang.reader.client.core;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by cailianjie on 2016-6-15.
 *
 * 读取配置文件，获取appnium初始化参数
 */
public class Config {

    static  Map<String,String> initAppniumParamMap;

    static String appniumUrl;
    static DeviceType deviceType;

    /*
    获取appniumParam参数
     */
    public static Map<String,String> getAppniumParam(){
        if(initAppniumParamMap==null) {

            Properties properties = ResourceLoader.loadCurrentPropertyFile("conf/appnium_Param.properties");

            String device= (String) properties.get("device");
            deviceType = DeviceType.valueOf(device.toUpperCase());
            appniumUrl= (String) properties.get("appnium_url");

            properties = ResourceLoader.loadCurrentPropertyFile("conf/"+device.toLowerCase()+"_Param.properties");
            initAppniumParamMap = new HashMap<String, String>((Map) properties);
        }

        return initAppniumParamMap;
    }

    /*
    根据配置文件生成DesiredCapabilities对象
     */
    public static DesiredCapabilities getAppniumDesiredCapabilities(){
        Map<String,String> appniumParam = getAppniumParam();

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        for (String key:appniumParam.keySet()){
            desiredCapabilities.setCapability(key,appniumParam.get(key));
        }
        return desiredCapabilities;
    }


    public static DeviceType getDeviceType() {
        return deviceType;
    }

    public static void setDeviceType(DeviceType deviceType) {
        Config.deviceType = deviceType;
    }

    public static String getAppniumUrl() {
        return appniumUrl;
    }

    public static void setAppniumUrl(String appniumUrl) {
        Config.appniumUrl = appniumUrl;
    }
}
