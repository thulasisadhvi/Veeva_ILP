package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().fullscreen();
        WebElement countries=driver.findElement(By.xpath("//select[@id=\"country\"]"));
        //select class for select dropdown
        Select dropdown=new Select(countries);
        dropdown.selectByVisibleText("United Kingdom");
        Thread.sleep(2000);
        dropdown.selectByValue("germany");
        Thread.sleep(2000);
        dropdown.selectByIndex(5);
        Thread.sleep(2000);

        List<WebElement> options=dropdown.getOptions();
        System.out.println("all options :"+options.size());
        for(WebElement op:options){
            System.out.println(op.getText());
        }
        driver.close();

    }
}
