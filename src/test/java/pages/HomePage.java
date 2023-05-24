package pages;

import base.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HomePage extends AbstractBasePage {

    private static final String BTN_LOGO = "//img[@alt='delivery group icon']";
    private static final String BTN_DROPDOWN_FAST_START = "//div[@class='fast-start']";
    private static final String COMPANY_NAVIGATION = "//p[contains(text(),'Клієнтам')]";
    private static final String BTN_REGISTRATION = "//label[@class='login-block__autorization-btn']";
    private static final String BTN_GIFT_CLOSE = "//div[@class='gift-close']";
    private static final String BTN_ENTER = "//label[@class='login-block__login-btn']";
    private static final String INPUT_TRACKING = "//input[@class='tracking__input']";
    private static final String INPUT_SEARCH = "//input[@class='main-search__input']";
    private static final String BTN_LANGUAGE = "//div[@class='switch-lang__btn dropdown-arrow']";
    private static final String BTN_ENGLISHLANGUAGE = "//a[@href='/en-us']";
    private static final String TRACKORDERS = "//div[@class='tracking__item']";
    private static final String CALCULATECOST = "//p[contains(text(),'Calculate cost')]";
    private static final String CALLACOURIER = "//p[contains(text(),'Call a courier')]";
    private static final String FINDAREPRESENTATIVE = "//p[contains(text(),'Find a representative')]";

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

    public WebElement getInputSearch() {
        return driver.findElement(By.xpath(INPUT_SEARCH));
    }

    public HomePage goToLastWindow() {
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windows = new ArrayList<>(windowHandles);

        driver.switchTo().window(windows.get(windows.size() - 1));
        return this;
    }

    public WebElement getLanguage() {
        return driver.findElement(By.xpath(BTN_LANGUAGE));
    }

    public HomePage clickLanguage() {
        getLanguage().click();
        return this;
    }

    public WebElement getEnglishLanguage() {
        return driver.findElement(By.xpath(BTN_ENGLISHLANGUAGE));
    }

    public HomePage choseEnglishLanguage() {
        getEnglishLanguage().click();
        return this;
    }

    public WebElement getTrackOrders() {
        return driver.findElement(By.xpath(TRACKORDERS));
    }

    public WebElement getCalculateCost() {
        return driver.findElement(By.xpath(CALCULATECOST));
    }

    public WebElement getCallaACourier() {
        return driver.findElement(By.xpath(CALLACOURIER));
    }

    public WebElement getFindARepresentative() {
        return driver.findElement(By.xpath(FINDAREPRESENTATIVE));
    }
}
