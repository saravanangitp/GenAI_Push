// AddUserPage.ts

import { Page, Locator } from '@playwright/test';

/**
 * Page Object for Add User Page
 */
export class AddUserPage {

  private page: Page;
  private lastNameInput: Locator;

  /**
   * Initialize the page object with the provided Playwright Page instance
   * @param page 
   */
  // private constructor(page: Page) {
  //   this.page = page;
  //   this.lastNameInput = page.getByPlaceholder('Last Name');
  // }

  /**
   * Enter the last name
   * @param userAction 
   */
  public enterLastName(userAction: string): void {
    // Get the last name input field using the getByPlaceholder locator strategy
    this.lastNameInput = this.page.getByPlaceholder('Last Name');
    // Perform the user action on the last name input field
    this.lastNameInput.fill(userAction);
    // Log the action
    this.reportStep(`Performed entering last name on Add User Page`, "pass");
  }

  /**
   * Navigate to the add user page
   */
  public navigateToAddUserPage(): void {
    // Navigate to the add user page
    this.page.goto('https://thinking-tester-contact-list.herokuapp.com/addUser');
    // Log the action
    this.reportStep(`Navigated to Add User Page`, "pass");
  }

  /**
   * Report a step
   * @param step 
   * @param status 
   */
  private reportStep(step: string, status: string): void {
    console.log(`Report Step: ${step} - ${status}`);
  }

  /**
   * Initialize the page object
   * @param page 
   */
  public static initialize(page: Page): AddUserPage {
    const addUserPage = new AddUserPage();
    addUserPage.page = page;
    return addUserPage;
  }
}