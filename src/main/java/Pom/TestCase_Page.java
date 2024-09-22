package Pom;

import Base.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestCase_Page {

    WebDriver driver;

    public TestCase_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean verifyPage(){
        String txt = driver.getCurrentUrl();
        return txt.contains(TestData.testCasePageURL);

    }
}
