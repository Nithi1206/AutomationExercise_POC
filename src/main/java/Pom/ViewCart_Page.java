package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCart_Page {
    WebDriver driver;


    public ViewCart_Page(WebDriver driver){
        this.driver = driver;
//        allProductsPage = new AllProducts_Page(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//td[@class='cart_description']//h4)[1]")
    private WebElement firstProdName;

    @FindBy(xpath = "(//td[@class='cart_description']//h4)[2]")
    private WebElement secondProdName;

    @FindBy(xpath = "(//td[@class='cart_price']//p)[1]")
    private WebElement firstProdPrice;

    @FindBy(xpath = "(//td[@class='cart_price']//p)[2]")
    private WebElement secondProdPrice;

    @FindBy(xpath = "(//td[@class='cart_quantity']//button)[1]")
    private WebElement firstProdQty;

    @FindBy(xpath = "(//td[@class='cart_quantity']//button)[2]")
    private WebElement secondProdQty;

    @FindBy(xpath = "(//td[@class='cart_total']//p)[1]")
    private WebElement firstProdTotalPrice;

    @FindBy(xpath = "(//td[@class='cart_total']//p)[2]")
    private WebElement secondProdTotalPrice;

    @FindBy(xpath = "//td[@class='cart_quantity']//button")
    private WebElement prodQty;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    private WebElement proceedToCheckout;

    @FindBy(xpath = "//a[@href='/login']//u")
    private WebElement regOrLogin;


    public boolean verifyFirstProd(){
        String s = firstProdName.getText();
        return s.equalsIgnoreCase(AllProducts_Page.firstPName);
    }
    public boolean verifySecondProd(){
        String s = secondProdName.getText();
        String secPrd = AllProducts_Page.secondPName.trim().replaceAll("\\s+", " "); //replace multiple white spaces with single white space
        return s.equalsIgnoreCase(secPrd);

    }
    public boolean firstProdPrice(){
        String s = firstProdPrice.getText();
        String s1 = s.replace("Rs. ","");
        int price1 = Integer.parseInt(s1);
        return (price1== AllProducts_Page.firstPAmount);

    }
    public boolean secondProdPrice(){
        String s = secondProdPrice.getText();
        String s1 = s.replace("Rs. ","");
        int price1 = Integer.parseInt(s1);
        return (price1== AllProducts_Page.secondPAmount);

    }
    public boolean verifyProdQty(String qty){
        String txt = prodQty.getText();
        return txt.equals(qty);
    }
    public boolean verifyPage(String txt){
        String s = driver.getCurrentUrl();
        return s.contains(txt);
    }
    public void clickOnProceedToCheckout(){
        proceedToCheckout.click();
    }
    public void clickOnRegOrLogin(){
        regOrLogin.click();
    }
}
