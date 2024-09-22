package StepDef1;

import Base.BaseClass;
import Pom.Account_Info;
import Pom.Home_Page;
import Pom.Login_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserReg_Step extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    Login_Page loginPage = new Login_Page(driver);
    Account_Info accountInfo = new Account_Info(driver);

    @When("User verifies the home page is visible successfully")
    public void userVerifiesTheHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(homePage.visibleHomePage());
    }

    @And("User clicks on sigin or login button")
    public void userClicksOnSiginOrLoginButton() {
        homePage.clickOnSignIn();
    }

    @And("User verifies new signup is visible")
    public void userVerifiesNewSignupIsVisible() {
        Assert.assertTrue(loginPage.visibleNewUserSignup());
    }

    @And("User enters name and email address")
    public void userEntersNameAndEmailAddress() {
        loginPage.addNameAndEmail();
    }

    @And("User clicks signup button")
    public void userClicksSignupButton() {
        loginPage.clickOnSignUp();
    }

    @And("User fills tite name email password and date of birth")
    public void userFillsTiteNameEmailPasswordAndDateOfBirth() {
        accountInfo.addAccInfo();
    }

    @And("User selects checkbox signup for newsletter")
    public void userSelectsCheckboxSignupForNewsletter() {
        accountInfo.clickOnSplOffer();
    }

    @And("User selects checkbox receive special offers from our partners")
    public void userSelectsCheckboxReceiveSpecialOffersFromOurPartners() {
        accountInfo.clickOnNewsLetter();
    }

    @And("User fills name address and contact number")
    public void userFillsNameAddressAndContactNumber() {
        accountInfo.addAddressInfo();
    }

    @And("User clicks on create account button")
    public void userClicksOnCreateAccountButton() {
        accountInfo.clickOnCreateAccBtn();
    }

    @And("User verifies account created is visible")
    public void userVerifiesAccountCreatedIsVisible() {
        Assert.assertTrue(accountInfo.visibleAccCreated());
    }

    @And("User clicks continue button")
    public void userClicksContinueButton() {
        accountInfo.clickOnContinue();
    }

    @Then("User verifies that logged in as username is visible")
    public void userVerifiesThatLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(homePage.visibleLoggedInAs());
    }

    @When("User clicks on delete account button")
    public void userClicksOnDeleteAccountButton() {
        homePage.clickOnAccDelete();
    }

    @Then("User verifies that account deleted is visible and click continue button")
    public void userVerifiesThatAccountDeletedIsVisibleAndClickContinueButton() {
        Assert.assertTrue(homePage.visibleAccDeleted());
        homePage.clickOnAccDelContinue();
    }
}
