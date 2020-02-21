package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.pages.MainPage;
import selenium.pages.SearchingResults;
import selenium.testbase.Testbase;
import java.util.List;

public class BasicFuntions extends Testbase{
    MainPage mainPage =new MainPage();
    SearchingResults searchingResults =new SearchingResults();
    public void searchForItem() throws InterruptedException{
        mainPage.cookiesPrompt();
        mainPage.searchField("iPhone 8");
        mainPage.searchButton();
    }

    public void countIphones() {
        List<WebElement> iPhony = driver.findElements(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[2]/div[1]/div[3]/div/div/div/div[2]/div[1]/div/section[2]/section/article"));
        int iPhoneCount = iPhony.size();
        System.out.println("Ilosc iphonow na stronie " + iPhoneCount);
    }

    public void sortByPriceDescending() throws InterruptedException {
        searchingResults.sortBy();
        searchingResults.sortByPriceDescending();
    }

    public String howMuchiPhone() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[2]/div[1]/div[3]/div/div/div/div[2]/div[1]/div/section[2]/section/article[1]/div/div/div[2]/div[2]/div/div/span")));
        String cena  = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[2]/div[1]/div[3]/div/div/div/div[2]/div[1]/div/section[2]/section/article[1]/div/div/div[2]/div[2]/div/div/span")).getText();
        cena = cena.replaceAll(",", ".");
        cena = cena.replaceAll(" ", "");
        cena = cena.replaceAll("zł", "").trim();
        Double cenaint = Double.parseDouble(cena);
        System.out.println("Wartość przed dodaniem 20%: " + cena);
        cenaint *= 1.20;
        System.out.println("Wartosc po dodaniu 20%: " + cenaint);
        return cena;
    }
}
