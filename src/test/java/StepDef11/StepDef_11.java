package StepDef11;

import Base.BaseClass;
import Pom.Cart_Page;
import Pom.Home_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_11 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    Cart_Page cartPage = new Cart_Page(driver);

    @When("User verifies the home page is visible successfully")
    public void userVerifiesTheHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(homePage.visibleHomePage());
    }
    @When("User clicks on cart button")
    public void userClicksOnCartButton() {
        homePage.clickOnCart();
    }
    @When("User scroll down to footer")
    public void userScrollDownToFooter() {
        cartPage.scrollToFooter();
    }
    @Then("User verifies text subscription is available {string}")
    public void userVerifiesTextSubscriptionIsAvailable(String aa) {
        Assert.assertTrue(cartPage.verifySubscriptionTxt(aa));
    }
    @When("User enters email address in input and click on arrow button")
    public void userEntersEmailAddressInInputAndClickOnArrowButton() {
        cartPage.enterSubscriptionEmail();
        cartPage.clickArrowBtn();
    }
    @Then("User verifies the text {string} is visible")
    public void userVerifiesTheTextIsVisible(String ac) {
        Assert.assertTrue(cartPage.verifySuccessfulSubTxt(ac));
    }
}
