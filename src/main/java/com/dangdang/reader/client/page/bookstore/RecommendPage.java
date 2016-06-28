package com.dangdang.reader.client.page.bookstore;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * 书城出版页面
 * @author guohaiying
 */
public class RecommendPage {
	
	@AndroidFindBy(id="com.dangdang.reader:id/shopping_cart_iv")
	public MobileElement 购物车;
	
	@AndroidFindBy(id="com.dangdang.reader:id/search_iv")
	public MobileElement 搜索;
	
	//专题
	@FindBy(xpath="//*[@id=\"slider\"]/div/div[1]/div[2]/a/img")
	public  MobileElement 顶部专题;
	
	//入口
	@FindBy(xpath="//*[@id=\"rec_entrance\"]/ul[1]/li[1]")
	public  MobileElement 分类;
	
	@FindBy(xpath="//*[@id=\"rec_entrance\"]/ul[1]/li[2]")
	public  MobileElement 榜单;
	
	@FindBy(xpath="//*[@id=\"rec_entrance\"]/ul[1]/li[3]")
	public  MobileElement 特价;
	
	@FindBy(xpath="//*[@id=\"rec_entrance\"]/ul[1]/li[4]")
	public  MobileElement 原创;
	
	@FindBy(xpath="//*[@id=\"rec_entrance\"]/ul[2]/li[1]")
	public  MobileElement VIP包月;
	
	@FindBy(xpath="//*[@id=\"rec_entrance\"]/ul[2]/li[2]")
	public  MobileElement 借阅;
	
	@FindBy(xpath="//*[@id=\"rec_entrance\"]/ul[2]/li[3]")
	public  MobileElement 青春专场;
	
	@FindBy(xpath="//*[@id=\"rec_entrance\"]/ul[2]/li[4]")
	public  MobileElement 小说专场;
	
	//栏目
	@FindBy(xpath="//*[@id=\"jrkd\"]/div[2]/div[1]/ul[1]/li[1]")
	public  MobileElement 主编推荐;
	
	@FindBy(xpath="//*[@id=\"jrkd\"]/div[3]/span")
	public  MobileElement 主编推荐更多;
	
	@FindBy(xpath="//*[@id=\"rmww\"]/div[2]/div[1]/ul[1]/li[1]")
	public  MobileElement 新书首发;
	
	@FindBy(xpath="//*[@id=\"rmww\"]/div[3]/span")
	public  MobileElement 新书首发更多;
	
	@FindBy(xpath="//*[@id=\"xssf\"]/div[2]/div[1]/ul[1]/li[1]")
	public  MobileElement 小说;
	
	@FindBy(xpath="//*[@id=\"xssf\"]/div[3]/span")
	public  MobileElement 小说更多;
	
	@FindBy(xpath="//*[@id=\"bzzt\"]/div[2]/div[1]/ul[1]/li[1]")
	public  MobileElement 青春;
	
	@FindBy(xpath="//*[@id=\"bzzt\"]/div[3]/span")
	public  MobileElement 青春更多;
	
	@FindBy(xpath="//*[@id=\"dddj\"]/div[2]/div[1]/ul[1]/li[1]")
	public  MobileElement 独家;
		
	@FindBy(xpath="//*[@id=\"dddj\"]/div[3]/span")
	public  MobileElement 独家更多;
		
	@FindBy(xpath="//*[@id=\"yytx\"]/div[2]/div[1]/ul[1]/li[1]")
	public  MobileElement 经管;
		
	@FindBy(xpath="//*[@id=\"yytx\"]/div[3]/span")
	public  MobileElement 经管更多;
		
	@FindBy(xpath="//*[@id=\"mrmj\"]/div[2]/div[1]/ul[1]/li[1]")
	public  MobileElement 励志;
		
	@FindBy(xpath="//*[@id=\"mrmj\"]/div[3]/span")
	public  MobileElement 励志更多;
	
	@FindBy(xpath="//*[@id=\"wzxs\"]/div[2]/div[1]/ul[1]/li[1]")
	public  MobileElement 文艺;
	
	@FindBy(xpath="//*[@id=\"wzxs\"]/div[3]/span")
	public  MobileElement 文艺更多;
	
	@FindBy(xpath="//*[@id=\"lsrw\"]/div[2]/div[1]/ul[1]/li[1]")
	public  MobileElement 历史人文;
	
	@FindBy(xpath="//*[@id=\"lsrw\"]/div[3]/span")
	public  MobileElement 历史人文更多;
	
	@FindBy(xpath="//*[@id=\"shlx\"]/div[2]/div[1]/ul[1]/li[1]")
	public  MobileElement 旅游美食健康;
	
	@FindBy(xpath="//*[@id=\"shlx\"]/div[3]/span")
	public  MobileElement 旅游美食健康更多;
	
	@FindBy(xpath="//*[@id=\"wxxs\"]/div[2]/div[1]/ul[1]/li[1]")
	public  MobileElement 武侠小说;
	
	@FindBy(xpath="//*[@id=\"wxxs\"]/div[3]/span")
	public  MobileElement 武侠小说更多;
	
	@FindBy(xpath="//*[@id=\"ppzq\"]/div[2]/div[1]/ul[1]/li[1]")
	public  MobileElement 名社好书;
	
	@FindBy(xpath="//*[@id=\"ppzq\"]/div[3]/span")
	public  MobileElement 名社好书更多;
	
	

}
