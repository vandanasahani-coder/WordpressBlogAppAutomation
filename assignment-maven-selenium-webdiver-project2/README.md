# Detailed documentation #

**Prerequisite**
1. Java environment 
2. Maven

**Language:** In our Selenium Project we are using Java language. Selenium supports multiple languages.

**Type of Framework:** In our project, we are using TestNG Framework by using Page Object Model design pattern with Page Factory.

**POM:** As per the Page Object Model, we have maintained a class for every web page. Each web page has a separate class and that class holds the functionality and members of that web page. Separate classes for every individual test.

**Packages:** We have separate packages for ObjectRepository and testcases. All the web page related classes come under the ObjectRepository package and all the tests related classes come under testcases.

For example, Login Page and Logout Page have separate classes to store element locators. For the login test, there would be a separate class which calls the methods from the Login Page and Logout Page class.

**test Base Class**: Test Base class (TestBase.java) deals with all the common functions used by all the pages. This class is responsible for loading the configurations from config package, Initializing the WebDriver, Implicit Waits etc.

**config package:** BrowserSetting and WebdriverSettings Class class (BrowserSetting.java and WebdriverSettings.java Class) deals with all the common functions used by all the pages. This class is responsible for Initializing the WebDriver, Implicit Waits.

**variable package:** This package (UrlVariable.java and UserVariable.java) stores the information that remains static throughout the framework such as browser-specific information, application URL, email address, password, etc.

All the details which change as per the environment and authorization such as URL, Login Credentials are kept in the UrlVariable.java and UserVariable.java class. Keeping these details in a separate file makes it easy to maintain.

**TestNG:** Using TestNG for runnning the test cases.

**Maven:** Using Maven for build, execution, and dependency purpose. Integrating the TestNG dependency in the POM.xml file and running this POM.xml file using Jenkins.

**Version Control Tool:** We use Git as a repository to store our test scripts.

**Jenkins:** By using Jenkins CI (Continuous Integration) Tool, we execute test cases. 

# How to run the Test #

 


**Note: Configure web-driver path and test email address.**
	

- Configure webdriver.
    - I used ChromeDriver but you can choose other webdriver eg. Mozilla GeckoDriver 
    - I have kept the Chrome Driver in project path itself inside Driver's folder.
    
- Configure test email address.
    - 'USER_EMAIL` is given which is already existing email for wordpress you can give another email as well in
    `assignment-maven-selenium-webdiver-project/src/main/java/variable/wordpress/UserVariable.java` 
    - Note: please provide the email which exist in database. 

	
Project is ready to run. Execute following commands and enjoy the automatic web-driver test.
- Go to project path in terminal. For example: C:\Users\User-Name\eclipse-workspace\assignment-maven-selenium-webdiver-project>
- Run `mvn clean`
- Run `mvn compile`
- Run `mvn test`

