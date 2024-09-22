package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryProd_Page {
    WebDriver driver;

    public CategoryProd_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='Women - Tops Products']")
    private WebElement womenPrdTitle;

    @FindBy(xpath = "//a[@href='#Men']")
    private WebElement menCategory;

    @FindBy(xpath = "//div[@id='Men']//a[contains(text(),'Jeans')]")
    private WebElement menJeanCategory;

    public boolean visibleWomenProdTitle(String title){
        return womenPrdTitle.getText().equalsIgnoreCase(title);
    }
    public void clickOnMenSubCategory(){
        menCategory.click();
        menJeanCategory.click();
    }
    public boolean verifyProdCategoryPage(String linkTxt){
        return driver.getCurrentUrl().contains(linkTxt);
    }

}
