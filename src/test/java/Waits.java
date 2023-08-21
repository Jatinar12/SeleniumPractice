import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.name("q")).sendKeys("automation tep by step" + Keys.ENTER);
        Thread.sleep(2000);

        //Explicit wait
        WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement myLink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Step by Step: NEVER STOP LEARNING")));
        myLink.click();

        //Implicit wait
        Wait <WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(1))
                                .ignoring(NoSuchElementException.class);

         fluentWait.until(ExpectedConditions.elementToBeSelected(By.xpath(null)));



        driver.close();
        driver.quit();

    }
}
