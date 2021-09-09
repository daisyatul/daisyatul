package utilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Driverfactory {
    public static WebDriver createInstance(String browserName) {

        WebDriver driver=null;
        switch (browserName.trim().toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                Assert.fail("No Such Method Defined");
        }
        return driver;
    }
}


