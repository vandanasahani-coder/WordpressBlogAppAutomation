package ObjectRepository.wordpress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WordpressLogOutPage {
   
	WebDriver driver;
	
	//Account Log-Out elements
	@FindBy(xpath = "//*[@id=\'header\']/a[3]")
	WebElement click_logout;
	
	@FindBy(xpath="(//*[@type='button'])[2]")
	WebElement account_logout;
	
	public WordpressLogOutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement logoutClickPath() {
		return click_logout;
	}

	public WebElement accountLogoutPath() {
		return account_logout;
	}
}
