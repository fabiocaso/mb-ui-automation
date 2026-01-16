package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}

