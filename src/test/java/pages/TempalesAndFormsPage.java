package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TempalesAndFormsPage extends HomePage {

    private static final String DOC_MENU_BTN = "//p[@class='nav__title'][contains(text(),'Документи')]";
    private static final String TMPLS_AND_FRMS_BTN = "//a[@href='/uk-UA/GenericPages/DbIndex/3447']";
    private static final String VAT_PAYERS_FILE = "//a[@href='https://www.delivery-auto.com/userfs/LocalizableFiles/uk-UA/Documents/46dc4489-e91a-454d-87bd-89f4518bac7a_%D0%92%D0%B8%D1%82%D1%8F%D0%B3%20%D0%9F%D0%94%D0%92%20%D0%94%D0%B5%D0%BB%D1%96%D0%B2%D0%B5%D1%80%D1%96%202019.PDF']";
    private static final String VAT_PAYERS_TAB = "//embed[@internalid='0C2413E2BAFCB98783B89361FDC949BB']";
    private static final String EXTRC_FROM_USR_FILE = "//a[contains(text(), 'Витяг з ЄДР')]";
    private static final String EXTRC_FROM_USR_TAB = "//embed[@name='5D27FCA69B72282A4562783A40FA4CD4']";

    public TempalesAndFormsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getElementToHover() {
        return driver.findElement(By.xpath(DOC_MENU_BTN));
    }

    public WebElement getTempalesAndFormsBtn() {
        return driver.findElement(By.xpath(TMPLS_AND_FRMS_BTN));
    }

    public WebElement getVatPayersFile() {
        return driver.findElement(By.xpath(VAT_PAYERS_FILE));
    }

    public WebElement getVatPayersTab() {
        return driver.findElement(By.xpath(VAT_PAYERS_TAB));
    }

    public WebElement getExtractFromUSRFile() {
        return driver.findElement(By.xpath(EXTRC_FROM_USR_FILE));
    }

    public WebElement getExtractFromUSRTab() {
        return driver.findElement(By.xpath(EXTRC_FROM_USR_TAB));
    }

    public TempalesAndFormsPage clickTempalesAndFormsBtn() {
        getTempalesAndFormsBtn().click();
        return this;
    }

    public TempalesAndFormsPage clickVATPayers() {
        getVatPayersFile().click();
        return this;
    }

    public TempalesAndFormsPage clickExtractFromUSR() {
        getExtractFromUSRFile().click();
        return this;
    }

    public TempalesAndFormsPage hoverCursorDocBtn() {
        Actions actions = new Actions(driver);

        actions.moveToElement(getElementToHover()).perform();
        return this;
    }
}
