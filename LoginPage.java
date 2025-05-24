package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

    // Method to enter email
    /**
     * Enters the email into the email field.
     * @param email the email to be entered
     */
    public void enterEmail(String email) {
        // Using By.id locator strategy
        reportStep("Entering email on the login page", "INFO");
        driver.findElement(Locators.ID, "email").sendKeys(email);
    }

    // Method to enter password
    /**
     * Enters the password into the password field.
     * @param password the password to be entered
     */
    public void enterPassword(String password) {
        // Using By.id locator strategy
        reportStep("Entering password on the login page", "INFO");
        driver.findElement(Locators.ID, "password").sendKeys(password);
    }

    // Method to click submit button
    /**
     * Clicks the submit button.
     */
    public void clickSubmit() {
        // Using By.id locator strategy
        reportStep("Clicking submit button on the login page", "INFO");
        driver.findElement(Locators.ID, "submit").click();
    }
}