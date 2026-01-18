package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class DashboardPage {

    private WebDriver driver;
    private WaitUtils wait;

    private By pageTitle = By.xpath("//h1[contains(text(),'Hello')]");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtils(driver);
    }

    public boolean isLoaded() {
        wait.waitForVisible(pageTitle);
        return driver.findElement(pageTitle).isDisplayed();
    }

    public String getWelcomeText() {
        return driver.findElement(pageTitle).getText();
    }
}
