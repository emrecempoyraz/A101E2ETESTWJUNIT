import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    SearchBox searchBox;
    By cartCountLocator = new By.ByXPath("//span//span[@class='count js-basket-quantity'] ");
    By cartContainer = new By.ByCssSelector("span[class='count-container']");
    By acceptCookiesLocator = new By.ByCssSelector("button[id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");


    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isCountUp(){
        return getCartCount () > 0 ;
    }

    public void goToCart(){
        click(cartContainer);
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }

    public void acceptCookies (){
        if (isDisplayed(acceptCookiesLocator)) {
            click(acceptCookiesLocator);
        }
    }




}
