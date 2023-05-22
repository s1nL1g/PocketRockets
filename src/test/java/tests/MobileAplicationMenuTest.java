package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.MobileMenuPage;
import static org.testng.Assert.assertTrue;

public class MobileAplicationMenuTest extends AbstractBaseTest {

    @Test
    public void appStoreTest(){
        MobileMenuPage mobileMenuPage = new MobileMenuPage(driver);

        mobileMenuPage.clickAppStoreBtn();

        assertTrue(mobileMenuPage.getAppStorePage().isDisplayed());
    }

    @Test
    public void googlePlayTest(){
        MobileMenuPage mobileMenuPage = new MobileMenuPage(driver);

        mobileMenuPage.clickGooglePlayBtn();

        assertTrue(mobileMenuPage.getGooglePlayPage().isDisplayed());
    }
}
