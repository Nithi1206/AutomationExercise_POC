package StepDef10;

import Base.BaseClass;
import Pom.Home_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_10 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);

    @When("User verifies the home page is visible successfully")
    public void userVerifiesTheHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(homePage.visibleHomePage());
    }
    @When("User scroll down to footer")
    public void userScrollDownToFooter() {
        homePage.scrollToFooter();
    }
    @Then("User verifies text subscription is available {string}")
    public void userVerifiesTextSubscriptionIsAvailable(String aa) {
        Assert.assertTrue(homePage.verifySubscriptionTxt(aa));
    }
    @When("User enters email address in input and click on arrow button")
    public void userEntersEmailAddressInInputAndClickOnArrowButton() {
        homePage.enterSubscriptionEmail();
        homePage.clickArrowBtn();
    }
    @Then("User verifies the text {string} is visible")
    public void userVerifiesTheTextIsVisible(String ac) {
        Assert.assertTrue(homePage.verifySuccessfulSubTxt(ac));
    }
}
