package search;

import java.util.List;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import romaniaup.selenium.test.AppConfig;


public class SimpleSearchTest extends TestBase {
    @Test 
    public void simpleSearchWithOneKeyword(){
        
        driver.get(AppConfig.getSiteUrl());
        
        driver.findElement(By.id("search")).sendKeys("vase"+ Keys.ENTER );
        
        List<WebElement> productNames = driver.findElements(By.cssSelector("h2.product-name a"));
        
        System.out.println("Am stocat "+productNames.size() + " produse.");
        
        for(WebElement productName : productNames){
            assertThat("ceva nu e bine",productName.getText(),containsString("VASE"));
        
            
        System.out.println("Test completed de mine");
        //driver.close();
        }
        //driver.findElement(By.xpath("//div[@class='product-info' and ./descendant::*[text()='Herald Glass Vase']]//button[@title='Add to Cart']")).click();
        
        
        
        
    }
}
