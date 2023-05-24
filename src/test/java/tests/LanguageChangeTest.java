package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class LanguageChangeTest extends AbstractBaseTest {

    private String trackOrdersExpect = "Track orders";
    private String calculateCostExpect = "Calculate cost";
    private String callACourierExpect = "Call a courier";
    private String findARepresentativeExpected = "Find a representative";

    @Test
    public void checkLanguageChangeTest() {
        HomePage homePage = new HomePage(driver);

        homePage
                .clickLanguage()
                .choseEnglishLanguage();

        assertEquals(homePage.getTrackOrders().getText(), trackOrdersExpect);
        assertEquals(homePage.getCalculateCost().getText(), calculateCostExpect);
        assertEquals(homePage.getCallaACourier().getText(), callACourierExpect);
        assertEquals(homePage.getFindARepresentative().getText(), findARepresentativeExpected);
    }
}
