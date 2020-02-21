package selenium.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testbase {
    public static WebDriver driver = new ChromeDriver();
    public WebDriverWait wait = new WebDriverWait(driver, 15);

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://allegro.pl");
    }

    public void endTest() {
        driver.quit();
    }
}