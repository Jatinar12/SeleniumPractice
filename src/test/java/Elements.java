import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class Elements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ABCD", Keys.ENTER);
        Thread.sleep(2000);

        driver.navigate().to("https://trytestingthis.netlify.app/");
        List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));

        for(WebElement element : options) {
            System.out.println(element.getText());
        }

        driver.findElement(By.cssSelector("#fname")).sendKeys("Raghav");

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement loginButton = driver.findElement(By.id(""));
        driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton)).sendKeys("RAhul");


//        driver.close();
    }
}
