package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage {

    private WebDriver driver;

    private By pricingLink = By.linkText("Pricing");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPricing() {
        driver.findElement(pricingLink).click();
    }

    public String getTitle() {
        return driver.getTitle();
    }


    public List<String> getPrimaryMenuTexts() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By menuItems = By.cssSelector("#primary-menu li");
        // Wait for menu to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuItems));

        List<String> menuTexts = new ArrayList<>();


        for (WebElement item : driver.findElements(menuItems)) {
            menuTexts.add(item.getText().trim());
        }

        return menuTexts;
    }

}

