package selenium.tests;

import org.testng.annotations.*;
import selenium.actions.BasicFuntions;
import selenium.testbase.Testbase;

public class SC_1_0_0 {
    Testbase testbase =new Testbase();
    BasicFuntions basicFuntions =new BasicFuntions();

    @BeforeTest
    public void beforeTest() {
        testbase.setUp();
    }

    @Test
    public void scenario_1_0_0() throws InterruptedException {
//    1. Otwórz stronę Allegro
        //setUp
//    2. Wyszukaj przedmiot iPhone 8
        basicFuntions.searchForItem();
//    3. Zlicz wszystkie wyświetlone iPhony
        basicFuntions.countIphones();
//    4. Znajdź najwyższą cenę i wyświetl w konsoli
        basicFuntions.sortByPriceDescending();
//    5. Do największej ceny dodaj 20% i wyświetl w konsoli
        basicFuntions.howMuchiPhone();
    }

    @AfterTest
    public void afterTest() {
        testbase.endTest();
    }
}
