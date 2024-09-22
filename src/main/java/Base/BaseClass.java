package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;

    public static void launchBrowser(){

        driver = new ChromeDriver();
    }
    public static void launchurl(){
        driver.get("https://www.automationexercise.com/");
    }
    public static void maximize(){
        driver.manage().window().maximize();
    }
    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    public static void quiteBrowswer(){
        driver.quit();
    }
}
