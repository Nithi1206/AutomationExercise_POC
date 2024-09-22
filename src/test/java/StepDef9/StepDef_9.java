package StepDef9;

import Base.BaseClass;
import Pom.AllProducts_Page;
import Pom.Home_Page;
import Pom.SearchProd_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_9 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    AllProducts_Page allProducts = new AllProducts_Page(driver);
    SearchProd_Page searchProdPage = new SearchProd_Page(driver);

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
    @Then("User enters product name {string} and click on search button")
    public void userEntersProductNameAndClickOnSearchButton(String prName) {
        allProducts.enterProdNameInSearchBox(prName);
        allProducts.clickOnSearchBtn();
    }
    @Then("User verifies search product text {string} is visible")
    public void userVerifiesSearchProductTextIsVisible(String prTxt) {
        Assert.assertTrue(searchProdPage.visibleSearchProdTxt(prTxt));
    }
    @Then("User verifies all the products related to search are visible")
    public void userVerifiesAllTheProductsRelatedToSearchAreVisible() {
        Assert.assertTrue(searchProdPage.visibleAllSearchProd());
    }


}
