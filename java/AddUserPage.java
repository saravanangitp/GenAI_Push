package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Page Object class for Add User page.
 */
public class AddUserPage extends ProjectSpecificMethods {

    /**
     * Locator for the Add User header.
     */
    private By addUserHeaderLocator = By.xpath("//h1[text()='Add User']");

    /**
     * Performs the user action on the Add User page.
     * 
     * @param userAction the action to be performed
     */
    public void performUserAction(String userAction) {
        // Perform the user action
        reportStep("Performing user action: " + userAction + " on Add User page", "INFO");
        // Add the actual action based on the userAction parameter
    }

    /**
     * Gets the Add User header element.
     * 
     * @return the Add User header element
     */
    public WebElement getAddUserHeader() {
        // Get the Add User header element using the locator
        return getDriver().findElement(addUserHeaderLocator);
    }

    /**
     * Verifies if the Add User header is displayed.
     * 
     * @return true if the Add User header is displayed, false otherwise
     */
    public boolean isAddUserHeaderDisplayed() {
        // Get the Add User header element
        WebElement header = getAddUserHeader();
        // Check if the header is displayed
        return header.isDisplayed();
    }

    /**
     * Navigates to the Add User page.
     */
    public void navigateToPage() {
        // Navigate to the Add User page
        getDriver().get("https://thinking-tester-contact-list.herokuapp.com/addUser");
        reportStep("Navigated to Add User page", "INFO");
    }
}