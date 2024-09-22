package StepDef8;

import Base.BaseClass;
import Pom.AllProducts_Page;
import Pom.Home_Page;
import Pom.ProductDetail_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_8 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    AllProducts_Page allProducts = new AllProducts_Page(driver);
    ProductDetail_Page productDetailPage = new ProductDetail_Page(driver);

    @When("User verifies the home page is visible successfully")
    public void userVerifiesTheHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(homePage.visibleHomePage());
    }
    @When("User clicks on product button on homepage")
    public void userClicksOnProductButtonOnHomepage() {
        homePage.clickOnProductsBtn();
    }
    @Then("User verifies navigated to all products page successfully {string}")
    public void userVerifiesNavigatedToAllProductsPageSuccessfully(String pr) {
        Assert.assertTrue(allProducts.verifyProductPage(pr));
    }
    @When("User verifies product list is visible")
    public void userVerifiesProductListIsVisible() {
        Assert.assertTrue(allProducts.visibleAllProducts());
    }
    @When("User clicks on view product of first product")
    public void userClicksOnViewProductOfFirstProduct() {
        allProducts.clickOnFirstViewCart();
    }
    @Then("User verifies landed to product detail page {string}")
    public void userVerifiesLandedToProductDetailPage(String urlText) {
        Assert.assertTrue(productDetailPage.verifyPage(urlText));
    }
    @When("User verifies that details name category price availability condition brand are visible")
    public void userVerifiesThatDetailsNameCategoryPriceAvailabilityConditionBrandAreVisible() {
        Assert.assertTrue(productDetailPage.visibleProdName());
        Assert.assertTrue(productDetailPage.visibleProdCategory());
        Assert.assertTrue(productDetailPage.visibleProdPrice());
        Assert.assertTrue(productDetailPage.visibleProdAvail());
        Assert.assertTrue(productDetailPage.visibleProdCondition());
        Assert.assertTrue(productDetailPage.visibleProdBrand());
    }



}
