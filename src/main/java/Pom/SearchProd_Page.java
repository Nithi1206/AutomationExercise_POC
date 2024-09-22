package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProd_Page {
    WebDriver driver;

    public SearchProd_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='Searched Products']")
    private WebElement searchProdTxt;

    @FindBy(xpath = "//div[@class='features_items']")
    private WebElement allSearchProd;

    @FindBy(xpath = "//div[@class='productinfo text-center']//p[text()='Blue Top']")
    private WebElement searchProdName;

    @FindBy(xpath = "//img[@src='/get_product_picture/1']")
    private WebElement firstProd;

    @FindBy(xpath = "//div[@class='overlay-content']//a[@class='btn btn-default add-to-cart']")
    private WebElement overlayAddToCart;

    @FindBy(xpath = "//div[@class='productinfo text-center']//a[@class='btn btn-default add-to-cart']")
    private WebElement searchProdAddToCart;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    private WebElement contShoppingBtn;

    @FindBy(xpath = "//a[@href='/view_cart']")
    private WebElement cartBtn;

    public boolean visibleSearchProdTxt(String txt){
        String s = searchProdTxt.getText();
        return s.equalsIgnoreCase(txt);
    }
    public boolean visibleAllSearchProd(){
        return allSearchProd.isDisplayed();
    }
    public String getSearchProdName(){
        return searchProdName.getText();
    }
    public void clickOnAddToCart(){
        searchProdAddToCart.click();
    }
//    public void hoverToSearchProd(){
//        Actions actions = new Actions(driver);
//        actions.moveToElement(firstProd);
//    }
//    public void clickOnOverlayAddToCart() throws InterruptedException {
//        Thread.sleep(2000);
//        overlayAddToCart.click();
//    }
    public void clickOnContShoppingBtn(){
        contShoppingBtn.click();
    }
    public void clickOnCartBtn(){
        cartBtn.click();
    }
}
