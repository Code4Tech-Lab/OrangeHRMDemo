package UnitTest;

import orangeHRM.Utils.Bean;
import org.junit.Test;

public class ContructorTest  extends BaseTest{
   @Test
     public void homePage(){
       driver.get(prop.getProperty("url"));
         System.out.println("good morning");

     }
    @Test
    public void homePage1(){
        driver.get(prop.getProperty("url"));
        Bean bean=new Bean(prop.getProperty("userID"),"passWord" );
        System.out.println("Good Luck");


    }

    @Test
    public void homePage2(){
        System.out.println("Hey Heilly");


    }
}
