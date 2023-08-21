import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Mouse {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

//        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//        WebElement boxA = driver.findElement(By.xpath("//li[text()= 'A']"));
//        WebElement boxD = driver.findElement(By.xpath("//li[text()= 'D']"));

        Actions action = new Actions(driver);
//        action.moveToElement(boxA);
//        action.clickAndHold();
//        action.moveToElement(boxD);

//        action.contextClick(boxD);

//        action.doubleClick(boxD);
        WebElement elem1 =  driver.findElement(By.id("draggable"));
        WebElement elem2 =  driver.findElement(By.id("droppable"));
        action.dragAndDrop(elem1, elem2);

        action.build().perform();
        Thread.sleep(3000);
        System.out.println("Mouse actions done");
        driver.quit();
    }
}
