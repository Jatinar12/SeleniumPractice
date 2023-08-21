import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Browser {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        String originalWindow = driver.getWindowHandle();
        driver.navigate().to("https://automationstepbystep.com");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().window(originalWindow);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));


        driver.manage().window().getSize().getWidth();
        driver.manage().window().getSize().getHeight();

        driver.manage().window().setSize(new Dimension(800,600));

//        driver.manage().window().setPosition(new Point(500,100));        //Changes the position of the window

//        driver.manage().window().maximize();
//        driver.manage().window().minimize();                 // Maximize and fullscreen the window
//        driver.manage().window().fullscreen();

//        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(scrFile, new File("./images.png"));

//        driver.close();
//        driver.quit();
    }
}
