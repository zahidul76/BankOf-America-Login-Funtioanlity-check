package bofafunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BankOfAmericaLoginTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://bankofamerica.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"onlineId1\"]")).sendKeys("abcgsh@gmail.com");
        driver.findElement(By.cssSelector("#passcode1")).sendKeys("zahid");
        //driver.findElement(By.xpath("//*[@id=\"signIn\"]")).click();
       // driver.findElement(By.linkText("Forgot ID/Password?")).click();
        driver.findElement(By.partialLinkText("Password?")).click();
        driver.getTitle();

        String title = driver.getTitle();
        System.out.println("The Title is :" + title );
        //driver.close();
        System.out.println("Test Successfully Completed");









    }
}
