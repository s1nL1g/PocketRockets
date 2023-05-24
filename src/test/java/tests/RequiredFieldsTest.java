package tests;

import base.AbstractBaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.RequiredFieldsPage;

import static org.testng.Assert.assertEquals;

public class RequiredFieldsTest extends AbstractBaseTest {

    @Test
    public void requiredFieldsTest() {
        RequiredFieldsPage requiredFieldsPage = new RequiredFieldsPage(driver);

        requiredFieldsPage.goToCalculateCost()
                .waitVisibility()
                .clickCalculateBtn();

        String expectedBorderColor = "rgb(255, 0, 0)";

        String borderColorFromField = (String) ((JavascriptExecutor) driver).executeScript("return window.getComputedStyle(arguments[0]).getPropertyValue('border-color');", requiredFieldsPage.getFromField());
        String borderColorToField = (String) ((JavascriptExecutor) driver).executeScript("return window.getComputedStyle(arguments[0]).getPropertyValue('border-color');", requiredFieldsPage.getToField());
        String borderColorWeightField = (String) ((JavascriptExecutor) driver).executeScript("return window.getComputedStyle(arguments[0]).getPropertyValue('border-color');", requiredFieldsPage.getWeightField());
        String borderColorTotalField = (String) ((JavascriptExecutor) driver).executeScript("return window.getComputedStyle(arguments[0]).getPropertyValue('border-color');", requiredFieldsPage.getTotalVolumeField());

        assertEquals(expectedBorderColor, borderColorFromField);
        assertEquals(expectedBorderColor, borderColorToField);
        assertEquals(expectedBorderColor, borderColorWeightField);
        assertEquals(expectedBorderColor, borderColorTotalField);
    }
}
