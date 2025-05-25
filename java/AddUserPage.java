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
     * Locator for the Add User header element.
     */
    private By addUserHeaderLocator = By.xpath("//h1[text()='Add User']");

    /**
     * Performs the user action on the Add User page.
     * 
     * @param userAction the action to be performed
     */
    public void performUserAction(String userAction) {
        // Get the Add User header element
        WebElement addUserHeader = getDriver().findElement(addUserHeaderLocator);
        
        // Perform the user action
        // Add your action logic here based on the userAction parameter
        reportStep("Performing user action: " + userAction + " on Add User page", "INFO");
    }

    /**
     * Verifies if the Add User header is displayed.
     * 
     * @return true if the header is displayed, false otherwise
     */
    public boolean isAddUserHeaderDisplayed() {
        // Get the Add User header element
        WebElement addUserHeader = getDriver().findElement(addUserHeaderLocator);
        
        // Check if the header is displayed
        boolean isDisplayed = addUserHeader.isDisplayed();
        reportStep("Verified if Add User header is displayed on Add User page", "INFO");
        return isDisplayed;
    }

    /**
     * Navigates to the Add User page.
     */
    public void navigateToAddUserPage() {
        // Navigate to the Add User page
        getDriver().get("https://thinking-tester-contact-list.herokuapp.com/addUser");
        reportStep("Navigated to Add User page", "INFO");
    }
}