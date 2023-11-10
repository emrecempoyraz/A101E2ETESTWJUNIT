import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Test_Add_Products_To_Cart extends BaseTest{

    HomePage homePage;
    ProductsPage productsPage;
    ProductsDetailPage productDetailPage;
    CartPage cartPage;


    @Test
    @Order(1)
    public void search_product(){
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        productsPage = new ProductsPage(driver);
        homePage.searchBox.search("zeytin");
        Assertions.assertTrue(productsPage.isOnProductPage(),"Not on product page!");
    }

    @Test
    @Order(2)
    public void selectProduct(){
        productDetailPage = new ProductsDetailPage(driver);
        productsPage.selectProduct();
        //Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on product detail page");
    }

    @Test
    @Order(3)
    public void add_product_to_cart(){
        productDetailPage.addToCart();
        driver.findElement(By.cssSelector("a[class='go-to-shop']")).click();
        Assertions.assertTrue(homePage.isCountUp(),"Product count did not increase!");
    }

    @Test
    @Order(4)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(),"Product is not on cart! ");
    }





}
