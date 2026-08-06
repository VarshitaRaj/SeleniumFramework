package test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import pages.FacebookLoginPageObject;

public class TestNGDemo {
	private static WebDriver driver = null;
	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();
		System.out.println("This is Before Test Block");
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
 public void tearDownTest() {
	 driver.close();
	 System.out.println("Test Completed successful");
	 System.out.println("This is After test Block");
	 driver.quit();
 }
}
