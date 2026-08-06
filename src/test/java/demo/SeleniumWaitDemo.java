package demo;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumWaitDemo {
	public static void main(String[] args) throws InterruptedException {
		seleniumWaits();
		
	}
	
		public static void seleniumWaits() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		try {
			//implicit wait 
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Timeouts wait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//System.out.println("Implicit wait has been set." + wait);
		//default polling time is 250ms
		driver.get("https://facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("password123");
		driver.findElement(By.id("login_form")).click();
		
		// Explicit wait 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.id("emails")));
		
		
		driver.findElement(By.id("login_form1"));
		}
	    
		finally {
            driver.quit();
        }
		
	    }
	}


