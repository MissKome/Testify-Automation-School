import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Task16 {
    WebDriver driver = null;

    @BeforeClass
    public void testify(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module4\\Module_4B\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://testifyltd.com/");
        System.out.println("...launch browser...");
        driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
        System.out.println("...open the contact us page...");
    }

    @Test
    public  void  contactInformation(){

        String text =  driver.findElement(By.xpath("//p[contains(text(),'Contact Information')]")).getText();
        System.out.println("...contact information check...");
        System.out.println(text);
        Assert.assertEquals(text, "Contact Information");

    }

    @Test
    public  void  email(){

        String text =  driver.findElement(By.xpath("//span[contains(text(),'info@testifyltd.com')]")).getText();
        System.out.println("...confirm email address...");
        System.out.println(text);
        Assert.assertEquals(text, "info@testifyltd.com");

    }

    @Test
    public  void  phoneNumber(){

        String text =  driver.findElement(By.xpath("//span[contains(text(),'(+234)905-882-0971')]")).getText();
        System.out.println("...confirm phone number...");
        System.out.println(text);
        Assert.assertEquals(text, "(+234)905-882-0971");


    }
    @Test
    public  void  country(){

        String text =  driver.findElement(By.xpath("//span[contains(text(),'Nigeria')]")).getText();
        System.out.println("...confirm country...");
        System.out.println(text);
        Assert.assertEquals(text, "Nigeria");

    }
    @AfterClass
    public  void quitBrowser(){
        driver.quit();
        System.out.println("...close browser...");
    }



}
