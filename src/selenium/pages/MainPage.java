package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.testbase.Testbase;

public class MainPage extends Testbase {

    public void cookiesPrompt() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div/div/div/button")));
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/button")).click();
    }

    public void searchField(String searchItem) throws InterruptedException{
        Thread.sleep(200);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/nav/div/div/div/div/form/input")));
        driver.findElement(By.xpath("/html/body/div/div/nav/div/div/div/div/form/input")).sendKeys(searchItem);
        Thread.sleep(300);

    }

    public void searchButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/nav/div/div/div/div/form/button")));
        driver.findElement(By.xpath("/html/body/div/div/nav/div/div/div/div/form/button")).click();
    }

}
