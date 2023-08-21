import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

//        driver.get("https://google.com");
//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("selenium" + Keys.ENTER);
//
//        driver.get("https://trytestingthis.netlify.app/");
//        List<WebElement> elements =  driver.findElements(By.tagName("select"));
//        for(WebElement element : elements)
//            System.out.println(element.getText());

//        driver.get("https://google.com");
//        WebElement element = driver.findElement(By.tagName("form"));
//        element.findElement(By.name("q")).sendKeys("Cricket Score" + Keys.ENTER);

//        driver.get("https://google.com");
//        WebElement element = driver.findElement(By.name("q"));
//        element.sendKeys("Selenium" + Keys.ENTER);
//
//        String title = driver.switchTo().activeElement().getAttribute("title");
//        System.out.println(title);

//        driver.get("https://google.com");
//        WebElement element = driver.findElement(By.name("q"));
//
//        String tagName = element.getTagName();
//        String text = element.getText();
//        String cssValue = element.getCssValue("font");
//
//        System.out.println(tagName +" |" + text+ "|" + cssValue);

//        driver.findElement(By.name("....")).isEnabled();
//        driver.findElement(By.name("....")).isSelected();

        driver.quit();
    }
}
