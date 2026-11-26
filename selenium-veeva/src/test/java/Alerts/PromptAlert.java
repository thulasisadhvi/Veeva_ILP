package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement element=driver.findElement
                (By.xpath("//button[normalize-space()='Click for JS Prompt']"));
        element.click();
        Alert myalert=driver.switchTo().alert();
        System.out.println(myalert.getText());
        Thread.sleep(2000);
        myalert.sendKeys("sadhvi");
        myalert.accept();
        Thread.sleep(2000);

        element.click();
        myalert.dismiss();
        Thread.sleep(2000);

        driver.quit();
    }
}
