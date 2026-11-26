package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("sunday")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("sunday")).click();

        List<WebElement> checkboxes=driver.findElements
                (By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox.checkbox\"]"));
        /*for(int i=0;i<checkboxes.size();i++){
            checkboxes.get(i).click();
        }*/
        /*for(WebElement checkbox.checkbox: checkboxes){
            checkbox.checkbox.click();
        }*/
        for(int i=0;i<3;i++){
            checkboxes.get(i).click();
        }
        Thread.sleep(2000);

        for(WebElement checkbox: checkboxes){
            if(checkbox.isSelected()){
            checkbox.click();}
        }

        Thread.sleep(2000);

        driver.quit();

    }
}
