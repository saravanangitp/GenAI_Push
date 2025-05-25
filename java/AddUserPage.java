package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AddUserPage extends ProjectSpecificMethods {

    // Method to enter first name
    /**
     * Enters the first name in the First Name field.
     * @param firstName the first name to be entered
     */
    public void enterFirstName(String firstName) {
        // Using By.id locator strategy
        getDriver().findElement(Locators.ID, "firstName").sendKeys(firstName);
        reportStep("Entered first name: " + firstName + " on Add User page");
    }

    // Method to get the first name
    /**
     * Gets the first name from the First Name field.
     * @return the first name
     */
    public String getFirstName() {
        // Using By.id locator strategy
        return getDriver().findElement(Locators.ID, "firstName").getAttribute("value");
        // reportStep("Got first name: " + getDriver().findElement(Locators.ID, "firstName").getAttribute("value") + " on Add User page");
    }
}