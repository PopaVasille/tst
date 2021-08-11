
package webview;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductsGrid {
    
    @FindBy (css = "h2.product-name a")
    private List<WebElement> productNames;

    public List<WebElement> getProductNames() {
        return productNames;
    }
    
    
}
