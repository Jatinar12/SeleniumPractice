import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadStrategies {
    public static void main(String[] args) {

        ChromeOptions option = new ChromeOptions();
        option.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new ChromeDriver(option);

        driver.navigate().to("https://google.com");
    }
}
