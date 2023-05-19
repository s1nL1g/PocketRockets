package pages;

import base.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractBasePage {

    private static final String BTN_LOGO = "//img[@alt='delivery group icon']";
    private static final String BTN_DROPDOWN_FAST_START = "//div[@class='fast-start']";
    private static final String COMPANY_NAVIGATION = "//p[contains(text(),'Клієнтам')]";
    private static final String BTN_REGISTRATION = "//label[@class='login-block__autorization-btn']";
    private static final String BTN_GIFT_CLOSE = "//div[@class='gift-close']";
    private static final String BTN_ENTER = "//label[@class='login-block__login-btn']";
    private static final String INPUT_TRACKING = "//input[@class='tracking__input']";
    private static final String INPUT_SEARCH = "//input[@class='main-search__input']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogo() {
        return driver.findElement(By.xpath(BTN_LOGO));
    }

    public WebElement getFastStart() {
        return driver.findElement(By.xpath(BTN_DROPDOWN_FAST_START));
    }

    public WebElement getRegistrationBtn() {
        return driver.findElement(By.xpath(BTN_REGISTRATION));
    }

    public void clickRegistrationBtn() {
        getRegistrationBtn().click();
    }

    public HomePage clickBtnGiftClose() {
        driver.findElement(By.xpath(BTN_GIFT_CLOSE)).click();
        return this;
    }

    public WebElement getEnterBtn() {
        return driver.findElement(By.xpath(BTN_ENTER));
    }

    public WebElement getLoginBtn() {
        return driver.findElement(By.xpath(BTN_ENTER));
    }

    public HomePage clickLoginBtn() {
        getLoginBtn().click();
        return this;
    }

    public WebElement getCompanyNavigation() {
        return driver.findElement(By.xpath(COMPANY_NAVIGATION));
    }

    public WebElement getInputTracking() {
        return driver.findElement(By.xpath(INPUT_TRACKING));
    }

    public WebElement getInputSearch(){
        return driver.findElement(By.xpath(INPUT_SEARCH));
    }
}