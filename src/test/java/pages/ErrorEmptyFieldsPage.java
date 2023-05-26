package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ErrorEmptyFieldsPage extends HomePage {

    private static final String FEEDBACK_BTN = "//a[@class='nav-numbers__item feedback-block-link']";
    private static final String SEND_BTN = "//button[@class='feedback__btn']";
    private static final String ERROR_MSG = "//h3[@class='popup-notify__title'][contains(text(),'Ваша заявка не відправлена')]";

    public ErrorEmptyFieldsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFeedbackBtn() {
        return driver.findElement(By.xpath(FEEDBACK_BTN));
    }

    public WebElement getSendBtn() {
        return driver.findElement(By.xpath(SEND_BTN));
    }

    public WebElement getErrorMessage() {
        return driver.findElement(By.xpath(ERROR_MSG));
    }

    public ErrorEmptyFieldsPage clickFeedbackBtn() {
        getFeedbackBtn().click();
        return this;
    }

    public ErrorEmptyFieldsPage clickSendBtn() {
        getSendBtn().click();
        return this;
    }
}
