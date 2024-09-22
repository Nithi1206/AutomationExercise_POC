package Pom;

import Base.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

    WebDriver driver;

    public Login_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    private WebElement newUserSignup;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private WebElement userName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement email;

    @FindBy(xpath = "//button[text()='Signup']")
    private WebElement signUpBtn;

    @FindBy (xpath = "//h2[text()='Login to your account']")
    private WebElement loginToUrAcc;

    @FindBy(xpath = "//form[@action='/login']//input[@placeholder='Email Address']")
    private WebElement loginEmailField;

    @FindBy(xpath = "//form[@action='/login']//input[@placeholder='Password']")
    private WebElement loginPasswordField;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginBtn;

    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    private WebElement incorrectEmailText;

    @FindBy(xpath = "//p[contains(text(),'Email Address already exist')]")
    private WebElement alreadyEmailAvailableTxt;

    public boolean visibleNewUserSignup(){
        return newUserSignup.isDisplayed();
    }
    public void addNameAndEmail(){
        userName.sendKeys(TestData.userName);
        email.sendKeys(TestData.email);
    }
    public void clickOnSignUp(){
        signUpBtn.click();
    }
    public boolean visibleLoginToUrAcc(){
        return loginToUrAcc.isDisplayed();
    }
    public void loginEmail(){
        loginEmailField.sendKeys(TestData.correctEmail);
    }
    public void loginPassword(){
        loginPasswordField.sendKeys(TestData.correctPassword);
    }
    public void clickOnLoginBtn(){
        loginBtn.click();
    }
    public void addIncorecctEmail(){
        loginEmailField.sendKeys(TestData.incorrectEmail);
    }
    public void addIncorrectPwd(){
        loginPasswordField.sendKeys(TestData.incorrectPassword);
    }
    public boolean visibleIncorrectEmailTxt(){
        return incorrectEmailText.isDisplayed();
    }
    public void loginEmail2(){
        loginEmailField.sendKeys(TestData.correctEmail1);
    }
    public boolean verifyNavigateToLoginPage(){
        String url = driver.getCurrentUrl();
        return url.contains(TestData.loginUrlContains);
    }
    public void alreadyRegisteredEmail(){
        userName.sendKeys(TestData.userName);
        email.sendKeys(TestData.correctEmail1);
    }
    public boolean visibleSignupErrorText(String err){
        String text = alreadyEmailAvailableTxt.getText();
        return text.contains(err);
    }
    public void loginWithCorrectCredentials(){
        loginEmailField.sendKeys(TestData.correctEmail1);
        loginPasswordField.sendKeys(TestData.correctPassword);
        loginBtn.click();
    }
}
