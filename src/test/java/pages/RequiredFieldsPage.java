package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class RequiredFieldsPage extends HomePage {

    private static final String CLCLT_COST = "https://www.delivery-auto.com/uk-UA/CalculateCost";
    private static final String FROM_FLD = "//div[@class='calc-form__input-wrap calc-form__yellow-arrow time-line time-line--first-point']//input[@class='ui-autocomplete-input ng-invalid ng-invalid-required ng-touched']";
    private static final String TO_FLD = "//div[@class='calc-form__input-wrap']//input[@class='ui-autocomplete-input ng-invalid ng-invalid-required ng-touched']";
    private static final String WEIGHT_FLD = "//input[@class='calc-form__input--short time-line__input ng-pristine ng-valid-min ng-valid-max ng-invalid ng-invalid-required ng-touched']";
    private static final String TTL_VOLUME_FLD = "//input[@class='calc-form__input--short ng-pristine ng-valid-min ng-valid-max ng-invalid ng-invalid-required ng-touched']";
    private static final String CLCLT_BTN = "//div[@class='type-cargo-1 time-line']//button[@ng-click='Calculate(true)']";

    public RequiredFieldsPage(WebDriver driver) {
        super(driver);
    }

    public RequiredFieldsPage goToCalculateCost() {
        driver.get(CLCLT_COST);
        return this;
    }

    public WebElement getFromField() {
        return driver.findElement(By.xpath(FROM_FLD));
    }

    public WebElement getToField() {
        return driver.findElement(By.xpath(TO_FLD));
    }

    public WebElement getWeightField() {
        return driver.findElement(By.xpath(WEIGHT_FLD));
    }

    public WebElement getTotalVolumeField() {
        return driver.findElement(By.xpath(TTL_VOLUME_FLD));
    }

    public WebElement getCalculateBtn() {
        return driver.findElement(By.xpath(CLCLT_BTN));
    }

    public RequiredFieldsPage clickCalculateBtn() {
        getCalculateBtn().click();
        return this;
    }

    public WebElement scrollToCalculateBtn() {
        WebElement calcBtn = driver.findElement(By.xpath(CLCLT_BTN));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", calcBtn);
        return null;
    }

    public RequiredFieldsPage waitVisibility() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='type-cargo-1 time-line']//button[@ng-click='Calculate(true)']")));
        return this;
    }

    public RequiredFieldsPage waitUntilClicable() {
        waitUntilElementToBeClickable(String.valueOf(By.xpath(CLCLT_BTN)));
        return this;
    }
}
