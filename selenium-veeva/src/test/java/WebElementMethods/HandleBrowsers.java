package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class HandleBrowsers {
    public static void main(String []args){
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> handles=driver.getWindowHandles();

        //approach 1
        /*List<String> handle=new ArrayList<>(handles);

        String parent=handle.get(0);
        String child=handle.get(1);

        System.out.println("parent: "+parent+"\n"+"child: "+child +"\n"+ "actual: "+driver.getWindowHandle());
        driver.switchTo().window(child);
        System.out.println("parent: "+parent+"\n"+"child: "+child +"\n"+ "actual: "+driver.getWindowHandle());
        driver.switchTo().window(parent);
        System.out.println("parent: "+parent+"\n"+"child: "+child +"\n"+ "actual: "+driver.getWindowHandle());*/

        for(String windowid: handles){
            String title=driver.switchTo().window(windowid).getTitle();
            if(title.equals("OrangeHRM")){
                System.out.println(driver.getCurrentUrl());
            }
            //based on which work on which browser we can validate and do the working
        }

        driver.quit();

    }
}
