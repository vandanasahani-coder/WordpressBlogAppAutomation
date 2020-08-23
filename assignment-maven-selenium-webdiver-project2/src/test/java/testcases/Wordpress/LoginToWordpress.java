package testcases.Wordpress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ObjectRepository.wordpress.WordpressLogOutPage;
import ObjectRepository.wordpress.WordpressLoginPage;

import static variable.wordpress.UserVariable.*;

public class LoginToWordpress {

	static WebDriverWait wait;
	
	@Test
	public void accountLogin() throws InterruptedException {
		
		
		//Initiate browser
		TestBase test = new TestBase();

		WebDriver driver = test.setup();
		
		logIn(driver);
		
		logOut(driver);
		
		
		
	}
	
	private void logIn(WebDriver driver) {
		
		//Account Log-In
		WordpressLoginPage login= new WordpressLoginPage(driver);
		
		login.loginClickPath().click();
		
		login.userEmailPath().sendKeys(USER_EMAIL);
		
		login.clickContinuePath().click();
		
		login.passwordPath().sendKeys(USER_PASSWORD);
		
		login.submitPath().click();
	}
	
	private void logOut(WebDriver driver) throws InterruptedException {
		
		//Account Log-Out
		WordpressLogOutPage logout=new WordpressLogOutPage(driver);
		
		logout.logoutClickPath().click();
		
		logout.accountLogoutPath().click();
		
		Thread.sleep(6000);
		
		driver.close();
	}
	
}
