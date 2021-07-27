package search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.Keys;


public class SimpleSearchTest {
    @Test 
    public void simpleSearchWithOneKeyword(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vpopa\\Desktop\\javaOnline\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://testfasttrackit.info/selenium-test/");
        
        driver.findElement(By.id("search")).sendKeys("vase"+ Keys.ENTER );
        
        
    }
}
