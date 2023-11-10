import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsDetailPage extends BasePage{

   By addToCartButtonLocator = new By.ByXPath("//button[@class='add-to-basket button green block with-icon js-add-basket']");

   public ProductsDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage(){
       return isDisplayed(addToCartButtonLocator);
    }


    public void addToCart (){
       click(addToCartButtonLocator);

    }


}
