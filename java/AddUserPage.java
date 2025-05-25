package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page object class for Add User page.
 */
public class AddUserPage extends ProjectSpecificMethods {

    // Method to verify the header
    /**
     * Verify the header of the Add User page.
     */
    public void verifyHeader() {
        // Locate the header element
        WebElement header = getDriver().findElement(Locators.XPATH, "//h1");
        // Verify the header text
        reportStep("Verifying the header on Add User page", "INFO");
        if (header.getText().equals("Add User")) {
            reportStep("Header is verified successfully on Add User page", "PASS");
        } else {
            reportStep("Header is not verified on Add User page", "FAIL");
        }
    }

    // Method to verify the header class
    /**
     * Verify the class of the header element.
     */
    public void verifyHeaderClass() {
        // Locate the header element
        WebElement header = getDriver().findElement(Locators.XPATH, "//h1");
        // Verify the header class
        reportStep("Verifying the header class on Add User page", "INFO");
        if (header.getAttribute("class").equals("genai-highlight genai-selected")) {
            reportStep("Header class is verified successfully on Add User page", "PASS");
        } else {
            reportStep("Header class is not verified on Add User page", "FAIL");
        }
    }
}