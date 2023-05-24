package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.NecessaryFieldsPage;

import static org.testng.Assert.assertTrue;

public class NecessaryFieldsTest extends AbstractBaseTest {

    @Test
    public void necessaryFieldsTest() {
        NecessaryFieldsPage necessaryFieldsPage = new NecessaryFieldsPage(driver);

        assertTrue(necessaryFieldsPage.getUsernameField().isDisplayed());
        assertTrue(necessaryFieldsPage.getCityField().isDisplayed());
        assertTrue(necessaryFieldsPage.getPhoneField().isDisplayed());
        assertTrue(necessaryFieldsPage.getQuestionThemeSelector().isDisplayed());
        assertTrue(necessaryFieldsPage.getMessageField().isDisplayed());
    }
}
