package com.dangdang.reader.client.page;

import com.dangdang.reader.client.core.*;
import com.dangdang.reader.client.page.plan_pages.InterestTagPage;
import com.dangdang.reader.client.page.personal_pages.MyPlanListPage;
import com.dangdang.reader.client.page.plan_pages.RecommentPlanDetailPage;
import com.dangdang.reader.client.page.plan_pages.RecommentPlanPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;

import java.net.MalformedURLException;

/**
 * Created by cailianjie on 2016-6-2.
 */

@AndroidFindBy(className="android.widget.FrameLayout1")
public class MainPage extends PageBase {


    @AndroidFindBy(id = "com.dangdang.reader:id/tab_store")
    public static MobileElement 书城;

    @AndroidFindBy(id = "com.dangdang.reader:id/tab_personal")
    public static MobileElement 我的;

    @AndroidFindBy(id = "com.dangdang.reader:id/tab_shelf")
    public static MobileElement 书架;

    @AndroidFindBy(id = "com.dangdang.reader:id/tab_find")
    public static MobileElement 发现;

    @AndroidFindBy(id = "com.dangdang.reader:id/tab_home")
    public static MobileElement 导读;



    public PersonalPage 打开我的页面() throws IllegalAccessException, MalformedURLException, InstantiationException {
        我的.click();
        return PageCreator.createPage(PersonalPage.class);
    }




/*    static {
        loadElement(MainPage.class);
    }*/

    public static void main(String[] args) throws MalformedURLException {

        try {



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

        }
        finally {
            DriverFactory.getDriver().quit();
        }

    }

}
