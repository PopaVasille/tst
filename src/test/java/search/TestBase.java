package search;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import romaniaup.selenium.test.AppConfig;
import romaniaup.selenium.test.DriverFactory;


public class TestBase {
    protected WebDriver driver = null;
    
    @Before
    public void setup(){
        String browser =System.getProperty("browser", "chrome");
        driver = DriverFactory.getDriver(browser);
    }
    @After
    public void tearDown(){
        driver.quit();
    }
    
    public void openHomepage(){
        driver.get(AppConfig.getSiteUrl());
    }
}
