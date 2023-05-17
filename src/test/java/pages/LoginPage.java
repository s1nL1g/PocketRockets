package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends HomePage {
    private static final String BTN_CLOSE_LOGIN_PAGE = "//label[@class='login-block__login-btn']";
    private static final String INPUT_EMAIL = "//input[@name='UserName']";
    private static final String INPUT_PASSWORD = "//input[@name='Password']";
    private static final String BTN_ENTER = "//button[@class='login-button']";
    private static final String LINK_REGISTRATION = "//a[@class='login-link']";
    private static final String MESSAGE_SUCCESS = "//div[@ng-reflect-klass='error_message success']";// "//div[@class='error_message success mess_show']";
    private static final String LOGIN_MODAL_WINDOW = "//div[@class='login-modal']";
    private static final String MY_ACCOUNT_MENU = "//p[contains(text(),'Мій кабінет')]";
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void closeLoginPage() {
        driver.findElement(By.xpath(BTN_CLOSE_LOGIN_PAGE)).click();
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath(INPUT_EMAIL));
    }

    public LoginPage setEmailField() {
        getEmailField().sendKeys("litovetsn@gmail.com");
        return this;
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.xpath(INPUT_PASSWORD));
    }

    public LoginPage setPassword() {
        getPasswordField().sendKeys("Pp)rtyu12");
        return this;
    }

    public WebElement getBtnEnter() {
        return driver.findElement(By.xpath(BTN_ENTER));
    }

    public LoginPage clickBtnEnter() {
        getBtnEnter().click();
        return this;
    }

    public WebElement getLoginModalWindow() {
        return driver.findElement(By.xpath(LOGIN_MODAL_WINDOW));
    }
    public WebElement getMyAccountBtn(){
        return waitUntilVisibilityOfElement("//p[contains(text(),'Мій кабінет')]");
    }
}

