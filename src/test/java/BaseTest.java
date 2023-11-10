import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BaseTest {

    WebDriver driver;



    @BeforeAll
    public void setUp () {
        driver = new ChromeDriver(DriverOptions.getOptions(GetParameter.IS_HEADLESS));
        driver.get("https://www.a101.com.tr/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }


    @AfterAll
    public void tearDown () {
        //driver.close();
    }







}
