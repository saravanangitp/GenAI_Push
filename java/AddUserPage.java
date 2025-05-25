package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AddUserPage extends ProjectSpecificMethods {

    // Method to enter first name
    public void enterFirstName(String firstName) {
        // reportStep("Entering first name on Add User page");
        driver.findElement(Locators.ID, "firstName").sendKeys(firstName);
        reportStep("Entered first name as " + firstName + " on Add User page");
    }

    // Method to enter last name
    public void enterLastName(String lastName) {
        // reportStep("Entering last name on Add User page");
        driver.findElement(Locators.ID, "lastName").sendKeys(lastName);
        reportStep("Entered last name as " + lastName + " on Add User page");
    }

    // Method to enter email
    public void enterEmail(String email) {
        // reportStep("Entering email on Add User page");
        driver.findElement(Locators.ID, "email").sendKeys(email);
        reportStep("Entered email as " + email + " on Add User page");
    }

    // Method to enter password
    public void enterPassword(String password) {
        // reportStep("Entering password on Add User page");
        driver.findElement(Locators.ID, "password").sendKeys(password);
        reportStep("Entered password on Add User page");
    }

    // Method to click submit button
    public void clickSubmitButton() {
        // reportStep("Clicking submit button on Add User page");
        driver.findElement(Locators.ID, "submit").click();
        reportStep("Clicked submit button on Add User page");
    }

    // Method to click cancel button
    public void clickCancelButton() {
        // reportStep("Clicking cancel button on Add User page");
        driver.findElement(Locators.ID, "cancel").click();
        reportStep("Clicked cancel button on Add User page");
    }
}