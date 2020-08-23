package testcases.Wordpress;

import org.openqa.selenium.WebDriver;

import config.BrowserSetting;

public class TestBase {

	public WebDriver setup() {
		BrowserSetting bs = new BrowserSetting();

		WebDriver driver = bs.BrowserSettings();
		
		return driver;
	}
}
