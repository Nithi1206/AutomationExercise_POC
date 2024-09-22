package Pom;

import Base.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Account_Info {

    WebDriver driver;

    public Account_Info(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    private WebElement accInformation;

    @FindBy(xpath = "//input[@id='id_gender1']")
    private WebElement genderTitle;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passField;

    @FindBy(xpath = "//select[@id='days']")
    private WebElement dayB;

    @FindBy(xpath = "//select[@id='months']")
    private WebElement monthB;

    @FindBy(xpath = "//select[@id='years']")
    private WebElement yearB;

    @FindBy(xpath = "//input[@id='newsletter']")
    private WebElement newsLetter;

    @FindBy(xpath = "//input[@id='optin']")
    private WebElement splOffer;

    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='company']")
    private WebElement companyName;

    @FindBy(xpath = "//input[@id='address1']")
    private WebElement address1;

    @FindBy(xpath = "//input[@id='address2']")
    private WebElement address2;

    @FindBy(xpath = "//input[@id='state']")
    private WebElement stateName;

    @FindBy(xpath = "//input[@id='city']")
    private WebElement cityName;

    @FindBy(xpath = "//input[@id='zipcode']")
    private WebElement zipCode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    private WebElement mobNumber;

    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement crateAccBtn;

    @FindBy(xpath = "//b[text()='Account Created!']")
    private WebElement accCreated;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement continueBtn;

    public void addAccInfo(){
        genderTitle.click();
        passField.sendKeys(TestData.correctPassword);
        Select s1 = new Select(dayB);
        s1.selectByVisibleText(TestData.day);
        Select s2 = new Select(monthB);
        s2.selectByVisibleText(TestData.month);
        Select s3 = new Select(yearB);
        s3.selectByVisibleText(TestData.year);
    }
    public void clickOnSplOffer(){
        splOffer.click();
    }
    public void clickOnNewsLetter(){
        newsLetter.click();
    }
    public void addAddressInfo(){
        firstName.sendKeys(TestData.fName);
        lastName.sendKeys(TestData.lName);
        companyName.sendKeys((TestData.companyName));
        address1.sendKeys(TestData.addressArea);
        address2.sendKeys(TestData.addressArea2);
        stateName.sendKeys(TestData.state);
        cityName.sendKeys(TestData.city);
        zipCode.sendKeys(TestData.zip);
        mobNumber.sendKeys(TestData.mobileNumber);
    }
    public void clickOnCreateAccBtn(){
        crateAccBtn.click();
    }
    public boolean visibleAccCreated(){
        return accCreated.isDisplayed();
    }
    public void clickOnContinue(){
        continueBtn.click();
    }


}
