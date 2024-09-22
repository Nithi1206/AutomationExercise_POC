package Pom;

import Base.TestData;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {
    WebDriver driver;
    JavascriptExecutor js;

    public Cart_Page(WebDriver driver){
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//footer[@id='footer']")
    private WebElement footer;

    @FindBy(xpath = "//h2[text()='Subscription']")
    private WebElement subText;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    private WebElement subscriptionEmail;

    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    private WebElement subscriptionArrow;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    private WebElement subSuccessTextMsg;

    @FindBy(xpath = "//h4//a[text()='Blue Top']")
    private WebElement firstProd;

    @FindBy(xpath = "//a[text()='Blue Top']//ancestor::td//following-sibling::td//a[@class='cart_quantity_delete']")
    private WebElement firstProdX;

    @FindBy(xpath = "//table[@id='cart_info_table']")
    private WebElement cartTable;

    @FindBy(xpath = "//ul//a[@href='/login']")
    private WebElement signupOrLoginBtn;

    @FindBy(xpath = "//a[@href='/logout']")
    private WebElement logoutBtn;

    private String firstProdName;

    public void scrollToFooter(){
        js.executeScript("arguments[0].scrollIntoView(true)", footer);
    }
    public boolean verifySubscriptionTxt(String subTxt){
        String s =  subText.getText();
        return s.contains(subTxt);
    }
    public void enterSubscriptionEmail(){
        subscriptionEmail.sendKeys(TestData.email);
    }
    public void clickArrowBtn(){
        subscriptionArrow.click();
    }
    public boolean verifySuccessfulSubTxt(String successTxt){
        String s = subSuccessTextMsg.getText();

        return s.contains(successTxt);
    }
    public boolean verifyCartPage(String urlTxt){
        return driver.getCurrentUrl().contains(urlTxt);
    }
    public void firstProdRemove(){
        firstProdName= firstProd.getText();
        firstProdX.click();
    }
    public boolean verifyFirstProdRemoved() throws InterruptedException {
        Thread.sleep(2000);
        return cartTable.getText().contains(firstProdName);
    }
    public boolean visibleFirstProd(){
        return firstProd.isDisplayed();
    }
    public void clicksOnSignInOrLoginBtn(){
        signupOrLoginBtn.click();
    }
    public void clicksOnLogout(){
        logoutBtn.click();
    }

}
