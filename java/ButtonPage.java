package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ButtonPage extends ProjectSpecificMethods {

    // Method to click the button
    /**
     * Clicks the button with the given id.
     * 
     * @param buttonId the id of the button to click
     */
    public void clickButton(String buttonId) {
        // Report the step
        reportStep("Clicking the button with id: " + buttonId + " on ButtonPage");
        // Click the button
        driver.findElement(Locators.ID, buttonId).click();
    }

    // Method to get the button text
    /**
     * Gets the text of the button with the given id.
     * 
     * @param buttonId the id of the button to get text from
     * @return the text of the button
     */
    public String getButtonText(String buttonId) {
        // Report the step
        reportStep("Getting the text of the button with id: " + buttonId + " on ButtonPage");
        // Get the button text
        return driver.findElement(Locators.ID, buttonId).getText();
    }

    // Method to verify the button class
    /**
     * Verifies the class of the button with the given id.
     * 
     * @param buttonId the id of the button to verify class
     * @param buttonClass the expected class of the button
     */
    public void verifyButtonClass(String buttonId, String buttonClass) {
        // Report the step
        reportStep("Verifying the class of the button with id: " + buttonId + " on ButtonPage");
        // Verify the button class
        assert driver.findElement(Locators.ID, buttonId).getAttribute("class").contains(buttonClass);
    }
}