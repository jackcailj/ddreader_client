package com.dangdang.reader.client.page.bookstore;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.dangdang.reader.client.core.PageBase;
import com.dangdang.reader.client.core.PageCreator;
import com.dangdang.reader.client.page.MainPage;


public class TTWidget extends PageBase{

	@Test
	public void testAA() throws IllegalAccessException, InstantiationException, MalformedURLException{
		MainPage mainPage = PageCreator.createPage(MainPage.class);
		mainPage.button.click();
		mainPage.aa.click();
		mainPage.书城.click();
		//System.out.println("activity:" + driver.currentActivity());
		TTWidget ttPage = PageCreator.createPage(TTWidget.class);		
		Set<String> contextNames = driver.getContextHandles();
		System.out.println("aaaaa" + contextNames);
		
		driver.context("WEBVIEW_com.dangdang.reader"); 
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"rec_entrance\"]/ul[1]/li[1]/a"));
		ele.click();
	}
	
	public static void main(String[] args){
		
	}

}
