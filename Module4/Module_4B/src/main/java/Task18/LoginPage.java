package Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver Sdriver = null;

    public LoginPage (WebDriver driver){
        Sdriver = driver;
        PageFactory.initElements(Sdriver, this);
    }

    //Input username
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement username;
    public WebElement getUsername(){
        return  username;

    }

    //input password
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    public WebElement getPassword(){
        return  password;

    }

    //click on the login button
    @FindBy(xpath = "  //input[@id='login-button']")
    private WebElement login;
    public WebElement login(){
        return  login;

    }


}
