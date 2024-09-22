package StepDef17;

import Base.BaseClass;
import Pom.AllProducts_Page;
import Pom.Cart_Page;
import Pom.Home_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_17 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    AllProducts_Page allProductsPage = new AllProducts_Page(driver);
    Cart_Page cartPage = new Cart_Page(driver);

    @When("User verifies the home page is visible successfully")
    public void userVerifiesTheHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(homePage.visibleHomePage());
    }
    @When("User add products to cart")
    public void userAddProductsToCart() throws InterruptedException {
        homePage.clickOnProductsBtn();
        allProductsPage.mouseHoverToFirstProd();
        allProductsPage.clickOnOverlayFirstAddCart();
        allProductsPage.clickOnOverlayContinue();
        allProductsPage.mouseHoverToSecondProd();
        allProductsPage.clickOnOverlaySecondAddCart();
        allProductsPage.clickOnOverlayContinue();
    }
    @When("User clicks on cart button")
    public void userClicksOnCartButton() {
        allProductsPage.clickOnCartBtn();
    }
    @Then("User verifies cart page url contains text {string}")
    public void userVerifiesCartPageUrlContainsText(String linkTxt) {
        Assert.assertTrue(cartPage.verifyCartPage(linkTxt));
    }
    @When("Clicks X button corresponding to particular product")
    public void clicksXButtonCorrespondingToParticularProduct() {
        cartPage.firstProdRemove();
    }
    @Then("User verifies that product is removed from the cart")
    public void userVerifiesThatProductIsRemovedFromTheCart() throws InterruptedException {
        Assert.assertFalse(cartPage.verifyFirstProdRemoved());
    }
}
