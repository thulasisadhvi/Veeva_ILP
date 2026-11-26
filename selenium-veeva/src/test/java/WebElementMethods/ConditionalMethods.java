package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver= new ChromeDriver ();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().fullscreen();

        Thread.sleep(3000);
        WebElement element=driver.findElement(By.className("title"));
        System.out.println("displayed:"+element.isDisplayed());

        WebElement element1= driver.findElement(By.cssSelector("input#name"));
        System.out.println("displayed:"+element1.isDisplayed());
        System.out.println("Enabled:"+element1.isEnabled());
        element1.sendKeys("Sadhvi");

        WebElement element2= driver.findElement(By.cssSelector("input[placeholder=\"Enter EMail\"]"));
        System.out.println("displayed:"+element2.isDisplayed());
        System.out.println("Enabled:"+element2.isEnabled());
        element2.sendKeys("Sadhvi@gmail.com");
        Thread.sleep(2000);

        WebElement element3= driver.findElement(By.cssSelector("input.form-check-input[id=\"male\"]"));
        System.out.println("selected:"+element3.isSelected());
        WebElement element4= driver.findElement(By.cssSelector("input.form-check-input[id=\"female\"]"));
        System.out.println("selected:"+element3.isSelected());

        element3.click();
        System.out.println("selected:"+element3.isSelected());
        System.out.println("selected:"+element4.isSelected());
        Thread.sleep(2000);

        element4.click();
        System.out.println("selected:"+element3.isSelected());
        System.out.println("selected:"+element4.isSelected());

        Thread.sleep(2000);

        driver.quit();
    }
}
