package orangeHRM.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    // Constructor to initialize WebDriver and PageFactory
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize elements using PageFactory
    }

    // WebElement for username input field
    @FindBy(xpath = "//input[@name='username']")  // Locate the username field by ID
    private WebElement usernameField;

    // WebElement for password input field
    @FindBy(id = "password")  // Locate the password field by ID
    private WebElement passwordField;

    // WebElement for login button
    @FindBy(id = "loginBtn")  // Locate the login button by ID
    private WebElement loginButton;

    // Getter and Setter for username
    public WebElement getUsernameField() {
        return usernameField;
    }

    public void setUsername(String username) {
        getUsernameField().sendKeys(username);
    }

    // Getter and Setter for password
    public WebElement getPasswordField() {
        return passwordField;
    }

    public void setPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    // Getter for login button and action to click it
    public WebElement getLoginButton() {
        return loginButton;
    }

    public void clickLoginButton() {
        getLoginButton().click();
    }

    // Login method combining the above methods
    public void login(String username, String password) {
        setUsername(username);       // Set username using setter method
        setPassword(password);       // Set password using setter method
        clickLoginButton();          // Click the login button using getter method
    }
}
