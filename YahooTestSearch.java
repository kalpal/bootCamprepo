package loginEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class YahooTestSearch {

    private WebDriver driver;


    @BeforeTest
    public void setupDriver() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.OFF);
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bakhtiyor\\IdeaProjects\\day_one_a\\src\\test\\resource\\geckodriver.exe");
        driver = new FirefoxDriver();

    }

    @Test
    public void test001() throws Exception {
        driver.get("http://www.yahoo.com");
    }

    @Test
    public void test002() throws Exception {
        driver.get("http://www.google.com");
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
