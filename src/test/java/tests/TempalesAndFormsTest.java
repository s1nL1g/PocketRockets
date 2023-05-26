package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TempalesAndFormsPage;

import static org.testng.Assert.assertTrue;

public class TempalesAndFormsTest extends AbstractBaseTest {

    @Test
    public void vatPayersTest() {
        TempalesAndFormsPage tempalesAndFormsPage = new TempalesAndFormsPage(driver);
        HomePage homePage = new HomePage(driver);

        tempalesAndFormsPage.hoverCursorDocBtn()
                .clickTempalesAndFormsBtn()
                .clickVATPayers();

        homePage.goToLastWindow();

        String currentUrl = driver.getCurrentUrl();

        assertTrue(currentUrl.contains("https://www.delivery-auto.com/userfs/LocalizableFiles/uk-UA/Documents/46dc4489-e91a-454d-87bd-89f4518bac7a_%D0%92%D0%B8%D1%82%D1%8F%D0%B3%20%D0%9F%D0%94%D0%92%20%D0%94%D0%B5%D0%BB%D1%96%D0%B2%D0%B5%D1%80%D1%96%202019.PDF"));
    }

    @Test
    public void extractFromUSRTest() {
        TempalesAndFormsPage tempalesAndFormsPage = new TempalesAndFormsPage(driver);
        HomePage homePage = new HomePage(driver);

        tempalesAndFormsPage.hoverCursorDocBtn()
                .clickTempalesAndFormsBtn()
                .clickExtractFromUSR();

        homePage.goToLastWindow();

        String currentUrl = driver.getCurrentUrl();

        assertTrue(currentUrl.contains("https://www.delivery-auto.com/userfs/LocalizableFiles/uk-UA/Documents/46dc4489-e91a-454d-87bd-89f4518bac7a_%D0%92%D0%B8%D1%82%D1%8F%D0%B3%20%D0%9F%D0%94%D0%92%20%D0%94%D0%B5%D0%BB%D1%96%D0%B2%D0%B5%D1%80%D1%96%202019.PDF"));
    }
}
