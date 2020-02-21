package selenium.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import selenium.testbase.Testbase;

public class SearchingResults extends Testbase {

    public void sortBy() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/select")));
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/select")).click();
    }
    public void sortByPriceDescending() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/select/option[3]")));
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/select/option[3]")).click();
        Thread.sleep(1000);
    }
}
