package Task19.SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPageSauce {
    WebDriver Pdriver = null;

    public FinishPageSauce (WebDriver driver){
        Pdriver = driver;
        PageFactory.initElements(Pdriver, this);
    }

    //click on the finish button
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement Finish;
    public WebElement getFinish(){
        return  Finish;

    }

    //get the success message text
    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement success;
    public WebElement getSuccess(){
        return  success;

    }

}
