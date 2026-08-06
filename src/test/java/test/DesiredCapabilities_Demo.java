package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities_Demo {
	WebDriver driver;
	
	@BeforeTest
    public void setup() {

        WebDriverManager.edgedriver().setup();

        EdgeOptions options = new EdgeOptions();

        // Add Edge capabilities if required
        options.setCapability("acceptInsecureCerts", true);

        driver = new EdgeDriver(options);

        driver.manage().window().maximize();
    }

		
		@Test
		public void test1() {
				driver.get("https://facebook.com/");
				WebElement Email = driver.findElement(By.name("email"));
				WebElement Password = driver.findElement(By.name("pass"));
				Email.sendKeys("Abc.FB@gmail.com");
				Password.sendKeys("FACE123");
		}
		
		@AfterTest
		public void teardown() {
				driver.quit();
		
	}

}
