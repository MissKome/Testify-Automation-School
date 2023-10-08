
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task15 {
    WebDriver driver = null;

@BeforeClass
    public void openBrowser (){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module4\\Module_4B\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    //launch browser
    driver = new ChromeDriver();
    //maximize the browser
    driver.manage().window().maximize();
    //implicit wait
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    System.out.println("...launch browser...");

}

@Test
    public void google(){
    System.out.println("...navigate to google...");
    driver.get("https://www.google.com/");

    driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify");
    System.out.println("search for testify");

    System.out.println( "   ");
}



@Test
    public  void mcdonalds(){
    System.out.println("...navigate to mcdonalds...");
    driver.get("https://www.mcdonalds.com/us/en-us.html");
     String color = driver.findElement(By.xpath("//a[@id='button-ordernow']")).getCssValue("background-color");
    System.out.println("print out the order now button color: " + color);


}

@AfterClass
    public  void close(){
    driver.quit();
    System.out.println("close browser");
}


}
