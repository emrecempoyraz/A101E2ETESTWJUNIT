import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{
    By productFilterLocation = new By.ByXPath("//div[@class='total-product-count hidden-xs']//h1");
    By productNameLocator = new By.ByCssSelector("img[alt='Marmarabirlik Siyah Zeytin S Kalori 500 G']");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage(){
        return isDisplayed(productFilterLocation);
    }

    public void selectProduct (){
        driver.findElement(productNameLocator).click();
    }
}
