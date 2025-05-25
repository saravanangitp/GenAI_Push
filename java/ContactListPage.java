package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Page Object class for the Contact List page.
 */
public class ContactListPage extends ProjectSpecificMethods {

    /**
     * Locator for the sign up paragraph element.
     */
    private By signUpParagraphLocator = By.cssSelector("p[class='genai-highlight genai-selected']");

    /**
     * Method to get the sign up paragraph text.
     * 
     * @return the sign up paragraph text
     */
    public String getSignUpParagraphText() {
        // Get the sign up paragraph element
        WebElement signUpParagraphElement = driver.findElement(signUpParagraphLocator);
        // Get the text of the sign up paragraph element
        String signUpParagraphText = signUpParagraphElement.getText();
        // Report the step
        reportStep("Sign up paragraph text retrieved from Contact List page", "INFO");
        return signUpParagraphText;
    }

    /**
     * Method to perform user action on the sign up paragraph element.
     * 
     * @param userAction the user action to perform
     */
    public void performUserActionOnSignUpParagraph(String userAction) {
        // Get the sign up paragraph element
        WebElement signUpParagraphElement = driver.findElement(signUpParagraphLocator);
        // Perform the user action on the sign up paragraph element
        // For example, if userAction is "click", then signUpParagraphElement.click();
        // Report the step
        reportStep("User action '" + userAction + "' performed on sign up paragraph element on Contact List page", "INFO");
    }
}