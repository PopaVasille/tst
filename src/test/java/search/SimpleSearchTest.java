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
import org.openqa.selenium.support.PageFactory;
import romaniaup.selenium.test.AppConfig;
import webview.Header;
import webview.ProductsGrid;


public class SimpleSearchTest extends TestBase {
    @Test 
    public void simpleSearchWithOneKeyword(){
        
        openHomepage();
        
        String searchKeyword = "vase";
        Header header = PageFactory.initElements(driver, Header.class);
        
        header.search(searchKeyword);
        
        ProductsGrid productsGrid = PageFactory.initElements(driver, ProductsGrid.class);
        
        System.out.println("Am stocat "+productsGrid.getProductNames().size() + " produse.");
        
        for(WebElement productName : productsGrid.getProductNames()){
            assertThat("ceva nu e bine",productName.getText(),containsString("VASE"));
        
            
        System.out.println("Test completed de mine");
        //driver.close();
        }
        //driver.findElement(By.xpath("//div[@class='product-info' and ./descendant::*[text()='Herald Glass Vase']]//button[@title='Add to Cart']")).click();
        
        
        
        
    }
}
