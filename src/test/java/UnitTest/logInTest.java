package UnitTest;


import orangeHRM.Utils.Bean;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class logInTest extends BaseTest {

    @Test
    public void testMethodHRM() throws InterruptedException {



            // Create a LoginCredentials object to store login details



        try {



                System.out.println("Login Attempted!");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Close the browser

                Thread.sleep(5000);
                driver.quit();
            }
        }


    @Test
    public void testMethod() throws InterruptedException {


        // Create a LoginCredentials object to store login details
        Bean loginCredentials = new Bean("Admin", "admin123");

        try {

            Thread.sleep(5000);
            // Find the username and password input fields and the login button
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys(loginCredentials.getUsername());
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys(loginCredentials.getPassword());
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@type='submit']")).click();


            System.out.println("Hurray!!!!!!   Login Attempted!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser

            Thread.sleep(5000);
            driver.quit();
        }
    }
}
