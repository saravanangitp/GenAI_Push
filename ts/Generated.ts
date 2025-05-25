// InputPage.ts

import { Page, Locator } from '@playwright/test';

/**
 * Page Object for Input Page
 */
export class InputPage {
  private page: Page;
  private firstNameInput: Locator;

  /**
   * Initialize the page object with the Playwright Page instance
   * @param page 
   */
  // page: Page is passed from the test file, no need for a constructor

  /**
   * Method to fill the First Name input field
   * @param firstName 
   */
  public fillFirstNameInput(firstName: string): void {
    // Use getByPlaceholder to locate the input field
    this.firstNameInput = this.page.getByPlaceholder('First Name');
    // Fill the input field
    this.firstNameInput.fill(firstName);
    // Log the action
    this.reportStep(`Filled the First Name input field with ${firstName} on Input Page`, "pass");
  }

  /**
   * Method to get the value of the First Name input field
   * @returns 
   */
  public getFirstNameInputValue(): string {
    // Use getByPlaceholder to locate the input field
    this.firstNameInput = this.page.getByPlaceholder('First Name');
    // Get the input field value
    return this.firstNameInput.inputValue();
  }
}