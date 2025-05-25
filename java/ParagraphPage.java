package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.WebElement;

public class ParagraphPage extends ProjectSpecificMethods {

    // Method to verify the paragraph text
    /**
     * Verify the paragraph text.
     * @param paragraphText the expected paragraph text
     */
    public void verifyParagraphText(String paragraphText) {
        // Locate the paragraph element using cssSelector
        WebElement paragraphElement = driver.findElement(Locators.CSS_SELECTOR, "p.genai-highlight.genai-selected");
        // Verify the paragraph text
        reportStep("Verifying the paragraph text on ParagraphPage", paragraphElement.getText().equals(paragraphText));
    }
}