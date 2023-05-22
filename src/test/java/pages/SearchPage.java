package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends AbstractBasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    private static final String MESSAGE_HAVE_NOT_RESULTS = "//h2";
    private static final String BTN_LOGO = "//a[@class='del_logo']";

    public WebElement getMessageHaveNotResult() {
        return waitUntilElementToBeClickable(MESSAGE_HAVE_NOT_RESULTS);
    }

    public WebElement getLogo() {
        return waitUntilElementToBeClickable(BTN_LOGO);
    }
}