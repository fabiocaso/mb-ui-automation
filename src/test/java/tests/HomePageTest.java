package tests;

import base.BaseTest;
import pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomePageTest extends BaseTest {


    @Test
    public void verifyHomePageTitle() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.getTitle().contains("Malwarebytes"));
    }

    @Test
    public void verifySiteNavigation() {
        HomePage homePage = new HomePage(driver);

        List<String> actualMenu = homePage.getPrimaryMenuTexts();

        List<String> expectedMenu = List.of(
                "Pricing",
                "Personal",
                "Partners",
                "Resources",
                "Business",
                "Help"
        );

        for (String expectedItem : expectedMenu) {
            Assert.assertTrue(
                    actualMenu.contains(expectedItem),
                    "Missing menu item: " + expectedItem
            );
        }
    }

}
