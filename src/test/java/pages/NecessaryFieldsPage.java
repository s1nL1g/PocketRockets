package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NecessaryFieldsPage extends HomePage {

    private static final String USRNAME_FLD = "//input[@id='call-username']";
    private static final String CITY_FLD = "//input[@id='call-city']";
    private static final String PHONE_FLD = "//input[@id='call-phone']";
    private static final String QUESTN_THM_SLCTR = "//select[@id='Question']";
    private static final String MSSG_FLD = "//textarea[@id='Message']";

    public NecessaryFieldsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUsernameField() {
        return driver.findElement(By.xpath(USRNAME_FLD));
    }

    public WebElement getCityField() {
        return driver.findElement(By.xpath(CITY_FLD));
    }

    public WebElement getPhoneField() {
        return driver.findElement(By.xpath(PHONE_FLD));
    }

    public WebElement getQuestionThemeSelector() {
        return driver.findElement(By.xpath(QUESTN_THM_SLCTR));
    }

    public WebElement getMessageField() {
        return driver.findElement(By.xpath(MSSG_FLD));
    }
}
