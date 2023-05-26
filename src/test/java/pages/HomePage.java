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
}
