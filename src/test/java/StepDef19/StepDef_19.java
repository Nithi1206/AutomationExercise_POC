package StepDef19;

import Base.BaseClass;
import Pom.AllProducts_Page;
import Pom.BrandProducts_Page;
import Pom.Home_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_19 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    AllProducts_Page allProductsPage = new AllProducts_Page(driver);
    BrandProducts_Page brandProductsPage = new BrandProducts_Page(driver);

    @When("User clicks on product button on homepage")
    public void userClicksOnProductButtonOnHomepage() {
        homePage.clickOnProductsBtn();
    }
    @Then("User verifies that Brands are visible on left side bar")
    public void userVerifiesThatBrandsAreVisibleOnLeftSideBar() {
        Assert.assertTrue(allProductsPage.visibleSideBarBrands());
    }
    @When("User clicks on any brand name")
    public void userClicksOnAnyBrandName() {
        allProductsPage.clickOnPoloBrand();
    }
    @Then("User verifies that brand page url is contained {string} and brand products are displayed")
    public void userVerifiesThatBrandPageUrlIsContainedAndBrandProductsAreDisplayed(String urlTxt) {
        Assert.assertTrue(brandProductsPage.verifyProdBrandPage(urlTxt));
        Assert.assertTrue(brandProductsPage.visibleBrandProds());
    }
    @When("User clicks on any other brand link on left side bar")
    public void userClicksOnAnyOtherBrandLinkOnLeftSideBar() {
        brandProductsPage.clickOnBibaBrand();
    }
    @Then("User verifies that brand page url is contained {string} and can see products")
    public void userVerifiesThatBrandPageUrlIsContainedAndCanSeeProducts(String urlTxt) {
        Assert.assertTrue(brandProductsPage.verifyProdBrandPage(urlTxt));
        Assert.assertTrue(brandProductsPage.visibleBrandProds());
    }


}
