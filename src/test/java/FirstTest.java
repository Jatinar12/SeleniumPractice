import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class FirstTest {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "./Lib/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.close();
    }
}
