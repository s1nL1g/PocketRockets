package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InactiveTermsOfServicePage;

import static org.testng.Assert.assertTrue;

public class InactiveTermsOfServiceTest extends AbstractBaseTest {
    @Test
    public void inactiveButtonTest() {
        InactiveTermsOfServicePage inactiveTermsOfServicePage = new InactiveTermsOfServicePage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickRegistrationBtn();

        inactiveTermsOfServicePage.closeModalWindow()
                .sendPhone()
                .sendEmail()
                .sendPassword();

        assertTrue(!inactiveTermsOfServicePage.getCreateAccBtn().isEnabled());
    }
}
