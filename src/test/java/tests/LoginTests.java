package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends AbstractBaseTest {
    @Test
    public void loginPositiveTest() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickLoginBtn();
        loginPage.setEmailField()
                .setPassword()
                .clickBtnEnter();
        assertTrue(loginPage.getMyAccountBtn().isDisplayed());
    }
}
