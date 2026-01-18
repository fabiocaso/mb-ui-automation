package pages;

import config.CredentialsProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class LoginPage {
    private WebDriver driver;
    private WaitUtils wait;
    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("kc-login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtils(driver);
    }

    public void navigateToLoginPage() throws InterruptedException {
      driver.get("https://my.malwarebytes.com/secure-hub");
      wait.waitForVisible(usernameInput);
    }

    public DashboardPage login() throws InterruptedException {
        driver.findElement(usernameInput).sendKeys(CredentialsProvider.getUserName());
        driver.findElement(passwordInput).sendKeys(CredentialsProvider.getPassword());
        driver.findElement(loginButton).click();
        Thread.sleep(15000); //Wait for the email security code
        return new DashboardPage(driver);
    }

}
