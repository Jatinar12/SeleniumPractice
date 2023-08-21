import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://trytestingthis.netlify.app/");

        WebElement dropdown = driver.findElement(By.id("owc"));
        Select selectobject = new Select(dropdown);

        selectobject.selectByIndex(1);
        Thread.sleep(2000);
        selectobject.selectByValue("option 2");
        Thread.sleep(3000);
        selectobject.selectByVisibleText("Option 3");
        Thread.sleep(1000);
//
//        System.out.println("Completed");
//        Thread.sleep(1000);

        selectobject.deselectByIndex(1);
        Thread.sleep(2000);
        selectobject.deselectByValue("option 2");
        Thread.sleep(3000);
        selectobject.deselectByVisibleText("Option 3");
        Thread.sleep(1000);

        System.out.println("Completed");
        Thread.sleep(1000);
        driver.quit();
    }
}
