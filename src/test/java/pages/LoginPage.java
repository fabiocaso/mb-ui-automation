package pages;

import config.CredentialsProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tests.LoginTest;
import utils.WaitUtils;

public class LoginPage {
    private WebDriver driver;
    private WaitUtils wait;
    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("kc-login");

    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

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
        log.debug(">>>Username: "+CredentialsProvider.getUserName());
        driver.findElement(passwordInput).sendKeys(CredentialsProvider.getPassword());
        log.debug(">>>Password: "+CredentialsProvider.getPassword());
        driver.findElement(loginButton).click();
        return new DashboardPage(driver);
    }

}
