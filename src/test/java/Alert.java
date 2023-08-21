import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alert {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //Js alert
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();

        if(driver.getPageSource().contains("You successfully clicked an alert"))
            System.out.println("You successfully clicked an alert");
        System.out.println("==================================");

        //Js confirm
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert1.dismiss();

        if(driver.getPageSource().contains("You clicked: Cancel"))
            System.out.println("You clicked: Cancel");
        System.out.println("==================================");

        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());
        alert3.sendKeys("Automation");
        alert1.accept();

        Thread.sleep(3000);
        if(driver.getPageSource().contains("You entered: Automation"))
            System.out.println("You entered: Automation");
        System.out.println("==================================");

        driver.close();
        driver.quit();


    }
}
