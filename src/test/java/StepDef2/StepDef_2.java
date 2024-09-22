package StepDef2;

import Base.BaseClass;
import Pom.Home_Page;
import Pom.Login_Page;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_2 extends BaseClass {

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
    @When("User verifies Login to your account is visible")
    public void userVerifiesLoginToYourAccountIsVisible() {
        Assert.assertTrue(loginPage.visibleLoginToUrAcc());
    }
    @When("User enters correct email and password")
    public void userEntersCorrectEmailAndPassword() {
        loginPage.loginEmail();
        loginPage.loginPassword();
    }
    @When("User clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.clickOnLoginBtn();

    }
    @When("User verifies that logged in as username is visible")
    public void userVerifiesThatLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(homePage.visibleLoggedInAs());
    }
    @When("User clicks on delete account button")
    public void userClicksOnDeleteAccountButton() {
        homePage.clickOnAccDelete();
    }
    @When("User verifies that account deleted is visible")
    public void userVerifiesThatAccountDeletedIsVisible() {
        Assert.assertTrue(homePage.visibleAccDeleted());
    }

    }
