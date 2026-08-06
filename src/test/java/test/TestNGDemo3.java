package test;

import org.testng.annotations.Test;

import config.PropertiesFile;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import pages.FacebookLoginPageObject;

public class TestNGDemo3 {
	private static final String FIREFOX = "Firefox";
	private static final String CHROME = "Chrome";
	private static WebDriver driver = null;
	public static String browserName = null;
	
	
	
	@BeforeTest
	public void setUpTest() {
		PropertiesFile.getProperties();
		if (browserName.equalsIgnoreCase(CHROME)) {
		driver = new ChromeDriver();
		System.out.println("This is chrome browser");
		
	}
		else if (browserName.equalsIgnoreCase(FIREFOX)) {
			driver = new FirefoxDriver();
			System.out.println("This is Before Firefox browser");
		}
			
		}
	
	@Test
 public static void FacebookLogIn() {
	 //WebDriver driver = new ChromeDriver();
	 FacebookLoginPageObject LoginPage = new FacebookLoginPageObject (driver);
	 driver.get("https://facebook.com/");
	 LoginPage.setTextInEmail("ABC@gmail.com");
	 LoginPage.setTextInPassword("Test123");
	 System.out.println("This is Test Block");
	 
 }
 @AfterTest
 public void tearDownTest() throws IOException {
	 driver.close();
	 System.out.println("Test Completed successful");
	 System.out.println("This is After test Block");
	 PropertiesFile.setProperties();
	 //driver.quit();
 }
}
