package StepDef3;

import Base.BaseClass;
import Pom.Home_Page;
import Pom.Login_Page;
import io.cucumber.java.en.But;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_3 extends BaseClass {

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
    @When("User enters incorrect email and password")
    public void userEntersIncorrectEmailAndPassword() {
        loginPage.addIncorecctEmail();
        loginPage.addIncorrectPwd();
    }
    @When("User clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.clickOnLoginBtn();
    }
    @But("User verifies your email or password is incorrect is visible")
    public void userVerifiesYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertTrue(loginPage.visibleIncorrectEmailTxt());
    }

}
