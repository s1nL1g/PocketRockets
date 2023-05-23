package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrequentlyAskedPage extends HomePage {
    private static final String INSURANCE_COST_THM = "//label[@class='questions__label'][contains(text(),'Яка вартість страхування вантажу?')]";
    private static final String INSURANCE_COST_INFO = "//h2[@class='answer__title'][contains(text(),'Яка вартість страхування вантажу?')]";
    private static final String DISCOUNT_THM = "//label[@class='questions__label'][contains(text(),'Як можна отримати знижку?')]";
    private static final String DISCOUNT_INFO = "//h2[@class='answer__title'][contains(text(),'Як можна отримати знижку?')]";
    private static final String CHANGE_CITY_THM = "//label[@class='questions__label'][contains(text(),'Як змінити місто прибуття вантажу?')]";
    private static final String CHANGE_CITY_INFO = "//h2[@class='answer__title'][contains(text(),'Як змінити місто прибуття вантажу?')]";
    private static final String CHANGE_RECIPIENT_THM = "//label[@class='questions__label'][contains(text(),'Як змінити отримувача вантажу?')]";
    private static final String CHANGE_RECIPIENT_INFO = "//h2[@class='answer__title'][contains(text(),'Як змінити отримувача вантажу?')]";
    private static final String PACKAGE_TRACKING_THM = "//label[@class='questions__label'][contains(text(),'Як дізнатися чи прибув вантаж?')]";
    private static final String PACKAGE_TRACKING_INFO = "//h2[@class='answer__title'][contains(text(),'Як дізнатися чи прибув вантаж?')]";
    private static final String COMPENSATION_THM = "//label[@class='questions__label'][contains(text(),'Як можна отримати компенсацію?')]";
    private static final String COMPENSATION_INFO = "//h2[@class='answer__title'][contains(text(),'Як можна отримати компенсацію?')]";
    private static final String PACKAGING_THM = "//label[@class='questions__label'][contains(text(),'Як повинен бути упакований вантаж?')]";
    private static final String PACKAGING_INFO = "//h2[@class='answer__title'][contains(text(),'Як повинен бути упакований вантаж?')]";

    public WebElement getInsuranceCostThm(){
        return driver.findElement(By.xpath(INSURANCE_COST_THM));
    }

    public WebElement getInsuranceCostInfo(){
        return driver.findElement(By.xpath(INSURANCE_COST_INFO));
    }

    public WebElement getDiscountThm(){
        return driver.findElement(By.xpath(DISCOUNT_THM));
    }

    public WebElement getDiscountInfo(){
        return driver.findElement(By.xpath(DISCOUNT_INFO));
    }

    public WebElement getChangeCityThm(){
        return driver.findElement(By.xpath(CHANGE_CITY_THM));
    }

    public WebElement getChangeCityInfo(){
        return driver.findElement(By.xpath(CHANGE_CITY_INFO));
    }

    public WebElement getChangeRecipientThm(){
        return driver.findElement(By.xpath(CHANGE_RECIPIENT_THM));
    }

    public WebElement getChangeRecipientInfo(){
        return driver.findElement(By.xpath(CHANGE_RECIPIENT_INFO));
    }

    public WebElement getPackageTrackingThm(){
        return driver.findElement(By.xpath(PACKAGE_TRACKING_THM));
    }

    public WebElement getPackageTrackingInfo(){
        return driver.findElement(By.xpath(PACKAGE_TRACKING_INFO));
    }

    public WebElement getCompensationThm(){
        return driver.findElement(By.xpath(COMPENSATION_THM));
    }

    public WebElement getCompensationInfo(){
        return driver.findElement(By.xpath(COMPENSATION_INFO));
    }

    public WebElement getPackagingThm(){
        return driver.findElement(By.xpath(PACKAGING_THM));
    }

    public WebElement getPackagingInfo(){
        return driver.findElement(By.xpath(PACKAGING_INFO));
    }

    public FrequentlyAskedPage clickInsuranceCost(){
        getInsuranceCostThm().click();
        return this;
    }

    public FrequentlyAskedPage clickDiscount(){
        getDiscountThm().click();
        return this;
    }

    public FrequentlyAskedPage clickChangeCity(){
        getChangeCityThm().click();
        return this;
    }

    public FrequentlyAskedPage clickChangeRecipient(){
        getChangeRecipientThm().click();
        return this;
    }

    public FrequentlyAskedPage clickPackageTracking(){
        getPackageTrackingThm().click();
        return this;
    }

    public FrequentlyAskedPage clickCompensation(){
        getCompensationThm().click();
        return this;
    }

    public FrequentlyAskedPage clickPackaging(){
        getPackagingThm().click();
        return this;
    }

    public FrequentlyAskedPage(WebDriver driver) {
        super(driver);
    }
}
