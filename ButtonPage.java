package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ButtonPage extends ProjectSpecificMethods {

    /**
     * Method to click the cancel button.
     */
    public void clickCancelButton() {
        // Click the cancel button
        reportStep("Clicking the cancel button on ButtonPage");
        driver.findElement(Locators.ID, "cancel").click();
    }

    /**
     * Method to get the text of the cancel button.
     * @return The text of the cancel button.
     */
    public String getCancelButtonText() {
        // Get the text of the cancel button
        reportStep("Getting the text of the cancel button on ButtonPage");
        return driver.findElement(Locators.ID, "cancel").getText();
    }

    /**
     * Method to get the class of the cancel button.
     * @return The class of the cancel button.
     */
    public String getCancelButtonClass() {
        // Get the class of the cancel button
        reportStep("Getting the class of the cancel button on ButtonPage");
        return driver.findElement(Locators.ID, "cancel").getAttribute("class");
    }
}