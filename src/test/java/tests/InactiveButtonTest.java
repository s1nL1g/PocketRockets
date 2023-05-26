package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InactiveButtonPage;

import static org.testng.Assert.assertFalse;

public class InactiveButtonTest extends AbstractBaseTest {

    @Test
    public void inactiveButtonTest() {
        InactiveButtonPage inactiveButtonPage = new InactiveButtonPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickRegistrationBtn();

        inactiveButtonPage.closeModalWindow()
                .sendPhone()
                .sendEmail()
                .sendPassword()
                .clickAgreementCheckbox();

        assertFalse(inactiveButtonPage.getCreateAccBtn().isEnabled());
    }
}
