package StepDef21;

import Base.BaseClass;
import Pom.AllProducts_Page;
import Pom.Home_Page;
import Pom.ProductDetail_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_21 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    AllProducts_Page allProductsPage = new AllProducts_Page(driver);
    ProductDetail_Page productDetailPage = new ProductDetail_Page(driver);

    @When("User clicks on product button on homepage")
    public void userClicksOnProductButtonOnHomepage() {
        homePage.clickOnProductsBtn();
    }
    @Then("User verifies that all product page url contains text {string}")
    public void userVerifiesThatAllProductPageUrlContainsText(String urlTxt) {
        Assert.assertTrue(allProductsPage.verifyProductPage(urlTxt));
    }
    @When("User clicks on view product button")
    public void userClicksOnViewProductButton() {
        allProductsPage.clicksOnFirstViewProd();
    }
    @Then("User verifies Write your Review text is available {string}")
    public void userVerifiesWriteYourReviewTextIsAvailable(String reviewTxt) {
        Assert.assertEquals(productDetailPage.getWriteReviewTxt(), reviewTxt);
    }
    @When("User enters name {string} email {string} and review {string}")
    public void userEntersNameEmailAndReview(String uName, String emailAdd, String reviewMsg) {
        productDetailPage.addNameEmailReview(uName, emailAdd, reviewMsg);
    }
    @When("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        productDetailPage.clickOnSubmit();
    }
    @Then("User verifies success message {string} is visible")
    public void userVerifiesSuccessMessageIsVisible(String thanReviewTxt) {
        Assert.assertEquals(productDetailPage.getThanksReviewTxt(), thanReviewTxt);
    }
}
