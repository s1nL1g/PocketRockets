package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.CalculateCostPage;
import pages.HomePage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.testng.Assert.assertEquals;

public class CalculateCostTest extends AbstractBaseTest {

    @Test
    public void calculateCostDefaultValuesTest() {
        HomePage homePage = new HomePage(driver);
        CalculateCostPage calculateCostPage = new CalculateCostPage(driver);

        homePage.getCalculateCost().click();
        String dateTime = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                .format(LocalDateTime.now());

        assertEquals(calculateCostPage.getCurrentDataSend(), dateTime);
        assertEquals(calculateCostPage.getDefaultValueDeclaredCost(), "0");
        assertEquals(calculateCostPage.getDefaultValueCashOnDelivery(), "0");
        assertEquals(calculateCostPage.getDefaultValueQuantity(), "1");
    }
}
