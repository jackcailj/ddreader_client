package com.dangdang.reader.client.page.personal_pages;

/**
 * Created by cailianjie on 2016-6-22.
 */
public enum  PersonalMenu {
    读书计划("读书计划"),
    读书活动("读书计划"),
    收藏图书("图书"),
    收藏文章("文章"),
    收藏帖子("帖子"),
    笔记("笔记"),
    摇一摇("摇一摇"),
    我的订单("订单"),
    签到("签到");

    String content="";

    PersonalMenu(String text){
        content =text;
    }
}
