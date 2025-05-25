package com.salesforce.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.framework.reports.ReportManager;

/**
 * Page Object class for the Contact List Page.
 */
public class ContactListPage {

    private Page page;

    /**
     * Method to click on the sign up paragraph.
     */
    public void clickOnSignUpParagraph() {
        // Using getByText as the paragraph contains the text "Sign up to begin adding your contacts!"
        Locator signUpParagraph = page.locator("text=Sign up to begin adding your contacts!");
        // Perform the click action
        signUpParagraph.click();
        // Log the action
        ReportManager.reportStep("Performed click on sign up paragraph on Contact List Page", "pass");
    }

    /**
     * Method to verify the sign up paragraph is displayed.
     */
    public void verifySignUpParagraphIsDisplayed() {
        // Using getByText as the paragraph contains the text "Sign up to begin adding your contacts!"
        Locator signUpParagraph = page.locator("text=Sign up to begin adding your contacts!");
        // Check if the paragraph is visible
        if (signUpParagraph.isVisible()) {
            // Log the action
            ReportManager.reportStep("Verified sign up paragraph is displayed on Contact List Page", "pass");
        } else {
            // Log the action if the paragraph is not visible
            ReportManager.reportStep("Sign up paragraph is not displayed on Contact List Page", "fail");
        }
    }

    /**
     * Method to navigate to the Contact List Page.
     */
    public void navigateToContactListPage() {
        // Navigate to the Contact List Page
        page.navigate("https://thinking-tester-contact-list.herokuapp.com/addUser");
        // Log the action
        ReportManager.reportStep("Navigated to Contact List Page", "pass");
    }
}