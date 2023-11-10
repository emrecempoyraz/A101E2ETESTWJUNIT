import org.openqa.selenium.chrome.ChromeOptions;

public class DriverOptions {

    private static ChromeOptions options = new ChromeOptions();

    public static ChromeOptions getOptions(boolean isHeadless){
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");
        //options.addArguments("--incognito");

        if (isHeadless) {
            options.addArguments("--headless");
            System.out.println("Headless çalıştı");
        }

        return options;

    }



}
