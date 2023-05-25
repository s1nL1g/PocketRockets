package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InactiveTermsOfServicePage extends HomePage {

    private static final String CLOSE_MODAL_WINDOW_BTN = "//span[@id='login_close_button']";
    private static final String PHONE_FIELD = "//input[@name='phone']";
    private static final String EMAIL_FIELD = "//input[@name='email']";
    private static final String PASSWORD_FIELD = "//input[@name='password']";
    private static final String AGREEMENT_CHECKBOX = "//input[@name='isAgreed']";
    private static final String CREATE_ACCOUNT_BTN = "//div[@class='registration-modal']//button[@type='button']";

    public WebElement getModalWindowCloser() {
        return driver.findElement(By.xpath(CLOSE_MODAL_WINDOW_BTN));
    }

    public WebElement getPhoneField() {
        return driver.findElement(By.xpath(PHONE_FIELD));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath(EMAIL_FIELD));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.xpath(PASSWORD_FIELD));
    }

    public WebElement getAgreementCheckbox() {
        return driver.findElement(By.xpath(AGREEMENT_CHECKBOX));
    }

    public WebElement getCreateAccBtn() {
        return driver.findElement(By.xpath(CREATE_ACCOUNT_BTN));
    }

    public InactiveTermsOfServicePage closeModalWindow() {
        getModalWindowCloser().click();
        return this;
    }

    public InactiveTermsOfServicePage sendPhone() {
        getPhoneField().sendKeys("(063) 363 63 63");
        return this;
    }

    public InactiveTermsOfServicePage sendEmail() {
        getEmailField().sendKeys("vc@gmail.com");
        return this;
    }

    public InactiveTermsOfServicePage sendPassword() {
        getPasswordField().sendKeys("TestPass123");
        return this;
    }

    public InactiveTermsOfServicePage(WebDriver driver) {
        super(driver);
    }
}
