package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NestedFrame {
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://qa.randomly.online/practice/frames");
        Thread.sleep(3000);
        String data=driver.findElement(By.xpath("//p[@class='mb-3 text-sm text-slate-600']")).getText();
        System.out.println(data);
        String accessCode = data.replace("Access code:", "").trim();
        WebElement element= driver.findElement(By.xpath("//iframe[@id='practice-iframe']"));
        driver.switchTo().frame(element);
        driver.findElement(By.xpath("//input[@id=\"frame-input\"]")).sendKeys(accessCode);
        driver.findElement(By.xpath("//button[@id=\"frame-submit\"]")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        //mainFrame
        Thread.sleep(10000);
        driver.findElement(By.id("btn-main-confirm")).click();
        Thread.sleep(2000);

        //nested frame
        driver.switchTo().frame("outer-frame");
        driver.switchTo().frame("inner-frame");
        String text=driver.findElement(By.id("inner-code")).getText();
        System.out.println(text);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@aria-label='Inner code:']")).sendKeys(text);
        Thread.sleep(2000);



        driver.quit();
    }
}
