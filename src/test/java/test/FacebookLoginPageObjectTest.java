package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FacebookLoginPageObject;

public class FacebookLoginPageObjectTest {
	private static WebDriver driver =null;
	public static void main(String[] args) {
		FacebookLogIn();
	
	}
 public static void FacebookLogIn() {
	 WebDriver driver = new ChromeDriver();
	 FacebookLoginPageObject LoginPage = new FacebookLoginPageObject (driver);
	 driver.get("https://facebook.com/");
	 LoginPage.setTextInEmail("ABC@gmail.com");
	 LoginPage.setTextInPassword("Test123");
	 driver.close();
		 
	 
 }
}
