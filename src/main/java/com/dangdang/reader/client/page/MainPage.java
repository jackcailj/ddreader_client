package com.dangdang.reader.client.page;

import com.dangdang.reader.client.core.*;
import com.dangdang.reader.client.page.plan_pages.InterestTagPage;
import com.dangdang.reader.client.page.personal_pages.MyPlanListPage;
import com.dangdang.reader.client.page.plan_pages.RecommentPlanDetailPage;
import com.dangdang.reader.client.page.plan_pages.RecommentPlanPage;
import com.dangdang.reader.client.page.start_pages.AdPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

/**
 * Created by cailianjie on 2016-6-2.
 */

@AndroidFindBy(className="android.widget.FrameLayout1")
public class MainPage extends PageBase {

	@AndroidFindBy(id = "com.dangdang.reader:id/dialog_left_button")
	public MobileElement button;
	
	@AndroidFindBy(id = "com.dangdang.reader:id/dots_ll")
	public  MobileElement aa;
		
    @AndroidFindBy(id = "com.dangdang.reader:id/tab_store")
    @iOSFindBy(uiAutomator = ".tabBar().buttons()[\"书城\"]")
    public  MobileElement 书城;

    @AndroidFindBy(id = "com.dangdang.reader:id/tab_personal")
    //@iOSFindBy(xpath = "//UIAButton[@name=\"我的\"]")
    @iOSFindBy(uiAutomator = ".tabBar().buttons()[\"我的\"]")
    public  MobileElement 我的;

    @AndroidFindBy(id = "com.dangdang.reader:id/tab_shelf")
    @iOSFindBy(uiAutomator = ".tabBar().buttons()[\"书架\"]")
    public  MobileElement 书架;

    @AndroidFindBy(id = "com.dangdang.reader:id/tab_find")
    @iOSFindBy(uiAutomator = ".tabBar().buttons()[\"发现\"]")
    public  MobileElement 发现;

    @AndroidFindBy(id = "com.dangdang.reader:id/tab_home")
    @iOSFindBy(uiAutomator = ".tabBar().buttons()[\"导读\"]")
    public  MobileElement 导读;


    @iOSFindBy(uiAutomator = ".images()[\"CloudShelf_Guide_Desc\"]")
    @WithTimeout(time=5,unit= TimeUnit.SECONDS)
    public MobileElement 引导;



    @Override
    public void setUp() {
        try{
            引导.click();
        }
        catch (Exception e){
            System.out.println(LoggerUtils.getStrackTrace(e));
        }
    }

    public PersonalPage 打开我的页面() throws IllegalAccessException, MalformedURLException, InstantiationException {
        我的.click();
        return PageCreator.createPage(PersonalPage.class);
    }

    @Test
    public void test() throws IllegalAccessException, InstantiationException, MalformedURLException{
    	MainPage mainPage = PageCreator.createPage(MainPage.class);
    	mainPage.button.click();
    }


/*     {
        loadElement(MainPage.class);
    }*/

    public static void main(String[] args) throws MalformedURLException {

        try {
            //AdPage adPage = PageCreator.createPage(AdPage.class);
            //MainPage mainPage =adPage.滑动广告图片().选择标签().订阅频道();
        	MainPage mainPage = PageCreator.createPage(MainPage.class);
        	mainPage.打开我的页面().打开摇一摇页面();
        	

            //Thread.sleep(10000);
            /*int i=0;
            Dimension firstDim =null;
            for (PlanItem item: myPlanListPage.计划列表) {

                if(i==0){
                    firstDim = item.getWrappedElement().getSize();
                }
                else if(i>0){

                    Point point = item.getWrappedElement().getLocation();
                    Dimension rectangle = myPlanListPage.get添加读书计划().getSize();//item.getWrappedElement().getSize();


                    DriverFactory.getDriver().swipe(point.getX()+100,point.getY(),point.getX()+100,point.getY()-rectangle.getHeight(),2000);
                }

                System.out.println(item.get计划名称());
                System.out.println(item.get书籍名称());
                System.out.println(item.get剩余时间());
                System.out.println(item.get总体进度());
                System.out.println(item.get计划价格());
                System.out.println(item.get预计读完时间());

                i++;
    *//*            Map<String,String> params = new HashMap<String,String>();
                params.put("element","com.dangdang.reader:id/plan_rl");
                params.put("text","《鲁豫有约之财智过人(电子书)》");*//*


            }
*/
  /*          Thread.sleep(10000);

            AndroidDriver driver = (AndroidDriver) DriverFactory.getDriver();
            Set<String> contexts = driver.getContextHandles();
            for(String context : contexts){
                System.out.println(context);
            }
            System.out.println();*/

        }catch (Exception e){
            System.out.println(LoggerUtils.getStrackTrace(e));
        }
        finally {
            DriverFactory.getDriver().quit();
        }

    }

}
