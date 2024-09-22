package StepDef5;

import Base.BaseClass;
import Pom.Home_Page;
import Pom.Login_Page;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_5 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    Login_Page loginPage = new Login_Page(driver);

    @When("User verifies the home page is visible successfully")
    public void userVerifiesTheHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(homePage.visibleHomePage());
    }
    @When("User clicks on sigin or login button")
    public void userClicksOnSiginOrLoginButton() {
        homePage.clickOnSignIn();
    }
    @When("User verifies new signup is visible")
    public void userVerifiesNewSignupIsVisible() {
        Assert.assertTrue(loginPage.visibleNewUserSignup());
    }
    @When("User enters username and already registered email")
    public void userEntersUsernameAndAlreadyRegisteredEmail() {
        loginPage.alreadyRegisteredEmail();
    }
    @When("User clicks signup button")
    public void userClicksSignupButton() {
        loginPage.clickOnSignUp();
    }
    @When("User verifies the error text {string} is visible")
    public void userVerifiesTheErrorTextIsVisible(String errText) {
        Assert.assertTrue(loginPage.visibleSignupErrorText(errText));
    }
}
