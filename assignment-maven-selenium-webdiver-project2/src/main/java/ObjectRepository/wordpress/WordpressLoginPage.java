package ObjectRepository.wordpress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WordpressLoginPage {
	
        WebDriver driver;
        
        //Account Log-In elements
        @FindBy(linkText ="Log In" )
         WebElement click_LogIn;

        @FindBy(id = "usernameOrEmail")
         WebElement inputText_email;

        @FindBy(xpath="//*[@type='submit']")
         WebElement click_Continue;

        @FindBy(xpath ="//*[@type='password']")
         WebElement inputText_password;

        @FindBy(xpath="//*[@type='submit']")
         WebElement click_submit;

	//Constructor method
	public WordpressLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement loginClickPath() {
		return click_LogIn;
	}

	public WebElement userEmailPath() {
		return inputText_email;
	}

	public WebElement clickContinuePath() {
		return click_Continue;
	}

	public WebElement passwordPath() {
		return inputText_password;
	}
	public WebElement submitPath() {
		return click_submit;
	}
	
}


