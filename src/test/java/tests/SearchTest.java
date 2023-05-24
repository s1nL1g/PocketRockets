package tests;

import base.AbstractBaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

import java.util.Random;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTest extends AbstractBaseTest {

    @Test
    public void SearchTest() {
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);
        Random random = new Random();

        String randomText = random.longs().toString();

        homePage.getInputSearch().sendKeys(randomText + Keys.ENTER);

        assertEquals(searchPage.getMessageHaveNotResult().getText(), "Пошук не дав результатів");
        assertTrue(getUrl().contains("SearchEngine"));

        searchPage.getLogo().click();
        homePage.getInputTracking().sendKeys(randomText + Keys.ENTER);

        assertEquals(searchPage.getMessageHaveNotResult().getText(), "Пошук не дав результатів");
    }
}
