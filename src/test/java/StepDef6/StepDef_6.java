package StepDef6;

import Base.BaseClass;
import Pom.ContactUs;
import Pom.Home_Page;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDef_6 extends BaseClass {

    Home_Page homePage = new Home_Page(driver);
    ContactUs contactUs = new ContactUs(driver);

    @When("User verifies the home page is visible successfully")
    public void userVerifiesTheHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(homePage.visibleHomePage());
    }
    @When("User clicks on contact us button")
    public void userClicksOnContactUsButton() {
        homePage.clickOnContactUs();;
    }
    @When("User verifies text get in touch {string} is visible")
    public void userVerifiesTextGetInTouchIsVisible(String getInTouchTxt) {
        Assert.assertTrue(contactUs.visibleGetInTouch(getInTouchTxt));
    }
    @When("User enters name email subject and message")
    public void userEntersNameEmailSubjectAndMessage() {
        contactUs.addNameEmailSubMsg();
    }
    @When("User uploads file")
    public void userUploadsFile() {
        contactUs.uploadFile();
    }
    @When("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        contactUs.clickOnSubmit();
    }
    @When("User clicks on ok")
    public void userClicksOnOk() {
        contactUs.clickOk();
    }
    @When("User verifies success message is visible {string}")
    public void userVerifiesSuccessMessageIsVisible(String successMsgTxt) {
        Assert.assertTrue(contactUs.visibleSuccMsg(successMsgTxt));
    }
    @When("User clicks on home button and verifies landed on home page")
    public void userClicksOnHomeButtonAndVerifiesLandedOnHomePage() {
        contactUs.clikcOnHomeBtn();
        Assert.assertTrue(homePage.visibleHomePage());
    }
}
