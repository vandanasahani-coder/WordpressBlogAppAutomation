package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {

	public WebDriver driverSettings() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
