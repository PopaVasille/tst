package search;


import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegisterTest {
    @Test
    public void RegisterTest(){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\vpopa\\Desktop\\javaOnline\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();          
        driver.get("http://testfasttrackit.info/selenium-test/");
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        driver.findElement(By.linkText("ACCOUNT")).click();
        
        driver.findElement(By.linkText("Register")).click();
        
        driver.findElement(By.id("firstname")).sendKeys("Popa");
        driver.findElement(By.id("middlename")).sendKeys("Vasile");
        driver.findElement(By.name("lastname")).sendKeys("Vasile1");
        driver.findElement(By.name("email")).sendKeys("popa.vasille90@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("confirmation")).sendKeys("123456");
        driver.findElement(By.name("is_subscribed")).click();
        
        
        
    
    }
}       
