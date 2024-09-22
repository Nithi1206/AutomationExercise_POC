package StepDef13;

import Base.BaseClass;
import Pom.Home_Page;
import Pom.ProductDetail_Page;
import Pom.ViewCart_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_13 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    ProductDetail_Page productDetailPage = new ProductDetail_Page(driver);
    ViewCart_Page viewCartPage = new ViewCart_Page(driver);

    @When("User verifies the home page is visible successfully")
    public void userVerifiesTheHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(homePage.visibleHomePage());
    }
    @When("User clicks on view product for any product on home page")
    public void userClicksOnViewProductForAnyProductOnHomePage() {
        homePage.clickOnFirstProdViewCart();
    }
    @Then("User verifies url contains product details text {string}")
    public void userVerifiesUrlContainsProductDetailsText(String prodDet) {
        Assert.assertTrue(productDetailPage.verifyPage(prodDet));
    }
    @When("User increases quantity to four")
    public void userIncreasesQuantityToFour() {
        productDetailPage.increaseQty();
    }
    @When("User clicks on add to cart button")
    public void userClicksOnAddToCartButton() {
        productDetailPage.clickOnAddToCart();
    }
    @Then("User verifies that product is displayed in cart page with exact {string} quantity")
    public void userVerifiesThatProductIsDisplayedInCartPageWithExactQuantity(String quantity) {
        productDetailPage.clickOnViewCart();
        Assert.assertTrue(viewCartPage.verifyProdQty(quantity));

    }
}
