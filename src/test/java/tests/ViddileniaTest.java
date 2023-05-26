package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ViddileniaPage;

public class ViddileniaTest extends AbstractBaseTest {
    public String viddileniaPageUrl = "https://www.delivery-auto.com/uk-UA/Representatives/Index";

    @Test
    public void checkCrossingFromHomePageToViddileniaPage() {
        HomePage homePage = new HomePage(driver);
        ViddileniaPage viddileniaPage = new ViddileniaPage(driver);

        homePage
                .clickViddilenia();

        Assert.assertEquals(viddileniaPageUrl, viddileniaPage.getUrl());
    }
}
