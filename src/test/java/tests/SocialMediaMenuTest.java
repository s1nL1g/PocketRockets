package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SocialMenuPage;

import static org.testng.Assert.assertTrue;

public class SocialMediaMenuTest extends AbstractBaseTest {

    @Test
    public void youtubeTest() {
        SocialMenuPage socialMenuPage = new SocialMenuPage(driver);
        HomePage homePage = new HomePage(driver);

        socialMenuPage.clickYoutubeBtn();

        homePage.goToLastWindow();

        assertTrue(socialMenuPage.getYoutubeChanel().isDisplayed());
    }

    @Test
    public void facebookTest() {
        SocialMenuPage socialMenuPage = new SocialMenuPage(driver);
        HomePage homePage = new HomePage(driver);

        socialMenuPage.clickFacebookBtn();

        homePage.goToLastWindow();

        socialMenuPage.waitUntilFCBBeLoaded()
                .closeModalWindowFCB();

        assertTrue(socialMenuPage.getFacebookPage().isDisplayed());
    }

    @Test
    public void instagramTest() {
        SocialMenuPage socialMenuPage = new SocialMenuPage(driver);
        HomePage homePage = new HomePage(driver);

        socialMenuPage.clickInstagramBtn();

        homePage.goToLastWindow();

        assertTrue(driver.getCurrentUrl().contains("https://www.instagram.com/deliverygroup_ua/"));
    }
}

