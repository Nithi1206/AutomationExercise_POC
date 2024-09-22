package Pom;

import Base.TestData;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

    WebDriver driver;
    JavascriptExecutor js;

    public Home_Page(WebDriver driver){
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='header-middle']//ancestor::body")
    private WebElement homePage;

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement signinBtn;

    @FindBy(xpath = "//a[contains(text(),'Logged in as')]")
    private WebElement loggedInAs;

    @FindBy(xpath = "//a[contains(text(),'Delete Account')]")
    private WebElement deleteAccount;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    private WebElement logOutBtn;

    @FindBy(xpath = "//b[text()='Account Deleted!']")
    private WebElement accountDeleted;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement accDelContinueBtn;

    @FindBy(xpath = "//a[contains(text(),'Contact us')]")
    private WebElement contactUs;

    @FindBy(xpath = "(//a[@class='test_cases_list']//button[text()='Test Cases'])[1]")
    private WebElement testCaseBtn;

    @FindBy(xpath = "//a[contains(text(),'Products')]")
    private WebElement productsBtn;

    @FindBy(xpath = "//footer[@id='footer']")
    private WebElement footer;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    private WebElement subscriptionEmail;

    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    private WebElement subscriptionArrow;

    @FindBy(xpath = "//h2[text()='Subscription']")
    private WebElement subText;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    private WebElement subSuccessTextMsg;

    @FindBy(xpath = "//a[contains(text(),'Cart')]")
    private WebElement cartBtn;

    @FindBy(xpath = "(//a[text()='View Product'])[1]")
    private WebElement firstAddToCart;

    @FindBy(xpath = "//h2[text()='Category']//following-sibling::div[@class='panel-group category-products']")
    private WebElement categoryList;

    @FindBy(xpath = "//a[@href='#Women']")
    private WebElement womenCategory;

    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Tops')]")
    private WebElement womenTops;

    @FindBy(xpath = "//div[@id='recommended-item-carousel']//a[@data-product-id='1']")
    private WebElement firstAddToCartOnRecommended;

    @FindBy(xpath = "//h2[text()='recommended items']")
    private WebElement recomItemsTxt;

    @FindBy(xpath = "//u[text()='View Cart']")
    private WebElement viewCart;

    @FindBy(xpath = "(//div[@class='productinfo text-center']//a[@data-product-id='1'])[1]")
    private WebElement firstProdAddToCart;

    @FindBy(xpath = "//u[text()='View Cart']")
    private WebElement contShopping;

    @FindBy(xpath = "//h2[text()='Subscription']")
    private WebElement bottomSubscription;

    @FindBy(xpath = "//i[@class='fa fa-angle-up']")
    private WebElement scrollUpArrow;

    @FindBy(xpath = "(//h2[contains(text(),'Full-Fledged')])[1]")
    private WebElement fullPledgedHeading;

    public boolean visibleHomePage(){
        return homePage.isDisplayed();
    }
    public void clickOnSignIn(){
        signinBtn.click();
    }
    public boolean visibleLoggedInAs(){
        return loggedInAs.isDisplayed();
    }
    public void clickOnAccDelete(){
        deleteAccount.click();
    }
    public boolean visibleAccDeleted(){
        return accountDeleted.isDisplayed();
    }
    public void clickOnAccDelContinue(){
        accDelContinueBtn.click();
    }
    public void clickOnLogoutBtn(){
        logOutBtn.click();
    }
    public void clickOnContactUs(){
        contactUs.click();
    }
    public void clickonTestCaseBtn(){
        testCaseBtn.click();
    }
    public void clickOnProductsBtn(){
        productsBtn.click();
    }
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
    public void clickOnCart(){
        cartBtn.click();
    }
    public void clickOnFirstProdViewCart(){
        firstAddToCart.click();
    }
    public boolean visibleCategoryList(){
        return categoryList.isDisplayed();
    }
    public void clickOnWomenCategory(){
        womenCategory.click();
    }
    public void clickOnWomenTops(){
        womenTops.click();
    }
    public void scrollsToBottomPage(){
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    public boolean visibleRecomItemTxt(){
        return recomItemsTxt.isDisplayed();
    }
    public void clickOnRecomAddToCart() throws InterruptedException {
        //firstAddToCartOnRecommended.click();
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();", firstAddToCartOnRecommended);
    }
    public void clickOnViewCart() throws InterruptedException {
        //viewCart.click();
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();", viewCart);
    }
    public void clickOnFirstProdAddToCart(){
        firstProdAddToCart.click();
    }
    public void clickOnContinueShopping(){
        contShopping.click();
    }
    public String getBottomSubTxt(){
//        System.out.println(bottomSubscription.getText());
        return bottomSubscription.getText();
    }
    public void clickOnScrollUpArrow(){
        scrollUpArrow.click();
    }
    public boolean verifyPageIsFullyScrolledUp() throws InterruptedException {
        Thread.sleep(2000);
//        System.out.println(js.executeScript("return window.pageYOffset;"));
//        Object obj = js.executeScript("return window.pageYOffset;"); //if the value is zero page is fully scrolleup
        boolean scrolledUp;
        Long scrollPosition = (Long) js.executeScript("return window.scrollY;"); //if the value is zero page is fully scrolleup
        scrolledUp = scrollPosition == 0;
//        System.out.println(scrolledUp);
        return scrolledUp;
    }
    public boolean verifyFullPledged(){
        return fullPledgedHeading.isDisplayed();
    }
    public void scrollUpPage() throws InterruptedException {
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0, 0);");
    }


}
