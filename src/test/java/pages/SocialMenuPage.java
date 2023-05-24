package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SocialMenuPage extends HomePage {

    private static final String YTB_BTN = "//img[@alt='youtube']";
    private static final String FCB_BTN = "//img[@alt='facebook']";
    private static final String LNKDN_BTN = "//img[@alt='linkedin']";
    private static final String INST_BTN = "//img[@alt='instagram']";
    private static final String YTB_CHNL_PAGE = "//yt-formatted-string[contains(text(), 'DELIVERY. Доставка вантажу')]";
    private static final String CLOSE_MOD_WINDW = "//div[@aria-label='Закрити']";
    private static final String FCB_PAGE = "//h1[@class='x1heor9g x1qlqyl8 x1pd3egz x1a2a7pz']";
    private static final String INST_PAGE = "//div[@class='x6s0dn4 x78zum5 x1q0g3np xs83m0k xeuugli x1n2onr6']/h2[text()='deliverygroup_ua']";

    public SocialMenuPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getYouTubeBtn() {
        return driver.findElement(By.xpath(YTB_BTN));
    }

    public SocialMenuPage clickYoutubeBtn() {
        getYouTubeBtn().click();
        return this;
    }

    public WebElement getFacebookBtn() {
        return driver.findElement(By.xpath(FCB_BTN));
    }

    public SocialMenuPage clickFacebookBtn() {
        getFacebookBtn().click();
        return this;
    }

    public WebElement getLinkedinBtn() {
        return driver.findElement(By.xpath(LNKDN_BTN));
    }

    public SocialMenuPage clickLinkedinBtn() {
        getLinkedinBtn().click();
        return this;
    }

    public WebElement getInstagramBtn() {
        return driver.findElement(By.xpath(INST_BTN));
    }

    public SocialMenuPage clickInstagramBtn() {
        getInstagramBtn().click();
        return this;
    }

    public WebElement getYoutubeChanel() {
        return driver.findElement(By.xpath(YTB_CHNL_PAGE));
    }

    public WebElement getFacebookPage() {
        return driver.findElement(By.xpath(FCB_PAGE));
    }

    public SocialMenuPage waitUntilFCBBeLoaded() {
        isWaitUntilUrlContainsText("https://www.facebook.com/Deliveryauto");
        return this;
    }

    public SocialMenuPage waitUntilYTBBeLoaded() {
        isWaitUntilUrlContainsText("https://www.youtube.com/channel/UC2ZxuQoIjvHGl2yR4FeS8qQ/featured");
        return this;
    }

    public WebElement getCloseButtonMDL_WNDW() {
        return driver.findElement(By.xpath(CLOSE_MOD_WINDW));
    }

    public SocialMenuPage closeModalWindowFCB() {
        getCloseButtonMDL_WNDW().click();
        return this;
    }

    public WebElement getInstagramPage() {
        return driver.findElement(By.xpath(INST_PAGE));
    }
}
