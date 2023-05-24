package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobileMenuPage extends HomePage {

    private static final String APP_STR_BTN = "//img[@alt='app-store']";
    private static final String GGL_PLAY_BTN = "//div[@class='links__apps']//img[@alt='google-play']";
    private static final String APP_STR_PAGE = "//h1[@class='product-header__title app-header__title']";
    private static final String GGL_PLAY_PAGE = "//span[text()='Delivery-Auto']";

    public MobileMenuPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAppStoreBtn(){
        return driver.findElement(By.xpath(APP_STR_BTN));
    }

    public WebElement getGooglePlayBtn(){
        return driver.findElement(By.xpath(GGL_PLAY_BTN));
    }

    public WebElement getAppStorePage(){
        return driver.findElement(By.xpath(APP_STR_PAGE));
    }

    public WebElement getGooglePlayPage(){
        return driver.findElement(By.xpath(GGL_PLAY_PAGE));
    }

    public MobileMenuPage clickAppStoreBtn(){
        getAppStoreBtn().click();
        return this;
    }

    public MobileMenuPage clickGooglePlayBtn(){
        getGooglePlayBtn().click();
        return this;
    }
}
