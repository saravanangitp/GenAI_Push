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
        reportStep("Sign up paragraph text: " + signUpParagraphText, "ContactListPage");
        
        return signUpParagraphText;
    }

    /**
     * Method to verify if the sign up paragraph is displayed.
     * 
     * @return true if the sign up paragraph is displayed, false otherwise
     */
    public boolean isSignUpParagraphDisplayed() {
        // Get the sign up paragraph element
        WebElement signUpParagraphElement = driver.findElement(signUpParagraphLocator);
        
        // Check if the sign up paragraph element is displayed
        boolean isDisplayed = signUpParagraphElement.isDisplayed();
        
        // Report the step
        reportStep("Sign up paragraph is displayed: " + isDisplayed, "ContactListPage");
        
        return isDisplayed;
    }
}