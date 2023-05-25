package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.ErrorEmptyFieldsPage;

import static org.testng.Assert.assertTrue;

public class ErrorEmptyFieldsTest extends AbstractBaseTest {

    @Test
    public void errorMessageTest() {
        ErrorEmptyFieldsPage errorEmptyFieldsPage = new ErrorEmptyFieldsPage(driver);

        errorEmptyFieldsPage.clickFeedbackBtn()
                .clickSendBtn();

        assertTrue(errorEmptyFieldsPage.getErrorMessage().isDisplayed());
    }
}
