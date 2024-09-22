package StepDef26;

import Base.BaseClass;
import Pom.Home_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_26 extends BaseClass {
    Home_Page homePage = new Home_Page(driver);

    @When("User verifies the home page is visible successfully")
    public void userVerifiesTheHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(homePage.visibleHomePage());
    }
    @When("User scrolls to bottom of page")
    public void userScrollsToBottomOfPage() {
        homePage.scrollsToBottomPage();
    }
    @When("User verifies text subscription is available {string}")
    public void userVerifiesTextSubscriptionIsAvailable(String txt) {
        Assert.assertEquals(txt, homePage.getBottomSubTxt());
    }
    @And("User scrolls to top of the page")
    public void userScrollsToTopOfThePage() throws InterruptedException {
        homePage.scrollUpPage();
    }
    @When("User verifies that page is scrolled up")
    public void userVerifiesThatPageIsScrolledUp() throws InterruptedException {
        Assert.assertTrue(homePage.verifyPageIsFullyScrolledUp());
    }
    @When("User verifies Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void userVerifiesFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
        Assert.assertTrue(homePage.verifyFullPledged());
    }

}
