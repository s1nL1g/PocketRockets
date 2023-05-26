package pages;

import base.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculateCostPage extends AbstractBasePage {

    public CalculateCostPage(WebDriver driver) {
        super(driver);
    }

    private static final String ROUTE_FIRST_FIELD = "//input[@class = 'ui-autocomplete-input ng-invalid ng-invalid-required ng-touched']";
    private static final String ROUTE_SECOND_FIELD = "//input[@class = 'ui-autocomplete-input']";
    private static final String MSG_WARNING_COST = "//div[@id='warningCost']";
    private static final String DELIVERY_TYPE = "//select[@id='DeliveryType']";
    private static final String DELIVERY_DESTINATION = "//a[@id='ui-id-2349']";
    private static final String DATA_SEND = "//input[@id='DateSend']";
    private static final String FIELD_DECLARED_COST = "//input[@id='t3']";
    private static final String FIELD_CASH_ON_DELIVERY = "//input[@id='appl_COD']";
    private static final String FIELD_QUANTITY = "//input[@id='t8']";

    public WebElement getInputRout1() {
        return waitUntilVisibilityOfElement(ROUTE_FIRST_FIELD);
    }

    public WebElement getDataSend() {
        return waitUntilVisibilityOfElement(DATA_SEND);
    }

    public String getCurrentDataSend() {
        return getDataSend().getAttribute("value");
    }

    public WebElement getFieldDeclaredCost() {
        return waitUntilVisibilityOfElement(FIELD_DECLARED_COST);
    }

    public String getDefaultValueDeclaredCost() {
        return getFieldDeclaredCost().getAttribute("value");
    }

    public WebElement getFieldCashOnDelivery() {
        return waitUntilVisibilityOfElement(FIELD_CASH_ON_DELIVERY);
    }

    public String getDefaultValueCashOnDelivery() {
        return getFieldCashOnDelivery().getAttribute("value");
    }

    public WebElement getFieldQuantity() {
        return waitUntilVisibilityOfElement(FIELD_QUANTITY);
    }

    public String getDefaultValueQuantity() {
        return getFieldQuantity().getAttribute("value");
    }
}
