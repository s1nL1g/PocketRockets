package tests;

import base.AbstractBaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import static org.testng.Assert.assertTrue;
import java.util.Random;

public class SearchTest extends AbstractBaseTest {

    @Test
    public void SearchTest() {
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);
        Random random = new Random();

        String randomTekst = random.longs().toString();

        homePage.getInputSearch().sendKeys(randomTekst+ Keys.ENTER);
        assertTrue(searchPage.getMessageHaveNotResult().getText().equals("Пошук не дав результатів"));
        assertTrue(getUrl().contains("SearchEngine"));
        searchPage.getLogo().click();
        homePage.getInputTracking().sendKeys(randomTekst+Keys.ENTER);
        assertTrue(searchPage.getMessageHaveNotResult().getText().equals("Пошук не дав результатів"));
    }
}
