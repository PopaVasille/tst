
package search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WishListTest {
    @Test
    public void wishListAddTest(){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\vpopa\\Desktop\\javaOnline\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://testfasttrackit.info/selenium-test/");
        
        driver.findElement(By.className("nav-5")).click();
        driver.findElement(By.id("product-collection-image-403")).click();
        driver.findElement(By.className("link-wishlist")).click();
    }      
}
