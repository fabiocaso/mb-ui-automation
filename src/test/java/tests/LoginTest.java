package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest  extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @Test
    public void userCanLoginSuccessfully() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();
        DashboardPage dashboardPage = loginPage.login();
        Assert.assertTrue(dashboardPage.isLoaded());
        Assert.assertTrue(
                dashboardPage.getWelcomeText().contains("Hello, Fabio Caso")
        );
    }
}
