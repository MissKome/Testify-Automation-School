import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task14 {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module_4B\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//implicit wait
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//navigate to url
        driver.navigate().to("https://www.toolsqa.com/");
//click on the dialogue
       driver.findElement(By.xpath("//*[@id=\"accept-cookie-policy\"]")).click();
//click on the tutorials button
       driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[4]/a[1]")).click();





    }
}
