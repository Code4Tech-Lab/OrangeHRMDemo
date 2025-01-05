package UnitTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import orangeHRM.Utils.Bean;
import orangeHRM.Utils.ReadPropFile;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public Properties prop;

    public Properties readFile() throws IOException {
        FileInputStream newFile = new FileInputStream(new File("browserSpecification.properties"));
        Properties prop = new Properties();
        prop.load(newFile);
        return prop;


    }


    @Before
    public void openBrowser() throws IOException {
        prop = readFile();
        String browser = prop.getProperty("browser");
        String userID = prop.getProperty("userID");
        String passWord = prop.getProperty("password");
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.out.println("Blank browser is there");
            driver.get(prop.getProperty("url"));


        } else {
            System.out.println("Set browser");
        }

    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        if (!(driver == null)) {

            driver.quit();
            System.out.print("ALL browser has been closed");
        }

    }
}
