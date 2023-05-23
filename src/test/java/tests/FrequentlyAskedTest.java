package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.FrequentlyAskedPage;

import static org.testng.Assert.assertTrue;

public class FrequentlyAskedTest extends AbstractBaseTest {
    @Test
    public void frequentlyAskedQuestionsTest() {
        FrequentlyAskedPage frequentlyAskedPage = new FrequentlyAskedPage(driver);

        frequentlyAskedPage.clickInsuranceCost();
        assertTrue(frequentlyAskedPage.getInsuranceCostInfo().isDisplayed());

        frequentlyAskedPage.clickDiscount();
        assertTrue(frequentlyAskedPage.getDiscountInfo().isDisplayed());

        frequentlyAskedPage.clickChangeCity();
        assertTrue(frequentlyAskedPage.getChangeCityInfo().isDisplayed());

        frequentlyAskedPage.clickChangeRecipient();
        assertTrue(frequentlyAskedPage.getChangeRecipientInfo().isDisplayed());

        frequentlyAskedPage.clickPackageTracking();
        assertTrue(frequentlyAskedPage.getPackageTrackingInfo().isDisplayed());

        frequentlyAskedPage.clickCompensation();
        assertTrue(frequentlyAskedPage.getCompensationInfo().isDisplayed());

        frequentlyAskedPage.clickPackaging();
        assertTrue(frequentlyAskedPage.getPackagingInfo().isDisplayed());
    }
}
