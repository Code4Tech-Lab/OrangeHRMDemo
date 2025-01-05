package orange.Hrm;


import UnitTest.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends BaseTest {
    @Test
    public void logInTestDemo() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        if (driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
            System.out.println(" Log In Successful");
        } else {
            System.out.println("log in Failed");
        }
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void verifyPageTitle() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        if (driver.getTitle().equals("OrangeHRM")) {
            System.out.println("page title verifiyed");
        } else {
            System.out.println("Check page title one more time");
        }
        Thread.sleep(5000);
        driver.quit();
    }

}
