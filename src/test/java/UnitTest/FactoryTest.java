package UnitTest;

import orangeHRM.Utils.LoginPage;
import org.junit.Test;

public class FactoryTest extends BaseTest{
@Test
public  void  factoryTestMethod(){
System.out.print("factoryTestMethod() is running");
    driver.get(prop.getProperty("url"));
    // Create an instance of LoginPage
    LoginPage loginPage = new LoginPage(driver);
    loginPage.login("Admin","admin123");
    // Perform login
   // loginPage.login(prop.getProperty("userID"), prop.getProperty("passWord"));
}


}
