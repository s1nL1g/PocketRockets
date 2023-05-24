package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ViddileniaPage;

public class ViddileniaTest extends AbstractBaseTest {
    private String viddileniaPageUrl = "https://www.delivery-auto.com/uk-UA/Representatives/Index";

    @Test
    public void checkCrosingFromHomePageToViddileniaPage() {
        HomePage homePage = new HomePage(driver);
        ViddileniaPage viddileniaPage = new ViddileniaPage(driver);

        homePage.clickViddilenia();

        String resultURL = driver.getCurrentUrl();
        Assert.assertTrue(resultURL.equals(viddileniaPageUrl));
    }
}
