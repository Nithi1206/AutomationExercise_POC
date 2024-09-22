package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetail_Page {
    WebDriver driver;

    public ProductDetail_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='Blue Top']")
    private WebElement prodName;

    @FindBy(xpath = "//p[contains(text(),'Category')]")
    private WebElement prodCategory;

    @FindBy(xpath = "//label[text()='Quantity:']//preceding-sibling::span")
    private WebElement prodPrice;

    @FindBy(xpath = "//b[text()='Availability:']")
    private WebElement prodAvailability;

    @FindBy(xpath = "//b[text()='Condition:']")
    private WebElement prodCondition;

    @FindBy(xpath = "//b[text()='Brand:']")
    private WebElement prodBrand;

    @FindBy(xpath = "//input[@id='quantity']")
    private WebElement prodQty;

    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    private WebElement addToCart;

    @FindBy(xpath = "//u[text()='View Cart']")
    private WebElement viewCart;

    @FindBy(xpath = "//span[text()='Thank you for your review.']")
    private WebElement thanksReviewTxt;

    @FindBy(xpath = "//a[@href='#reviews']")
    private WebElement writeReviewTxt;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;

    @FindBy(xpath = "//textarea[@id='review']")
    private WebElement reviewField;

    @FindBy(xpath = "//button[@id='button-review']")
    private WebElement submitBtn;

    public boolean verifyPage(String url){
        String txt = driver.getCurrentUrl();
        return txt.contains(url);
    }
    public boolean visibleProdName(){
        return prodName.isDisplayed();
    }
    public boolean visibleProdCategory(){
        return prodCategory.isDisplayed();
    }
    public boolean visibleProdPrice(){
        return prodPrice.isDisplayed();
    }
    public boolean visibleProdAvail(){
        return prodAvailability.isDisplayed();
    }
    public boolean visibleProdCondition(){
        return prodCondition.isDisplayed();
    }
    public boolean visibleProdBrand(){
        return prodBrand.isDisplayed();
    }
    public void increaseQty(){
        prodQty.clear();
        prodQty.sendKeys("4");
    }
    public void clickOnAddToCart(){
        addToCart.click();
    }
    public void clickOnViewCart(){
        viewCart.click();
    }
    public String getThanksReviewTxt(){
        return thanksReviewTxt.getText();
    }
    public String getWriteReviewTxt(){
        return writeReviewTxt.getText();
    }
    public void addNameEmailReview(String n, String e, String r){
        nameField.sendKeys(n);
        emailField.sendKeys(e);
        reviewField.sendKeys(r);
    }
    public void clickOnSubmit(){
        submitBtn.click();
    }

}
