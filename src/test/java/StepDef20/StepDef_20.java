package StepDef20;

import Base.BaseClass;
import Pom.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_20 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    AllProducts_Page allProductsPage = new AllProducts_Page(driver);
    SearchProd_Page searchProdPage = new SearchProd_Page(driver);
    Cart_Page cartPage = new Cart_Page(driver);
    Login_Page loginPage = new Login_Page(driver);


    @When("User clicks on product button on homepage")
    public void userClicksOnProductButtonOnHomepage() {
        homePage.clickOnProductsBtn();
    }
    @Then("User verifies that all product page url contains text {string}")
    public void userVerifiesThatAllProductPageUrlContainsText(String urlTxt) {
        Assert.assertTrue(allProductsPage.verifyProductPage(urlTxt));
    }
    @When("User enters product name {string} in search input and click search button")
    public void userEntersProductNameInSearchInputAndClickSearchButton(String prName) {
        allProductsPage.enterProdNameInSearchBox(prName);
        allProductsPage.clickOnSearchBtn();
    }
    @Then("User verifies Searched Product is visible on the page {string}")
    public void userVerifiesSearchedProductIsVisibleOnThePage(String searchProdTxt) {
        Assert.assertTrue(searchProdPage.visibleSearchProdTxt(searchProdTxt));
    }
    @When("User verifies product related to search is visible {string}")
    public void userVerifiesProductRelatedToSearchIsVisible(String pName) {
        Assert.assertEquals(searchProdPage.getSearchProdName(), pName);
    }
    @When("User add the product to cart")
    public void userAddTheProductToCart() throws InterruptedException {
        searchProdPage.clickOnAddToCart();
        searchProdPage.clickOnContShoppingBtn();
    }
    @When("User clicks on cart button and verify that products are visible in cart")
    public void userClicksOnCartButtonAndVerifyThatProductsAreVisibleInCart() {
        searchProdPage.clickOnCartBtn();
        Assert.assertTrue(cartPage.visibleFirstProd());
    }
    @When("User clicks on signin or login button and submit login details")
    public void userClicksOnSigninOrLoginButtonAndSubmitLoginDetails() {
        cartPage.clicksOnSignInOrLoginBtn();
        loginPage.loginWithCorrectCredentials();
    }
    @When("User clicks on cart page")
    public void userClicksOnCartPage() {
        homePage.clickOnCart();
    }
    @Then("User verifies that that those products are visible in cart after login as well")
    public void userVerifiesThatThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
        Assert.assertTrue(cartPage.visibleFirstProd());
        cartPage.clicksOnLogout();
    }


}
