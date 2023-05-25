package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PartnershipTabPage;

import static org.testng.Assert.assertTrue;

public class PartnershipTabTest extends AbstractBaseTest {

    @Test
    public void EpicentrTest() {
        PartnershipTabPage partnershipTabPage = new PartnershipTabPage(driver);
        HomePage homePage = new HomePage(driver);

        partnershipTabPage.clickBecomeAPartner()
                .clickBuildMaterials()
                .hoverCursorToGoBtn()
                .waitUntilBeVisible()
                .clickGoEpicentrBtn();

        homePage.goToLastWindow();

        assertTrue(partnershipTabPage.getEpicentrLogoBtn().isDisplayed());
    }
}
