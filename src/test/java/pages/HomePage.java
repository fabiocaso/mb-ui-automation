package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        List<String> menuTexts = new ArrayList<>();

        List<WebElement> menuItems =
                driver.findElements(By.cssSelector("#primary-menu li"));

        for (WebElement item : menuItems) {
            menuTexts.add(item.getText().trim());
        }

        return menuTexts;
    }

}

