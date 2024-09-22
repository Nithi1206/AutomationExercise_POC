package StepDef23;

import Base.BaseClass;
import Pom.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_23 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    Login_Page loginPage = new Login_Page(driver);
    Account_Info accountInfo = new Account_Info(driver);
    Cart_Page cartPage = new Cart_Page(driver);
    ViewCart_Page viewCartPage = new ViewCart_Page(driver);
    CheckOut_Page checkOutPage =  new CheckOut_Page(driver);

    @When("User verifies the home page is visible successfully")
    public void userVerifiesTheHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(homePage.visibleHomePage());
    }
    @When("User clicks on sigin or login button")
    public void userClicksOnSiginOrLoginButton() {
        homePage.clickOnSignIn();
    }
    @When("User fills all detail in signup and create account")
    public void userFillsAllDetailInSignupAndCreateAccount() {
        loginPage.addNameAndEmail();
        loginPage.clickOnSignUp();
        accountInfo.addAccInfo();
        accountInfo.addAddressInfo();
        accountInfo.clickOnCreateAccBtn();
    }
    @Then("User verifies account created is visible and click on continue button")
    public void userVerifiesAccountCreatedIsVisibleAndClickOnContinueButton() {
        Assert.assertTrue(accountInfo.visibleAccCreated());
        accountInfo.clickOnContinue();
    }
    @Then("User verifies that logged in as username is visible")
    public void userVerifiesThatLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(homePage.visibleLoggedInAs());
    }
    @When("User add product to cart")
    public void userAddProductToCart() {
        homePage.clickOnFirstProdAddToCart();
        homePage.clickOnContinueShopping();
    }
    @When("User clicks on cart button")
    public void userClicksOnCartButton() {
        homePage.clickOnCart();
    }
    @Then("User verifies url conatins text view_cart {string}")
    public void userVerifiesUrlConatinsTextViewCart(String urlTxt) {
        Assert.assertTrue(cartPage.verifyCartPage(urlTxt));
    }
    @When("User clicks on proceed to checkout")
    public void userClicksOnProceedToCheckout() {
        viewCartPage.clickOnProceedToCheckout();
    }
    @When("User verifies that the delivery address is same address filled at the time registration of account")
    public void userVerifiesThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertTrue(checkOutPage.verifyDelAddress());
    }
    @When("User verifies that the billing address is same address filled at the time registration of account")
    public void userVerifiesThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertTrue(checkOutPage.verifyBillingAddress());
    }
    @When("User clicks on delete account button")
    public void userClicksOnDeleteAccountButton() {
        checkOutPage.clickOnDelAccBtn();
    }
    @Then("User verifies that account deleted text {string} is visible and click on continue button")
    public void userVerifiesThatAccountDeletedTextIsVisibleAndClickOnContinueButton(String AccDeleted) {
        Assert.assertTrue(homePage.visibleAccDeleted());
    }

}
