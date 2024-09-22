package Pom;

import Base.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {

    WebDriver driver;

    public ContactUs(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='Get In Touch']")
    private WebElement getInTouchTxt;

    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    private WebElement subjectField;

    @FindBy(xpath = "//textarea[@placeholder='Your Message Here']")
    private WebElement messageField;

    @FindBy(xpath = "//input[@name='upload_file']")
    private WebElement upFile;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitBtn;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    private WebElement succMsg;

    @FindBy(xpath = "//span[contains(text(),'Home')]")
    private WebElement homeBtn;

    public boolean visibleGetInTouch(String text){
        String txt = getInTouchTxt.getText();
        return txt.contains(text);
    }
    public void addNameEmailSubMsg(){
        nameField.sendKeys(TestData.userName);
        emailField.sendKeys(TestData.correctEmail1);
        messageField.sendKeys(TestData.message);
        subjectField.sendKeys(TestData.subject);
    }
    public void uploadFile(){
        upFile.sendKeys("C:\\Users\\hp\\Desktop\\dependencies.txt");
    }
    public void clickOnSubmit(){
        submitBtn.click();
    }
    public void clickOk(){
        driver.switchTo().alert().accept();
    }
    public boolean visibleSuccMsg(String success){
        String txt = succMsg.getText();
        return txt.contains(success);
    }
    public void clikcOnHomeBtn(){
        homeBtn.click();
    }
}
