package StepDef7;

import Base.BaseClass;
import Pom.Home_Page;
import Pom.TestCase_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_7 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    TestCase_Page testCasePage = new TestCase_Page(driver);


    @When("User verifies the home page is visible successfully")
    public void userVerifiesTheHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(homePage.visibleHomePage());
    }
    @When("User clicks on test case button")
    public void userClicksOnTestCaseButton() {
        homePage.clickonTestCaseBtn();
    }
    @Then("User verifies that navigated to test case page successfully")
    public void userVerifiesThatNavigatedToTestCasePageSuccessfully() {
        Assert.assertTrue(testCasePage.verifyPage());
    }
}
