package Task19.SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageSauce {
    WebDriver Sdriver = null;

    public LoginPageSauce (WebDriver driver){
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
