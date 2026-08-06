package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {
	 //WebDriver driver = new ChromeDriver();
	 private static WebElement element = null;
	
	public static WebElement textbox_email (WebDriver driver)
	{
	element =	driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
	return element;
		
	}
	public static WebElement textbox_password (WebDriver driver)
	{
 element = driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
 return element;
}
}
