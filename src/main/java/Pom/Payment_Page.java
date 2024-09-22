package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Payment_Page {
    WebDriver driver;
    JavascriptExecutor js;

    public Payment_Page(WebDriver driver){
        this.driver = driver;
        js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='name_on_card']")
    private WebElement nameOnCard;

    @FindBy(xpath = "//input[@name='card_number']")
    private WebElement cardNum;

    @FindBy(xpath = "//input[@name='cvc']")
    private WebElement cvc;

    @FindBy(xpath = "//input[@name='expiry_month']")
    private WebElement expMonth;

    @FindBy(xpath = "//input[@name='expiry_year']")
    private WebElement expYear;

    @FindBy(xpath = "//button[@data-qa='pay-button']")
    private WebElement payBtn;


    public void addCardDetail(String cardName,String cardNumber, String cardCVV, String month, String yr){
        nameOnCard.sendKeys(cardName);
        cardNum.sendKeys(cardNumber);
        cvc.sendKeys(cardCVV);
        expMonth.sendKeys(month);
        expYear.sendKeys(yr);

    }
    public void clickOnPayBtn(){

        payBtn.click();

    }



}
