package java.testbase;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Testbase {

    public void retryingFindClick(By by) throws InterruptedException {
        int attempts = 0;
        boolean failed = false;
        Exception currentException = new Exception();
//        WebDriverWait explicitWait = new WebDriverWait(webDriver, 10);
//        explicitWait.until(ExpectedConditions.visibilityOf(webDriver.findElement(by)));
        while (attempts < 5) {
            try {
                webDriver.findElement(by).click();
                failed = false;
                break;
            } catch (Exception e) {
                currentException = e;
                failed = true;
            }
            attempts++;
            Thread.sleep(50);
        }
        if (failed) {
            Assert.fail("Nie wykonano kroku " + currentException.getMessage());
        }
        Thread.sleep(140);
    }


}