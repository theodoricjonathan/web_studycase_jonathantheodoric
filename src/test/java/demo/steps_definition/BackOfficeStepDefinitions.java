package demo.steps_definition;

import demo.pages.backoffice.CategoriesPage;
import demo.pages.backoffice.DashboardPage;
import demo.pages.backoffice.ItemLibraryPage;
import demo.pages.backoffice.LoginPage;
import demo.pages.backoffice.ModifiersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BackOfficeStepDefinitions {

  LoginPage loginPage = new LoginPage();
  DashboardPage dashboardPage = new DashboardPage();
  CategoriesPage categoriesPage = new CategoriesPage();
  ItemLibraryPage itemLibraryPage = new ItemLibraryPage();
  ModifiersPage modifiersPage = new ModifiersPage();

  @Given("User open moka backoffice login page")
  public void userOpenMokaBackofficeLoginPage() {
    loginPage.openPage();
  }

  @When("User input email/phone {string} on backoffice login page")
  public void userInputEmailOnBackofficeLoginPage(String emailOrPhone) {
    loginPage.inputEmailorPhone(emailOrPhone);
  }

  @When("User input password {string} on backoffice login page")
  public void userInputPasswordOnBackofficeLoginPage(String password) {
    loginPage.inputPassword(password);
  }

  @When("User click Sign in on backoffice login page")
  public void userClickSignInOnBackofficeLoginPage() {
    loginPage.clickSignIn();
  }


  @Then("User successfully login on backoffice")
  public void userSuccessfullyLoginOnBackoffice() {
    Assert.assertTrue(dashboardPage.isOnPage());
  }

  @When("User go to menu categories on backoffice")
  public void userGoToMenuCategoriesOnBackoffice() {
    categoriesPage.openPage();
  }


  @When("User go to menu item library on backoffice")
  public void userGoToMenuItemLibraryOnBackoffice() {
    itemLibraryPage.openPage();
  }

  @When("User go to menu modifiers on backoffice")
  public void userGoToMenuModifiersOnBackoffice() {
    modifiersPage.openPage();
  }

  @And("User click Create Category")
  public void userClickCreateCategory() {
    categoriesPage.clickCreateCategory();
  }

  @And("User input {string} on category page")
  public void userInputOnCategoryPage(String data) {
    categoriesPage.inputCategory(data);
  }

  @And("User click save")
  public void userClickSave() {
    categoriesPage.clickSave();
  }

  @Then("category {string} created")
  public void categoryCreated(String data) {
    String actual = categoriesPage.getCategory();
    Assert.assertEquals(data, actual);
  }

  @And("User click Create Modifier")
  public void userClickCreateModifier() {
    modifiersPage.clickCreateModifier();
  }

  @And("User input {string}")
  public void userInput(String data) {
    modifiersPage.inputModifier(data);
  }

  @And("User click Manage")
  public void userClickManage() {
    modifiersPage.clickManage();
  }

  @And("User click Add Option")
  public void userClickAddOption() {
    modifiersPage.clickAddOption();
  }

  @And("User click save manage")
  public void userClickSaveManage() {
    modifiersPage.clickSaveManage();
  }

  @And("User click Saves")
  public void userClickSaves() {
    modifiersPage.clickSaves();
  }

  @Then("modifier {string} created")
  public void modifierCreated(String data) {
    String actual = modifiersPage.getModifier();
    Assert.assertEquals(data, actual);
  }

  @And("User inputs {string}")
  public void userInputs(String data) {
    modifiersPage.inputName(data);
  }

  @And("User input price {string}")
  public void userInputPrice(String data) {
    modifiersPage.inputPrice(data);
  }

  @And("user click Create Item")
  public void userClickCreateItem() {
    itemLibraryPage.clickCreateItem();
  }


  @And("User input name {string}")
  public void userInputName(String data) {
    itemLibraryPage.inputNames(data);
  }

  @And("User input prices {string}")
  public void userInputPrices(String data) {
    itemLibraryPage.inputPrices(data);
  }

  @And("User click save item")
  public void userClickSaveItem() {
    itemLibraryPage.clickSaveItem();
  }

  @Then("item {string} created")
  public void itemCreated(String data) {
    String actual = itemLibraryPage.getItem();
    Assert.assertEquals(data, actual);
  }
}
