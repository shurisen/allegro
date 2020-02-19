import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import java.util.List;

public class Test {
    public static WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 15);
    public void setUp() {

        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\!!W\\Selenium\\allegro\\chromedriver.exe");
//        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);
    }


    public void testAllegro() throws InterruptedException {
        driver.get("https://allegro.pl");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[7]/div/div[2]/div/div[2]/button[2]")));
        driver.findElement(By.xpath("/html/body/div[2]/div[7]/div/div[2]/div/div[2]/button[2]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/nav/div/div[1]/div/div/form/input")));
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/nav/div/div[1]/div/div/form/input")).sendKeys("iPhone8");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/nav/div/div[1]/div/div/form/button")));
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/nav/div/div[1]/div/div/form/button")).click();
    }
    public void ileIphonow() throws InterruptedException {
        List<WebElement> iPhony = driver.findElements(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[2]/div[1]/div[3]/div/div/div/div[2]/div[1]/div/section[2]/section/article"));
        int iPhoneCount = iPhony.size();
        System.out.println("Ilosc iphonow na stronie " + iPhoneCount);
    }
    public void znalezienieNajwyzszejCeny() throws InterruptedException {
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/select")));
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/select")).click();
        Thread.sleep(100);
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/select/option[3]")).click();
        Thread.sleep(5000);
    }

    public String ileAjfon() {
        String cena  = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[2]/div[1]/div[3]/div/div/div/div[2]/div[1]/div/section[2]/section/article[1]/div/div/div[2]/div[2]/div/div/span")).getText();
        cena = cena.replaceAll(",", ".");
        cena = cena.replaceAll(" ", "");
        cena = cena.replaceAll("zł", "").trim();
        Double cenaint = Double.parseDouble(cena);
        cenaint *= 1.20;
        System.out.println("Wartosc po dodaniu 20%: " + cenaint);
        return cena;
    }


    public void wykonanieTestu() throws InterruptedException {
        testAllegro();
        ileIphonow();
        znalezienieNajwyzszejCeny();
        ileAjfon();

    }

    @AfterTest
    public void closeChrome()
    {
        driver.quit();
    }
}
