package StepDef16;

import Base.BaseClass;
import Pom.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_16 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    Payment_Page paymentPage = new Payment_Page(driver);
    PaymentDone_Page paymentDonePage = new PaymentDone_Page(driver);
    AllProducts_Page allProductsPage = new AllProducts_Page(driver);
    ViewCart_Page viewCartPage = new ViewCart_Page(driver);
    Login_Page loginPage = new Login_Page(driver);
    Account_Info accountInfo = new Account_Info(driver);
    CheckOut_Page checkOutPage = new CheckOut_Page(driver);

    @When("User verifies the home page is visible successfully")
    public void userVerifiesTheHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(homePage.visibleHomePage());
    }
    @When("User clicks on sigin or login button")
    public void userClicksOnSiginOrLoginButton() {
        homePage.clickOnSignIn();
    }
    @And("User fills email and password and click login button")
    public void userFillsEmailAndPasswordAndClickLoginButton() {
        loginPage.loginEmail2();
        loginPage.loginPassword();
        loginPage.clickOnLoginBtn();
    }
    @Then("User verifies that logged in as username is visible")
    public void userVerifiesThatLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(homePage.visibleLoggedInAs());
    }
    @When("User add products to cart")
    public void userAddProductsToCart() {
        homePage.clickOnProductsBtn();
        allProductsPage.mouseHoverToFirstProd();
        allProductsPage.clickOnOverlayFirstAddCart();
        allProductsPage.clickOnOverlayContinue();
    }
    @When("User clicks on cart button")
    public void userClicksOnCartButton() {
        allProductsPage.clickOnCartBtn();
    }
    @Then("User verifies cart page url contains text {string}")
    public void userVerifiesCartPageUrlContainsText(String urlTxt) {
        Assert.assertTrue(viewCartPage.verifyPage(urlTxt));
    }
    @When("User clicks on proceed to checkout")
    public void userClicksOnProceedToCheckout() {
        viewCartPage.clickOnProceedToCheckout();
    }
    @When("User verifies the texts {string} and {string} are visible")
    public void userVerifiesTheTextsAndAreVisible(String accInfo, String reviewOrder) {
        Assert.assertEquals(checkOutPage.getAccDetailTxt(),accInfo);
        Assert.assertEquals(checkOutPage.getReviewUrOrderTxt(),reviewOrder);
    }
    @When("User add description {string} and click place order button")
    public void userAddDescriptionAndClickPlaceOrderButton(String message) {
        checkOutPage.addMessageInDescription(message);
        checkOutPage.clickOnPlaceOrder();
    }
    @When("User enters details name on card {string} card number {string} cvc {string} expire month {string} year {string}")
    public void userEntersDetailsNameOnCardCardNumberCvcExpireMonthYear(String name, String cNum, String cvv, String expMonth, String expYear) {
        paymentPage.addCardDetail(name, cNum, cvv, expMonth, expYear);
    }
    @When("User clicks on pay and confirm order button")
    public void userClicksOnPayAndConfirmOrderButton() {
        paymentPage.clickOnPayBtn();
    }
    @When("User verifies the success alert text {string} is visible")
    public void userVerifiesTheSuccessAlertTextIsVisible(String sucText) {
        Assert.assertEquals(sucText, paymentDonePage.verifySuccessAlert());
    }
    @When("User clicks on delete account button")
    public void userClicksOnDeleteAccountButton() {
        paymentDonePage.clickOnDelAccBtn();
    }
    @Then("User verifies that account deleted text {string} is visible and click on continue button")
    public void userVerifiesThatAccountDeletedTextIsVisibleAndClickOnContinueButton(String string) {
        Assert.assertEquals(paymentDonePage.visibleAccDeleted(),string);
        paymentDonePage.clickOnContBtn();
    }

}
