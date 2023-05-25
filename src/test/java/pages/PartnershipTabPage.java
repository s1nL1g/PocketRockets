package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PartnershipTabPage extends HomePage {

    private static final String BCM_PARTNER_BTN = "//div[@class='become-partner']//a[@class='main-btn']";
    private static final String BUILD_MTRLS_PART = "//a[contains(text(),'Будівельні матеріали')]";
    private static final String EPICENTR_FRAME = "//img[@src='https://www.delivery-auto.com/userfs/images/epicentr.jpg']";
    private static final String GO_EPICENTR_BTN = "//a[@href='https://epicentrk.ua']";
    private static final String EPICENTR_LOGO_BTN = "//img[@title='Епіцентр']";

    public WebElement getBecomeAPartnerBtn() {
        return driver.findElement(By.xpath(BCM_PARTNER_BTN));
    }

    public WebElement getBuildMaterialsPart() {
        return driver.findElement(By.xpath(BUILD_MTRLS_PART));
    }

    public WebElement getGoEpicentrBtn() {
        return driver.findElement(By.xpath(GO_EPICENTR_BTN));
    }

    public WebElement getEpicentrLogoBtn() {
        return driver.findElement(By.xpath(EPICENTR_LOGO_BTN));
    }

    public PartnershipTabPage clickBecomeAPartner() {
        getBecomeAPartnerBtn().click();
        return this;
    }

    public PartnershipTabPage clickBuildMaterials() {
        getBuildMaterialsPart().click();
        return this;
    }

    public PartnershipTabPage clickGoEpicentrBtn() {
        getGoEpicentrBtn().click();
        return this;
    }

    public WebElement getElementToHover() {
        return driver.findElement(By.xpath(EPICENTR_FRAME));
    }

    public PartnershipTabPage hoverCursorToGoBtn() {
        Actions actions = new Actions(driver);

        actions.moveToElement(getElementToHover()).perform();
        return this;
    }

    public PartnershipTabPage waitUntilBeVisible() {
        waitUntilElementToBeClickable(GO_EPICENTR_BTN);
        return this;
    }

    public PartnershipTabPage(WebDriver driver) {
        super(driver);
    }
}
