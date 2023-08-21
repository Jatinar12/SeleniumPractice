import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keyboard {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

//        driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
//
//        Actions action = new Actions(driver);
//        Action keydown = action.keyDown(Keys.CONTROL).sendKeys("a").build();
//        keydown.perform();

        WebElement date = driver.findElement(By.name("q"));
        Actions action = new Actions(driver);
        CharSequence selenium;
        action.keyDown(Keys.SHIFT).sendKeys("Selenium")
                .keyUp(Keys.SHIFT).sendKeys("selenium").perform();
    }
}
