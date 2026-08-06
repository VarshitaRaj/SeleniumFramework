package listeners;

import org.testng.annotations.Test;

import pages.FacebookLoginPageObject;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners (listeners.TestNGListeners.class)

public class TestNGListenerDemo3withTest {
	@Test
	public void Test7 (){
		System.out.println("I am inside Test7");
		
	}
	@Test
	public void Test8 (){
		System.out.println("I am inside Test8");
		WebDriver driver = new ChromeDriver();
		 FacebookLoginPageObject LoginPage = new FacebookLoginPageObject (driver);
		 driver.get("https://facebook.com/");
		 LoginPage.setTextInEmail("ABC@gmail.com");
		 LoginPage.setTextInPassword("Test123");
		 driver.close();
		
	}
	@Test
	public void Test9 (){
		System.out.println("I am inside Test9");
		throw new SkipException("This Test is Skipped");
		
	}

}
