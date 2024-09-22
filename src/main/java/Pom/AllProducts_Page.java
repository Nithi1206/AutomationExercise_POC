package Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProducts_Page {

    WebDriver driver;
    Actions actions;
    JavascriptExecutor js;

    public AllProducts_Page(WebDriver driver){
        this.driver = driver;
        actions = new Actions(driver);
        js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//div[@class='features_items']")
    private WebElement allProducts;

    @FindBy(xpath = "(//a[text()='View Product'])[1]")
    private WebElement firstViewCart;

    @FindBy(xpath = "//input[@id='search_product']")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@id='submit_search']")
    private WebElement searchBtn;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[1]")
    private WebElement firstProd;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[2]")
    private WebElement secondProd;

    @FindBy(xpath = "(//div[@class='overlay-content']//a[text()='Add to cart'])[1]")
    private WebElement firstOverlayAddToCart;

    @FindBy(xpath = "(//div[@class='overlay-content']//a[text()='Add to cart'])[2]")
    private WebElement secondOverlayAddToCart;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    private WebElement continueShopping;

    @FindBy(xpath = "//a[@href='/view_cart']//u")
    private WebElement overlayViewCart;

    @FindBy(xpath = "(//div[@class='productinfo text-center']//h2)[1]")
    private WebElement firstProdPrice;

    @FindBy(xpath = "(//div[@class='productinfo text-center']//h2)[2]")
    private WebElement secondProdPrice;

    @FindBy(xpath = "(//div[@class='productinfo text-center']//p)[1]")
    private WebElement firstProdName;

    @FindBy(xpath = "(//div[@class='productinfo text-center']//p)[2]")
    private WebElement secondProdName;

    @FindBy(xpath = "//span[@id='gda']//*[name()='svg']")
    private WebElement xMark;

    @FindBy(xpath = "(//a[@href='/view_cart'])[1]")
    private WebElement cartBtn;

    @FindBy(xpath = "//a[contains(text(),'Logged in as')]")
    private WebElement loggedInAs;

    @FindBy(xpath = "//div[@class='brands-name']")
    private WebElement sideBarBrands;

    @FindBy(xpath = "//a[text()='Polo']")
    private WebElement poloBrand;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    private WebElement firstViewProd;

    public static String firstPName;
    public static String secondPName;
    public static int firstPAmount;
    public static int secondPAmount;


    public boolean verifyProductPage(String prod){
        String txt = driver.getCurrentUrl();
        return txt.contains(prod);
    }
    public boolean visibleAllProducts(){
        return allProducts.isDisplayed();
    }
    public void clickOnFirstViewCart(){
        firstViewCart.click();
    }
    public void enterProdNameInSearchBox(String prodName){
        searchBox.sendKeys(prodName);
    }
    public void clickOnSearchBtn(){
        searchBtn.click();
    }
    public void mouseHoverToFirstProd(){
        actions.moveToElement(firstProd).build().perform();
    }
    public void clickOnOverlayFirstAddCart(){
        //firstOverlayAddToCart.click();
        js.executeScript("arguments[0].click();", firstOverlayAddToCart);
    }
    public void clickOnOverlayContinue(){
        continueShopping.click();
    }
    public void mouseHoverToSecondProd(){
        xMark.click();
        actions.moveToElement(secondProd).build().perform();
    }
    public void clickOnOverlaySecondAddCart() throws InterruptedException {
        Thread.sleep(2000);
        secondOverlayAddToCart.click();
    }
    public void clickOnOverlayViewCart(){
        firstPName = firstProdName.getText();
        secondPName = secondProdName.getText();
        String s = firstProdPrice.getText();
        String s1 = s.replace("Rs. ","");
        firstPAmount = Integer.parseInt(s1);
        String s3 = secondProdPrice.getText();
        String s4 = s3.replace("Rs. ","");
        secondPAmount = Integer.parseInt(s4);

        overlayViewCart.click();
    }
    public void clickOnCartBtn(){
        cartBtn.click();
    }
    public boolean visibleLoggedInAs(){
        return loggedInAs.isDisplayed();
    }
    public boolean visibleSideBarBrands(){
        return sideBarBrands.isDisplayed();
    }
    public void clickOnPoloBrand(){
        poloBrand.click();
    }
    public void clicksOnFirstViewProd(){
        firstViewProd.click();
    }

}
