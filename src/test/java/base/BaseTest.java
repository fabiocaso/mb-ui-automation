package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {

        String baseUrl = ConfigReader.get("base.url");

        String os = System.getProperty("os.name").toLowerCase();
        boolean isLinux = os.contains("linux");

        boolean headless = Boolean.parseBoolean(ConfigReader.get("headless"));

        ChromeOptions options = new ChromeOptions();

        options.addArguments(
                "--no-sandbox",
                "--disable-dev-shm-usage",
                "--disable-gpu",
                "--window-size=1920,1080"
        );

        if (headless || isLinux) {
            options.addArguments("--headless=new");
        }

        System.out.println("Chrome options: " + options.asMap());

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}