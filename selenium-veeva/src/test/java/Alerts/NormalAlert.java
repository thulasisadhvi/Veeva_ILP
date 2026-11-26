package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalAlert {
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement
                (By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert myalert=driver.switchTo().alert();
        System.out.println(myalert.getText());
        Thread.sleep(2000);
        myalert.accept();
        driver.quit();
    }
}
