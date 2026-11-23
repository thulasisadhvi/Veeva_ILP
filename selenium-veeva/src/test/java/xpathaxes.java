import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class xpathaxes {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().fullscreen();


        String text=driver.findElement(By.xpath("//a[contains(normalize-space(.),'Honasa Consumer')]/self::a")).getText();
        System.out.println("self Node :"+text);

        String ancestor=driver.findElement(By.xpath("//a[contains(normalize-space(.),'Honasa Consumer')]/ancestor::tr")).getText();
        System.out.println("ancestor Node :"+ancestor);

        String parent=driver.findElement(By.xpath("//a[contains(normalize-space(.),'Honasa Consumer')]/parent::td")).getText();
        System.out.println("parent Node :"+parent);

        List< WebElement> descendants =driver.findElements(By.xpath("//a[contains(normalize-space(.),'Honasa Consumer')]/ancestor::tr/descendant::*"));
        System.out.println("descendants :"+ descendants.size());

        List< WebElement> followings =driver.findElements(By.xpath("//a[contains(normalize-space(.),'Honasa Consumer')]/ancestor::tr/following::*"));
        System.out.println("followings :"+ followings.size());

        List< WebElement> precedings =driver.findElements(By.xpath("//a[contains(normalize-space(.),'Honasa Consumer')]/ancestor::tr/preceding::*"));
        System.out.println("precedings :"+ precedings.size());

        List< WebElement> followingsiblings =driver.findElements(By.xpath("//a[contains(normalize-space(.),'Honasa Consumer')]/ancestor::tr/following-sibling::*"));
        System.out.println("followingsiblings:"+ followingsiblings.size());

        List< WebElement> precedingsiblings =driver.findElements(By.xpath("//a[contains(normalize-space(.),'Honasa Consumer')]/ancestor::tr/preceding-sibling::*"));
        System.out.println("precedingsiblings:"+ precedingsiblings.size());

        List< WebElement> childrens =driver.findElements(By.xpath("//a[contains(normalize-space(.),'Honasa Consumer')]/ancestor::tr/child::*"));
        System.out.println("childrens :"+ childrens.size());

        driver.quit();

/*      output:
       self Node :Honasa Consumer
        ancestor Node :Honasa Consumer A 525.40 539.30 + 2.65 Buy  |  Sell
        parent Node :Honasa Consumer
        descendants :10
        followings :996
        precedings :653
        followingsiblings:72
        precedingsiblings:27
         childrens :6
 */
    }
}
