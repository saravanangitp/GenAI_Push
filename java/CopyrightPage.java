package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Represents the page object for the given DOM structure.
 */
public class CopyrightPage extends ProjectSpecificMethods {

    /**
     * Locates the paragraph element with the class 'genai-highlight genai-selected'.
     */
    @FindBy(xpath = ".//p[contains(@class, 'genai-highlight') and contains(@class, 'genai-selected')]")
    private WebElement copyrightParagraph;

    /**
     * Gets the text of the copyright paragraph.
     * 
     * @return the text of the copyright paragraph
     */
    public String getCopyrightText() {
        // Report the step of getting the copyright text
        reportStep("Getting the copyright text on the Copyright Page");
        // Return the text of the copyright paragraph
        return copyrightParagraph.getText();
    }

    /**
     * Verifies if the copyright paragraph is displayed.
     * 
     * @return true if the copyright paragraph is displayed, false otherwise
     */
    public boolean isCopyrightParagraphDisplayed() {
        // Report the step of verifying the copyright paragraph display
        reportStep("Verifying the copyright paragraph display on the Copyright Page");
        // Return true if the copyright paragraph is displayed, false otherwise
        return copyrightParagraph.isDisplayed();
    }
}