package com.dangdang.reader.client.testcase.bookstore;

import java.net.MalformedURLException;
import java.util.Set;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.PageCreator;
import com.dangdang.reader.client.page.MainPage;
import com.dangdang.reader.client.page.bookstore.RecommendPage;

public class TestA extends PageBase{
	RecommendPage page;
	
	@BeforeClass
	public void setUp() throws IllegalAccessException, InstantiationException, MalformedURLException{
		MainPage mainPage = PageCreator.createPage(MainPage.class);
		mainPage.button.click();
		mainPage.aa.click();
		mainPage.书城.click();
		page = PageCreator.createPage(RecommendPage.class);
		driver.context("WEBVIEW_com.dangdang.reader"); 
	}
	
	@Test
	public void testAA(){
		Set<String> contextNames = driver.getContextHandles();
		System.out.println("aaaaa" + contextNames);
		driver.context("WEBVIEW_com.dangdang.reader"); 
		page.分类.click();
		
	}

}
