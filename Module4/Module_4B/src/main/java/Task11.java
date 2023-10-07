import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Task11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.driver.chrome", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module_4B\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to url
        driver.get("https://www.google.com/");

        Thread.sleep(300);

        //enter testify ltd in the search box
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify ltd");
        Thread.sleep(300);

        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).click();

        //click on the search button
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
        Thread.sleep(300);

        //click on the search with testifyltd.com
        driver.findElement(By.xpath("//a[@href='https://www.testifyltd.com/']//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Testify Limited']")).click();

        //scroll down the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        Thread.sleep(300);

        //click on the LinkedIn icon
        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/*[1]")).click();

        //get the description text on the page
        Set<String> windows = driver.getWindowHandles();

        String linkedIn = "";

        for (String window : windows) {
            driver.switchTo().window(window);
            Thread.sleep(3000);
            System.out.println(driver.getCurrentUrl());

            if (driver.getCurrentUrl().equalsIgnoreCase("https://www.linkedin.com/company/testifyorg/")) {
                linkedIn = driver.getCurrentUrl();
                Thread.sleep(300);

                if (driver.findElement(By.xpath("//*[@id=\"organization_guest_contextual-sign-in\"]/div/section/div/div/div/div[1]/button")).isDisplayed()) {
                    driver.close();

                } else {

                    String text = driver.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[2]/div[1]/div[2]/main[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/p[1]")).getText();
                    System.out.println(text);
//
//}                     }
                }
            }
        }
    }
}