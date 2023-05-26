package pages;

import base.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HomePage extends AbstractBasePage {

    private static final String LOGO_BUTTON = "//img[@alt='delivery group icon']";
    private static final String FAST_START_DROPDOWN = "//div[@class='fast-start']";
    private static final String COMPANY_NAVIGATION = "//p[contains(text(),'Клієнтам')]";
    private static final String REGISTRATION_BUTTON = "//label[@class='login-block__autorization-btn']";
    private static final String GIFT_CLOSE = "//div[@class='gift-close']";
    private static final String ENTER_BUTTON = "//label[@class='login-block__login-btn']";
    private static final String INPUT_TRACKING = "//input[@class='tracking__input']";
    private static final String INPUT_SEARCH = "//input[@class='main-search__input']";
    private static final String VIDDILENIA_BUTTON = "//a[text()='Відділення']";
    private static final String LANGUAGE_BUTTON = "//div[@class='switch-lang__btn dropdown-arrow']";
    private static final String ENGLISH_LANGUAGE_BUTTON = "//a[@href='/en-us']";
    private static final String TRACK_ORDERS = "//div[@class='tracking__item']";
    private static final String CALCULATE_COST = "//p[contains(text(),'Calculate cost')]";
    private static final String CALL_A_COURIER = "//p[contains(text(),'Call a courier')]";
    private static final String FIND_A_REPRESENTATIVE = "//p[contains(text(),'Find a representative')]";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogo() {
        return driver.findElement(By.xpath(LOGO_BUTTON));
    }

    public WebElement getFastStart() {
        return driver.findElement(By.xpath(FAST_START_DROPDOWN));
    }

    public WebElement getRegistrationBtn() {
        return driver.findElement(By.xpath(REGISTRATION_BUTTON));
    }

    public void clickRegistrationBtn() {
        getRegistrationBtn().click();
    }

    public HomePage clickBtnGiftClose() {
        driver.findElement(By.xpath(GIFT_CLOSE)).click();
        return this;
    }

    public WebElement getEnterBtn() {
        return driver.findElement(By.xpath(ENTER_BUTTON));
    }

    public WebElement getLoginBtn() {
        return driver.findElement(By.xpath(ENTER_BUTTON));
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
    public WebElement getViddileniaBTN() {
        return driver.findElement(By.xpath(VIDDILENIA_BUTTON));
    }

    public ViddileniaPage clickViddilenia() {
        getViddileniaBTN().click();
        return new ViddileniaPage(driver);
    }

    public WebElement getLanguage() {
        return driver.findElement(By.xpath(LANGUAGE_BUTTON));
    }

    public HomePage clickLanguage() {
        getLanguage().click();
        return this;
    }

    public WebElement getEnglishLanguage() {
        return driver.findElement(By.xpath(ENGLISH_LANGUAGE_BUTTON));
    }

    public HomePage choseEnglishLanguage() {
        getEnglishLanguage().click();
        return this;
    }

    public WebElement getTrackOrders() {
        return driver.findElement(By.xpath(TRACK_ORDERS));
    }

    public WebElement getCalculateCost() {
        return driver.findElement(By.xpath(CALCULATE_COST));
    }

    public WebElement getCallaACourier() {
        return driver.findElement(By.xpath(CALL_A_COURIER));
    }

    public WebElement getFindARepresentative() {
        return driver.findElement(By.xpath(FIND_A_REPRESENTATIVE));
    }
}
