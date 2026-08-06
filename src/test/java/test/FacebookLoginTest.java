package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FacebookLoginPage;

public class FacebookLoginTest {
	private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		
		FacebookLogin();
			
	}
	
	public static void FacebookLogin() {
		driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        FacebookLoginPage.textbox_email(driver).sendKeys("Abc@gmail.com");
        FacebookLoginPage.textbox_password(driver).sendKeys("Test123");
        System.out.println("Test Completed");
        driver.close();
		
		
	}
	
	

}
