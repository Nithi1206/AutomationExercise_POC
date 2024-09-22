package Pom;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandProducts_Page extends BaseClass {

    WebDriver driver;

    public BrandProducts_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='features_items']")
    private WebElement allProducts;

    @FindBy(xpath = "//a[@href='/brand_products/Biba']")
    private WebElement bibaBrand;

    public boolean verifyProdBrandPage(String url){
        return driver.getCurrentUrl().contains(url);
    }
    public boolean visibleBrandProds(){
        return allProducts.isDisplayed();
    }
    public void clickOnBibaBrand(){
        bibaBrand.click();
    }
}
