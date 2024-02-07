package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Browserlaunch
{
    public static void main( String args[])
    {
        System.out.println("***********START-TEST**************");
        String currentDirectory = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", currentDirectory +"/src/test/resources/drivers/chromedriver.exe");
        System.setProperty("webdriver.edge.driver", currentDirectory +"/src/test/resources/drivers/msedgedriver.exe");
        System.setProperty("webdriver.gecko.driver", currentDirectory +"/src/test/resources/drivers/geckodriver.exe");
/*
        Headless- "Chrome headless" refers to running the Google Chrome web browser in a mode that doesn't have a graphical user interface (GUI). In other words, it operates in a headless or non-visible mode.


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

*/
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new EdgeDriver();
//        WebDriver driver = new FirefoxDriver();

        driver.get("https://parabank.parasoft.com/parabank/admin.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        String str = driver.getTitle();
        System.out.println("The tab Title is "+ str);
        driver.quit();
    }
}
