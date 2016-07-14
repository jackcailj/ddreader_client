package com.dangdang.reader.client.core;

/**
 * Created by cailianjie on 2016-7-7.
 */
public class Utils {

    static String[] cn=new String[]{"？","《","》","，","。","；","‘","“","’","”","（","）","『","』","、","×","……","！","，"};
    static String[] en=new String[]{"?","<",">",",",".",";","'","\"","'","\"","(",")","[","]","","*","...","!",","};

    public static String formatString(String str){

        String strReplace = str;
        for(int i=0;i<cn.length;i++){
            strReplace = strReplace.replace(cn[i],en[i]);
        }

        return strReplace;
    }


    public static void main(String[] args){
        String str ="你有多久没读完一本书了?立即加入读书计划,不再为懒惰找借口，让阅读成为生活中必不可少的营养品！";

        System.out.println(formatString(str));
    }
}
