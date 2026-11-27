package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class frame {
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.vision/demo/webtest/frames/");
        /*
        driver.switchTo().frame(webelement);
        driver.switchTo().frame(id);
        driver.switchTo().frame(name);
        driver.switchTo().frame(index);
        */

        WebElement element=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(element);
        WebElement input=driver.findElement(By.xpath("//input[@name=\"mytext1\"]"));
        input.sendKeys("welcome");
        driver.switchTo().defaultContent();
        Thread.sleep(2000);

        WebElement element2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(element2);
        WebElement input1=driver.findElement(By.xpath("//input[@name=\"mytext2\"]"));
        input1.sendKeys("selenium");
        driver.switchTo().defaultContent();
        Thread.sleep(2000);

        WebElement element3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(element3);
        WebElement input2=driver.findElement(By.xpath("//input[@name=\"mytext3\"]"));
        input2.sendKeys("framesConcept");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@class=\"AB7Lab Id5V1\"]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[@class=\"aDTYNe snByac n5vBHf OIC90c\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"uVccjd aiSeRd FXLARc wGQFbe BJHAP oLlshd\"]")).click();

        driver.switchTo().defaultContent();
        driver.quit();

    }
}
