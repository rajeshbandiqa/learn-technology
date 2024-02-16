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


        ChromeOptions options = new ChromeOptions();
 /*       options.addArguments("--headless");
        options.addArgument("start-maximized");
        DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	    options.merge(capabilities);
	    // Example 1: Headless Mode
        // options.addArguments("--headless");

        // Example 2: Disable GPU (useful in headless mode)
        // options.addArguments("--disable-gpu");

        // Example 3: Start maximized
        // options.addArguments("--start-maximized");

        // Example 4: Disable extensions
        // options.addArguments("--disable-extensions");

        // Example 5: Set specific window size
        // options.addArguments("--window-size=1200,800");

        // Example 6: Disable info bars (e.g., "Chrome is being controlled by automated test software")
        // options.addArguments("--disable-infobars");

        // Example 7: Ignore certificate errors
        // options.addArguments("--ignore-certificate-errors");

        // Example 8: Disable image loading
        // options.addArguments("--blink-settings=imagesEnabled=false");

        // Example 9: Disable browser side navigation
        // options.addArguments("--disable-blink-features=BrowserSideNavigation");

        // Example 10: Set a specific user agent
        // options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36 Edge/17.17134");

        // Example 11: Incognito mode
        // options.addArguments("--incognito");

//        String downloadPath = "path/to/custom/download/directory";
        options.addArguments("--download.default_directory=" + downloadPath);
*/
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
//        options.addArguments("--disable-popup-blocking");
//        options.addArguments("--start-maximized");
//        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);



//        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new EdgeDriver();
//        WebDriver driver = new FirefoxDriver();

        driver.get("https://parabank.parasoft.com/parabank/admin.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        String str = driver.getTitle();
        System.out.println("The tab Title is "+ str);
        driver.quit();
    }
}
