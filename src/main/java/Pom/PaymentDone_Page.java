package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class PaymentDone_Page {
    WebDriver driver;

    public PaymentDone_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/delete_account']")
    private WebElement delAccBtn;

    @FindBy(xpath = "//b[text()='Account Deleted!']")
    private WebElement accDeletedTxt;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement continueBtn;

    @FindBy(xpath = "//p[contains(text(),'Your order')]")
    private WebElement successTxt;

    @FindBy(xpath = "//a[text()='Download Invoice']")
    private WebElement downloadInvoice;




    public void clickOnDelAccBtn(){
        delAccBtn.click();
    }
    public String visibleAccDeleted(){
        return accDeletedTxt.getText();
    }
    public void clickOnContBtn(){
        continueBtn.click();
    }
    public String verifySuccessAlert(){
        return successTxt.getText();
    }
    public void clickOnDownloadInvoice(){
        downloadInvoice.click();
    }
    public boolean verifyInvoiceDownloaded() throws InterruptedException {

        Thread.sleep(3000);
        String downloadFilePath = "C:\\Users\\hp\\Downloads";
        File downloadedFile = new File(downloadFilePath + "\\invoice.txt");

        boolean fileDownloaded;
        if (downloadedFile.exists()) {
            fileDownloaded = true;
        } else {
            fileDownloaded = false;
        }
        return fileDownloaded;
    }
}
