package Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage {
    WebDriver Pdriver = null;

    public FinishPage (WebDriver driver){
        Pdriver = driver;
        PageFactory.initElements(Pdriver, this);
    }

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement Finish;
    public WebElement getFinish(){
        return  Finish;

    }

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement success;
    public WebElement getSuccess(){
        return  success;

    }

}
