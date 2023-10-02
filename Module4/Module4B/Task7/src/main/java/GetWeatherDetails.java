import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWeatherDetails {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module4\\Module4B\\Task7\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //navigate to browser
        driver.get(" https://worldweather.wmo.int/en/home.html");

        driver.findElement(By.id("q_search")).sendKeys("Lagos");
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("input[class='top_searchbox_submit']")).click();
         Thread.sleep(5000);


for (int i = 1; i <=5; i++) {
    String day = driver.findElement(By.xpath("//div[@class='city_forecast_day_object'][" + i + "]/descendant:: div[1]")).getText();
    String description = driver.findElement(By.xpath("//body[1]/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[" + (i ) + "]/div[4]")).getText();

    // Print the day and weather description
    System.out.println("Day " + i + ": " + day);
    System.out.println("Weather Description: " + description);
    System.out.println();



}
    }
}