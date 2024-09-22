package StepDef12;

import Base.BaseClass;
import Pom.AllProducts_Page;
import Pom.Home_Page;
import Pom.ViewCart_Page;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_12 extends BaseClass {
    Home_Page homePage = new Home_Page(driver);
    AllProducts_Page allProductsPage = new AllProducts_Page(driver);
    ViewCart_Page viewCartPage = new ViewCart_Page(driver);

    @When("User verifies the home page is visible successfully")
    public void userVerifiesTheHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(homePage.visibleHomePage());
    }
    @When("User clicks on product button on homepage")
    public void userClicksOnProductButtonOnHomepage() {
        homePage.clickOnProductsBtn();
    }
    @When("User hover over first product and click Add to cart")
    public void userHoverOverFirstProductAndClickAddToCart() {
        allProductsPage.mouseHoverToFirstProd();
        allProductsPage.clickOnOverlayFirstAddCart();
    }
    @When("User click continue shopping button")
    public void userClickContinueShoppingButton() {
        allProductsPage.clickOnOverlayContinue();
    }
    @When("User hover over second product and click Add to cart")
    public void userHoverOverSecondProductAndClickAddToCart() throws InterruptedException {
        allProductsPage.mouseHoverToSecondProd();
        allProductsPage.clickOnOverlaySecondAddCart();
    }
    @When("User clicks on view cart button")
    public void userClicksOnViewCartButton() {
        allProductsPage.clickOnOverlayViewCart();
    }
    @When("User verifies both products are added to cart")
    public void userVerifiesBothProductsAreAddedToCart() {
        Assert.assertTrue(viewCartPage.verifyFirstProd());
        Assert.assertTrue(viewCartPage.verifySecondProd());
    }
    @When("User verifies their prices quantity and total price")
    public void userVerifiesTheirPricesQuantityAndTotalPrice() {
        Assert.assertTrue(viewCartPage.firstProdPrice());
        Assert.assertTrue(viewCartPage.secondProdPrice());
    }

}
