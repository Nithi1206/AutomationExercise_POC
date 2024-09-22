package Pom;

import Base.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut_Page {
    WebDriver driver;

    public CheckOut_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='Address Details']")
    private WebElement accDetailTxt;

    @FindBy(xpath = "//h2[text()='Review Your Order']")
    private WebElement reviewUrOrder;

    @FindBy(xpath = "//textarea[@name='message']")
    private WebElement description;

    @FindBy(xpath = "//a[text()='Place Order']")
    private WebElement placeOrderBtn;

    @FindBy(xpath = "//ul[@id='address_delivery']//li[@class='address_firstname address_lastname']")
    private WebElement delName;

    @FindBy(xpath = "(//ul[@id='address_delivery']//li[@class='address_address1 address_address2'])[2]")
    private WebElement delAddress1;

    @FindBy(xpath = "//ul[@id='address_delivery']//li[@class='address_city address_state_name address_postcode']")
    private WebElement delAddress2;

    @FindBy(xpath = "//ul[@id='address_delivery']//li[@class='address_phone']")
    private WebElement delMobNum;

    @FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_firstname address_lastname']")
    private WebElement billName;

    @FindBy(xpath = "(//ul[@id='address_invoice']//li[@class='address_address1 address_address2'])[2]")
    private WebElement billAddress1;

    @FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_city address_state_name address_postcode']")
    private WebElement billAddress2;

    @FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_phone']")
    private WebElement billMobNum;

    @FindBy(xpath = "//a[@href='/delete_account']")
    private WebElement delAccBtn;

    public String getAccDetailTxt(){
        return accDetailTxt.getText();
    }
    public String getReviewUrOrderTxt(){
        return reviewUrOrder.getText();
    }
    public void addMessageInDescription(String msg){
        description.sendKeys(msg);
    }
    public void clickOnPlaceOrder(){
        placeOrderBtn.click();
    }

    public boolean verifyDelAddress(){
        boolean firstName = billName.getText().contains(TestData.fName);
        boolean lastname = billName.getText().contains(TestData.lName);
        boolean address1 = billAddress1.getText().contains(TestData.addressArea);
        boolean address2 = billAddress2.getText().contains(TestData.city);
        boolean mobileNumber = billMobNum.getText().contains(TestData.mobileNumber);

        return firstName && lastname && address1 && address2 && mobileNumber;
    }
    public boolean verifyBillingAddress(){
        boolean firstName = delName.getText().contains(TestData.fName);
        boolean lastname = delName.getText().contains(TestData.lName);
        boolean address1 = delAddress1.getText().contains(TestData.addressArea);
        boolean address2 = delAddress2.getText().contains(TestData.city);
        boolean mobileNumber = delMobNum.getText().contains(TestData.mobileNumber);

        return firstName && lastname && address1 && address2 && mobileNumber;
    }
    public void clickOnDelAccBtn(){
        delAccBtn.click();
    }
}
