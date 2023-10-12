package Task19.DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ElementsQA {
    WebDriver driver = null;

    @BeforeClass
    public void openBrowser () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module4\\Module_4B\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //launch browser
        driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        System.out.println("launch browser");
        driver.get("https://demoqa.com/");

        //scrolldown on the page
        JavascriptExecutor scrolling = (JavascriptExecutor) driver;
        scrolling.executeScript("window.scrollBy(0, 500)");


    }

    @Test (groups = {"one"})
    public  void homepage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module4\\Module_4B\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://demoqa.com/");

        Thread.sleep(5000);

        Boolean homepage = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed();
        if (homepage) {
            System.out.println("Element is dispalyed");
        } else {
            System.out.println("Element is not dispalyed");
        }
    }

    @Test(priority = 1)
    public void clickElements(){
        // click on the Elements tile
        String name = driver.findElement(By.xpath("//h5[normalize-space()='Elements']")).getText();
        System.out.println(name);
        driver.findElement(By.xpath("//h5[normalize-space()='Elements']")).click();

    }

    @Test (priority = 2)
    public void elementsPage(){
        //confirm you are on the elements page
        String elements = driver.findElement(By.xpath("//div[@class='main-header']")).getText();
        Assert.assertEquals(elements, "Elements");
        System.out.println("I am on the element page");

    }
}
